package com.netty.study.grpcdemo;

import com.netty.study.proto.*;
import io.grpc.stub.StreamObserver;

import java.util.Date;
import java.util.UUID;

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
        String userid = request.getUserid();
        System.out.println("客户端发送的userid" + userid);
        responseObserver.onNext(GetStudentByUserIdRes.newBuilder().setBirthday(new Date().toString()).setRealname("server realname1").setUserid(UUID.randomUUID().toString()+"server1").build());
        responseObserver.onNext(GetStudentByUserIdRes.newBuilder().setBirthday(new Date().toString()).setRealname("server realname2").setUserid(UUID.randomUUID().toString()+"server2").build());
        responseObserver.onNext(GetStudentByUserIdRes.newBuilder().setBirthday(new Date().toString()).setRealname("server realname3").setUserid(UUID.randomUUID().toString()+"server3").build());
        responseObserver.onNext(GetStudentByUserIdRes.newBuilder().setBirthday(new Date().toString()).setRealname("server realname4").setUserid(UUID.randomUUID().toString()+"server4").build());
        responseObserver.onNext(GetStudentByUserIdRes.newBuilder().setBirthday(new Date().toString()).setRealname("server realname5").setUserid(UUID.randomUUID().toString()+"server5").build());
        responseObserver.onCompleted();
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
