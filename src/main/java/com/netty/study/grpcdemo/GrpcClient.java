package com.netty.study.grpcdemo;

import com.netty.study.proto.GetRealNameByUserNameReq;
import com.netty.study.proto.GetRealNameByUserNameRes;
import com.netty.study.proto.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",8899)
                .usePlaintext().build();
        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.
                newBlockingStub(managedChannel);
        GetRealNameByUserNameRes myResponse = blockingStub.getRealNameByUserName(GetRealNameByUserNameReq.newBuilder().setUsername("zhangsan").build());
        System.out.println(myResponse.getRealname());
    }
}
