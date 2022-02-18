/*
 * Copyright (c) Baidu Inc. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// source: qiantao.proto

package com.baidu.bjf.remoting.protobuf.complexList;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code tutorial.TypeDef}
   */
  public enum TypeDef
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TEXT = 1;</code>
     */
    TEXT(0, 1),
    /**
     * <code>NUMBER = 2;</code>
     */
    NUMBER(1, 2),
    /**
     * <code>DECIMAL = 4;</code>
     */
    DECIMAL(2, 4),
    /**
     * <code>ID = 8;</code>
     */
    ID(3, 8),
    /**
     * <code>URL = 16;</code>
     */
    URL(4, 16),
    ;

    /**
     * <code>TEXT = 1;</code>
     */
    public static final int TEXT_VALUE = 1;
    /**
     * <code>NUMBER = 2;</code>
     */
    public static final int NUMBER_VALUE = 2;
    /**
     * <code>DECIMAL = 4;</code>
     */
    public static final int DECIMAL_VALUE = 4;
    /**
     * <code>ID = 8;</code>
     */
    public static final int ID_VALUE = 8;
    /**
     * <code>URL = 16;</code>
     */
    public static final int URL_VALUE = 16;


    public final int getNumber() { return value; }

    public static TypeDef valueOf(int value) {
      switch (value) {
        case 1: return TEXT;
        case 2: return NUMBER;
        case 4: return DECIMAL;
        case 8: return ID;
        case 16: return URL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TypeDef>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TypeDef>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TypeDef>() {
            public TypeDef findValueByNumber(int number) {
              return TypeDef.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final TypeDef[] VALUES = values();

    public static TypeDef valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private TypeDef(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tutorial.TypeDef)
  }

  public interface PersonOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string name = 1;
    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // required int32 id = 2;
    /**
     * <code>required int32 id = 2;</code>
     *
     * <pre>
     * Unique ID number for this person.
     * </pre>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 2;</code>
     *
     * <pre>
     * Unique ID number for this person.
     * </pre>
     */
    int getId();

    // optional string email = 3;
    /**
     * <code>optional string email = 3;</code>
     */
    boolean hasEmail();
    /**
     * <code>optional string email = 3;</code>
     */
    java.lang.String getEmail();
    /**
     * <code>optional string email = 3;</code>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    // optional double doubleF = 4;
    /**
     * <code>optional double doubleF = 4;</code>
     */
    boolean hasDoubleF();
    /**
     * <code>optional double doubleF = 4;</code>
     */
    double getDoubleF();

    // optional float floatF = 5;
    /**
     * <code>optional float floatF = 5;</code>
     */
    boolean hasFloatF();
    /**
     * <code>optional float floatF = 5;</code>
     */
    float getFloatF();

    // optional bytes bytesF = 6;
    /**
     * <code>optional bytes bytesF = 6;</code>
     */
    boolean hasBytesF();
    /**
     * <code>optional bytes bytesF = 6;</code>
     */
    com.google.protobuf.ByteString getBytesF();

    // optional bool boolF = 7;
    /**
     * <code>optional bool boolF = 7;</code>
     */
    boolean hasBoolF();
    /**
     * <code>optional bool boolF = 7;</code>
     */
    boolean getBoolF();
  }
  /**
   * Protobuf type {@code tutorial.Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessage
      implements PersonOrBuilder {
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Person(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Person defaultInstance;
    public static Person getDefaultInstance() {
      return defaultInstance;
    }

    public Person getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              email_ = input.readBytes();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              doubleF_ = input.readDouble();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              floatF_ = input.readFloat();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              bytesF_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              boolF_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.class, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder.class);
    }

    public static com.google.protobuf.Parser<Person> PARSER =
        new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 id = 2;
    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>required int32 id = 2;</code>
     *
     * <pre>
     * Unique ID number for this person.
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 id = 2;</code>
     *
     * <pre>
     * Unique ID number for this person.
     * </pre>
     */
    public int getId() {
      return id_;
    }

    // optional string email = 3;
    public static final int EMAIL_FIELD_NUMBER = 3;
    private java.lang.Object email_;
    /**
     * <code>optional string email = 3;</code>
     */
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string email = 3;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          email_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string email = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional double doubleF = 4;
    public static final int DOUBLEF_FIELD_NUMBER = 4;
    private double doubleF_;
    /**
     * <code>optional double doubleF = 4;</code>
     */
    public boolean hasDoubleF() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional double doubleF = 4;</code>
     */
    public double getDoubleF() {
      return doubleF_;
    }

    // optional float floatF = 5;
    public static final int FLOATF_FIELD_NUMBER = 5;
    private float floatF_;
    /**
     * <code>optional float floatF = 5;</code>
     */
    public boolean hasFloatF() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional float floatF = 5;</code>
     */
    public float getFloatF() {
      return floatF_;
    }

    // optional bytes bytesF = 6;
    public static final int BYTESF_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString bytesF_;
    /**
     * <code>optional bytes bytesF = 6;</code>
     */
    public boolean hasBytesF() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes bytesF = 6;</code>
     */
    public com.google.protobuf.ByteString getBytesF() {
      return bytesF_;
    }

    // optional bool boolF = 7;
    public static final int BOOLF_FIELD_NUMBER = 7;
    private boolean boolF_;
    /**
     * <code>optional bool boolF = 7;</code>
     */
    public boolean hasBoolF() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool boolF = 7;</code>
     */
    public boolean getBoolF() {
      return boolF_;
    }

    private void initFields() {
      name_ = "";
      id_ = 0;
      email_ = "";
      doubleF_ = 0D;
      floatF_ = 0F;
      bytesF_ = com.google.protobuf.ByteString.EMPTY;
      boolF_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getEmailBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, doubleF_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, floatF_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, bytesF_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, boolF_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getEmailBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, doubleF_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, floatF_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, bytesF_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, boolF_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.class, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder.class);
      }

      // Construct using com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        doubleF_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        floatF_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        bytesF_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        boolF_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_Person_descriptor;
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person getDefaultInstanceForType() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.getDefaultInstance();
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person build() {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person buildPartial() {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person result = new com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.doubleF_ = doubleF_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.floatF_ = floatF_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.bytesF_ = bytesF_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.boolF_ = boolF_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person) {
          return mergeFrom((com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person other) {
        if (other == com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasEmail()) {
          bitField0_ |= 0x00000004;
          email_ = other.email_;
          onChanged();
        }
        if (other.hasDoubleF()) {
          setDoubleF(other.getDoubleF());
        }
        if (other.hasFloatF()) {
          setFloatF(other.getFloatF());
        }
        if (other.hasBytesF()) {
          setBytesF(other.getBytesF());
        }
        if (other.hasBoolF()) {
          setBoolF(other.getBoolF());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string name = 1;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // required int32 id = 2;
      private int id_ ;
      /**
       * <code>required int32 id = 2;</code>
       *
       * <pre>
       * Unique ID number for this person.
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * <pre>
       * Unique ID number for this person.
       * </pre>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * <pre>
       * Unique ID number for this person.
       * </pre>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 2;</code>
       *
       * <pre>
       * Unique ID number for this person.
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      // optional string email = 3;
      private java.lang.Object email_ = "";
      /**
       * <code>optional string email = 3;</code>
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>optional string email = 3;</code>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }

      // optional double doubleF = 4;
      private double doubleF_ ;
      /**
       * <code>optional double doubleF = 4;</code>
       */
      public boolean hasDoubleF() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional double doubleF = 4;</code>
       */
      public double getDoubleF() {
        return doubleF_;
      }
      /**
       * <code>optional double doubleF = 4;</code>
       */
      public Builder setDoubleF(double value) {
        bitField0_ |= 0x00000008;
        doubleF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double doubleF = 4;</code>
       */
      public Builder clearDoubleF() {
        bitField0_ = (bitField0_ & ~0x00000008);
        doubleF_ = 0D;
        onChanged();
        return this;
      }

      // optional float floatF = 5;
      private float floatF_ ;
      /**
       * <code>optional float floatF = 5;</code>
       */
      public boolean hasFloatF() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional float floatF = 5;</code>
       */
      public float getFloatF() {
        return floatF_;
      }
      /**
       * <code>optional float floatF = 5;</code>
       */
      public Builder setFloatF(float value) {
        bitField0_ |= 0x00000010;
        floatF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float floatF = 5;</code>
       */
      public Builder clearFloatF() {
        bitField0_ = (bitField0_ & ~0x00000010);
        floatF_ = 0F;
        onChanged();
        return this;
      }

      // optional bytes bytesF = 6;
      private com.google.protobuf.ByteString bytesF_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes bytesF = 6;</code>
       */
      public boolean hasBytesF() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bytes bytesF = 6;</code>
       */
      public com.google.protobuf.ByteString getBytesF() {
        return bytesF_;
      }
      /**
       * <code>optional bytes bytesF = 6;</code>
       */
      public Builder setBytesF(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        bytesF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes bytesF = 6;</code>
       */
      public Builder clearBytesF() {
        bitField0_ = (bitField0_ & ~0x00000020);
        bytesF_ = getDefaultInstance().getBytesF();
        onChanged();
        return this;
      }

      // optional bool boolF = 7;
      private boolean boolF_ ;
      /**
       * <code>optional bool boolF = 7;</code>
       */
      public boolean hasBoolF() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool boolF = 7;</code>
       */
      public boolean getBoolF() {
        return boolF_;
      }
      /**
       * <code>optional bool boolF = 7;</code>
       */
      public Builder setBoolF(boolean value) {
        bitField0_ |= 0x00000040;
        boolF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool boolF = 7;</code>
       */
      public Builder clearBoolF() {
        bitField0_ = (bitField0_ & ~0x00000040);
        boolF_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:tutorial.Person)
    }

    static {
      defaultInstance = new Person(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:tutorial.Person)
  }

  public interface AddressBookOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .tutorial.Person person = 1;
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> 
        getPersonList();
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person getPerson(int index);
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    int getPersonCount();
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    java.util.List<? extends com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder> 
        getPersonOrBuilderList();
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder getPersonOrBuilder(
        int index);

    // repeated .tutorial.TypeDef typeDef = 2;
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> getTypeDefList();
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    int getTypeDefCount();
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef getTypeDef(int index);
  }
  /**
   * Protobuf type {@code tutorial.AddressBook}
   *
   * <pre>
   * Our address book file is just one of these.
   * </pre>
   */
  public static final class AddressBook extends
      com.google.protobuf.GeneratedMessage
      implements AddressBookOrBuilder {
    // Use AddressBook.newBuilder() to construct.
    private AddressBook(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AddressBook(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AddressBook defaultInstance;
    public static AddressBook getDefaultInstance() {
      return defaultInstance;
    }

    public AddressBook getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AddressBook(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                person_ = new java.util.ArrayList<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person>();
                mutable_bitField0_ |= 0x00000001;
              }
              person_.add(input.readMessage(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef value = com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  typeDef_ = new java.util.ArrayList<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef>();
                  mutable_bitField0_ |= 0x00000002;
                }
                typeDef_.add(value);
              }
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef value = com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    typeDef_ = new java.util.ArrayList<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef>();
                    mutable_bitField0_ |= 0x00000002;
                  }
                  typeDef_.add(value);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = java.util.Collections.unmodifiableList(person_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          typeDef_ = java.util.Collections.unmodifiableList(typeDef_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.class, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.Builder.class);
    }

    public static com.google.protobuf.Parser<AddressBook> PARSER =
        new com.google.protobuf.AbstractParser<AddressBook>() {
      public AddressBook parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddressBook(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AddressBook> getParserForType() {
      return PARSER;
    }

    // repeated .tutorial.Person person = 1;
    public static final int PERSON_FIELD_NUMBER = 1;
    private java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> person_;
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    public java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> getPersonList() {
      return person_;
    }
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    public java.util.List<? extends com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder> 
        getPersonOrBuilderList() {
      return person_;
    }
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    public int getPersonCount() {
      return person_.size();
    }
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person getPerson(int index) {
      return person_.get(index);
    }
    /**
     * <code>repeated .tutorial.Person person = 1;</code>
     */
    public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder getPersonOrBuilder(
        int index) {
      return person_.get(index);
    }

    // repeated .tutorial.TypeDef typeDef = 2;
    public static final int TYPEDEF_FIELD_NUMBER = 2;
    private java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> typeDef_;
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    public java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> getTypeDefList() {
      return typeDef_;
    }
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    public int getTypeDefCount() {
      return typeDef_.size();
    }
    /**
     * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
     */
    public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef getTypeDef(int index) {
      return typeDef_.get(index);
    }

    private void initFields() {
      person_ = java.util.Collections.emptyList();
      typeDef_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      for (int i = 0; i < getPersonCount(); i++) {
        if (!getPerson(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < person_.size(); i++) {
        output.writeMessage(1, person_.get(i));
      }
      for (int i = 0; i < typeDef_.size(); i++) {
        output.writeEnum(2, typeDef_.get(i).getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < person_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, person_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < typeDef_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(typeDef_.get(i).getNumber());
        }
        size += dataSize;
        size += 1 * typeDef_.size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code tutorial.AddressBook}
     *
     * <pre>
     * Our address book file is just one of these.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_AddressBook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.class, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.Builder.class);
      }

      // Construct using com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPersonFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          personBuilder_.clear();
        }
        typeDef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.internal_static_tutorial_AddressBook_descriptor;
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook getDefaultInstanceForType() {
        return com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.getDefaultInstance();
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook build() {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook buildPartial() {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook result = new com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook(this);
        int from_bitField0_ = bitField0_;
        if (personBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            person_ = java.util.Collections.unmodifiableList(person_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.person_ = person_;
        } else {
          result.person_ = personBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          typeDef_ = java.util.Collections.unmodifiableList(typeDef_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.typeDef_ = typeDef_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook) {
          return mergeFrom((com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook other) {
        if (other == com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook.getDefaultInstance()) return this;
        if (personBuilder_ == null) {
          if (!other.person_.isEmpty()) {
            if (person_.isEmpty()) {
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePersonIsMutable();
              person_.addAll(other.person_);
            }
            onChanged();
          }
        } else {
          if (!other.person_.isEmpty()) {
            if (personBuilder_.isEmpty()) {
              personBuilder_.dispose();
              personBuilder_ = null;
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
              personBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPersonFieldBuilder() : null;
            } else {
              personBuilder_.addAllMessages(other.person_);
            }
          }
        }
        if (!other.typeDef_.isEmpty()) {
          if (typeDef_.isEmpty()) {
            typeDef_ = other.typeDef_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTypeDefIsMutable();
            typeDef_.addAll(other.typeDef_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getPersonCount(); i++) {
          if (!getPerson(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.AddressBook) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .tutorial.Person person = 1;
      private java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> person_ =
        java.util.Collections.emptyList();
      private void ensurePersonIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = new java.util.ArrayList<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person>(person_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder> personBuilder_;

      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> getPersonList() {
        if (personBuilder_ == null) {
          return java.util.Collections.unmodifiableList(person_);
        } else {
          return personBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public int getPersonCount() {
        if (personBuilder_ == null) {
          return person_.size();
        } else {
          return personBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person getPerson(int index) {
        if (personBuilder_ == null) {
          return person_.get(index);
        } else {
          return personBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.set(index, value);
          onChanged();
        } else {
          personBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.set(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder addPerson(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(value);
          onChanged();
        } else {
          personBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(index, value);
          onChanged();
        } else {
          personBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder addPerson(
          com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder addAllPerson(
          java.lang.Iterable<? extends com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person> values) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          super.addAll(values, person_);
          onChanged();
        } else {
          personBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder clearPerson() {
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          personBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public Builder removePerson(int index) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.remove(index);
          onChanged();
        } else {
          personBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder getPersonBuilder(
          int index) {
        return getPersonFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder getPersonOrBuilder(
          int index) {
        if (personBuilder_ == null) {
          return person_.get(index);  } else {
          return personBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public java.util.List<? extends com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder> 
           getPersonOrBuilderList() {
        if (personBuilder_ != null) {
          return personBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(person_);
        }
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder addPersonBuilder() {
        return getPersonFieldBuilder().addBuilder(
            com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder addPersonBuilder(
          int index) {
        return getPersonFieldBuilder().addBuilder(
            index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .tutorial.Person person = 1;</code>
       */
      public java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder> 
           getPersonBuilderList() {
        return getPersonFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder> 
          getPersonFieldBuilder() {
        if (personBuilder_ == null) {
          personBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.Person.Builder, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.PersonOrBuilder>(
                  person_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          person_ = null;
        }
        return personBuilder_;
      }

      // repeated .tutorial.TypeDef typeDef = 2;
      private java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> typeDef_ =
        java.util.Collections.emptyList();
      private void ensureTypeDefIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          typeDef_ = new java.util.ArrayList<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef>(typeDef_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public java.util.List<com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> getTypeDefList() {
        return java.util.Collections.unmodifiableList(typeDef_);
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public int getTypeDefCount() {
        return typeDef_.size();
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef getTypeDef(int index) {
        return typeDef_.get(index);
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public Builder setTypeDef(
          int index, com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTypeDefIsMutable();
        typeDef_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public Builder addTypeDef(com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTypeDefIsMutable();
        typeDef_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public Builder addAllTypeDef(
          java.lang.Iterable<? extends com.baidu.bjf.remoting.protobuf.complexList.AddressBookProtos.TypeDef> values) {
        ensureTypeDefIsMutable();
        super.addAll(values, typeDef_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .tutorial.TypeDef typeDef = 2;</code>
       */
      public Builder clearTypeDef() {
        typeDef_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:tutorial.AddressBook)
    }

    static {
      defaultInstance = new AddressBook(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:tutorial.AddressBook)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tutorial_Person_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rqiantao.proto\022\010tutorial\"q\n\006Person\022\014\n\004n" +
      "ame\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\r\n\005email\030\003 \001(\t\022\017\n\007" +
      "doubleF\030\004 \001(\001\022\016\n\006floatF\030\005 \001(\002\022\016\n\006bytesF\030" +
      "\006 \001(\014\022\r\n\005boolF\030\007 \001(\010\"S\n\013AddressBook\022 \n\006p" +
      "erson\030\001 \003(\0132\020.tutorial.Person\022\"\n\007typeDef" +
      "\030\002 \003(\0162\021.tutorial.TypeDef*=\n\007TypeDef\022\010\n\004" +
      "TEXT\020\001\022\n\n\006NUMBER\020\002\022\013\n\007DECIMAL\020\004\022\006\n\002ID\020\010\022" +
      "\007\n\003URL\020\020B@\n+com.baidu.bjf.remoting.proto" +
      "buf.complexListB\021AddressBookProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_tutorial_Person_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_tutorial_Person_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_tutorial_Person_descriptor,
              new java.lang.String[] { "Name", "Id", "Email", "DoubleF", "FloatF", "BytesF", "BoolF", });
          internal_static_tutorial_AddressBook_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_tutorial_AddressBook_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_tutorial_AddressBook_descriptor,
              new java.lang.String[] { "Person", "TypeDef", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
