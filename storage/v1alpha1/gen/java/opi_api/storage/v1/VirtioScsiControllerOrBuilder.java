// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface VirtioScsiControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.VirtioScsiController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2;</code>
   * @return Whether the pcieId field is set.
   */
  boolean hasPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2;</code>
   * @return The pcieId.
   */
  opi_api.storage.v1.PciEndpoint getPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2;</code>
   */
  opi_api.storage.v1.PciEndpointOrBuilder getPcieIdOrBuilder();

  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   * @return Whether the minLimit field is set.
   */
  boolean hasMinLimit();
  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   * @return The minLimit.
   */
  opi_api.storage.v1.QosLimit getMinLimit();
  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMinLimitOrBuilder();

  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   * @return Whether the maxLimit field is set.
   */
  boolean hasMaxLimit();
  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   * @return The maxLimit.
   */
  opi_api.storage.v1.QosLimit getMaxLimit();
  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMaxLimitOrBuilder();
}
