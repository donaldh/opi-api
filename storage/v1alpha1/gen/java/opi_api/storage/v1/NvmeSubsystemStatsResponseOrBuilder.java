// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeSubsystemStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeSubsystemStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   * @return The stats.
   */
  opi_api.storage.v1.VolumeStats getStats();
  /**
   * <code>.opi_api.storage.v1.VolumeStats stats = 1;</code>
   */
  opi_api.storage.v1.VolumeStatsOrBuilder getStatsOrBuilder();
}
