package com.netty.study.websocketDemo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.time.LocalDateTime;

public class MyWebSocketTextFramerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        System.out.println("收到客户端的消息：" + msg.text());
        ctx.channel().writeAndFlush(new TextWebSocketFrame("服务器的时间：" + LocalDateTime.now()));
    }

    /**
     * web客户连接后，会打印这行
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        /*
        id表示唯一，有长有短，长的asLongText，唯一。短的asShortText()不唯一
         */
        System.out.println("handlerAdded的ID：" + ctx.channel().id().asShortText());
    }

    /**
     * 一个很有趣的现象，如果客户端刷新一下，实际上会调用这个方法，因为连接断了，新建了一个连接
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("handlerRemoved的ID：" + ctx.channel().id().asLongText());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        String message = cause.getMessage();
        System.out.println("异常发生:"+message);
        //异常一旦发生就要关闭连接
        ctx.close();
    }


}
