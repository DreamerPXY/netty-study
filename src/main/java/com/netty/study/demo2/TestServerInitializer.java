package com.netty.study.demo2;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TestServerInitializer extends SimpleChannelInboundHandler<SocketChannel> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, SocketChannel msg) throws Exception {

    }
}
