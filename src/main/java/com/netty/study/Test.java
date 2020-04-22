package com.netty.study;

import com.google.protobuf.InvalidProtocolBufferException;
import com.netty.study.demo4.DataInfo;

public class Test {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Person person = DataInfo.Person.newBuilder().setName("张三").setId(1).setEmail("1538899501@qq.com")
                .build();
        byte[] bytes = person.toByteArray();
        DataInfo.Person person1 = DataInfo.Person.parseFrom(bytes);
        System.out.println(person1);
    }
}
