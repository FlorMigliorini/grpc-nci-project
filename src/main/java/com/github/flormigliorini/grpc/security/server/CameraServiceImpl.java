package com.github.flormigliorini.grpc.security.server;

import com.proto.camera.Camera;
import com.proto.camera.CameraRequest;
import com.proto.camera.CameraResponse;
import com.proto.camera.CameraServiceGrpc;
import io.grpc.stub.StreamObserver;

public class CameraServiceImpl extends CameraServiceGrpc.CameraServiceImplBase {

    @Override
    public void camera(CameraRequest request, StreamObserver<CameraResponse> responseObserver) {
       //extract the field we need
        Camera camera = request.getCamera();
        String ID = camera.getID();
        //create response
        String result = "The camera is " + ID;
        CameraResponse cameraResponse = CameraResponse.newBuilder()
                .setResult(result)
                .build();

        //response back to the client
        responseObserver.onNext(cameraResponse);

        //complete the RCP call
        responseObserver.onCompleted();
        //super.camera(request, responseObserver);
    }
}
