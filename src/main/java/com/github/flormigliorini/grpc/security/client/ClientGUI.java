package com.github.flormigliorini.grpc.security.client;

import com.proto.camera.CameraIdentMessage;
import com.proto.camera.CameraRequest;
import com.proto.camera.CameraResponse;
import com.proto.camera.CameraServiceGrpc;
import com.proto.logger.LoggerRequest;
import com.proto.logger.LoggerResponse;
import com.proto.logger.LoggerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ClientGUI extends JPanel implements ActionListener{

    private JTextField entryCamIdent, replyCamIdent;
    private JTextField entryCamService, replyCamService;
    private JTextField entryLogger1, replyLogger, entryLogger2;

    private JPanel getService1JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Active Camera")	;
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
//        entryCamIdent = new JTextField("",5);
//        panel.add(entryCamIdent);
//        panel.add(Box.createRigidArea(new Dimension(5, 0)));

        JButton button = new JButton("CameraON");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton buttonCam02 = new JButton("CameraOFF");
        buttonCam02.addActionListener(this);
        panel.add(buttonCam02);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        replyCamIdent = new JTextField();
        replyCamIdent.setPreferredSize(new Dimension(200,100));
        replyCamIdent .setEditable(false);
        panel.add(replyCamIdent);

        panel.setLayout(boxlayout);

        return panel;
    }

    private JPanel getService2JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("What is the maximum people?(1-10): ");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(15, 10)));
        entryCamService = new JTextField("",5);
        panel.add(entryCamService);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Invoke Camera Service");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        replyCamService = new JTextField("", 10);
        replyCamService .setEditable(false);
        panel.add(replyCamService);

        panel.setLayout(boxlayout);

        return panel;

    }

    private JPanel getService3JPanel() {

        this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        JLabel label = new JLabel("Report incident for camera 01?");
        label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        label.setHorizontalAlignment(JLabel.LEFT);
        entryLogger1 = new JTextField("");
        entryLogger1.setPreferredSize(new Dimension(10, 0));
        entryLogger1.setAlignmentX(JTextField.RIGHT_ALIGNMENT);
        entryLogger1.setHorizontalAlignment(JTextField.RIGHT);
        this.add(label);
        this.add(Box.createRigidArea(new Dimension(10, 0)));
        this.add(entryLogger1);
        this.add(Box.createRigidArea(new Dimension(300, 5)));

        return this;
    }
    private JPanel getService3_1JPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Report incident for camera 02?")	;
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        entryLogger2 = new JTextField("",10);
        panel.add(entryLogger2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Invoke Logger");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        replyLogger = new JTextField("", 10);
        replyLogger .setEditable(false);
        panel.add(replyLogger);

        return panel;

    }

    public static void main(String[] args) {

        ClientGUI gui = new ClientGUI();
        //gui.run();

        gui.build();

    }

    private void build() {

        JFrame frame = new JFrame("Service Controller gRPC project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the panel to add buttons
        JPanel panel = new JPanel();

        // Set the BoxLayout to be X_AXIS: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        // Set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add(getService1JPanel());
        panel.add(getService2JPanel());
        panel.add(getService3JPanel());
        panel.add(getService3_1JPanel());

        // Set size for the frame
        frame.setSize(300, 300);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

//    ManagedChannel channel;
//    public void run(){
//        channel = ManagedChannelBuilder.forAddress("localhost", 50053)
//                .usePlaintext()
//                .build();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String label = button.getActionCommand();

        if (label.equals("CameraON")) {
            System.out.println("camera to be invoked");


            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
            CameraServiceGrpc.CameraServiceBlockingStub blockingStub = CameraServiceGrpc.newBlockingStub(channel);

            CameraIdentMessage cameraIdentMessage = CameraIdentMessage.newBuilder()
                    //.setID(entryCamIdent.getText()).build();
                            .setID(label).build();

            //we stream the responses (in a blocking manner)
            blockingStub.cameraIdent(cameraIdentMessage)
                    .forEachRemaining(cameraIdentResponse -> {
                        replyCamIdent.setText(cameraIdentResponse.getCameraInfo());
                    });



        } else if(label.equals("CameraOFF")){
            System.out.println("camera to be invoked");


            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
            CameraServiceGrpc.CameraServiceBlockingStub blockingStub = CameraServiceGrpc.newBlockingStub(channel);

            CameraIdentMessage cameraIdentMessage = CameraIdentMessage.newBuilder()
                    //.setID(entryCamIdent.getText()).build();
                    .setID(label).build();

            //we stream the responses (in a blocking manner)
            blockingStub.cameraIdent(cameraIdentMessage)
                    .forEachRemaining(cameraIdentResponse -> {
                        replyCamIdent.setText("Camera OFF");
                    });
        }
        else if (label.equals("Invoke Camera Service")) {
            System.out.println("Camera to be invoked");
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
            CameraServiceGrpc.CameraServiceBlockingStub blockingStub = CameraServiceGrpc.newBlockingStub(channel);

            if (entryCamService.getText().equals("")){
                replyCamService.setText("Please enter number of people");
            }else{
                //preparing message to send
                CameraRequest cameraRequest = CameraRequest.newBuilder().setRequest(Integer.parseInt(entryCamService.getText())).build();
                //retreving reply from service
                CameraResponse cameraResponse = blockingStub.camera(cameraRequest);

                replyCamService.setText(String.valueOf(cameraResponse.getResult()));
            }

        } else if(label.equals("Invoke Logger")) {
            System.out.println("Invoke Logger Service");

            CountDownLatch latch = new CountDownLatch(1);

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50056).usePlaintext().build();
            //create an async client
            LoggerServiceGrpc.LoggerServiceStub asyncClient = LoggerServiceGrpc.newStub(channel);
            StreamObserver<LoggerResponse> responseStreamObserver = new StreamObserver<LoggerResponse>() {
                @Override
                public void onNext(LoggerResponse value) {
                    //replyLogger.setText(LoggerResponse.newBuilder().getLoggerMsg());
                    System.out.println("test " + value.getLoggerMsg());
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    System.out.println("stream is completed");
                }
            };

            StreamObserver<LoggerRequest> requestStreamObserver = asyncClient.logger(responseStreamObserver);
            try {
                requestStreamObserver.onNext(LoggerRequest.newBuilder().setRequest(entryLogger1.getText()).build());
                Thread.sleep(500);

                requestStreamObserver.onNext(LoggerRequest.newBuilder().setRequest(entryLogger2.getText()).build());

                requestStreamObserver.onCompleted();

                Thread.sleep(10000);

            } catch (RuntimeException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


        }
//            StreamObserver<LoggerRequest> requestStreamObserver = asyncClient.logger(new StreamObserver<LoggerResponse>() {
//                @Override
//                public void onNext(LoggerResponse value) {
//                    //we get a resp from the server
//                    replyLogger.setText(value.getLoggerMsg() + value.getLoggerDay() + value.getLoggerTimer());
//                    //onNext will be called only once
//                }
//
//                @Override
//                public void onError(Throwable t) {
//                    //we get an error from the server
//                }
//
//                @Override
//                public void onCompleted() {
//                //the server is done sending us data
//                    //onCompleted will be called right after onNext()
//                    System.out.println("Server sending something test");
//                    latch.countDown();
//                }
//            });
//            //streaming msg #1
//            System.out.println("Sending message 1");
//            requestStreamObserver.onNext(LoggerRequest.newBuilder()
//                    .setRequest(entryLogger1.getText())
//                    .build());
//            //streaming msg #2
//            System.out.println("Sending message 2");
//            requestStreamObserver.onNext(LoggerRequest.newBuilder()
//                    .setRequest(entryLogger2.getText())
//                    .build());
//
//            //we tell the server that the client is done seding data
//            requestStreamObserver.onCompleted();
//
//            try {
//                latch.await(3L, TimeUnit.SECONDS);
//            }catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }

    }
}
