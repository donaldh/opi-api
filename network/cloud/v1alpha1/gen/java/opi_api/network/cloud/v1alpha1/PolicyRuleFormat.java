// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * PolicyRuleFormat captures what format is used for the rules in a given
 * SecurityPolicySpec object
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.PolicyRuleFormat}
 */
public enum PolicyRuleFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * POLICY_RULE_FORMAT_UNSPECIFIED indicates that user has not set format
   * explicitly, in which case POLICY_RULE_FORMAT_FLATTENED is assumed
   * for an implementation is agnostic to flattened or compressed rules
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_UNSPECIFIED = 0;</code>
   */
  POLICY_RULE_FORMAT_UNSPECIFIED(0),
  /**
   * <pre>
   * POLICY_RULE_FORMAT_FLATTENED is used when xPU expands the
   * user configured rules so that each rule has only single source
   * IP address/prefix/range, destination IP address/prefix/range,
   * source port range, destination port range as match conditions
   * In this format none of the rules must use SrcIPList,
   * DstIPList, PortList, ICMPMatchList attributes, wherever applicable
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_FLATTENED = 1;</code>
   */
  POLICY_RULE_FORMAT_FLATTENED(1),
  /**
   * <pre>
   * POLICY_RULE_FORMAT_COMPACT is used when rules contain list of
   * source IP, destination IP, src port range, destination port ranges
   * as match conditions
   * In this format, ALL the rules must use SrcIPList, DstIPList,
   * PortList, ICMPMatchList attributes only, whereever applicable
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_COMPACT = 2;</code>
   */
  POLICY_RULE_FORMAT_COMPACT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * POLICY_RULE_FORMAT_UNSPECIFIED indicates that user has not set format
   * explicitly, in which case POLICY_RULE_FORMAT_FLATTENED is assumed
   * for an implementation is agnostic to flattened or compressed rules
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int POLICY_RULE_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * POLICY_RULE_FORMAT_FLATTENED is used when xPU expands the
   * user configured rules so that each rule has only single source
   * IP address/prefix/range, destination IP address/prefix/range,
   * source port range, destination port range as match conditions
   * In this format none of the rules must use SrcIPList,
   * DstIPList, PortList, ICMPMatchList attributes, wherever applicable
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_FLATTENED = 1;</code>
   */
  public static final int POLICY_RULE_FORMAT_FLATTENED_VALUE = 1;
  /**
   * <pre>
   * POLICY_RULE_FORMAT_COMPACT is used when rules contain list of
   * source IP, destination IP, src port range, destination port ranges
   * as match conditions
   * In this format, ALL the rules must use SrcIPList, DstIPList,
   * PortList, ICMPMatchList attributes only, whereever applicable
   * </pre>
   *
   * <code>POLICY_RULE_FORMAT_COMPACT = 2;</code>
   */
  public static final int POLICY_RULE_FORMAT_COMPACT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PolicyRuleFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PolicyRuleFormat forNumber(int value) {
    switch (value) {
      case 0: return POLICY_RULE_FORMAT_UNSPECIFIED;
      case 1: return POLICY_RULE_FORMAT_FLATTENED;
      case 2: return POLICY_RULE_FORMAT_COMPACT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PolicyRuleFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PolicyRuleFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PolicyRuleFormat>() {
          public PolicyRuleFormat findValueByNumber(int number) {
            return PolicyRuleFormat.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final PolicyRuleFormat[] VALUES = values();

  public static PolicyRuleFormat valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PolicyRuleFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.PolicyRuleFormat)
}

