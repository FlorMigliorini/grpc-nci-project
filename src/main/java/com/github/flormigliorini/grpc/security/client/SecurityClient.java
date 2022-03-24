package com.github.flormigliorini.grpc.security.client;

import com.proto.simple.SimpleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SecurityClient {
    public static void main(String[] args) {
        System.out.println("Testing client");

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()//force to be access/connection to the server
                .build();
        //creating stub
        System.out.println("creating stub");
        //SimpleServiceGrpc.SimpleServiceBlockingStub syncClient = SimpleServiceGrpc.newBlockingStub(managedChannel);

        SimpleServiceGrpc.SimpleServiceFutureStub asyncClient = SimpleServiceGrpc.newFutureStub(managedChannel);

        //Do something
        //shutting down managedChannel
        System.out.println("Shutting down channel");
        managedChannel.shutdown();

    }
}
