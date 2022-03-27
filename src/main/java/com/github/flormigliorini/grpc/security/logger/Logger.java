package com.github.flormigliorini.grpc.security.logger;

import com.github.flormigliorini.grpc.security.camera.Camera;
import com.proto.camera.CameraResponse;
import com.proto.logger.LoggerRequest;
import com.proto.logger.LoggerResponse;
import com.proto.logger.LoggerServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;

public class Logger extends LoggerImpBase {

    public static void main(String[] args) throws InterruptedException, IOException {
        Camera camera = new Camera();

        int port = 50056;

        Server server = ServerBuilder.forPort(port)
                .addService(camera)
                .build()
                .start();

        System.out.println("Logger started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public StreamObserver<LoggerRequest> logger(StreamObserver<LoggerResponse> responseObserver) {

        //StreamObserver<LoggerRequest> streamObserver = new StreamObserver<LoggerRequest>() {

        return new StreamObserver<LoggerRequest>(){
//            String result = "";
            ArrayList<String> list = new ArrayList();

            @Override
            public void onNext(LoggerRequest value) {
                //client send a msg
                System.out.println("receiving value: " + value.getRequest());

                list.add(value.getRequest());
            }

            @Override
            public void onError(Throwable t) {
                //client send an error

            }

            @Override
            public void onCompleted() {
                System.out.printf("receiving values \n" );
               //client is done
                String entry1 = list.get(0);
                String entry2 = list.get(1);

                LoggerResponse reply = LoggerResponse.newBuilder()
                        .setLoggerMsg("Incident reported for both cameras")
                        .build();

                responseObserver.onNext(reply);

                responseObserver.onCompleted();
//                responseObserver.onNext(
//                        LoggerResponse.newBuilder()
//                                .setLoggerMsg("incident reported for both cameras")
//                                .setLoggerDay("")
//                                .setLoggerTimer("")
//                                .build()
//                );
//                responseObserver.onCompleted();
            }
        };
       // return streamObserver;
    }
//    @Override
//    public void logger(LoggerRequest request, StreamObserver<LoggerResponse> responseObserver) {
//        String day = "";
//        int maxDay=5, minDay=1;
//        int randomDay = (int) (Math.random()*(maxDay - minDay + 1) + minDay);
//
//        int maxHours=18, minHours=8;
//        int randomHours = (int) (Math.random()*(maxHours - minHours + 1) + minHours);
//
//        int maxMinutes=60, minMinutes=0;
//        int randomMinutes = (int) (Math.random()*(maxMinutes - minMinutes + 1) + minMinutes);
//
//        //prepare the value to be set back
//        if (request.getRequest().equalsIgnoreCase("YES")){
//            switch (randomDay) {
//                case 1:
//                    day = "Incident reported Monday " ;
//                    break;
//                case 2:
//                    day = "Incident reported Tuesday " ;
//                    break;
//                case 3:
//                    day = "Incident reported Wednesday " ;
//                    break;
//                case 4:
//                    day = "Incident reported Thursday " ;
//                    break;
//                case 5:
//                    day = "Incident reported Friday " ;
//                    break;
//            }
//            //preparing the response message
//            LoggerResponse loggerResponse = LoggerResponse.newBuilder()
//                    .setLoggerMsg("Too many people is not allowed")
//                    .setLoggerDay(day)
//                    .setLoggerTimer(randomHours +":"+ randomMinutes)
//                    .build();
//
//            //response back to the client
//            responseObserver.onNext(loggerResponse);
//
//            //complete the RCP call
//            responseObserver.onCompleted();
//        } else{
//            //preparing the response message
//            LoggerResponse loggerResponse = LoggerResponse.newBuilder()
//                    .setLoggerMsg("No incident to report")
//                    .setLoggerDay("")
//                    .setLoggerTimer("")
//                    .build();
//
//            //response back to the client
//            responseObserver.onNext(loggerResponse);
//
//            //complete the RCP call
//            responseObserver.onCompleted();
//        }
//    }
}
