from concurrent import futures
import logging

import grpc
import alarm_pb2
import alarm_pb2_grpc

class Alarm(alarm_pb2_grpc.AlarmService):
    
 def Alarm(self, request, context):
        return alarm_pb2.AlarmReply(message='Test, %s!' % request.request)


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    alarm_pb2_grpc.add_AlarmService_to_server(AlarmService(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    server.wait_for_termination()


if __name__ == '__main__':
    logging.basicConfig()
    serve()