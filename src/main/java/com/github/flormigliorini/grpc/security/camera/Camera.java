package com.github.flormigliorini.grpc.security.camera;

import com.proto.camera.CameraRequest;
import com.proto.camera.CameraResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class Camera extends CameraImplBase{
    public static void main(String[] args) throws InterruptedException, IOException {
        Camera camera = new Camera();

        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(camera)
                .build()
                .start();

        System.out.println("Camera started, listening on " + port);

        server.awaitTermination();

    }


    @Override
    public void camera(CameraRequest request, StreamObserver<CameraResponse> responseObserver) {

        //prepare the value to be set back
        int result = request.getID().length();


        //preparing the response message
        //ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();
        CameraResponse cameraResponse = CameraResponse.newBuilder()
               .setResult(result)
                .build();

        //response back to the client
        responseObserver.onNext( cameraResponse );

        //complete the RCP call
        responseObserver.onCompleted();

    }
}
