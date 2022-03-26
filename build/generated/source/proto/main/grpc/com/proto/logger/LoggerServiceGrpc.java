package com.proto.logger;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: logger/logger.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoggerServiceGrpc {

  private LoggerServiceGrpc() {}

  public static final String SERVICE_NAME = "logger.LoggerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.logger.LoggerRequest,
      com.proto.logger.LoggerResponse> getLoggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logger",
      requestType = com.proto.logger.LoggerRequest.class,
      responseType = com.proto.logger.LoggerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.logger.LoggerRequest,
      com.proto.logger.LoggerResponse> getLoggerMethod() {
    io.grpc.MethodDescriptor<com.proto.logger.LoggerRequest, com.proto.logger.LoggerResponse> getLoggerMethod;
    if ((getLoggerMethod = LoggerServiceGrpc.getLoggerMethod) == null) {
      synchronized (LoggerServiceGrpc.class) {
        if ((getLoggerMethod = LoggerServiceGrpc.getLoggerMethod) == null) {
          LoggerServiceGrpc.getLoggerMethod = getLoggerMethod =
              io.grpc.MethodDescriptor.<com.proto.logger.LoggerRequest, com.proto.logger.LoggerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.logger.LoggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.logger.LoggerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoggerServiceMethodDescriptorSupplier("Logger"))
              .build();
        }
      }
    }
    return getLoggerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoggerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceStub>() {
        @java.lang.Override
        public LoggerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceStub(channel, callOptions);
        }
      };
    return LoggerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoggerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceBlockingStub>() {
        @java.lang.Override
        public LoggerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceBlockingStub(channel, callOptions);
        }
      };
    return LoggerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoggerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceFutureStub>() {
        @java.lang.Override
        public LoggerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceFutureStub(channel, callOptions);
        }
      };
    return LoggerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LoggerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void logger(com.proto.logger.LoggerRequest request,
        io.grpc.stub.StreamObserver<com.proto.logger.LoggerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoggerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoggerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.logger.LoggerRequest,
                com.proto.logger.LoggerResponse>(
                  this, METHODID_LOGGER)))
          .build();
    }
  }

  /**
   */
  public static final class LoggerServiceStub extends io.grpc.stub.AbstractAsyncStub<LoggerServiceStub> {
    private LoggerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceStub(channel, callOptions);
    }

    /**
     */
    public void logger(com.proto.logger.LoggerRequest request,
        io.grpc.stub.StreamObserver<com.proto.logger.LoggerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoggerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoggerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LoggerServiceBlockingStub> {
    private LoggerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.logger.LoggerResponse logger(com.proto.logger.LoggerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoggerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoggerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LoggerServiceFutureStub> {
    private LoggerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.logger.LoggerResponse> logger(
        com.proto.logger.LoggerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoggerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGGER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoggerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoggerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGGER:
          serviceImpl.logger((com.proto.logger.LoggerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.logger.LoggerResponse>) responseObserver);
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

  private static abstract class LoggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoggerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.logger.Logger.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoggerService");
    }
  }

  private static final class LoggerServiceFileDescriptorSupplier
      extends LoggerServiceBaseDescriptorSupplier {
    LoggerServiceFileDescriptorSupplier() {}
  }

  private static final class LoggerServiceMethodDescriptorSupplier
      extends LoggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoggerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoggerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoggerServiceFileDescriptorSupplier())
              .addMethod(getLoggerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
