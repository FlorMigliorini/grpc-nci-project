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
    internal_static_alarm_AlarmRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alarm_AlarmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alarm_AlarmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alarm_AlarmResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021alarm/alarm.proto\022\005alarm\"\037\n\014AlarmReque" +
      "st\022\017\n\007request\030\001 \001(\t\"&\n\rAlarmResponse\022\025\n\r" +
      "alarmResponse\030\001 \001(\t2H\n\014AlarmService\0228\n\005A" +
      "larm\022\023.alarm.AlarmRequest\032\024.alarm.AlarmR" +
      "esponse\"\000(\0010\001B\023\n\017com.proto.alarmP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_alarm_AlarmRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_alarm_AlarmRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alarm_AlarmRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_alarm_AlarmResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_alarm_AlarmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alarm_AlarmResponse_descriptor,
        new java.lang.String[] { "AlarmResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
