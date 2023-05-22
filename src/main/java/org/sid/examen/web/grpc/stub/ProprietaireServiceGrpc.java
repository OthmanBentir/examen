package org.sid.examen.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: proprietaire.proto")
public final class ProprietaireServiceGrpc {

  private ProprietaireServiceGrpc() {}

  public static final String SERVICE_NAME = "ProprietaireService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest,
      org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaire",
      requestType = org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest.class,
      responseType = org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest,
      org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod() {
    io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest, org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> getGetProprietaireMethod;
    if ((getGetProprietaireMethod = ProprietaireServiceGrpc.getGetProprietaireMethod) == null) {
      synchronized (ProprietaireServiceGrpc.class) {
        if ((getGetProprietaireMethod = ProprietaireServiceGrpc.getGetProprietaireMethod) == null) {
          ProprietaireServiceGrpc.getGetProprietaireMethod = getGetProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest, org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireService", "getProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServiceMethodDescriptorSupplier("getProprietaire"))
                  .build();
          }
        }
     }
     return getGetProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest,
      org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> getGetListProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListProprietaire",
      requestType = org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest.class,
      responseType = org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest,
      org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> getGetListProprietaireMethod() {
    io.grpc.MethodDescriptor<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest, org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> getGetListProprietaireMethod;
    if ((getGetListProprietaireMethod = ProprietaireServiceGrpc.getGetListProprietaireMethod) == null) {
      synchronized (ProprietaireServiceGrpc.class) {
        if ((getGetListProprietaireMethod = ProprietaireServiceGrpc.getGetListProprietaireMethod) == null) {
          ProprietaireServiceGrpc.getGetListProprietaireMethod = getGetListProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest, org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProprietaireService", "getListProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProprietaireServiceMethodDescriptorSupplier("getListProprietaire"))
                  .build();
          }
        }
     }
     return getGetListProprietaireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProprietaireServiceStub newStub(io.grpc.Channel channel) {
    return new ProprietaireServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProprietaireServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProprietaireServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProprietaireServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProprietaireServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProprietaireServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getListProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListProprietaireMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest,
                org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE)))
          .addMethod(
            getGetListProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest,
                org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse>(
                  this, METHODID_GET_LIST_PROPRIETAIRE)))
          .build();
    }
  }

  /**
   */
  public static final class ProprietaireServiceStub extends io.grpc.stub.AbstractStub<ProprietaireServiceStub> {
    private ProprietaireServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListProprietaireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProprietaireServiceBlockingStub extends io.grpc.stub.AbstractStub<ProprietaireServiceBlockingStub> {
    private ProprietaireServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse getProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse getListProprietaire(org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListProprietaireMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProprietaireServiceFutureStub extends io.grpc.stub.AbstractStub<ProprietaireServiceFutureStub> {
    private ProprietaireServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProprietaireServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProprietaireServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProprietaireServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse> getProprietaire(
        org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse> getListProprietaire(
        org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListProprietaireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE = 0;
  private static final int METHODID_GET_LIST_PROPRIETAIRE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProprietaireServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProprietaireServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE:
          serviceImpl.getProprietaire((org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_PROPRIETAIRE:
          serviceImpl.getListProprietaire((org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.examen.web.grpc.stub.ProprietaireOuterClass.GetListProprietaireResponse>) responseObserver);
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

  private static abstract class ProprietaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProprietaireServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.examen.web.grpc.stub.ProprietaireOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProprietaireService");
    }
  }

  private static final class ProprietaireServiceFileDescriptorSupplier
      extends ProprietaireServiceBaseDescriptorSupplier {
    ProprietaireServiceFileDescriptorSupplier() {}
  }

  private static final class ProprietaireServiceMethodDescriptorSupplier
      extends ProprietaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProprietaireServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProprietaireServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProprietaireServiceFileDescriptorSupplier())
              .addMethod(getGetProprietaireMethod())
              .addMethod(getGetListProprietaireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
