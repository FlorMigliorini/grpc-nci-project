// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alarm/alarm.proto

package com.proto.alarm;

public final class Alarm {
  private Alarm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_camera_AlarmRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_camera_AlarmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_camera_AlarmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_camera_AlarmResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021alarm/alarm.proto\022\006camera\"I\n\014AlarmRequ" +
      "est\022\021\n\tloggerMsg\030\001 \001(\t\022\021\n\tloggerDay\030\002 \001(" +
      "\t\022\023\n\013loggerTimer\030\003 \001(\t\"c\n\rAlarmResponse\022" +
      "\032\n\022securityPersonnel1\030\001 \001(\t\022\032\n\022securityP" +
      "ersonnel2\030\002 \001(\t\022\032\n\022securityPersonnel3\030\003 " +
      "\001(\t2J\n\014AlarmService\022:\n\005Alarm\022\024.camera.Al" +
      "armRequest\032\025.camera.AlarmResponse\"\000(\0010\001B" +
      "\023\n\017com.proto.alarmP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_camera_AlarmRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_camera_AlarmRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_camera_AlarmRequest_descriptor,
        new java.lang.String[] { "LoggerMsg", "LoggerDay", "LoggerTimer", });
    internal_static_camera_AlarmResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_camera_AlarmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_camera_AlarmResponse_descriptor,
        new java.lang.String[] { "SecurityPersonnel1", "SecurityPersonnel2", "SecurityPersonnel3", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
