// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alarm/alarm.proto

package com.proto.alarm;

/**
 * Protobuf type {@code camera.AlarmResponse}
 */
public final class AlarmResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:camera.AlarmResponse)
    AlarmResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmResponse.newBuilder() to construct.
  private AlarmResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmResponse() {
    securityPersonnel1_ = "";
    securityPersonnel2_ = "";
    securityPersonnel3_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlarmResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            securityPersonnel1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            securityPersonnel2_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            securityPersonnel3_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.alarm.Alarm.internal_static_camera_AlarmResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.alarm.Alarm.internal_static_camera_AlarmResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.alarm.AlarmResponse.class, com.proto.alarm.AlarmResponse.Builder.class);
  }

  public static final int SECURITYPERSONNEL1_FIELD_NUMBER = 1;
  private volatile java.lang.Object securityPersonnel1_;
  /**
   * <code>string securityPersonnel1 = 1;</code>
   * @return The securityPersonnel1.
   */
  @java.lang.Override
  public java.lang.String getSecurityPersonnel1() {
    java.lang.Object ref = securityPersonnel1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityPersonnel1_ = s;
      return s;
    }
  }
  /**
   * <code>string securityPersonnel1 = 1;</code>
   * @return The bytes for securityPersonnel1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityPersonnel1Bytes() {
    java.lang.Object ref = securityPersonnel1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityPersonnel1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITYPERSONNEL2_FIELD_NUMBER = 2;
  private volatile java.lang.Object securityPersonnel2_;
  /**
   * <code>string securityPersonnel2 = 2;</code>
   * @return The securityPersonnel2.
   */
  @java.lang.Override
  public java.lang.String getSecurityPersonnel2() {
    java.lang.Object ref = securityPersonnel2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityPersonnel2_ = s;
      return s;
    }
  }
  /**
   * <code>string securityPersonnel2 = 2;</code>
   * @return The bytes for securityPersonnel2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityPersonnel2Bytes() {
    java.lang.Object ref = securityPersonnel2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityPersonnel2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITYPERSONNEL3_FIELD_NUMBER = 3;
  private volatile java.lang.Object securityPersonnel3_;
  /**
   * <code>string securityPersonnel3 = 3;</code>
   * @return The securityPersonnel3.
   */
  @java.lang.Override
  public java.lang.String getSecurityPersonnel3() {
    java.lang.Object ref = securityPersonnel3_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityPersonnel3_ = s;
      return s;
    }
  }
  /**
   * <code>string securityPersonnel3 = 3;</code>
   * @return The bytes for securityPersonnel3.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityPersonnel3Bytes() {
    java.lang.Object ref = securityPersonnel3_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityPersonnel3_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, securityPersonnel1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, securityPersonnel2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel3_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, securityPersonnel3_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, securityPersonnel1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, securityPersonnel2_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityPersonnel3_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, securityPersonnel3_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.alarm.AlarmResponse)) {
      return super.equals(obj);
    }
    com.proto.alarm.AlarmResponse other = (com.proto.alarm.AlarmResponse) obj;

    if (!getSecurityPersonnel1()
        .equals(other.getSecurityPersonnel1())) return false;
    if (!getSecurityPersonnel2()
        .equals(other.getSecurityPersonnel2())) return false;
    if (!getSecurityPersonnel3()
        .equals(other.getSecurityPersonnel3())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SECURITYPERSONNEL1_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityPersonnel1().hashCode();
    hash = (37 * hash) + SECURITYPERSONNEL2_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityPersonnel2().hashCode();
    hash = (37 * hash) + SECURITYPERSONNEL3_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityPersonnel3().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.alarm.AlarmResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.alarm.AlarmResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.alarm.AlarmResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.alarm.AlarmResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.alarm.AlarmResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code camera.AlarmResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:camera.AlarmResponse)
      com.proto.alarm.AlarmResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.alarm.Alarm.internal_static_camera_AlarmResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.alarm.Alarm.internal_static_camera_AlarmResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.alarm.AlarmResponse.class, com.proto.alarm.AlarmResponse.Builder.class);
    }

    // Construct using com.proto.alarm.AlarmResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      securityPersonnel1_ = "";

      securityPersonnel2_ = "";

      securityPersonnel3_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.alarm.Alarm.internal_static_camera_AlarmResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.alarm.AlarmResponse getDefaultInstanceForType() {
      return com.proto.alarm.AlarmResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.alarm.AlarmResponse build() {
      com.proto.alarm.AlarmResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.alarm.AlarmResponse buildPartial() {
      com.proto.alarm.AlarmResponse result = new com.proto.alarm.AlarmResponse(this);
      result.securityPersonnel1_ = securityPersonnel1_;
      result.securityPersonnel2_ = securityPersonnel2_;
      result.securityPersonnel3_ = securityPersonnel3_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.alarm.AlarmResponse) {
        return mergeFrom((com.proto.alarm.AlarmResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.alarm.AlarmResponse other) {
      if (other == com.proto.alarm.AlarmResponse.getDefaultInstance()) return this;
      if (!other.getSecurityPersonnel1().isEmpty()) {
        securityPersonnel1_ = other.securityPersonnel1_;
        onChanged();
      }
      if (!other.getSecurityPersonnel2().isEmpty()) {
        securityPersonnel2_ = other.securityPersonnel2_;
        onChanged();
      }
      if (!other.getSecurityPersonnel3().isEmpty()) {
        securityPersonnel3_ = other.securityPersonnel3_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.alarm.AlarmResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.alarm.AlarmResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object securityPersonnel1_ = "";
    /**
     * <code>string securityPersonnel1 = 1;</code>
     * @return The securityPersonnel1.
     */
    public java.lang.String getSecurityPersonnel1() {
      java.lang.Object ref = securityPersonnel1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityPersonnel1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string securityPersonnel1 = 1;</code>
     * @return The bytes for securityPersonnel1.
     */
    public com.google.protobuf.ByteString
        getSecurityPersonnel1Bytes() {
      java.lang.Object ref = securityPersonnel1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityPersonnel1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string securityPersonnel1 = 1;</code>
     * @param value The securityPersonnel1 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityPersonnel1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityPersonnel1() {
      
      securityPersonnel1_ = getDefaultInstance().getSecurityPersonnel1();
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel1 = 1;</code>
     * @param value The bytes for securityPersonnel1 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityPersonnel1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object securityPersonnel2_ = "";
    /**
     * <code>string securityPersonnel2 = 2;</code>
     * @return The securityPersonnel2.
     */
    public java.lang.String getSecurityPersonnel2() {
      java.lang.Object ref = securityPersonnel2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityPersonnel2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string securityPersonnel2 = 2;</code>
     * @return The bytes for securityPersonnel2.
     */
    public com.google.protobuf.ByteString
        getSecurityPersonnel2Bytes() {
      java.lang.Object ref = securityPersonnel2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityPersonnel2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string securityPersonnel2 = 2;</code>
     * @param value The securityPersonnel2 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityPersonnel2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityPersonnel2() {
      
      securityPersonnel2_ = getDefaultInstance().getSecurityPersonnel2();
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel2 = 2;</code>
     * @param value The bytes for securityPersonnel2 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityPersonnel2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object securityPersonnel3_ = "";
    /**
     * <code>string securityPersonnel3 = 3;</code>
     * @return The securityPersonnel3.
     */
    public java.lang.String getSecurityPersonnel3() {
      java.lang.Object ref = securityPersonnel3_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityPersonnel3_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string securityPersonnel3 = 3;</code>
     * @return The bytes for securityPersonnel3.
     */
    public com.google.protobuf.ByteString
        getSecurityPersonnel3Bytes() {
      java.lang.Object ref = securityPersonnel3_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityPersonnel3_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string securityPersonnel3 = 3;</code>
     * @param value The securityPersonnel3 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel3(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityPersonnel3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel3 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityPersonnel3() {
      
      securityPersonnel3_ = getDefaultInstance().getSecurityPersonnel3();
      onChanged();
      return this;
    }
    /**
     * <code>string securityPersonnel3 = 3;</code>
     * @param value The bytes for securityPersonnel3 to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityPersonnel3Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityPersonnel3_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:camera.AlarmResponse)
  }

  // @@protoc_insertion_point(class_scope:camera.AlarmResponse)
  private static final com.proto.alarm.AlarmResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.alarm.AlarmResponse();
  }

  public static com.proto.alarm.AlarmResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlarmResponse>() {
    @java.lang.Override
    public AlarmResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.alarm.AlarmResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

