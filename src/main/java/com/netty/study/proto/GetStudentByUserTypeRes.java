// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.netty.study.proto;

/**
 * Protobuf type {@code com.netty.study.proto.GetStudentByUserTypeRes}
 */
public  final class GetStudentByUserTypeRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.netty.study.proto.GetStudentByUserTypeRes)
    GetStudentByUserTypeResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetStudentByUserTypeRes.newBuilder() to construct.
  private GetStudentByUserTypeRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetStudentByUserTypeRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetStudentByUserTypeRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetStudentByUserTypeRes(
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
          case 8: {

            usernumber_ = input.readInt32();
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
    return com.netty.study.proto.StudentProto.internal_static_com_netty_study_proto_GetStudentByUserTypeRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.netty.study.proto.StudentProto.internal_static_com_netty_study_proto_GetStudentByUserTypeRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.netty.study.proto.GetStudentByUserTypeRes.class, com.netty.study.proto.GetStudentByUserTypeRes.Builder.class);
  }

  public static final int USERNUMBER_FIELD_NUMBER = 1;
  private int usernumber_;
  /**
   * <code>int32 usernumber = 1;</code>
   * @return The usernumber.
   */
  public int getUsernumber() {
    return usernumber_;
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
    if (usernumber_ != 0) {
      output.writeInt32(1, usernumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (usernumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, usernumber_);
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
    if (!(obj instanceof com.netty.study.proto.GetStudentByUserTypeRes)) {
      return super.equals(obj);
    }
    com.netty.study.proto.GetStudentByUserTypeRes other = (com.netty.study.proto.GetStudentByUserTypeRes) obj;

    if (getUsernumber()
        != other.getUsernumber()) return false;
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
    hash = (37 * hash) + USERNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getUsernumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.netty.study.proto.GetStudentByUserTypeRes parseFrom(
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
  public static Builder newBuilder(com.netty.study.proto.GetStudentByUserTypeRes prototype) {
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
   * Protobuf type {@code com.netty.study.proto.GetStudentByUserTypeRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.netty.study.proto.GetStudentByUserTypeRes)
      com.netty.study.proto.GetStudentByUserTypeResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netty.study.proto.StudentProto.internal_static_com_netty_study_proto_GetStudentByUserTypeRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netty.study.proto.StudentProto.internal_static_com_netty_study_proto_GetStudentByUserTypeRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netty.study.proto.GetStudentByUserTypeRes.class, com.netty.study.proto.GetStudentByUserTypeRes.Builder.class);
    }

    // Construct using com.netty.study.proto.GetStudentByUserTypeRes.newBuilder()
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
      usernumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.netty.study.proto.StudentProto.internal_static_com_netty_study_proto_GetStudentByUserTypeRes_descriptor;
    }

    @java.lang.Override
    public com.netty.study.proto.GetStudentByUserTypeRes getDefaultInstanceForType() {
      return com.netty.study.proto.GetStudentByUserTypeRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.netty.study.proto.GetStudentByUserTypeRes build() {
      com.netty.study.proto.GetStudentByUserTypeRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.netty.study.proto.GetStudentByUserTypeRes buildPartial() {
      com.netty.study.proto.GetStudentByUserTypeRes result = new com.netty.study.proto.GetStudentByUserTypeRes(this);
      result.usernumber_ = usernumber_;
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
      if (other instanceof com.netty.study.proto.GetStudentByUserTypeRes) {
        return mergeFrom((com.netty.study.proto.GetStudentByUserTypeRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.netty.study.proto.GetStudentByUserTypeRes other) {
      if (other == com.netty.study.proto.GetStudentByUserTypeRes.getDefaultInstance()) return this;
      if (other.getUsernumber() != 0) {
        setUsernumber(other.getUsernumber());
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
      com.netty.study.proto.GetStudentByUserTypeRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.netty.study.proto.GetStudentByUserTypeRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int usernumber_ ;
    /**
     * <code>int32 usernumber = 1;</code>
     * @return The usernumber.
     */
    public int getUsernumber() {
      return usernumber_;
    }
    /**
     * <code>int32 usernumber = 1;</code>
     * @param value The usernumber to set.
     * @return This builder for chaining.
     */
    public Builder setUsernumber(int value) {
      
      usernumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 usernumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsernumber() {
      
      usernumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.netty.study.proto.GetStudentByUserTypeRes)
  }

  // @@protoc_insertion_point(class_scope:com.netty.study.proto.GetStudentByUserTypeRes)
  private static final com.netty.study.proto.GetStudentByUserTypeRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.netty.study.proto.GetStudentByUserTypeRes();
  }

  public static com.netty.study.proto.GetStudentByUserTypeRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStudentByUserTypeRes>
      PARSER = new com.google.protobuf.AbstractParser<GetStudentByUserTypeRes>() {
    @java.lang.Override
    public GetStudentByUserTypeRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetStudentByUserTypeRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetStudentByUserTypeRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStudentByUserTypeRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.netty.study.proto.GetStudentByUserTypeRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

