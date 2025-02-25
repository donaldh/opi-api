// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * critical alerts effecting the health of the system
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.SystemAlert}
 */
public final class SystemAlert extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.SystemAlert)
    SystemAlertOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SystemAlert.newBuilder() to construct.
  private SystemAlert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SystemAlert() {
    alertDescription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SystemAlert();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SystemAlert(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (alertTime_ != null) {
              subBuilder = alertTime_.toBuilder();
            }
            alertTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(alertTime_);
              alertTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            alertDescription_ = s;
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
    return opi_api.network.cloud.v1alpha1.DeviceProto.internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.DeviceProto.internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.SystemAlert.class, opi_api.network.cloud.v1alpha1.SystemAlert.Builder.class);
  }

  public static final int ALERT_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp alertTime_;
  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   * @return Whether the alertTime field is set.
   */
  @java.lang.Override
  public boolean hasAlertTime() {
    return alertTime_ != null;
  }
  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   * @return The alertTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAlertTime() {
    return alertTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : alertTime_;
  }
  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAlertTimeOrBuilder() {
    return getAlertTime();
  }

  public static final int ALERT_DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object alertDescription_;
  /**
   * <pre>
   * name of the alert
   * </pre>
   *
   * <code>string alert_description = 2;</code>
   * @return The alertDescription.
   */
  @java.lang.Override
  public java.lang.String getAlertDescription() {
    java.lang.Object ref = alertDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alertDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name of the alert
   * </pre>
   *
   * <code>string alert_description = 2;</code>
   * @return The bytes for alertDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlertDescriptionBytes() {
    java.lang.Object ref = alertDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alertDescription_ = b;
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
    if (alertTime_ != null) {
      output.writeMessage(1, getAlertTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alertDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alertDescription_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alertTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAlertTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alertDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alertDescription_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.SystemAlert)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.SystemAlert other = (opi_api.network.cloud.v1alpha1.SystemAlert) obj;

    if (hasAlertTime() != other.hasAlertTime()) return false;
    if (hasAlertTime()) {
      if (!getAlertTime()
          .equals(other.getAlertTime())) return false;
    }
    if (!getAlertDescription()
        .equals(other.getAlertDescription())) return false;
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
    if (hasAlertTime()) {
      hash = (37 * hash) + ALERT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAlertTime().hashCode();
    }
    hash = (37 * hash) + ALERT_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getAlertDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SystemAlert parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.SystemAlert prototype) {
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
   * <pre>
   * critical alerts effecting the health of the system
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.SystemAlert}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.SystemAlert)
      opi_api.network.cloud.v1alpha1.SystemAlertOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.DeviceProto.internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.DeviceProto.internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.SystemAlert.class, opi_api.network.cloud.v1alpha1.SystemAlert.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.SystemAlert.newBuilder()
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
      if (alertTimeBuilder_ == null) {
        alertTime_ = null;
      } else {
        alertTime_ = null;
        alertTimeBuilder_ = null;
      }
      alertDescription_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.DeviceProto.internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SystemAlert getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.SystemAlert.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SystemAlert build() {
      opi_api.network.cloud.v1alpha1.SystemAlert result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SystemAlert buildPartial() {
      opi_api.network.cloud.v1alpha1.SystemAlert result = new opi_api.network.cloud.v1alpha1.SystemAlert(this);
      if (alertTimeBuilder_ == null) {
        result.alertTime_ = alertTime_;
      } else {
        result.alertTime_ = alertTimeBuilder_.build();
      }
      result.alertDescription_ = alertDescription_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.SystemAlert) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.SystemAlert)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.SystemAlert other) {
      if (other == opi_api.network.cloud.v1alpha1.SystemAlert.getDefaultInstance()) return this;
      if (other.hasAlertTime()) {
        mergeAlertTime(other.getAlertTime());
      }
      if (!other.getAlertDescription().isEmpty()) {
        alertDescription_ = other.alertDescription_;
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
      opi_api.network.cloud.v1alpha1.SystemAlert parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.SystemAlert) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp alertTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> alertTimeBuilder_;
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     * @return Whether the alertTime field is set.
     */
    public boolean hasAlertTime() {
      return alertTimeBuilder_ != null || alertTime_ != null;
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     * @return The alertTime.
     */
    public com.google.protobuf.Timestamp getAlertTime() {
      if (alertTimeBuilder_ == null) {
        return alertTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : alertTime_;
      } else {
        return alertTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public Builder setAlertTime(com.google.protobuf.Timestamp value) {
      if (alertTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        alertTime_ = value;
        onChanged();
      } else {
        alertTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public Builder setAlertTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (alertTimeBuilder_ == null) {
        alertTime_ = builderForValue.build();
        onChanged();
      } else {
        alertTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public Builder mergeAlertTime(com.google.protobuf.Timestamp value) {
      if (alertTimeBuilder_ == null) {
        if (alertTime_ != null) {
          alertTime_ =
            com.google.protobuf.Timestamp.newBuilder(alertTime_).mergeFrom(value).buildPartial();
        } else {
          alertTime_ = value;
        }
        onChanged();
      } else {
        alertTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public Builder clearAlertTime() {
      if (alertTimeBuilder_ == null) {
        alertTime_ = null;
        onChanged();
      } else {
        alertTime_ = null;
        alertTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getAlertTimeBuilder() {
      
      onChanged();
      return getAlertTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAlertTimeOrBuilder() {
      if (alertTimeBuilder_ != null) {
        return alertTimeBuilder_.getMessageOrBuilder();
      } else {
        return alertTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : alertTime_;
      }
    }
    /**
     * <pre>
     * alert timestamp
     * </pre>
     *
     * <code>.google.protobuf.Timestamp alert_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAlertTimeFieldBuilder() {
      if (alertTimeBuilder_ == null) {
        alertTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAlertTime(),
                getParentForChildren(),
                isClean());
        alertTime_ = null;
      }
      return alertTimeBuilder_;
    }

    private java.lang.Object alertDescription_ = "";
    /**
     * <pre>
     * name of the alert
     * </pre>
     *
     * <code>string alert_description = 2;</code>
     * @return The alertDescription.
     */
    public java.lang.String getAlertDescription() {
      java.lang.Object ref = alertDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alertDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name of the alert
     * </pre>
     *
     * <code>string alert_description = 2;</code>
     * @return The bytes for alertDescription.
     */
    public com.google.protobuf.ByteString
        getAlertDescriptionBytes() {
      java.lang.Object ref = alertDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alertDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name of the alert
     * </pre>
     *
     * <code>string alert_description = 2;</code>
     * @param value The alertDescription to set.
     * @return This builder for chaining.
     */
    public Builder setAlertDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alertDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the alert
     * </pre>
     *
     * <code>string alert_description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlertDescription() {
      
      alertDescription_ = getDefaultInstance().getAlertDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name of the alert
     * </pre>
     *
     * <code>string alert_description = 2;</code>
     * @param value The bytes for alertDescription to set.
     * @return This builder for chaining.
     */
    public Builder setAlertDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alertDescription_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.SystemAlert)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SystemAlert)
  private static final opi_api.network.cloud.v1alpha1.SystemAlert DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.SystemAlert();
  }

  public static opi_api.network.cloud.v1alpha1.SystemAlert getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SystemAlert>
      PARSER = new com.google.protobuf.AbstractParser<SystemAlert>() {
    @java.lang.Override
    public SystemAlert parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SystemAlert(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SystemAlert> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SystemAlert> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SystemAlert getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

