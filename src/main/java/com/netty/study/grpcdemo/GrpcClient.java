package com.netty.study.grpcdemo;

import com.netty.study.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.UUID;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",8899)
                .usePlaintext().build();

        firsttest(managedChannel);
//        secondTest(managedChannel);
//        managedChannel.shutdown();
    }

    private static void secondTest(ManagedChannel managedChannel) {
        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);
        Iterator<GetStudentByUserIdRes> studentByUserId = blockingStub.getStudentByUserId(GetStudentByUserIdReq.newBuilder().setUserid(UUID.randomUUID().toString()).build());
        if (studentByUserId.hasNext()){
            GetStudentByUserIdRes next = studentByUserId.next();
            System.out.println("birthday:"+ next.getBirthday());
            System.out.println("realname : " + next.getRealname());
            System.out.println("userid : " + next.getUserid());
        }
    }

    private static void firsttest(ManagedChannel managedChannel) {

      StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.
      newBlockingStub(managedChannel);
      GetRealNameByUserNameRes myResponse = blockingStub.getRealNameByUserName(GetRealNameByUserNameReq.newBuilder().setUsername("zhangsan").build());
      System.out.println(myResponse.getRealname());
    }
}
