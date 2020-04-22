package com.netty.study.grpcdemo;

import com.netty.study.proto.MyRequest;
import com.netty.study.proto.StudentServiceGrpc;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class GrpcDemo {
    public static void main(String[] args) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap().group(bossGroup,workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new MyGrpcHandler())
    }
}
