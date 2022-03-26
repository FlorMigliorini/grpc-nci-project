package com.github.flormigliorini.grpc.security.camera;

import com.proto.camera.CameraIdentMessage;
import com.proto.camera.CameraIdentResponse;
import com.proto.camera.CameraRequest;
import com.proto.camera.CameraResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.lang.Math;

import java.io.IOException;

public class Camera extends CameraImplBase{
    public static void main(String[] args) throws InterruptedException, IOException {
        Camera camera = new Camera();

        int port = 50055;

        Server server = ServerBuilder.forPort(port)
                .addService(camera)
                .build()
                .start();

        System.out.println("Camera started, listening on " + port);

        server.awaitTermination();

    }


    @Override
    public void camera(CameraRequest request, StreamObserver<CameraResponse> responseObserver) {
        int max=10, min=1;
        int randomNumber = (int) (Math.random()*(max - min + 1) + min);

        //prepare the value to be set back
       // String result = randomNumber + request.getRequest();
        String result;
        if (randomNumber > request.getRequest()){
            result = randomNumber + " is greater than " + request.getRequest();
        } else{
            result = randomNumber + " is less than " + request.getRequest();
        }
        //preparing the response message
        //ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();
        CameraResponse cameraResponse = CameraResponse.newBuilder()
               .setResult(result)
                .build();

        //response back to the client
        responseObserver.onNext(cameraResponse);

        //complete the RCP call
        responseObserver.onCompleted();
    }


    @Override
    public void cameraIdent(CameraIdentMessage cameraIdentMessage, StreamObserver<CameraIdentResponse> responseObserver) {

        String result = "";
        int counter = 1;
        try{
           for (int i=0; i < 2; i++){
               result = "Camera " + counter + ": = Cam0" + counter + ", room" + counter + " -> Active";
               counter++;
               CameraIdentResponse cameraIdentResponse = CameraIdentResponse.newBuilder()
                       .setCameraInfo(result)
                       .build();

               responseObserver.onNext(cameraIdentResponse);
               Thread.sleep(1000L);
           }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            responseObserver.onCompleted();
        }
    }
}
