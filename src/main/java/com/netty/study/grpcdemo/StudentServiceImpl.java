package com.netty.study.grpcdemo;

import com.netty.study.proto.MyRequest;
import com.netty.study.proto.MyResponse;
import com.netty.study.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealNameByUserName(MyRequest request, StreamObserver<MyResponse> responseObserver) {

        String username = request.getUsername();

        System.out.println("接收到客户端请求：" + username);

        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());

        responseObserver.onCompleted();
    }
}
