import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2

DESCRIPTOR = _descriptor.FileDescriptor(
  name='alarm.proto',
  package='alarm',
  syntax='proto3',
)

_ALARMREQUEST = _descriptor.Descriptor(
  name='AlarmRequest',
  full_name='alarm.AlarmRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='request', full_name='alarm.AlarmRequest.request', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=32,
  serialized_end=60,
)

_ALARMREPLY = _descriptor.Descriptor(
  name='AlarmReply',
  full_name='alarm.AlarmReply',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='alarmResponse', full_name='alarm.AlarmReply.alarmResponse', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=62,
  serialized_end=91,
)
DESCRIPTOR.message_types_by_name['AlarmRequest'] = _ALARMREQUEST
DESCRIPTOR.message_types_by_name['AlarmReply'] = _ALARMREPLY
#register file descriptor

AlarmRequest = _reflection.GeneratedProtocolMessageType('AlarmRequest', (_message.Message,), dict(
  DESCRIPTOR = _ALARMREQUEST,
  __module__ = 'alarm_pb2'
  ))
#register message alarmRequest

AlarmReply = _reflection.GeneratedProtocolMessageType('AlarmReply', (_message.Message,), dict(
  DESCRIPTOR = _ALARMREPLY,
  __module__ = 'alarm_pb2'
  ))
#register msg alarmReply


_ALARMSERVICE = _descriptor.ServiceDescriptor(
  name='AlarmService',
  full_name='alarm.AlarmService',
  file=DESCRIPTOR,
  index=0,
  options=None,
  serialized_start=93,
  serialized_end=166,
  methods=[
  _descriptor.MethodDescriptor(
    name='Alarm',
    full_name='alarm.AlarmService.Alarm',
    index=0,
    containing_service=None,
    input_type=_ALARMREQUEST,
    output_type=_ALARMREPLY,
    options=None,
  ),
])
#do register service desc alarmservice

DESCRIPTOR.services_by_name['AlarmService'] = _ALARMSERVICE