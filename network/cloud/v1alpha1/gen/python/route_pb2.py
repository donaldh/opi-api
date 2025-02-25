# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: route.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0broute.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x12networktypes.proto\x1a\x19google/api/resource.proto\"\xe4\x01\n\nRouteTable\x12\x0c\n\x04name\x18\x01 \x01(\t\x12<\n\x04spec\x18\x02 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.RouteTableSpec\x12@\n\x06status\x18\x03 \x01(\x0b\x32\x30.opi_api.network.cloud.v1alpha1.RouteTableStatus:H\xea\x41\x45\n)opi_api.network.cloud.v1alpha1/routetable\x12\x18routetables/{routetable}\"\x9d\x01\n\x0eRouteTableSpec\x12\x37\n\x02\x61\x66\x18\x01 \x01(\x0e\x32+.opi_api.network.opinetcommon.v1alpha1.IpAf\x12\x17\n\x0fpriority_enable\x18\x02 \x01(\x08\x12\x39\n\x06routes\x18\x03 \x03(\x0b\x32).opi_api.network.cloud.v1alpha1.RouteInfo\"X\n\tRouteInfo\x12\x10\n\x08route_id\x18\x01 \x01(\t\x12\x39\n\x05\x61ttrs\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.RouteAttrs\"\xce\x01\n\x10RouteTableStatus\x12\x11\n\tvpc_count\x18\x01 \x01(\x05\x12\x14\n\x0csubnet_count\x18\x02 \x01(\x05\x12\x12\n\nvnic_count\x18\x03 \x01(\x05\x12\x0f\n\x07pool_id\x18\x04 \x01(\x05\x12\x0e\n\x06hw_idx\x18\x05 \x01(\x05\x12 \n\x18route_table_base_address\x18\x06 \x01(\x04\x12\x18\n\x10hw_lpm_block_idx\x18\x07 \x01(\x05\x12 \n\x18hw_lpm_rewrite_block_idx\x18\x08 \x01(\x05\"\xc3\x04\n\nRouteAttrs\x12?\n\x06prefix\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefix\x12?\n\x0broute_class\x18\x02 \x01(\x0e\x32*.opi_api.network.cloud.v1alpha1.RouteClass\x12\x16\n\x0e\x63lass_priority\x18\x03 \x01(\x05\x12\x10\n\x08priority\x18\x04 \x01(\x05\x12R\n\x12overlay_nh_ip_info\x18\x05 \x01(\x0b\x32\x34.opi_api.network.cloud.v1alpha1.OverlayNextHopIPInfoH\x00\x12\x1a\n\x10nexthop_name_ref\x18\x06 \x01(\tH\x00\x12\x1b\n\x11nh_group_name_ref\x18\x07 \x01(\tH\x00\x12\x44\n\x0bvpc_nh_info\x18\x08 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.VPCPeerNhInfoH\x00\x12\x19\n\x0ftunnel_name_ref\x18\t \x01(\tH\x00\x12\x1e\n\x14route_table_name_ref\x18\n \x01(\tH\x00\x12\x16\n\x0c\x65val_mapping\x18\x0b \x01(\x08H\x00\x12\x0b\n\x03tos\x18\x0c \x01(\x05\x12;\n\x05\x65ncap\x18\r \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.Encap\x12\x13\n\x0boverlay_mac\x18\x0e \x01(\x0c\x42\x04\n\x02nh\"C\n\rVPCPeerNhInfo\x12\x14\n\x0cvpc_name_ref\x18\x01 \x01(\t\x12\x1c\n\x14route_table_name_ref\x18\x02 \x01(\t\"\x87\x01\n\x14OverlayNextHopIPInfo\x12\x44\n\nnexthop_ip\x18\x01 \x03(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddress\x12\x13\n\x0bnexthop_mac\x18\x02 \x03(\x0c\x12\x14\n\x0cvpc_name_ref\x18\x03 \x01(\t\"9\n\x07RouteId\x12\x10\n\x08route_id\x18\x01 \x01(\t\x12\x1c\n\x14route_table_name_ref\x18\x02 \x01(\t\"\xc6\x01\n\x05Route\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x37\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.cloud.v1alpha1.RouteSpec\x12;\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.RouteStatus:9\xea\x41\x36\n$opi_api.network.cloud.v1alpha1/route\x12\x0eroutes/{route}\"d\n\tRouteSpec\x12\x1c\n\x14route_table_name_ref\x18\x01 \x01(\t\x12\x39\n\x05\x61ttrs\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.RouteAttrs\"\r\n\x0bRouteStatus*q\n\nRouteClass\x12\x1b\n\x17ROUTE_CLASS_UNSPECIFIED\x10\x00\x12\x18\n\x14ROUTE_CLASS_INTERNET\x10\x01\x12\x17\n\x13ROUTE_CLASS_SERVICE\x10\x02\x12\x13\n\x0fROUTE_CLASS_VPC\x10\x03\x42k\n\x1eopi_api.network.cloud.v1alpha1B\nRouteProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_ROUTECLASS = DESCRIPTOR.enum_types_by_name['RouteClass']
RouteClass = enum_type_wrapper.EnumTypeWrapper(_ROUTECLASS)
ROUTE_CLASS_UNSPECIFIED = 0
ROUTE_CLASS_INTERNET = 1
ROUTE_CLASS_SERVICE = 2
ROUTE_CLASS_VPC = 3


_ROUTETABLE = DESCRIPTOR.message_types_by_name['RouteTable']
_ROUTETABLESPEC = DESCRIPTOR.message_types_by_name['RouteTableSpec']
_ROUTEINFO = DESCRIPTOR.message_types_by_name['RouteInfo']
_ROUTETABLESTATUS = DESCRIPTOR.message_types_by_name['RouteTableStatus']
_ROUTEATTRS = DESCRIPTOR.message_types_by_name['RouteAttrs']
_VPCPEERNHINFO = DESCRIPTOR.message_types_by_name['VPCPeerNhInfo']
_OVERLAYNEXTHOPIPINFO = DESCRIPTOR.message_types_by_name['OverlayNextHopIPInfo']
_ROUTEID = DESCRIPTOR.message_types_by_name['RouteId']
_ROUTE = DESCRIPTOR.message_types_by_name['Route']
_ROUTESPEC = DESCRIPTOR.message_types_by_name['RouteSpec']
_ROUTESTATUS = DESCRIPTOR.message_types_by_name['RouteStatus']
RouteTable = _reflection.GeneratedProtocolMessageType('RouteTable', (_message.Message,), {
  'DESCRIPTOR' : _ROUTETABLE,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteTable)
  })
_sym_db.RegisterMessage(RouteTable)

RouteTableSpec = _reflection.GeneratedProtocolMessageType('RouteTableSpec', (_message.Message,), {
  'DESCRIPTOR' : _ROUTETABLESPEC,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteTableSpec)
  })
_sym_db.RegisterMessage(RouteTableSpec)

RouteInfo = _reflection.GeneratedProtocolMessageType('RouteInfo', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEINFO,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteInfo)
  })
_sym_db.RegisterMessage(RouteInfo)

RouteTableStatus = _reflection.GeneratedProtocolMessageType('RouteTableStatus', (_message.Message,), {
  'DESCRIPTOR' : _ROUTETABLESTATUS,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteTableStatus)
  })
_sym_db.RegisterMessage(RouteTableStatus)

RouteAttrs = _reflection.GeneratedProtocolMessageType('RouteAttrs', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEATTRS,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteAttrs)
  })
_sym_db.RegisterMessage(RouteAttrs)

VPCPeerNhInfo = _reflection.GeneratedProtocolMessageType('VPCPeerNhInfo', (_message.Message,), {
  'DESCRIPTOR' : _VPCPEERNHINFO,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VPCPeerNhInfo)
  })
_sym_db.RegisterMessage(VPCPeerNhInfo)

OverlayNextHopIPInfo = _reflection.GeneratedProtocolMessageType('OverlayNextHopIPInfo', (_message.Message,), {
  'DESCRIPTOR' : _OVERLAYNEXTHOPIPINFO,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.OverlayNextHopIPInfo)
  })
_sym_db.RegisterMessage(OverlayNextHopIPInfo)

RouteId = _reflection.GeneratedProtocolMessageType('RouteId', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEID,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteId)
  })
_sym_db.RegisterMessage(RouteId)

Route = _reflection.GeneratedProtocolMessageType('Route', (_message.Message,), {
  'DESCRIPTOR' : _ROUTE,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.Route)
  })
_sym_db.RegisterMessage(Route)

RouteSpec = _reflection.GeneratedProtocolMessageType('RouteSpec', (_message.Message,), {
  'DESCRIPTOR' : _ROUTESPEC,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteSpec)
  })
_sym_db.RegisterMessage(RouteSpec)

RouteStatus = _reflection.GeneratedProtocolMessageType('RouteStatus', (_message.Message,), {
  'DESCRIPTOR' : _ROUTESTATUS,
  '__module__' : 'route_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.RouteStatus)
  })
_sym_db.RegisterMessage(RouteStatus)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\nRouteProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _ROUTETABLE._options = None
  _ROUTETABLE._serialized_options = b'\352AE\n)opi_api.network.cloud.v1alpha1/routetable\022\030routetables/{routetable}'
  _ROUTE._options = None
  _ROUTE._serialized_options = b'\352A6\n$opi_api.network.cloud.v1alpha1/route\022\016routes/{route}'
  _ROUTECLASS._serialized_start=1950
  _ROUTECLASS._serialized_end=2063
  _ROUTETABLE._serialized_start=95
  _ROUTETABLE._serialized_end=323
  _ROUTETABLESPEC._serialized_start=326
  _ROUTETABLESPEC._serialized_end=483
  _ROUTEINFO._serialized_start=485
  _ROUTEINFO._serialized_end=573
  _ROUTETABLESTATUS._serialized_start=576
  _ROUTETABLESTATUS._serialized_end=782
  _ROUTEATTRS._serialized_start=785
  _ROUTEATTRS._serialized_end=1364
  _VPCPEERNHINFO._serialized_start=1366
  _VPCPEERNHINFO._serialized_end=1433
  _OVERLAYNEXTHOPIPINFO._serialized_start=1436
  _OVERLAYNEXTHOPIPINFO._serialized_end=1571
  _ROUTEID._serialized_start=1573
  _ROUTEID._serialized_end=1630
  _ROUTE._serialized_start=1633
  _ROUTE._serialized_end=1831
  _ROUTESPEC._serialized_start=1833
  _ROUTESPEC._serialized_end=1933
  _ROUTESTATUS._serialized_start=1935
  _ROUTESTATUS._serialized_end=1948
# @@protoc_insertion_point(module_scope)
