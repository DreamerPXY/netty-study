package com.netty.study.grpcdemo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {

    private Server server;
    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8899).addService(new StudentServiceImpl()).build().start();
        System.out.println("server start ...");

        //使用jvm回调钩子 完成服务器关闭操作
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(() -> {
            //
            System.out.println("jvm虚拟机关闭");
            //关闭服务器
            stop();
        }));
    }

    private void awaitTem() throws InterruptedException {
        if (this.server!=null){
            this.server.awaitTermination();
        }
    }
    private void stop() {
        if (this.server!=null){
            this.server.shutdownNow();
        }
    }

    public static void main(String[] args) throws Exception{
        GrpcServer demo = new GrpcServer();
        demo.start();
        demo.awaitTem();
    }
}
