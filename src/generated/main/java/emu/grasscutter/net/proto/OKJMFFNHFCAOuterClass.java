// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OKJMFFNHFCA.proto

package emu.grasscutter.net.proto;

public final class OKJMFFNHFCAOuterClass {
  private OKJMFFNHFCAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OKJMFFNHFCAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OKJMFFNHFCA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool AHJEEFHMHGN = 2;</code>
     * @return The aHJEEFHMHGN.
     */
    boolean getAHJEEFHMHGN();

    /**
     * <code>bool AACHDBDODFG = 15;</code>
     * @return The aACHDBDODFG.
     */
    boolean getAACHDBDODFG();

    /**
     * <code>bool EIPOBNOIHHD = 1;</code>
     * @return The eIPOBNOIHHD.
     */
    boolean getEIPOBNOIHHD();

    /**
     * <code>uint32 LMKDFJMIHPJ = 13;</code>
     * @return The lMKDFJMIHPJ.
     */
    int getLMKDFJMIHPJ();

    /**
     * <code>uint32 GGJDMIHGAKA = 10;</code>
     * @return The gGJDMIHGAKA.
     */
    int getGGJDMIHGAKA();
  }
  /**
   * Protobuf type {@code OKJMFFNHFCA}
   */
  public static final class OKJMFFNHFCA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OKJMFFNHFCA)
      OKJMFFNHFCAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OKJMFFNHFCA.newBuilder() to construct.
    private OKJMFFNHFCA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OKJMFFNHFCA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OKJMFFNHFCA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OKJMFFNHFCA(
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
            case 8: {

              eIPOBNOIHHD_ = input.readBool();
              break;
            }
            case 16: {

              aHJEEFHMHGN_ = input.readBool();
              break;
            }
            case 80: {

              gGJDMIHGAKA_ = input.readUInt32();
              break;
            }
            case 104: {

              lMKDFJMIHPJ_ = input.readUInt32();
              break;
            }
            case 120: {

              aACHDBDODFG_ = input.readBool();
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
      return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.internal_static_OKJMFFNHFCA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.internal_static_OKJMFFNHFCA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.class, emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.Builder.class);
    }

    public static final int AHJEEFHMHGN_FIELD_NUMBER = 2;
    private boolean aHJEEFHMHGN_;
    /**
     * <code>bool AHJEEFHMHGN = 2;</code>
     * @return The aHJEEFHMHGN.
     */
    @java.lang.Override
    public boolean getAHJEEFHMHGN() {
      return aHJEEFHMHGN_;
    }

    public static final int AACHDBDODFG_FIELD_NUMBER = 15;
    private boolean aACHDBDODFG_;
    /**
     * <code>bool AACHDBDODFG = 15;</code>
     * @return The aACHDBDODFG.
     */
    @java.lang.Override
    public boolean getAACHDBDODFG() {
      return aACHDBDODFG_;
    }

    public static final int EIPOBNOIHHD_FIELD_NUMBER = 1;
    private boolean eIPOBNOIHHD_;
    /**
     * <code>bool EIPOBNOIHHD = 1;</code>
     * @return The eIPOBNOIHHD.
     */
    @java.lang.Override
    public boolean getEIPOBNOIHHD() {
      return eIPOBNOIHHD_;
    }

    public static final int LMKDFJMIHPJ_FIELD_NUMBER = 13;
    private int lMKDFJMIHPJ_;
    /**
     * <code>uint32 LMKDFJMIHPJ = 13;</code>
     * @return The lMKDFJMIHPJ.
     */
    @java.lang.Override
    public int getLMKDFJMIHPJ() {
      return lMKDFJMIHPJ_;
    }

    public static final int GGJDMIHGAKA_FIELD_NUMBER = 10;
    private int gGJDMIHGAKA_;
    /**
     * <code>uint32 GGJDMIHGAKA = 10;</code>
     * @return The gGJDMIHGAKA.
     */
    @java.lang.Override
    public int getGGJDMIHGAKA() {
      return gGJDMIHGAKA_;
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
      if (eIPOBNOIHHD_ != false) {
        output.writeBool(1, eIPOBNOIHHD_);
      }
      if (aHJEEFHMHGN_ != false) {
        output.writeBool(2, aHJEEFHMHGN_);
      }
      if (gGJDMIHGAKA_ != 0) {
        output.writeUInt32(10, gGJDMIHGAKA_);
      }
      if (lMKDFJMIHPJ_ != 0) {
        output.writeUInt32(13, lMKDFJMIHPJ_);
      }
      if (aACHDBDODFG_ != false) {
        output.writeBool(15, aACHDBDODFG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eIPOBNOIHHD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, eIPOBNOIHHD_);
      }
      if (aHJEEFHMHGN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, aHJEEFHMHGN_);
      }
      if (gGJDMIHGAKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gGJDMIHGAKA_);
      }
      if (lMKDFJMIHPJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, lMKDFJMIHPJ_);
      }
      if (aACHDBDODFG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, aACHDBDODFG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA other = (emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA) obj;

      if (getAHJEEFHMHGN()
          != other.getAHJEEFHMHGN()) return false;
      if (getAACHDBDODFG()
          != other.getAACHDBDODFG()) return false;
      if (getEIPOBNOIHHD()
          != other.getEIPOBNOIHHD()) return false;
      if (getLMKDFJMIHPJ()
          != other.getLMKDFJMIHPJ()) return false;
      if (getGGJDMIHGAKA()
          != other.getGGJDMIHGAKA()) return false;
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
      hash = (37 * hash) + AHJEEFHMHGN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAHJEEFHMHGN());
      hash = (37 * hash) + AACHDBDODFG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAACHDBDODFG());
      hash = (37 * hash) + EIPOBNOIHHD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEIPOBNOIHHD());
      hash = (37 * hash) + LMKDFJMIHPJ_FIELD_NUMBER;
      hash = (53 * hash) + getLMKDFJMIHPJ();
      hash = (37 * hash) + GGJDMIHGAKA_FIELD_NUMBER;
      hash = (53 * hash) + getGGJDMIHGAKA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA prototype) {
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
     * Protobuf type {@code OKJMFFNHFCA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OKJMFFNHFCA)
        emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.internal_static_OKJMFFNHFCA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.internal_static_OKJMFFNHFCA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.class, emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.newBuilder()
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
        aHJEEFHMHGN_ = false;

        aACHDBDODFG_ = false;

        eIPOBNOIHHD_ = false;

        lMKDFJMIHPJ_ = 0;

        gGJDMIHGAKA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.internal_static_OKJMFFNHFCA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA build() {
        emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA buildPartial() {
        emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA result = new emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA(this);
        result.aHJEEFHMHGN_ = aHJEEFHMHGN_;
        result.aACHDBDODFG_ = aACHDBDODFG_;
        result.eIPOBNOIHHD_ = eIPOBNOIHHD_;
        result.lMKDFJMIHPJ_ = lMKDFJMIHPJ_;
        result.gGJDMIHGAKA_ = gGJDMIHGAKA_;
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
        if (other instanceof emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA) {
          return mergeFrom((emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA other) {
        if (other == emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA.getDefaultInstance()) return this;
        if (other.getAHJEEFHMHGN() != false) {
          setAHJEEFHMHGN(other.getAHJEEFHMHGN());
        }
        if (other.getAACHDBDODFG() != false) {
          setAACHDBDODFG(other.getAACHDBDODFG());
        }
        if (other.getEIPOBNOIHHD() != false) {
          setEIPOBNOIHHD(other.getEIPOBNOIHHD());
        }
        if (other.getLMKDFJMIHPJ() != 0) {
          setLMKDFJMIHPJ(other.getLMKDFJMIHPJ());
        }
        if (other.getGGJDMIHGAKA() != 0) {
          setGGJDMIHGAKA(other.getGGJDMIHGAKA());
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
        emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean aHJEEFHMHGN_ ;
      /**
       * <code>bool AHJEEFHMHGN = 2;</code>
       * @return The aHJEEFHMHGN.
       */
      @java.lang.Override
      public boolean getAHJEEFHMHGN() {
        return aHJEEFHMHGN_;
      }
      /**
       * <code>bool AHJEEFHMHGN = 2;</code>
       * @param value The aHJEEFHMHGN to set.
       * @return This builder for chaining.
       */
      public Builder setAHJEEFHMHGN(boolean value) {
        
        aHJEEFHMHGN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool AHJEEFHMHGN = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHJEEFHMHGN() {
        
        aHJEEFHMHGN_ = false;
        onChanged();
        return this;
      }

      private boolean aACHDBDODFG_ ;
      /**
       * <code>bool AACHDBDODFG = 15;</code>
       * @return The aACHDBDODFG.
       */
      @java.lang.Override
      public boolean getAACHDBDODFG() {
        return aACHDBDODFG_;
      }
      /**
       * <code>bool AACHDBDODFG = 15;</code>
       * @param value The aACHDBDODFG to set.
       * @return This builder for chaining.
       */
      public Builder setAACHDBDODFG(boolean value) {
        
        aACHDBDODFG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool AACHDBDODFG = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAACHDBDODFG() {
        
        aACHDBDODFG_ = false;
        onChanged();
        return this;
      }

      private boolean eIPOBNOIHHD_ ;
      /**
       * <code>bool EIPOBNOIHHD = 1;</code>
       * @return The eIPOBNOIHHD.
       */
      @java.lang.Override
      public boolean getEIPOBNOIHHD() {
        return eIPOBNOIHHD_;
      }
      /**
       * <code>bool EIPOBNOIHHD = 1;</code>
       * @param value The eIPOBNOIHHD to set.
       * @return This builder for chaining.
       */
      public Builder setEIPOBNOIHHD(boolean value) {
        
        eIPOBNOIHHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool EIPOBNOIHHD = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEIPOBNOIHHD() {
        
        eIPOBNOIHHD_ = false;
        onChanged();
        return this;
      }

      private int lMKDFJMIHPJ_ ;
      /**
       * <code>uint32 LMKDFJMIHPJ = 13;</code>
       * @return The lMKDFJMIHPJ.
       */
      @java.lang.Override
      public int getLMKDFJMIHPJ() {
        return lMKDFJMIHPJ_;
      }
      /**
       * <code>uint32 LMKDFJMIHPJ = 13;</code>
       * @param value The lMKDFJMIHPJ to set.
       * @return This builder for chaining.
       */
      public Builder setLMKDFJMIHPJ(int value) {
        
        lMKDFJMIHPJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LMKDFJMIHPJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLMKDFJMIHPJ() {
        
        lMKDFJMIHPJ_ = 0;
        onChanged();
        return this;
      }

      private int gGJDMIHGAKA_ ;
      /**
       * <code>uint32 GGJDMIHGAKA = 10;</code>
       * @return The gGJDMIHGAKA.
       */
      @java.lang.Override
      public int getGGJDMIHGAKA() {
        return gGJDMIHGAKA_;
      }
      /**
       * <code>uint32 GGJDMIHGAKA = 10;</code>
       * @param value The gGJDMIHGAKA to set.
       * @return This builder for chaining.
       */
      public Builder setGGJDMIHGAKA(int value) {
        
        gGJDMIHGAKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GGJDMIHGAKA = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGGJDMIHGAKA() {
        
        gGJDMIHGAKA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OKJMFFNHFCA)
    }

    // @@protoc_insertion_point(class_scope:OKJMFFNHFCA)
    private static final emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA();
    }

    public static emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OKJMFFNHFCA>
        PARSER = new com.google.protobuf.AbstractParser<OKJMFFNHFCA>() {
      @java.lang.Override
      public OKJMFFNHFCA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OKJMFFNHFCA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OKJMFFNHFCA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OKJMFFNHFCA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OKJMFFNHFCAOuterClass.OKJMFFNHFCA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OKJMFFNHFCA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OKJMFFNHFCA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OKJMFFNHFCA.proto\"v\n\013OKJMFFNHFCA\022\023\n\013AH" +
      "JEEFHMHGN\030\002 \001(\010\022\023\n\013AACHDBDODFG\030\017 \001(\010\022\023\n\013" +
      "EIPOBNOIHHD\030\001 \001(\010\022\023\n\013LMKDFJMIHPJ\030\r \001(\r\022\023" +
      "\n\013GGJDMIHGAKA\030\n \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OKJMFFNHFCA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OKJMFFNHFCA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OKJMFFNHFCA_descriptor,
        new java.lang.String[] { "AHJEEFHMHGN", "AACHDBDODFG", "EIPOBNOIHHD", "LMKDFJMIHPJ", "GGJDMIHGAKA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
