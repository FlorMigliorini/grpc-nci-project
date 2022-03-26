package com.proto.alarm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: alarm/alarm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AlarmServiceGrpc {

  private AlarmServiceGrpc() {}

  public static final String SERVICE_NAME = "camera.AlarmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.alarm.AlarmRequest,
      com.proto.alarm.AlarmResponse> getAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Alarm",
      requestType = com.proto.alarm.AlarmRequest.class,
      responseType = com.proto.alarm.AlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.alarm.AlarmRequest,
      com.proto.alarm.AlarmResponse> getAlarmMethod() {
    io.grpc.MethodDescriptor<com.proto.alarm.AlarmRequest, com.proto.alarm.AlarmResponse> getAlarmMethod;
    if ((getAlarmMethod = AlarmServiceGrpc.getAlarmMethod) == null) {
      synchronized (AlarmServiceGrpc.class) {
        if ((getAlarmMethod = AlarmServiceGrpc.getAlarmMethod) == null) {
          AlarmServiceGrpc.getAlarmMethod = getAlarmMethod =
              io.grpc.MethodDescriptor.<com.proto.alarm.AlarmRequest, com.proto.alarm.AlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Alarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.alarm.AlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.alarm.AlarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AlarmServiceMethodDescriptorSupplier("Alarm"))
              .build();
        }
      }
    }
    return getAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlarmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlarmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlarmServiceStub>() {
        @java.lang.Override
        public AlarmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlarmServiceStub(channel, callOptions);
        }
      };
    return AlarmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlarmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlarmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlarmServiceBlockingStub>() {
        @java.lang.Override
        public AlarmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlarmServiceBlockingStub(channel, callOptions);
        }
      };
    return AlarmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlarmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlarmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlarmServiceFutureStub>() {
        @java.lang.Override
        public AlarmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlarmServiceFutureStub(channel, callOptions);
        }
      };
    return AlarmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlarmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void alarm(com.proto.alarm.AlarmRequest request,
        io.grpc.stub.StreamObserver<com.proto.alarm.AlarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlarmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.alarm.AlarmRequest,
                com.proto.alarm.AlarmResponse>(
                  this, METHODID_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class AlarmServiceStub extends io.grpc.stub.AbstractAsyncStub<AlarmServiceStub> {
    private AlarmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlarmServiceStub(channel, callOptions);
    }

    /**
     */
    public void alarm(com.proto.alarm.AlarmRequest request,
        io.grpc.stub.StreamObserver<com.proto.alarm.AlarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlarmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlarmServiceBlockingStub> {
    private AlarmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlarmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.alarm.AlarmResponse alarm(com.proto.alarm.AlarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlarmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AlarmServiceFutureStub> {
    private AlarmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlarmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlarmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.alarm.AlarmResponse> alarm(
        com.proto.alarm.AlarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALARM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlarmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlarmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALARM:
          serviceImpl.alarm((com.proto.alarm.AlarmRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.alarm.AlarmResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlarmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.alarm.Alarm.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlarmService");
    }
  }

  private static final class AlarmServiceFileDescriptorSupplier
      extends AlarmServiceBaseDescriptorSupplier {
    AlarmServiceFileDescriptorSupplier() {}
  }

  private static final class AlarmServiceMethodDescriptorSupplier
      extends AlarmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlarmServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlarmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlarmServiceFileDescriptorSupplier())
              .addMethod(getAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
