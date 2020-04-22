package com.netty.study.demo5;

import com.netty.study.demo4.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtobufClientHandler extends SimpleChannelInboundHandler<DataInfo.Person> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Person msg) throws Exception {
        System.out.println("call back from server:");
        System.out.println(msg);
    }
    //
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        DataInfo.Person person = DataInfo.Person.newBuilder().setId(1).setEmail("123@qq.com")
                .setName("pxy").build();
        ctx.channel().writeAndFlush(person);
    }
}
