/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.zeppelin.interpreter.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-01-22")
public class WebUrlInfo implements org.apache.thrift.TBase<WebUrlInfo, WebUrlInfo._Fields>, java.io.Serializable, Cloneable, Comparable<WebUrlInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WebUrlInfo");

  private static final org.apache.thrift.protocol.TField INTERPRETER_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("interpreterGroupId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WEBURL_FIELD_DESC = new org.apache.thrift.protocol.TField("weburl", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WebUrlInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WebUrlInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String interpreterGroupId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String weburl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTERPRETER_GROUP_ID((short)1, "interpreterGroupId"),
    WEBURL((short)2, "weburl");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INTERPRETER_GROUP_ID
          return INTERPRETER_GROUP_ID;
        case 2: // WEBURL
          return WEBURL;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTERPRETER_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("interpreterGroupId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WEBURL, new org.apache.thrift.meta_data.FieldMetaData("weburl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WebUrlInfo.class, metaDataMap);
  }

  public WebUrlInfo() {
  }

  public WebUrlInfo(
    java.lang.String interpreterGroupId,
    java.lang.String weburl)
  {
    this();
    this.interpreterGroupId = interpreterGroupId;
    this.weburl = weburl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WebUrlInfo(WebUrlInfo other) {
    if (other.isSetInterpreterGroupId()) {
      this.interpreterGroupId = other.interpreterGroupId;
    }
    if (other.isSetWeburl()) {
      this.weburl = other.weburl;
    }
  }

  public WebUrlInfo deepCopy() {
    return new WebUrlInfo(this);
  }

  @Override
  public void clear() {
    this.interpreterGroupId = null;
    this.weburl = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getInterpreterGroupId() {
    return this.interpreterGroupId;
  }

  public WebUrlInfo setInterpreterGroupId(@org.apache.thrift.annotation.Nullable java.lang.String interpreterGroupId) {
    this.interpreterGroupId = interpreterGroupId;
    return this;
  }

  public void unsetInterpreterGroupId() {
    this.interpreterGroupId = null;
  }

  /** Returns true if field interpreterGroupId is set (has been assigned a value) and false otherwise */
  public boolean isSetInterpreterGroupId() {
    return this.interpreterGroupId != null;
  }

  public void setInterpreterGroupIdIsSet(boolean value) {
    if (!value) {
      this.interpreterGroupId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getWeburl() {
    return this.weburl;
  }

  public WebUrlInfo setWeburl(@org.apache.thrift.annotation.Nullable java.lang.String weburl) {
    this.weburl = weburl;
    return this;
  }

  public void unsetWeburl() {
    this.weburl = null;
  }

  /** Returns true if field weburl is set (has been assigned a value) and false otherwise */
  public boolean isSetWeburl() {
    return this.weburl != null;
  }

  public void setWeburlIsSet(boolean value) {
    if (!value) {
      this.weburl = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INTERPRETER_GROUP_ID:
      if (value == null) {
        unsetInterpreterGroupId();
      } else {
        setInterpreterGroupId((java.lang.String)value);
      }
      break;

    case WEBURL:
      if (value == null) {
        unsetWeburl();
      } else {
        setWeburl((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INTERPRETER_GROUP_ID:
      return getInterpreterGroupId();

    case WEBURL:
      return getWeburl();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INTERPRETER_GROUP_ID:
      return isSetInterpreterGroupId();
    case WEBURL:
      return isSetWeburl();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WebUrlInfo)
      return this.equals((WebUrlInfo)that);
    return false;
  }

  public boolean equals(WebUrlInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_interpreterGroupId = true && this.isSetInterpreterGroupId();
    boolean that_present_interpreterGroupId = true && that.isSetInterpreterGroupId();
    if (this_present_interpreterGroupId || that_present_interpreterGroupId) {
      if (!(this_present_interpreterGroupId && that_present_interpreterGroupId))
        return false;
      if (!this.interpreterGroupId.equals(that.interpreterGroupId))
        return false;
    }

    boolean this_present_weburl = true && this.isSetWeburl();
    boolean that_present_weburl = true && that.isSetWeburl();
    if (this_present_weburl || that_present_weburl) {
      if (!(this_present_weburl && that_present_weburl))
        return false;
      if (!this.weburl.equals(that.weburl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInterpreterGroupId()) ? 131071 : 524287);
    if (isSetInterpreterGroupId())
      hashCode = hashCode * 8191 + interpreterGroupId.hashCode();

    hashCode = hashCode * 8191 + ((isSetWeburl()) ? 131071 : 524287);
    if (isSetWeburl())
      hashCode = hashCode * 8191 + weburl.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WebUrlInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetInterpreterGroupId()).compareTo(other.isSetInterpreterGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterpreterGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interpreterGroupId, other.interpreterGroupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWeburl()).compareTo(other.isSetWeburl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeburl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weburl, other.weburl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WebUrlInfo(");
    boolean first = true;

    sb.append("interpreterGroupId:");
    if (this.interpreterGroupId == null) {
      sb.append("null");
    } else {
      sb.append(this.interpreterGroupId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("weburl:");
    if (this.weburl == null) {
      sb.append("null");
    } else {
      sb.append(this.weburl);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WebUrlInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WebUrlInfoStandardScheme getScheme() {
      return new WebUrlInfoStandardScheme();
    }
  }

  private static class WebUrlInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<WebUrlInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WebUrlInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTERPRETER_GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.interpreterGroupId = iprot.readString();
              struct.setInterpreterGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WEBURL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.weburl = iprot.readString();
              struct.setWeburlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WebUrlInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.interpreterGroupId != null) {
        oprot.writeFieldBegin(INTERPRETER_GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.interpreterGroupId);
        oprot.writeFieldEnd();
      }
      if (struct.weburl != null) {
        oprot.writeFieldBegin(WEBURL_FIELD_DESC);
        oprot.writeString(struct.weburl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WebUrlInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WebUrlInfoTupleScheme getScheme() {
      return new WebUrlInfoTupleScheme();
    }
  }

  private static class WebUrlInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<WebUrlInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WebUrlInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInterpreterGroupId()) {
        optionals.set(0);
      }
      if (struct.isSetWeburl()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetInterpreterGroupId()) {
        oprot.writeString(struct.interpreterGroupId);
      }
      if (struct.isSetWeburl()) {
        oprot.writeString(struct.weburl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WebUrlInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.interpreterGroupId = iprot.readString();
        struct.setInterpreterGroupIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.weburl = iprot.readString();
        struct.setWeburlIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

