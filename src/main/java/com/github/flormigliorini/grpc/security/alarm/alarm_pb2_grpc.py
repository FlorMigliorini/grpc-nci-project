#gRPC Python protocol compiler plugin
import grpc

import alarm_pb2 as alarm__pb2


class AlarmStub(object):
  """service definition.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.Alarm = channel.unary_unary(
        '/alarm.AlarmService/Alarm',
        request_serializer=alarm__pb2.AlarmRequest.SerializeToString,
        response_deserializer=alarm__pb2.AlarmReply.FromString,
        )
     
class AlarmService(object):
  """service definition.
  """

  def Alarm(self, request, context):
    """Sends a greeting
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_AlarmService_to_server(servicer, server):
  rpc_method_handlers = {
      'Alarm': grpc.unary_unary_rpc_method_handler(
          servicer.Alarm,
          request_deserializer=alarm__pb2.AlarmRequest.FromString,
          response_serializer=alarm__pb2.AlarmReply.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'alarm.AlarmService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))