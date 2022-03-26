package com.github.flormigliorini.grpc.security.camera;

import com.proto.camera.*;
import io.grpc.stub.StreamObserver;

public abstract class CameraImplBase extends CameraServiceGrpc.CameraServiceImplBase {
    public abstract void cameraIdent(CameraIdentMessage cameraIdentMessage, StreamObserver<CameraIdentResponse> responseObserver);
}
