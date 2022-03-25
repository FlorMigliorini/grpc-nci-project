//package com.github.flormigliorini.grpc.security.client;
//
//import com.proto.camera.Camera;
//import com.proto.camera.CameraRequest;
//import com.proto.camera.CameraResponse;
//import com.proto.camera.CameraServiceGrpc;
//import com.proto.simple.SimpleServiceGrpc;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//
//public class SecurityClient {
//    public static void main(String[] args) {
//        System.out.println("Testing client");
//
//        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
//                .usePlaintext()//force to be access/connection to the server
//                .build();
//
//
//        //Creating a camera service client - sync
//        CameraServiceGrpc.CameraServiceBlockingStub cameraClient = CameraServiceGrpc.newBlockingStub(managedChannel);
//        //creating a protocol buffer msg
//        Camera camera = Camera.newBuilder()
//                .setID("CA01")
//                .setRoom("Solars")
//                .build();
//
//        //for cameraRequest
//        CameraRequest cameraRequest = CameraRequest.newBuilder()
//                        .setCamera(camera)
//                        .build();
//        //calling back the RPC and get back cameraResponse
//        CameraResponse cameraResponse = cameraClient.camera(cameraRequest);
//
//        System.out.println(cameraResponse.getResult());
//
//        //Do something
//        //shutting down managedChannel
//        System.out.println("Shutting down channel");
//        managedChannel.shutdown();
//
//    }
//}
