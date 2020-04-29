package com.netty.study.grpcdemo;

import com.netty.study.proto.*;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealNameByUserName(GetRealNameByUserNameReq request, StreamObserver<GetRealNameByUserNameRes> responseObserver) {
        String username = request.getUsername();

        System.out.println("接收到客户端请求：" + username);

        responseObserver.onNext(GetRealNameByUserNameRes.newBuilder().setRealname("张三").build());

        responseObserver.onCompleted();
    }


    @Override
    public void getStudentByUserId(GetStudentByUserIdReq request, StreamObserver<GetStudentByUserIdRes> responseObserver) {
        super.getStudentByUserId(request, responseObserver);
    }

    @Override
    public StreamObserver<GetStudentByUserTypeReq> getStudentByUserType(StreamObserver<GetStudentByUserTypeRes> responseObserver) {
        return super.getStudentByUserType(responseObserver);
    }

    @Override
    public StreamObserver<GetStudentByUserAgeReq> getStudentByUserAge(StreamObserver<GetStudentByUserAgeRes> responseObserver) {
        return super.getStudentByUserAge(responseObserver);
    }
}
