// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryCharAmusementInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryCharAmusementInfoOuterClass {
  private SceneGalleryCharAmusementInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryCharAmusementInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryCharAmusementInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 11;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>bool is_last_level = 4;</code>
     * @return The isLastLevel.
     */
    boolean getIsLastLevel();

    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 cur_score = 10;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    int getMaxScore();
  }
  /**
   * <pre>
   * Obf: ODAAFOEGKEE
   * </pre>
   *
   * Protobuf type {@code SceneGalleryCharAmusementInfo}
   */
  public static final class SceneGalleryCharAmusementInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryCharAmusementInfo)
      SceneGalleryCharAmusementInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryCharAmusementInfo.newBuilder() to construct.
    private SceneGalleryCharAmusementInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryCharAmusementInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryCharAmusementInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryCharAmusementInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              maxScore_ = input.readUInt32();
              break;
            }
            case 32: {

              isLastLevel_ = input.readBool();
              break;
            }
            case 80: {

              curScore_ = input.readUInt32();
              break;
            }
            case 88: {

              isSuccess_ = input.readBool();
              break;
            }
            case 96: {

              isFinish_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.internal_static_SceneGalleryCharAmusementInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.internal_static_SceneGalleryCharAmusementInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.class, emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 11;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 11;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int IS_LAST_LEVEL_FIELD_NUMBER = 4;
    private boolean isLastLevel_;
    /**
     * <code>bool is_last_level = 4;</code>
     * @return The isLastLevel.
     */
    @java.lang.Override
    public boolean getIsLastLevel() {
      return isLastLevel_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 12;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 10;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 10;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
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
      if (maxScore_ != 0) {
        output.writeUInt32(2, maxScore_);
      }
      if (isLastLevel_ != false) {
        output.writeBool(4, isLastLevel_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(10, curScore_);
      }
      if (isSuccess_ != false) {
        output.writeBool(11, isSuccess_);
      }
      if (isFinish_ != false) {
        output.writeBool(12, isFinish_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, maxScore_);
      }
      if (isLastLevel_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isLastLevel_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, curScore_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isSuccess_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo other = (emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getIsLastLevel()
          != other.getIsLastLevel()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + IS_LAST_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLastLevel());
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo prototype) {
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
     * Obf: ODAAFOEGKEE
     * </pre>
     *
     * Protobuf type {@code SceneGalleryCharAmusementInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryCharAmusementInfo)
        emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.internal_static_SceneGalleryCharAmusementInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.internal_static_SceneGalleryCharAmusementInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.class, emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSuccess_ = false;

        isLastLevel_ = false;

        isFinish_ = false;

        curScore_ = 0;

        maxScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.internal_static_SceneGalleryCharAmusementInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo build() {
        emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo result = new emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo(this);
        result.isSuccess_ = isSuccess_;
        result.isLastLevel_ = isLastLevel_;
        result.isFinish_ = isFinish_;
        result.curScore_ = curScore_;
        result.maxScore_ = maxScore_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getIsLastLevel() != false) {
          setIsLastLevel(other.getIsLastLevel());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
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
        emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 11;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 11;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private boolean isLastLevel_ ;
      /**
       * <code>bool is_last_level = 4;</code>
       * @return The isLastLevel.
       */
      @java.lang.Override
      public boolean getIsLastLevel() {
        return isLastLevel_;
      }
      /**
       * <code>bool is_last_level = 4;</code>
       * @param value The isLastLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIsLastLevel(boolean value) {
        
        isLastLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_last_level = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLastLevel() {
        
        isLastLevel_ = false;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 12;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 10;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 10;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 2;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryCharAmusementInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryCharAmusementInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryCharAmusementInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryCharAmusementInfo>() {
      @java.lang.Override
      public SceneGalleryCharAmusementInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryCharAmusementInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryCharAmusementInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryCharAmusementInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryCharAmusementInfoOuterClass.SceneGalleryCharAmusementInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryCharAmusementInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryCharAmusementInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryCharAmusementInfo.proto\"\203\001" +
      "\n\035SceneGalleryCharAmusementInfo\022\022\n\nis_su" +
      "ccess\030\013 \001(\010\022\025\n\ris_last_level\030\004 \001(\010\022\021\n\tis" +
      "_finish\030\014 \001(\010\022\021\n\tcur_score\030\n \001(\r\022\021\n\tmax_" +
      "score\030\002 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryCharAmusementInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryCharAmusementInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryCharAmusementInfo_descriptor,
        new java.lang.String[] { "IsSuccess", "IsLastLevel", "IsFinish", "CurScore", "MaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
