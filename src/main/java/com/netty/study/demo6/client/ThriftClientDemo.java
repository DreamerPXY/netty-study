package com.netty.study.demo6.client;

import com.netty.study.demo6.PersonService;
import com.netty.study.demo6.impl.PersonServiceImpl;
import org.apache.thrift.AsyncProcessFunction;
import org.apache.thrift.TBaseAsyncProcessor;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import java.util.Map;

public class ThriftClientDemo {
    public static void main(String[] args) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);

//            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(new PersonService.AsyncProcessor<>()));

            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
//
//            System.out.println("Starting the simple server...");
//            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
