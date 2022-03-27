from __future__ import print_function

import logging

import grpc
import alarm_pb2
import alarm_pb2_grpc


def run():
    
    with grpc.insecure_channel('localhost:50051') as channel:
        stub = alarm_pb2_grpc.AlarmStub(channel)
        response = stub.Alarm(alarm_pb2.AlarmRequest(name=''))
    print("Client received: " + response.message)


if __name__ == '__main__':
    logging.basicConfig()
    run()