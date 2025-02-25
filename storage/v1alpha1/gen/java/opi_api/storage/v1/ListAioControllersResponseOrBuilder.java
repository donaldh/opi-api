// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface ListAioControllersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListAioControllersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.AioController aio_controllers = 1;</code>
   */
  java.util.List<opi_api.storage.v1.AioController> 
      getAioControllersList();
  /**
   * <code>repeated .opi_api.storage.v1.AioController aio_controllers = 1;</code>
   */
  opi_api.storage.v1.AioController getAioControllers(int index);
  /**
   * <code>repeated .opi_api.storage.v1.AioController aio_controllers = 1;</code>
   */
  int getAioControllersCount();
  /**
   * <code>repeated .opi_api.storage.v1.AioController aio_controllers = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
      getAioControllersOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.AioController aio_controllers = 1;</code>
   */
  opi_api.storage.v1.AioControllerOrBuilder getAioControllersOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
