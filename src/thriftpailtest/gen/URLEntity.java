/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftpailtest.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLEntity implements org.apache.thrift.TBase<URLEntity, URLEntity._Fields>, java.io.Serializable, Cloneable, Comparable<URLEntity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("URLEntity");

  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("displayUrl", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPANDED_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("expandedUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ACCESSED_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("accessedUrl", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new URLEntityStandardSchemeFactory());
    schemes.put(TupleScheme.class, new URLEntityTupleSchemeFactory());
  }

  public String url; // required
  public String displayUrl; // optional
  public String expandedUrl; // optional
  public String accessedUrl; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    URL((short)1, "url"),
    DISPLAY_URL((short)2, "displayUrl"),
    EXPANDED_URL((short)3, "expandedUrl"),
    ACCESSED_URL((short)4, "accessedUrl");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // URL
          return URL;
        case 2: // DISPLAY_URL
          return DISPLAY_URL;
        case 3: // EXPANDED_URL
          return EXPANDED_URL;
        case 4: // ACCESSED_URL
          return ACCESSED_URL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.DISPLAY_URL,_Fields.EXPANDED_URL,_Fields.ACCESSED_URL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_URL, new org.apache.thrift.meta_data.FieldMetaData("displayUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPANDED_URL, new org.apache.thrift.meta_data.FieldMetaData("expandedUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCESSED_URL, new org.apache.thrift.meta_data.FieldMetaData("accessedUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(URLEntity.class, metaDataMap);
  }

  public URLEntity() {
  }

  public URLEntity(
    String url)
  {
    this();
    this.url = url;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public URLEntity(URLEntity other) {
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetDisplayUrl()) {
      this.displayUrl = other.displayUrl;
    }
    if (other.isSetExpandedUrl()) {
      this.expandedUrl = other.expandedUrl;
    }
    if (other.isSetAccessedUrl()) {
      this.accessedUrl = other.accessedUrl;
    }
  }

  public URLEntity deepCopy() {
    return new URLEntity(this);
  }

  @Override
  public void clear() {
    this.url = null;
    this.displayUrl = null;
    this.expandedUrl = null;
    this.accessedUrl = null;
  }

  public String getUrl() {
    return this.url;
  }

  public URLEntity setUrl(String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getDisplayUrl() {
    return this.displayUrl;
  }

  public URLEntity setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  public void unsetDisplayUrl() {
    this.displayUrl = null;
  }

  /** Returns true if field displayUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayUrl() {
    return this.displayUrl != null;
  }

  public void setDisplayUrlIsSet(boolean value) {
    if (!value) {
      this.displayUrl = null;
    }
  }

  public String getExpandedUrl() {
    return this.expandedUrl;
  }

  public URLEntity setExpandedUrl(String expandedUrl) {
    this.expandedUrl = expandedUrl;
    return this;
  }

  public void unsetExpandedUrl() {
    this.expandedUrl = null;
  }

  /** Returns true if field expandedUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetExpandedUrl() {
    return this.expandedUrl != null;
  }

  public void setExpandedUrlIsSet(boolean value) {
    if (!value) {
      this.expandedUrl = null;
    }
  }

  public String getAccessedUrl() {
    return this.accessedUrl;
  }

  public URLEntity setAccessedUrl(String accessedUrl) {
    this.accessedUrl = accessedUrl;
    return this;
  }

  public void unsetAccessedUrl() {
    this.accessedUrl = null;
  }

  /** Returns true if field accessedUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessedUrl() {
    return this.accessedUrl != null;
  }

  public void setAccessedUrlIsSet(boolean value) {
    if (!value) {
      this.accessedUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case DISPLAY_URL:
      if (value == null) {
        unsetDisplayUrl();
      } else {
        setDisplayUrl((String)value);
      }
      break;

    case EXPANDED_URL:
      if (value == null) {
        unsetExpandedUrl();
      } else {
        setExpandedUrl((String)value);
      }
      break;

    case ACCESSED_URL:
      if (value == null) {
        unsetAccessedUrl();
      } else {
        setAccessedUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URL:
      return getUrl();

    case DISPLAY_URL:
      return getDisplayUrl();

    case EXPANDED_URL:
      return getExpandedUrl();

    case ACCESSED_URL:
      return getAccessedUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case URL:
      return isSetUrl();
    case DISPLAY_URL:
      return isSetDisplayUrl();
    case EXPANDED_URL:
      return isSetExpandedUrl();
    case ACCESSED_URL:
      return isSetAccessedUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof URLEntity)
      return this.equals((URLEntity)that);
    return false;
  }

  public boolean equals(URLEntity that) {
    if (that == null)
      return false;

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_displayUrl = true && this.isSetDisplayUrl();
    boolean that_present_displayUrl = true && that.isSetDisplayUrl();
    if (this_present_displayUrl || that_present_displayUrl) {
      if (!(this_present_displayUrl && that_present_displayUrl))
        return false;
      if (!this.displayUrl.equals(that.displayUrl))
        return false;
    }

    boolean this_present_expandedUrl = true && this.isSetExpandedUrl();
    boolean that_present_expandedUrl = true && that.isSetExpandedUrl();
    if (this_present_expandedUrl || that_present_expandedUrl) {
      if (!(this_present_expandedUrl && that_present_expandedUrl))
        return false;
      if (!this.expandedUrl.equals(that.expandedUrl))
        return false;
    }

    boolean this_present_accessedUrl = true && this.isSetAccessedUrl();
    boolean that_present_accessedUrl = true && that.isSetAccessedUrl();
    if (this_present_accessedUrl || that_present_accessedUrl) {
      if (!(this_present_accessedUrl && that_present_accessedUrl))
        return false;
      if (!this.accessedUrl.equals(that.accessedUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(URLEntity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(other.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, other.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayUrl()).compareTo(other.isSetDisplayUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayUrl, other.displayUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpandedUrl()).compareTo(other.isSetExpandedUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpandedUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expandedUrl, other.expandedUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccessedUrl()).compareTo(other.isSetAccessedUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessedUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessedUrl, other.accessedUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("URLEntity(");
    boolean first = true;

    sb.append("url:");
    if (this.url == null) {
      sb.append("null");
    } else {
      sb.append(this.url);
    }
    first = false;
    if (isSetDisplayUrl()) {
      if (!first) sb.append(", ");
      sb.append("displayUrl:");
      if (this.displayUrl == null) {
        sb.append("null");
      } else {
        sb.append(this.displayUrl);
      }
      first = false;
    }
    if (isSetExpandedUrl()) {
      if (!first) sb.append(", ");
      sb.append("expandedUrl:");
      if (this.expandedUrl == null) {
        sb.append("null");
      } else {
        sb.append(this.expandedUrl);
      }
      first = false;
    }
    if (isSetAccessedUrl()) {
      if (!first) sb.append(", ");
      sb.append("accessedUrl:");
      if (this.accessedUrl == null) {
        sb.append("null");
      } else {
        sb.append(this.accessedUrl);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (url == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'url' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class URLEntityStandardSchemeFactory implements SchemeFactory {
    public URLEntityStandardScheme getScheme() {
      return new URLEntityStandardScheme();
    }
  }

  private static class URLEntityStandardScheme extends StandardScheme<URLEntity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, URLEntity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISPLAY_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayUrl = iprot.readString();
              struct.setDisplayUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPANDED_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.expandedUrl = iprot.readString();
              struct.setExpandedUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACCESSED_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accessedUrl = iprot.readString();
              struct.setAccessedUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, URLEntity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.url != null) {
        oprot.writeFieldBegin(URL_FIELD_DESC);
        oprot.writeString(struct.url);
        oprot.writeFieldEnd();
      }
      if (struct.displayUrl != null) {
        if (struct.isSetDisplayUrl()) {
          oprot.writeFieldBegin(DISPLAY_URL_FIELD_DESC);
          oprot.writeString(struct.displayUrl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.expandedUrl != null) {
        if (struct.isSetExpandedUrl()) {
          oprot.writeFieldBegin(EXPANDED_URL_FIELD_DESC);
          oprot.writeString(struct.expandedUrl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.accessedUrl != null) {
        if (struct.isSetAccessedUrl()) {
          oprot.writeFieldBegin(ACCESSED_URL_FIELD_DESC);
          oprot.writeString(struct.accessedUrl);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class URLEntityTupleSchemeFactory implements SchemeFactory {
    public URLEntityTupleScheme getScheme() {
      return new URLEntityTupleScheme();
    }
  }

  private static class URLEntityTupleScheme extends TupleScheme<URLEntity> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, URLEntity struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.url);
      BitSet optionals = new BitSet();
      if (struct.isSetDisplayUrl()) {
        optionals.set(0);
      }
      if (struct.isSetExpandedUrl()) {
        optionals.set(1);
      }
      if (struct.isSetAccessedUrl()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDisplayUrl()) {
        oprot.writeString(struct.displayUrl);
      }
      if (struct.isSetExpandedUrl()) {
        oprot.writeString(struct.expandedUrl);
      }
      if (struct.isSetAccessedUrl()) {
        oprot.writeString(struct.accessedUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, URLEntity struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.url = iprot.readString();
      struct.setUrlIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.displayUrl = iprot.readString();
        struct.setDisplayUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.expandedUrl = iprot.readString();
        struct.setExpandedUrlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.accessedUrl = iprot.readString();
        struct.setAccessedUrlIsSet(true);
      }
    }
  }

}

