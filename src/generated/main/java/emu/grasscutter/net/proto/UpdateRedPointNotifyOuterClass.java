// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdateRedPointNotify.proto

package emu.grasscutter.net.proto;

public final class UpdateRedPointNotifyOuterClass {
  private UpdateRedPointNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateRedPointNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdateRedPointNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> 
        getRedPointListList();
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getRedPointList(int index);
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    int getRedPointListCount();
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder> 
        getRedPointListOrBuilderList();
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder getRedPointListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 31
   * Obf: LNLHPPBHCHH
   * </pre>
   *
   * Protobuf type {@code UpdateRedPointNotify}
   */
  public static final class UpdateRedPointNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdateRedPointNotify)
      UpdateRedPointNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateRedPointNotify.newBuilder() to construct.
    private UpdateRedPointNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateRedPointNotify() {
      redPointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdateRedPointNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdateRedPointNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                redPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData>();
                mutable_bitField0_ |= 0x00000001;
              }
              redPointList_.add(
                  input.readMessage(emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          redPointList_ = java.util.Collections.unmodifiableList(redPointList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.internal_static_UpdateRedPointNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.internal_static_UpdateRedPointNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.class, emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.Builder.class);
    }

    public static final int RED_POINT_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> redPointList_;
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> getRedPointListList() {
      return redPointList_;
    }
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder> 
        getRedPointListOrBuilderList() {
      return redPointList_;
    }
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    @java.lang.Override
    public int getRedPointListCount() {
      return redPointList_.size();
    }
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getRedPointList(int index) {
      return redPointList_.get(index);
    }
    /**
     * <code>repeated .RedPointData red_point_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder getRedPointListOrBuilder(
        int index) {
      return redPointList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < redPointList_.size(); i++) {
        output.writeMessage(1, redPointList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < redPointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, redPointList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify other = (emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify) obj;

      if (!getRedPointListList()
          .equals(other.getRedPointListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getRedPointListCount() > 0) {
        hash = (37 * hash) + RED_POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRedPointListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 31
     * Obf: LNLHPPBHCHH
     * </pre>
     *
     * Protobuf type {@code UpdateRedPointNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdateRedPointNotify)
        emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.internal_static_UpdateRedPointNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.internal_static_UpdateRedPointNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.class, emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRedPointListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (redPointListBuilder_ == null) {
          redPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          redPointListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.internal_static_UpdateRedPointNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify build() {
        emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify buildPartial() {
        emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify result = new emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify(this);
        int from_bitField0_ = bitField0_;
        if (redPointListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            redPointList_ = java.util.Collections.unmodifiableList(redPointList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.redPointList_ = redPointList_;
        } else {
          result.redPointList_ = redPointListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify other) {
        if (other == emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify.getDefaultInstance()) return this;
        if (redPointListBuilder_ == null) {
          if (!other.redPointList_.isEmpty()) {
            if (redPointList_.isEmpty()) {
              redPointList_ = other.redPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRedPointListIsMutable();
              redPointList_.addAll(other.redPointList_);
            }
            onChanged();
          }
        } else {
          if (!other.redPointList_.isEmpty()) {
            if (redPointListBuilder_.isEmpty()) {
              redPointListBuilder_.dispose();
              redPointListBuilder_ = null;
              redPointList_ = other.redPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              redPointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRedPointListFieldBuilder() : null;
            } else {
              redPointListBuilder_.addAllMessages(other.redPointList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> redPointList_ =
        java.util.Collections.emptyList();
      private void ensureRedPointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          redPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData>(redPointList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder> redPointListBuilder_;

      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> getRedPointListList() {
        if (redPointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(redPointList_);
        } else {
          return redPointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public int getRedPointListCount() {
        if (redPointListBuilder_ == null) {
          return redPointList_.size();
        } else {
          return redPointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getRedPointList(int index) {
        if (redPointListBuilder_ == null) {
          return redPointList_.get(index);
        } else {
          return redPointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder setRedPointList(
          int index, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData value) {
        if (redPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPointListIsMutable();
          redPointList_.set(index, value);
          onChanged();
        } else {
          redPointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder setRedPointList(
          int index, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder builderForValue) {
        if (redPointListBuilder_ == null) {
          ensureRedPointListIsMutable();
          redPointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          redPointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder addRedPointList(emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData value) {
        if (redPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPointListIsMutable();
          redPointList_.add(value);
          onChanged();
        } else {
          redPointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder addRedPointList(
          int index, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData value) {
        if (redPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRedPointListIsMutable();
          redPointList_.add(index, value);
          onChanged();
        } else {
          redPointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder addRedPointList(
          emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder builderForValue) {
        if (redPointListBuilder_ == null) {
          ensureRedPointListIsMutable();
          redPointList_.add(builderForValue.build());
          onChanged();
        } else {
          redPointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder addRedPointList(
          int index, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder builderForValue) {
        if (redPointListBuilder_ == null) {
          ensureRedPointListIsMutable();
          redPointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          redPointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder addAllRedPointList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData> values) {
        if (redPointListBuilder_ == null) {
          ensureRedPointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, redPointList_);
          onChanged();
        } else {
          redPointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder clearRedPointList() {
        if (redPointListBuilder_ == null) {
          redPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          redPointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public Builder removeRedPointList(int index) {
        if (redPointListBuilder_ == null) {
          ensureRedPointListIsMutable();
          redPointList_.remove(index);
          onChanged();
        } else {
          redPointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder getRedPointListBuilder(
          int index) {
        return getRedPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder getRedPointListOrBuilder(
          int index) {
        if (redPointListBuilder_ == null) {
          return redPointList_.get(index);  } else {
          return redPointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder> 
           getRedPointListOrBuilderList() {
        if (redPointListBuilder_ != null) {
          return redPointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(redPointList_);
        }
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder addRedPointListBuilder() {
        return getRedPointListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.getDefaultInstance());
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder addRedPointListBuilder(
          int index) {
        return getRedPointListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.getDefaultInstance());
      }
      /**
       * <code>repeated .RedPointData red_point_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder> 
           getRedPointListBuilderList() {
        return getRedPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder> 
          getRedPointListFieldBuilder() {
        if (redPointListBuilder_ == null) {
          redPointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder>(
                  redPointList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          redPointList_ = null;
        }
        return redPointListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:UpdateRedPointNotify)
    }

    // @@protoc_insertion_point(class_scope:UpdateRedPointNotify)
    private static final emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify();
    }

    public static emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdateRedPointNotify>
        PARSER = new com.google.protobuf.AbstractParser<UpdateRedPointNotify>() {
      @java.lang.Override
      public UpdateRedPointNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateRedPointNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdateRedPointNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateRedPointNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UpdateRedPointNotifyOuterClass.UpdateRedPointNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateRedPointNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateRedPointNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032UpdateRedPointNotify.proto\032\022RedPointDa" +
      "ta.proto\"=\n\024UpdateRedPointNotify\022%\n\016red_" +
      "point_list\030\001 \003(\0132\r.RedPointDataB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RedPointDataOuterClass.getDescriptor(),
        });
    internal_static_UpdateRedPointNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdateRedPointNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateRedPointNotify_descriptor,
        new java.lang.String[] { "RedPointList", });
    emu.grasscutter.net.proto.RedPointDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
