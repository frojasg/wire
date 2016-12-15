// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * Describes a message type.
 */
public final class DescriptorProto extends Message<DescriptorProto, DescriptorProto.Builder> {
  public static final ProtoAdapter<DescriptorProto> ADAPTER = new ProtoAdapter_DescriptorProto();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  @WireField(
      tag = 2,
      adapter = "com.google.protobuf.FieldDescriptorProto#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FieldDescriptorProto> field;

  @WireField(
      tag = 6,
      adapter = "com.google.protobuf.FieldDescriptorProto#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FieldDescriptorProto> extension;

  @WireField(
      tag = 3,
      adapter = "com.google.protobuf.DescriptorProto#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<DescriptorProto> nested_type;

  @WireField(
      tag = 4,
      adapter = "com.google.protobuf.EnumDescriptorProto#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<EnumDescriptorProto> enum_type;

  @WireField(
      tag = 5,
      adapter = "com.google.protobuf.DescriptorProto$ExtensionRange#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<ExtensionRange> extension_range;

  @WireField(
      tag = 8,
      adapter = "com.google.protobuf.OneofDescriptorProto#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<OneofDescriptorProto> oneof_decl;

  @WireField(
      tag = 7,
      adapter = "com.google.protobuf.MessageOptions#ADAPTER"
  )
  public final MessageOptions options;

  @WireField(
      tag = 9,
      adapter = "com.google.protobuf.DescriptorProto$ReservedRange#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<ReservedRange> reserved_range;

  /**
   * Reserved field names, which may not be used by fields in the same message.
   * A given name may only be reserved once.
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> reserved_name;

  public DescriptorProto(String name, List<FieldDescriptorProto> field, List<FieldDescriptorProto> extension, List<DescriptorProto> nested_type, List<EnumDescriptorProto> enum_type, List<ExtensionRange> extension_range, List<OneofDescriptorProto> oneof_decl, MessageOptions options, List<ReservedRange> reserved_range, List<String> reserved_name) {
    this(name, field, extension, nested_type, enum_type, extension_range, oneof_decl, options, reserved_range, reserved_name, ByteString.EMPTY);
  }

  public DescriptorProto(String name, List<FieldDescriptorProto> field, List<FieldDescriptorProto> extension, List<DescriptorProto> nested_type, List<EnumDescriptorProto> enum_type, List<ExtensionRange> extension_range, List<OneofDescriptorProto> oneof_decl, MessageOptions options, List<ReservedRange> reserved_range, List<String> reserved_name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.field = Internal.immutableCopyOf("field", field);
    this.extension = Internal.immutableCopyOf("extension", extension);
    this.nested_type = Internal.immutableCopyOf("nested_type", nested_type);
    this.enum_type = Internal.immutableCopyOf("enum_type", enum_type);
    this.extension_range = Internal.immutableCopyOf("extension_range", extension_range);
    this.oneof_decl = Internal.immutableCopyOf("oneof_decl", oneof_decl);
    this.options = options;
    this.reserved_range = Internal.immutableCopyOf("reserved_range", reserved_range);
    this.reserved_name = Internal.immutableCopyOf("reserved_name", reserved_name);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.field = Internal.copyOf("field", field);
    builder.extension = Internal.copyOf("extension", extension);
    builder.nested_type = Internal.copyOf("nested_type", nested_type);
    builder.enum_type = Internal.copyOf("enum_type", enum_type);
    builder.extension_range = Internal.copyOf("extension_range", extension_range);
    builder.oneof_decl = Internal.copyOf("oneof_decl", oneof_decl);
    builder.options = options;
    builder.reserved_range = Internal.copyOf("reserved_range", reserved_range);
    builder.reserved_name = Internal.copyOf("reserved_name", reserved_name);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DescriptorProto)) return false;
    DescriptorProto o = (DescriptorProto) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name)
        && field.equals(o.field)
        && extension.equals(o.extension)
        && nested_type.equals(o.nested_type)
        && enum_type.equals(o.enum_type)
        && extension_range.equals(o.extension_range)
        && oneof_decl.equals(o.oneof_decl)
        && Internal.equals(options, o.options)
        && reserved_range.equals(o.reserved_range)
        && reserved_name.equals(o.reserved_name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + field.hashCode();
      result = result * 37 + extension.hashCode();
      result = result * 37 + nested_type.hashCode();
      result = result * 37 + enum_type.hashCode();
      result = result * 37 + extension_range.hashCode();
      result = result * 37 + oneof_decl.hashCode();
      result = result * 37 + (options != null ? options.hashCode() : 0);
      result = result * 37 + reserved_range.hashCode();
      result = result * 37 + reserved_name.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (!field.isEmpty()) builder.append(", field=").append(field);
    if (!extension.isEmpty()) builder.append(", extension=").append(extension);
    if (!nested_type.isEmpty()) builder.append(", nested_type=").append(nested_type);
    if (!enum_type.isEmpty()) builder.append(", enum_type=").append(enum_type);
    if (!extension_range.isEmpty()) builder.append(", extension_range=").append(extension_range);
    if (!oneof_decl.isEmpty()) builder.append(", oneof_decl=").append(oneof_decl);
    if (options != null) builder.append(", options=").append(options);
    if (!reserved_range.isEmpty()) builder.append(", reserved_range=").append(reserved_range);
    if (!reserved_name.isEmpty()) builder.append(", reserved_name=").append(reserved_name);
    return builder.replace(0, 2, "DescriptorProto{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DescriptorProto, Builder> {
    public String name;

    public List<FieldDescriptorProto> field;

    public List<FieldDescriptorProto> extension;

    public List<DescriptorProto> nested_type;

    public List<EnumDescriptorProto> enum_type;

    public List<ExtensionRange> extension_range;

    public List<OneofDescriptorProto> oneof_decl;

    public MessageOptions options;

    public List<ReservedRange> reserved_range;

    public List<String> reserved_name;

    public Builder() {
      field = Internal.newMutableList();
      extension = Internal.newMutableList();
      nested_type = Internal.newMutableList();
      enum_type = Internal.newMutableList();
      extension_range = Internal.newMutableList();
      oneof_decl = Internal.newMutableList();
      reserved_range = Internal.newMutableList();
      reserved_name = Internal.newMutableList();
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder field(List<FieldDescriptorProto> field) {
      Internal.checkElementsNotNull(field);
      this.field = field;
      return this;
    }

    public Builder extension(List<FieldDescriptorProto> extension) {
      Internal.checkElementsNotNull(extension);
      this.extension = extension;
      return this;
    }

    public Builder nested_type(List<DescriptorProto> nested_type) {
      Internal.checkElementsNotNull(nested_type);
      this.nested_type = nested_type;
      return this;
    }

    public Builder enum_type(List<EnumDescriptorProto> enum_type) {
      Internal.checkElementsNotNull(enum_type);
      this.enum_type = enum_type;
      return this;
    }

    public Builder extension_range(List<ExtensionRange> extension_range) {
      Internal.checkElementsNotNull(extension_range);
      this.extension_range = extension_range;
      return this;
    }

    public Builder oneof_decl(List<OneofDescriptorProto> oneof_decl) {
      Internal.checkElementsNotNull(oneof_decl);
      this.oneof_decl = oneof_decl;
      return this;
    }

    public Builder options(MessageOptions options) {
      this.options = options;
      return this;
    }

    public Builder reserved_range(List<ReservedRange> reserved_range) {
      Internal.checkElementsNotNull(reserved_range);
      this.reserved_range = reserved_range;
      return this;
    }

    /**
     * Reserved field names, which may not be used by fields in the same message.
     * A given name may only be reserved once.
     */
    public Builder reserved_name(List<String> reserved_name) {
      Internal.checkElementsNotNull(reserved_name);
      this.reserved_name = reserved_name;
      return this;
    }

    @Override
    public DescriptorProto build() {
      return new DescriptorProto(name, field, extension, nested_type, enum_type, extension_range, oneof_decl, options, reserved_range, reserved_name, super.buildUnknownFields());
    }
  }

  public static final class ExtensionRange extends Message<ExtensionRange, ExtensionRange.Builder> {
    public static final ProtoAdapter<ExtensionRange> ADAPTER = new ProtoAdapter_ExtensionRange();

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_START = 0;

    public static final Integer DEFAULT_END = 0;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    public final Integer start;

    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    public final Integer end;

    public ExtensionRange(Integer start, Integer end) {
      this(start, end, ByteString.EMPTY);
    }

    public ExtensionRange(Integer start, Integer end, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.start = start;
      this.end = end;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.start = start;
      builder.end = end;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof ExtensionRange)) return false;
      ExtensionRange o = (ExtensionRange) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(start, o.start)
          && Internal.equals(end, o.end);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (start != null ? start.hashCode() : 0);
        result = result * 37 + (end != null ? end.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (start != null) builder.append(", start=").append(start);
      if (end != null) builder.append(", end=").append(end);
      return builder.replace(0, 2, "ExtensionRange{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<ExtensionRange, Builder> {
      public Integer start;

      public Integer end;

      public Builder() {
      }

      public Builder start(Integer start) {
        this.start = start;
        return this;
      }

      public Builder end(Integer end) {
        this.end = end;
        return this;
      }

      @Override
      public ExtensionRange build() {
        return new ExtensionRange(start, end, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_ExtensionRange extends ProtoAdapter<ExtensionRange> {
      public ProtoAdapter_ExtensionRange() {
        super(FieldEncoding.LENGTH_DELIMITED, ExtensionRange.class);
      }

      @Override
      public int encodedSize(ExtensionRange value) {
        return ProtoAdapter.INT32.encodedSizeWithTag(1, value.start)
            + ProtoAdapter.INT32.encodedSizeWithTag(2, value.end)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, ExtensionRange value) throws IOException {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.start);
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.end);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public ExtensionRange decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.start(ProtoAdapter.INT32.decode(reader)); break;
            case 2: builder.end(ProtoAdapter.INT32.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public ExtensionRange redact(ExtensionRange value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  /**
   * Range of reserved tag numbers. Reserved tag numbers may not be used by
   * fields or extension ranges in the same message. Reserved ranges may
   * not overlap.
   */
  public static final class ReservedRange extends Message<ReservedRange, ReservedRange.Builder> {
    public static final ProtoAdapter<ReservedRange> ADAPTER = new ProtoAdapter_ReservedRange();

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_START = 0;

    public static final Integer DEFAULT_END = 0;

    /**
     * Inclusive.
     */
    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    public final Integer start;

    /**
     * Exclusive.
     */
    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    public final Integer end;

    public ReservedRange(Integer start, Integer end) {
      this(start, end, ByteString.EMPTY);
    }

    public ReservedRange(Integer start, Integer end, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.start = start;
      this.end = end;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.start = start;
      builder.end = end;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof ReservedRange)) return false;
      ReservedRange o = (ReservedRange) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(start, o.start)
          && Internal.equals(end, o.end);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (start != null ? start.hashCode() : 0);
        result = result * 37 + (end != null ? end.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (start != null) builder.append(", start=").append(start);
      if (end != null) builder.append(", end=").append(end);
      return builder.replace(0, 2, "ReservedRange{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<ReservedRange, Builder> {
      public Integer start;

      public Integer end;

      public Builder() {
      }

      /**
       * Inclusive.
       */
      public Builder start(Integer start) {
        this.start = start;
        return this;
      }

      /**
       * Exclusive.
       */
      public Builder end(Integer end) {
        this.end = end;
        return this;
      }

      @Override
      public ReservedRange build() {
        return new ReservedRange(start, end, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_ReservedRange extends ProtoAdapter<ReservedRange> {
      public ProtoAdapter_ReservedRange() {
        super(FieldEncoding.LENGTH_DELIMITED, ReservedRange.class);
      }

      @Override
      public int encodedSize(ReservedRange value) {
        return ProtoAdapter.INT32.encodedSizeWithTag(1, value.start)
            + ProtoAdapter.INT32.encodedSizeWithTag(2, value.end)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, ReservedRange value) throws IOException {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.start);
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.end);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public ReservedRange decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.start(ProtoAdapter.INT32.decode(reader)); break;
            case 2: builder.end(ProtoAdapter.INT32.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public ReservedRange redact(ReservedRange value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  private static final class ProtoAdapter_DescriptorProto extends ProtoAdapter<DescriptorProto> {
    public ProtoAdapter_DescriptorProto() {
      super(FieldEncoding.LENGTH_DELIMITED, DescriptorProto.class);
    }

    @Override
    public int encodedSize(DescriptorProto value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
          + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, value.field)
          + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, value.extension)
          + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(3, value.nested_type)
          + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, value.enum_type)
          + ExtensionRange.ADAPTER.asRepeated().encodedSizeWithTag(5, value.extension_range)
          + OneofDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(8, value.oneof_decl)
          + MessageOptions.ADAPTER.encodedSizeWithTag(7, value.options)
          + ReservedRange.ADAPTER.asRepeated().encodedSizeWithTag(9, value.reserved_range)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, value.reserved_name)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DescriptorProto value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.field);
      FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.extension);
      DescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.nested_type);
      EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.enum_type);
      ExtensionRange.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.extension_range);
      OneofDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.oneof_decl);
      MessageOptions.ADAPTER.encodeWithTag(writer, 7, value.options);
      ReservedRange.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.reserved_range);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 10, value.reserved_name);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DescriptorProto decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.field.add(FieldDescriptorProto.ADAPTER.decode(reader)); break;
          case 3: builder.nested_type.add(DescriptorProto.ADAPTER.decode(reader)); break;
          case 4: builder.enum_type.add(EnumDescriptorProto.ADAPTER.decode(reader)); break;
          case 5: builder.extension_range.add(ExtensionRange.ADAPTER.decode(reader)); break;
          case 6: builder.extension.add(FieldDescriptorProto.ADAPTER.decode(reader)); break;
          case 7: builder.options(MessageOptions.ADAPTER.decode(reader)); break;
          case 8: builder.oneof_decl.add(OneofDescriptorProto.ADAPTER.decode(reader)); break;
          case 9: builder.reserved_range.add(ReservedRange.ADAPTER.decode(reader)); break;
          case 10: builder.reserved_name.add(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public DescriptorProto redact(DescriptorProto value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.field, FieldDescriptorProto.ADAPTER);
      Internal.redactElements(builder.extension, FieldDescriptorProto.ADAPTER);
      Internal.redactElements(builder.nested_type, DescriptorProto.ADAPTER);
      Internal.redactElements(builder.enum_type, EnumDescriptorProto.ADAPTER);
      Internal.redactElements(builder.extension_range, ExtensionRange.ADAPTER);
      Internal.redactElements(builder.oneof_decl, OneofDescriptorProto.ADAPTER);
      if (builder.options != null) builder.options = MessageOptions.ADAPTER.redact(builder.options);
      Internal.redactElements(builder.reserved_range, ReservedRange.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
