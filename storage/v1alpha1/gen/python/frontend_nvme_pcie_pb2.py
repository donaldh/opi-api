# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_nvme_pcie.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import common_pb2 as common__pb2
import object_key_pb2 as object__key__pb2
import uuid_pb2 as uuid__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x66rontend_nvme_pcie.proto\x12\x12opi_api.storage.v1\x1a\x0c\x63ommon.proto\x1a\x10object_key.proto\x1a\nuuid.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\"\xb8\x01\n\rNVMeSubsystem\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0b\n\x03nqn\x18\x02 \x01(\t\x12\x15\n\rserial_number\x18\x03 \x01(\t\x12\x14\n\x0cmodel_number\x18\x04 \x01(\t\x12\x16\n\x0emax_namespaces\x18\x05 \x01(\x03\x12\x19\n\x11\x66irmware_revision\x18\x06 \x01(\t\x12\x10\n\x08\x66ru_guid\x18\x07 \x01(\x0c\"\x9a\x02\n\x0eNVMeController\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x1a\n\x12nvme_controller_id\x18\x02 \x01(\x05\x12\x32\n\x0csubsystem_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x38\n\x07pcie_id\x18\x04 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeControllerPciId\x12\x0f\n\x07max_nsq\x18\x05 \x01(\x05\x12\x0f\n\x07max_ncq\x18\x06 \x01(\x05\x12\x0c\n\x04sqes\x18\x07 \x01(\x05\x12\x0c\n\x04\x63qes\x18\x08 \x01(\x05\x12\x16\n\x0emax_namespaces\x18\t \x01(\x05\"\x91\x03\n\rNVMeNamespace\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x32\n\x0csubsystem_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x33\n\rcontroller_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x11\n\thost_nsid\x18\x04 \x01(\x05\x12\x12\n\nblock_size\x18\x05 \x01(\x03\x12\x14\n\x0c\x62locks_count\x18\x06 \x01(\x03\x12\r\n\x05nguid\x18\x07 \x01(\t\x12\r\n\x05\x65ui64\x18\x08 \x01(\x03\x12%\n\x04uuid\x18\t \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\x12/\n\tvolume_id\x18\n \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x1a\n\x12optimal_write_size\x18\x0b \x01(\x05\x12\x1e\n\x16pref_write_granularity\x18\x0c \x01(\x05\"R\n\x1aNVMeSubsystemCreateRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"P\n\x1aNVMeSubsystemDeleteRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"R\n\x1aNVMeSubsystemUpdateRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"\x1a\n\x18NVMeSubsystemListRequest\"Q\n\x19NVMeSubsystemListResponse\x12\x34\n\tsubsystem\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"M\n\x17NVMeSubsystemGetRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"O\n\x19NVMeSubsystemStatsRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"+\n\x1aNVMeSubsystemStatsResponse\x12\r\n\x05stats\x18\x01 \x01(\t\"U\n\x1bNVMeControllerCreateRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"R\n\x1bNVMeControllerDeleteRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x1bNVMeControllerUpdateRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"O\n\x19NVMeControllerListRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"T\n\x1aNVMeControllerListResponse\x12\x36\n\ncontroller\x18\x01 \x03(\x0b\x32\".opi_api.storage.v1.NVMeController\"O\n\x18NVMeControllerGetRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"F\n\x1aNVMeControllerStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"V\n\x1bNVMeControllerStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t\"R\n\x1aNVMeNamespaceCreateRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"P\n\x1aNVMeNamespaceDeleteRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"R\n\x1aNVMeNamespaceUpdateRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"\x83\x01\n\x18NVMeNamespaceListRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x33\n\rcontroller_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"Q\n\x19NVMeNamespaceListResponse\x12\x34\n\tnamespace\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"M\n\x17NVMeNamespaceGetRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"O\n\x19NVMeNamespaceStatsRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x1aNVMeNamespaceStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t2\xb0\x13\n\x13\x46rontendNvmeService\x12\x8b\x01\n\x13NVMeSubsystemCreate\x12..opi_api.storage.v1.NVMeSubsystemCreateRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/subsystems:\tsubsystem\x12\x81\x01\n\x13NVMeSubsystemDelete\x12..opi_api.storage.v1.NVMeSubsystemDeleteRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/subsystems/{subsystem}\x12\x8b\x01\n\x13NVMeSubsystemUpdate\x12..opi_api.storage.v1.NVMeSubsystemUpdateRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/subsystems:\tsubsystem\x12\x88\x01\n\x11NVMeSubsystemList\x12,.opi_api.storage.v1.NVMeSubsystemListRequest\x1a-.opi_api.storage.v1.NVMeSubsystemListResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/subsystems\x12\x86\x01\n\x10NVMeSubsystemGet\x12+.opi_api.storage.v1.NVMeSubsystemGetRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/subsystems/{subsystem}\x12u\n\x12NVMeSubsystemStats\x12-.opi_api.storage.v1.NVMeSubsystemStatsRequest\x1a..opi_api.storage.v1.NVMeSubsystemStatsResponse\"\x00\x12\x90\x01\n\x14NVMeControllerCreate\x12/.opi_api.storage.v1.NVMeControllerCreateRequest\x1a\".opi_api.storage.v1.NVMeController\"#\x82\xd3\xe4\x93\x02\x1d\"\x0f/v1/controllers:\ncontroller\x12\x85\x01\n\x14NVMeControllerDelete\x12/.opi_api.storage.v1.NVMeControllerDeleteRequest\x1a\x16.google.protobuf.Empty\"$\x82\xd3\xe4\x93\x02\x1e*\x1c/v1/controllers/{controller}\x12\x90\x01\n\x14NVMeControllerUpdate\x12/.opi_api.storage.v1.NVMeControllerUpdateRequest\x1a\".opi_api.storage.v1.NVMeController\"#\x82\xd3\xe4\x93\x02\x1d\x32\x0f/v1/controllers:\ncontroller\x12\x8c\x01\n\x12NVMeControllerList\x12-.opi_api.storage.v1.NVMeControllerListRequest\x1a..opi_api.storage.v1.NVMeControllerListResponse\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v1/controllers\x12\x8b\x01\n\x11NVMeControllerGet\x12,.opi_api.storage.v1.NVMeControllerGetRequest\x1a\".opi_api.storage.v1.NVMeController\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/v1/controllers/{controller}\x12x\n\x13NVMeControllerStats\x12..opi_api.storage.v1.NVMeControllerStatsRequest\x1a/.opi_api.storage.v1.NVMeControllerStatsResponse\"\x00\x12\x8b\x01\n\x13NVMeNamespaceCreate\x12..opi_api.storage.v1.NVMeNamespaceCreateRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/namespaces:\tnamespace\x12\x81\x01\n\x13NVMeNamespaceDelete\x12..opi_api.storage.v1.NVMeNamespaceDeleteRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/namespaces/{namespace}\x12\x8b\x01\n\x13NVMeNamespaceUpdate\x12..opi_api.storage.v1.NVMeNamespaceUpdateRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/namespaces:\tnamespace\x12\x88\x01\n\x11NVMeNamespaceList\x12,.opi_api.storage.v1.NVMeNamespaceListRequest\x1a-.opi_api.storage.v1.NVMeNamespaceListResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/namespaces\x12\x86\x01\n\x10NVMeNamespaceGet\x12+.opi_api.storage.v1.NVMeNamespaceGetRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/namespaces/{namespace}\x12u\n\x12NVMeNamespaceStats\x12-.opi_api.storage.v1.NVMeNamespaceStatsRequest\x1a..opi_api.storage.v1.NVMeNamespaceStatsResponse\"\x00\x42\x64\n\x12opi_api.storage.v1B\x15\x46rontendNvmePcieProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_NVMESUBSYSTEM = DESCRIPTOR.message_types_by_name['NVMeSubsystem']
_NVMECONTROLLER = DESCRIPTOR.message_types_by_name['NVMeController']
_NVMENAMESPACE = DESCRIPTOR.message_types_by_name['NVMeNamespace']
_NVMESUBSYSTEMCREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemCreateRequest']
_NVMESUBSYSTEMDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemDeleteRequest']
_NVMESUBSYSTEMUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemUpdateRequest']
_NVMESUBSYSTEMLISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemListRequest']
_NVMESUBSYSTEMLISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemListResponse']
_NVMESUBSYSTEMGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemGetRequest']
_NVMESUBSYSTEMSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsRequest']
_NVMESUBSYSTEMSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsResponse']
_NVMECONTROLLERCREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerCreateRequest']
_NVMECONTROLLERDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerDeleteRequest']
_NVMECONTROLLERUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerUpdateRequest']
_NVMECONTROLLERLISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerListRequest']
_NVMECONTROLLERLISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerListResponse']
_NVMECONTROLLERGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerGetRequest']
_NVMECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerStatsRequest']
_NVMECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerStatsResponse']
_NVMENAMESPACECREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceCreateRequest']
_NVMENAMESPACEDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceDeleteRequest']
_NVMENAMESPACEUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceUpdateRequest']
_NVMENAMESPACELISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceListRequest']
_NVMENAMESPACELISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceListResponse']
_NVMENAMESPACEGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceGetRequest']
_NVMENAMESPACESTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsRequest']
_NVMENAMESPACESTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsResponse']
NVMeSubsystem = _reflection.GeneratedProtocolMessageType('NVMeSubsystem', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEM,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystem)
  })
_sym_db.RegisterMessage(NVMeSubsystem)

NVMeController = _reflection.GeneratedProtocolMessageType('NVMeController', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLER,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeController)
  })
_sym_db.RegisterMessage(NVMeController)

NVMeNamespace = _reflection.GeneratedProtocolMessageType('NVMeNamespace', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespace)
  })
_sym_db.RegisterMessage(NVMeNamespace)

NVMeSubsystemCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMCREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemCreateRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemCreateRequest)

NVMeSubsystemDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemDeleteRequest)

NVMeSubsystemUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemUpdateRequest)

NVMeSubsystemListRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMLISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemListRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemListRequest)

NVMeSubsystemListResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMLISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemListResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemListResponse)

NVMeSubsystemGetRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemGetRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemGetRequest)

NVMeSubsystemStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsRequest)

NVMeSubsystemStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsResponse)

NVMeControllerCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERCREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerCreateRequest)
  })
_sym_db.RegisterMessage(NVMeControllerCreateRequest)

NVMeControllerDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeControllerDeleteRequest)

NVMeControllerUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeControllerUpdateRequest)

NVMeControllerListRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERLISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerListRequest)
  })
_sym_db.RegisterMessage(NVMeControllerListRequest)

NVMeControllerListResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERLISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerListResponse)
  })
_sym_db.RegisterMessage(NVMeControllerListResponse)

NVMeControllerGetRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerGetRequest)
  })
_sym_db.RegisterMessage(NVMeControllerGetRequest)

NVMeControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMeControllerStatsRequest)

NVMeControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMeControllerStatsResponse)

NVMeNamespaceCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACECREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceCreateRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceCreateRequest)

NVMeNamespaceDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceDeleteRequest)

NVMeNamespaceUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceUpdateRequest)

NVMeNamespaceListRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACELISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceListRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceListRequest)

NVMeNamespaceListResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACELISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceListResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceListResponse)

NVMeNamespaceGetRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceGetRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceGetRequest)

NVMeNamespaceStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsRequest)

NVMeNamespaceStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsResponse)

_FRONTENDNVMESERVICE = DESCRIPTOR.services_by_name['FrontendNvmeService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\025FrontendNvmePcieProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemCreate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemCreate']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/subsystems:\tsubsystem'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemDelete']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemDelete']._serialized_options = b'\202\323\344\223\002\034*\032/v1/subsystems/{subsystem}'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemUpdate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemUpdate']._serialized_options = b'\202\323\344\223\002\0332\016/v1/subsystems:\tsubsystem'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemList']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemList']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/subsystems'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemGet']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeSubsystemGet']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/subsystems/{subsystem}'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerCreate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerCreate']._serialized_options = b'\202\323\344\223\002\035\"\017/v1/controllers:\ncontroller'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerDelete']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerDelete']._serialized_options = b'\202\323\344\223\002\036*\034/v1/controllers/{controller}'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerUpdate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerUpdate']._serialized_options = b'\202\323\344\223\002\0352\017/v1/controllers:\ncontroller'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerList']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerList']._serialized_options = b'\202\323\344\223\002\021\022\017/v1/controllers'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerGet']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeControllerGet']._serialized_options = b'\202\323\344\223\002\036\022\034/v1/controllers/{controller}'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceCreate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceCreate']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/namespaces:\tnamespace'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceDelete']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceDelete']._serialized_options = b'\202\323\344\223\002\034*\032/v1/namespaces/{namespace}'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceUpdate']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceUpdate']._serialized_options = b'\202\323\344\223\002\0332\016/v1/namespaces:\tnamespace'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceList']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceList']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/namespaces'
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceGet']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['NVMeNamespaceGet']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/namespaces/{namespace}'
  _NVMESUBSYSTEM._serialized_start=152
  _NVMESUBSYSTEM._serialized_end=336
  _NVMECONTROLLER._serialized_start=339
  _NVMECONTROLLER._serialized_end=621
  _NVMENAMESPACE._serialized_start=624
  _NVMENAMESPACE._serialized_end=1025
  _NVMESUBSYSTEMCREATEREQUEST._serialized_start=1027
  _NVMESUBSYSTEMCREATEREQUEST._serialized_end=1109
  _NVMESUBSYSTEMDELETEREQUEST._serialized_start=1111
  _NVMESUBSYSTEMDELETEREQUEST._serialized_end=1191
  _NVMESUBSYSTEMUPDATEREQUEST._serialized_start=1193
  _NVMESUBSYSTEMUPDATEREQUEST._serialized_end=1275
  _NVMESUBSYSTEMLISTREQUEST._serialized_start=1277
  _NVMESUBSYSTEMLISTREQUEST._serialized_end=1303
  _NVMESUBSYSTEMLISTRESPONSE._serialized_start=1305
  _NVMESUBSYSTEMLISTRESPONSE._serialized_end=1386
  _NVMESUBSYSTEMGETREQUEST._serialized_start=1388
  _NVMESUBSYSTEMGETREQUEST._serialized_end=1465
  _NVMESUBSYSTEMSTATSREQUEST._serialized_start=1467
  _NVMESUBSYSTEMSTATSREQUEST._serialized_end=1546
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_start=1548
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_end=1591
  _NVMECONTROLLERCREATEREQUEST._serialized_start=1593
  _NVMECONTROLLERCREATEREQUEST._serialized_end=1678
  _NVMECONTROLLERDELETEREQUEST._serialized_start=1680
  _NVMECONTROLLERDELETEREQUEST._serialized_end=1762
  _NVMECONTROLLERUPDATEREQUEST._serialized_start=1764
  _NVMECONTROLLERUPDATEREQUEST._serialized_end=1849
  _NVMECONTROLLERLISTREQUEST._serialized_start=1851
  _NVMECONTROLLERLISTREQUEST._serialized_end=1930
  _NVMECONTROLLERLISTRESPONSE._serialized_start=1932
  _NVMECONTROLLERLISTRESPONSE._serialized_end=2016
  _NVMECONTROLLERGETREQUEST._serialized_start=2018
  _NVMECONTROLLERGETREQUEST._serialized_end=2097
  _NVMECONTROLLERSTATSREQUEST._serialized_start=2099
  _NVMECONTROLLERSTATSREQUEST._serialized_end=2169
  _NVMECONTROLLERSTATSRESPONSE._serialized_start=2171
  _NVMECONTROLLERSTATSRESPONSE._serialized_end=2257
  _NVMENAMESPACECREATEREQUEST._serialized_start=2259
  _NVMENAMESPACECREATEREQUEST._serialized_end=2341
  _NVMENAMESPACEDELETEREQUEST._serialized_start=2343
  _NVMENAMESPACEDELETEREQUEST._serialized_end=2423
  _NVMENAMESPACEUPDATEREQUEST._serialized_start=2425
  _NVMENAMESPACEUPDATEREQUEST._serialized_end=2507
  _NVMENAMESPACELISTREQUEST._serialized_start=2510
  _NVMENAMESPACELISTREQUEST._serialized_end=2641
  _NVMENAMESPACELISTRESPONSE._serialized_start=2643
  _NVMENAMESPACELISTRESPONSE._serialized_end=2724
  _NVMENAMESPACEGETREQUEST._serialized_start=2726
  _NVMENAMESPACEGETREQUEST._serialized_end=2803
  _NVMENAMESPACESTATSREQUEST._serialized_start=2805
  _NVMENAMESPACESTATSREQUEST._serialized_end=2884
  _NVMENAMESPACESTATSRESPONSE._serialized_start=2886
  _NVMENAMESPACESTATSRESPONSE._serialized_end=2971
  _FRONTENDNVMESERVICE._serialized_start=2974
  _FRONTENDNVMESERVICE._serialized_end=5454
# @@protoc_insertion_point(module_scope)
