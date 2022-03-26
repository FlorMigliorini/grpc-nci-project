package com.github.flormigliorini.grpc.security.logger;

import com.github.flormigliorini.grpc.security.camera.Camera;
import com.proto.logger.LoggerRequest;
import com.proto.logger.LoggerResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.lang.Math;

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
    public void logger(LoggerRequest request, StreamObserver<LoggerResponse> responseObserver) {
        String result = "";
        int maxDay=5, minDay=1;
        int randomDay = (int) (Math.random()*(maxDay - minDay + 1) + minDay);

        int maxHours=18, minHours=8;
        int randomHours = (int) (Math.random()*(maxHours - minHours + 1) + minHours);

        int maxMinutes=60, minMinutes=0;
        int randomMinutes = (int) (Math.random()*(maxMinutes - minMinutes + 1) + minMinutes);

        //prepare the value to be set back
        // String result = randomNumber + request.getRequest();
        if (request.getRequest().equalsIgnoreCase("YES")){
            switch (randomDay) {
                case 1:
                    result = "Incident reported Monday " + randomHours + ":" + randomMinutes;
                    break;
                case 2:
                    result = "Incident reported Tuesday " + randomHours + ":" + randomMinutes;
                    break;
                case 3:
                    result = "Incident reported Wednesday " + randomHours + ":" + randomMinutes;
                    break;
                case 4:
                    result = "Incident reported Thursday " + randomHours + ":" + randomMinutes;
                    break;
                case 5:
                    result = "Incident reported Friday " + randomHours + ":" + randomMinutes;
                    break;
            }
        } else{
            result = "No incident to report";
        }


        //preparing the response message
        //ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();
        LoggerResponse loggerResponse = LoggerResponse.newBuilder()
                .setResult(result)
                .build();

        //response back to the client
        responseObserver.onNext(loggerResponse);

        //complete the RCP call
        responseObserver.onCompleted();
    }
}
