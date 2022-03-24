package com.github.flormigliorini.grpc.security.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SecurityServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Testing server");

        Server server = ServerBuilder.forPort(50051)
                .addService(new CameraServiceImpl())
                .build();
        server.start();
        //Shutdown the server
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));
     server.awaitTermination();;


    }
}
