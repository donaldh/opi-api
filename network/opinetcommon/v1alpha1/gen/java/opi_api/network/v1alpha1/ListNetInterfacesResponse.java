// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

/**
 * <pre>
 * List of Interfaces Response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.v1alpha1.ListNetInterfacesResponse}
 */
public final class ListNetInterfacesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.v1alpha1.ListNetInterfacesResponse)
    ListNetInterfacesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNetInterfacesResponse.newBuilder() to construct.
  private ListNetInterfacesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNetInterfacesResponse() {
    netInterfaces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNetInterfacesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNetInterfacesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              netInterfaces_ = new java.util.ArrayList<opi_api.network.v1alpha1.NetInterface>();
              mutable_bitField0_ |= 0x00000001;
            }
            netInterfaces_.add(
                input.readMessage(opi_api.network.v1alpha1.NetInterface.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        netInterfaces_ = java.util.Collections.unmodifiableList(netInterfaces_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_ListNetInterfacesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_ListNetInterfacesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.v1alpha1.ListNetInterfacesResponse.class, opi_api.network.v1alpha1.ListNetInterfacesResponse.Builder.class);
  }

  public static final int NET_INTERFACES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.v1alpha1.NetInterface> netInterfaces_;
  /**
   * <pre>
   * List of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.v1alpha1.NetInterface> getNetInterfacesList() {
    return netInterfaces_;
  }
  /**
   * <pre>
   * List of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.v1alpha1.NetInterfaceOrBuilder> 
      getNetInterfacesOrBuilderList() {
    return netInterfaces_;
  }
  /**
   * <pre>
   * List of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
   */
  @java.lang.Override
  public int getNetInterfacesCount() {
    return netInterfaces_.size();
  }
  /**
   * <pre>
   * List of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.v1alpha1.NetInterface getNetInterfaces(int index) {
    return netInterfaces_.get(index);
  }
  /**
   * <pre>
   * List of interfaces
   * </pre>
   *
   * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.v1alpha1.NetInterfaceOrBuilder getNetInterfacesOrBuilder(
      int index) {
    return netInterfaces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < netInterfaces_.size(); i++) {
      output.writeMessage(1, netInterfaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < netInterfaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, netInterfaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.v1alpha1.ListNetInterfacesResponse)) {
      return super.equals(obj);
    }
    opi_api.network.v1alpha1.ListNetInterfacesResponse other = (opi_api.network.v1alpha1.ListNetInterfacesResponse) obj;

    if (!getNetInterfacesList()
        .equals(other.getNetInterfacesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getNetInterfacesCount() > 0) {
      hash = (37 * hash) + NET_INTERFACES_FIELD_NUMBER;
      hash = (53 * hash) + getNetInterfacesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.ListNetInterfacesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.v1alpha1.ListNetInterfacesResponse prototype) {
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
   * List of Interfaces Response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.v1alpha1.ListNetInterfacesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.v1alpha1.ListNetInterfacesResponse)
      opi_api.network.v1alpha1.ListNetInterfacesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_ListNetInterfacesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_ListNetInterfacesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.v1alpha1.ListNetInterfacesResponse.class, opi_api.network.v1alpha1.ListNetInterfacesResponse.Builder.class);
    }

    // Construct using opi_api.network.v1alpha1.ListNetInterfacesResponse.newBuilder()
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
        getNetInterfacesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (netInterfacesBuilder_ == null) {
        netInterfaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        netInterfacesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_ListNetInterfacesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.ListNetInterfacesResponse getDefaultInstanceForType() {
      return opi_api.network.v1alpha1.ListNetInterfacesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.ListNetInterfacesResponse build() {
      opi_api.network.v1alpha1.ListNetInterfacesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.ListNetInterfacesResponse buildPartial() {
      opi_api.network.v1alpha1.ListNetInterfacesResponse result = new opi_api.network.v1alpha1.ListNetInterfacesResponse(this);
      int from_bitField0_ = bitField0_;
      if (netInterfacesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          netInterfaces_ = java.util.Collections.unmodifiableList(netInterfaces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.netInterfaces_ = netInterfaces_;
      } else {
        result.netInterfaces_ = netInterfacesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.v1alpha1.ListNetInterfacesResponse) {
        return mergeFrom((opi_api.network.v1alpha1.ListNetInterfacesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.v1alpha1.ListNetInterfacesResponse other) {
      if (other == opi_api.network.v1alpha1.ListNetInterfacesResponse.getDefaultInstance()) return this;
      if (netInterfacesBuilder_ == null) {
        if (!other.netInterfaces_.isEmpty()) {
          if (netInterfaces_.isEmpty()) {
            netInterfaces_ = other.netInterfaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNetInterfacesIsMutable();
            netInterfaces_.addAll(other.netInterfaces_);
          }
          onChanged();
        }
      } else {
        if (!other.netInterfaces_.isEmpty()) {
          if (netInterfacesBuilder_.isEmpty()) {
            netInterfacesBuilder_.dispose();
            netInterfacesBuilder_ = null;
            netInterfaces_ = other.netInterfaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            netInterfacesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNetInterfacesFieldBuilder() : null;
          } else {
            netInterfacesBuilder_.addAllMessages(other.netInterfaces_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.network.v1alpha1.ListNetInterfacesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.v1alpha1.ListNetInterfacesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.v1alpha1.NetInterface> netInterfaces_ =
      java.util.Collections.emptyList();
    private void ensureNetInterfacesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        netInterfaces_ = new java.util.ArrayList<opi_api.network.v1alpha1.NetInterface>(netInterfaces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.v1alpha1.NetInterface, opi_api.network.v1alpha1.NetInterface.Builder, opi_api.network.v1alpha1.NetInterfaceOrBuilder> netInterfacesBuilder_;

    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public java.util.List<opi_api.network.v1alpha1.NetInterface> getNetInterfacesList() {
      if (netInterfacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(netInterfaces_);
      } else {
        return netInterfacesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public int getNetInterfacesCount() {
      if (netInterfacesBuilder_ == null) {
        return netInterfaces_.size();
      } else {
        return netInterfacesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public opi_api.network.v1alpha1.NetInterface getNetInterfaces(int index) {
      if (netInterfacesBuilder_ == null) {
        return netInterfaces_.get(index);
      } else {
        return netInterfacesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder setNetInterfaces(
        int index, opi_api.network.v1alpha1.NetInterface value) {
      if (netInterfacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetInterfacesIsMutable();
        netInterfaces_.set(index, value);
        onChanged();
      } else {
        netInterfacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder setNetInterfaces(
        int index, opi_api.network.v1alpha1.NetInterface.Builder builderForValue) {
      if (netInterfacesBuilder_ == null) {
        ensureNetInterfacesIsMutable();
        netInterfaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        netInterfacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder addNetInterfaces(opi_api.network.v1alpha1.NetInterface value) {
      if (netInterfacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetInterfacesIsMutable();
        netInterfaces_.add(value);
        onChanged();
      } else {
        netInterfacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder addNetInterfaces(
        int index, opi_api.network.v1alpha1.NetInterface value) {
      if (netInterfacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetInterfacesIsMutable();
        netInterfaces_.add(index, value);
        onChanged();
      } else {
        netInterfacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder addNetInterfaces(
        opi_api.network.v1alpha1.NetInterface.Builder builderForValue) {
      if (netInterfacesBuilder_ == null) {
        ensureNetInterfacesIsMutable();
        netInterfaces_.add(builderForValue.build());
        onChanged();
      } else {
        netInterfacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder addNetInterfaces(
        int index, opi_api.network.v1alpha1.NetInterface.Builder builderForValue) {
      if (netInterfacesBuilder_ == null) {
        ensureNetInterfacesIsMutable();
        netInterfaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        netInterfacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder addAllNetInterfaces(
        java.lang.Iterable<? extends opi_api.network.v1alpha1.NetInterface> values) {
      if (netInterfacesBuilder_ == null) {
        ensureNetInterfacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, netInterfaces_);
        onChanged();
      } else {
        netInterfacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder clearNetInterfaces() {
      if (netInterfacesBuilder_ == null) {
        netInterfaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        netInterfacesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public Builder removeNetInterfaces(int index) {
      if (netInterfacesBuilder_ == null) {
        ensureNetInterfacesIsMutable();
        netInterfaces_.remove(index);
        onChanged();
      } else {
        netInterfacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public opi_api.network.v1alpha1.NetInterface.Builder getNetInterfacesBuilder(
        int index) {
      return getNetInterfacesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public opi_api.network.v1alpha1.NetInterfaceOrBuilder getNetInterfacesOrBuilder(
        int index) {
      if (netInterfacesBuilder_ == null) {
        return netInterfaces_.get(index);  } else {
        return netInterfacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public java.util.List<? extends opi_api.network.v1alpha1.NetInterfaceOrBuilder> 
         getNetInterfacesOrBuilderList() {
      if (netInterfacesBuilder_ != null) {
        return netInterfacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(netInterfaces_);
      }
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public opi_api.network.v1alpha1.NetInterface.Builder addNetInterfacesBuilder() {
      return getNetInterfacesFieldBuilder().addBuilder(
          opi_api.network.v1alpha1.NetInterface.getDefaultInstance());
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public opi_api.network.v1alpha1.NetInterface.Builder addNetInterfacesBuilder(
        int index) {
      return getNetInterfacesFieldBuilder().addBuilder(
          index, opi_api.network.v1alpha1.NetInterface.getDefaultInstance());
    }
    /**
     * <pre>
     * List of interfaces
     * </pre>
     *
     * <code>repeated .opi_api.network.v1alpha1.NetInterface net_interfaces = 1;</code>
     */
    public java.util.List<opi_api.network.v1alpha1.NetInterface.Builder> 
         getNetInterfacesBuilderList() {
      return getNetInterfacesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.v1alpha1.NetInterface, opi_api.network.v1alpha1.NetInterface.Builder, opi_api.network.v1alpha1.NetInterfaceOrBuilder> 
        getNetInterfacesFieldBuilder() {
      if (netInterfacesBuilder_ == null) {
        netInterfacesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.v1alpha1.NetInterface, opi_api.network.v1alpha1.NetInterface.Builder, opi_api.network.v1alpha1.NetInterfaceOrBuilder>(
                netInterfaces_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        netInterfaces_ = null;
      }
      return netInterfacesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.v1alpha1.ListNetInterfacesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.ListNetInterfacesResponse)
  private static final opi_api.network.v1alpha1.ListNetInterfacesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.v1alpha1.ListNetInterfacesResponse();
  }

  public static opi_api.network.v1alpha1.ListNetInterfacesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNetInterfacesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNetInterfacesResponse>() {
    @java.lang.Override
    public ListNetInterfacesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNetInterfacesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNetInterfacesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNetInterfacesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.v1alpha1.ListNetInterfacesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

