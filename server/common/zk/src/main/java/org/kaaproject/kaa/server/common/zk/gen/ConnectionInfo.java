/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.common.zk.gen;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ConnectionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConnectionInfo\",\"namespace\":\"org.kaaproject.kaa.server.common.zk.gen\",\"fields\":[{\"name\":\"thriftHost\",\"type\":\"string\"},{\"name\":\"thriftPort\",\"type\":\"int\"},{\"name\":\"publicKey\",\"type\":[\"bytes\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.CharSequence thriftHost;
   private int thriftPort;
   private java.nio.ByteBuffer publicKey;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ConnectionInfo() {}

  /**
   * All-args constructor.
   */
  public ConnectionInfo(java.lang.CharSequence thriftHost, java.lang.Integer thriftPort, java.nio.ByteBuffer publicKey) {
    this.thriftHost = thriftHost;
    this.thriftPort = thriftPort;
    this.publicKey = publicKey;
  }

  @Override
public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  @Override
public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return thriftHost;
    case 1: return thriftPort;
    case 2: return publicKey;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @Override
@SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: thriftHost = (java.lang.CharSequence)value$; break;
    case 1: thriftPort = (java.lang.Integer)value$; break;
    case 2: publicKey = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'thriftHost' field.
   */
  public java.lang.CharSequence getThriftHost() {
    return thriftHost;
  }

  /**
   * Sets the value of the 'thriftHost' field.
   * @param value the value to set.
   */
  public void setThriftHost(java.lang.CharSequence value) {
    this.thriftHost = value;
  }

  /**
   * Gets the value of the 'thriftPort' field.
   */
  public java.lang.Integer getThriftPort() {
    return thriftPort;
  }

  /**
   * Sets the value of the 'thriftPort' field.
   * @param value the value to set.
   */
  public void setThriftPort(java.lang.Integer value) {
    this.thriftPort = value;
  }

  /**
   * Gets the value of the 'publicKey' field.
   */
  public java.nio.ByteBuffer getPublicKey() {
    return publicKey;
  }

  /**
   * Sets the value of the 'publicKey' field.
   * @param value the value to set.
   */
  public void setPublicKey(java.nio.ByteBuffer value) {
    this.publicKey = value;
  }

  /** Creates a new ConnectionInfo RecordBuilder */
  public static org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder();
  }

  /** Creates a new ConnectionInfo RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder other) {
    return new org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder(other);
  }

  /** Creates a new ConnectionInfo RecordBuilder by copying an existing ConnectionInfo instance */
  public static org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo other) {
    return new org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder(other);
  }

  /**
   * RecordBuilder for ConnectionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConnectionInfo>
    implements org.apache.avro.data.RecordBuilder<ConnectionInfo> {

    private java.lang.CharSequence thriftHost;
    private int thriftPort;
    private java.nio.ByteBuffer publicKey;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.thriftHost)) {
        this.thriftHost = data().deepCopy(fields()[0].schema(), other.thriftHost);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.thriftPort)) {
        this.thriftPort = data().deepCopy(fields()[1].schema(), other.thriftPort);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[2].schema(), other.publicKey);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing ConnectionInfo instance */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo other) {
            super(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.thriftHost)) {
        this.thriftHost = data().deepCopy(fields()[0].schema(), other.thriftHost);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.thriftPort)) {
        this.thriftPort = data().deepCopy(fields()[1].schema(), other.thriftPort);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[2].schema(), other.publicKey);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'thriftHost' field */
    public java.lang.CharSequence getThriftHost() {
      return thriftHost;
    }

    /** Sets the value of the 'thriftHost' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder setThriftHost(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.thriftHost = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'thriftHost' field has been set */
    public boolean hasThriftHost() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'thriftHost' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder clearThriftHost() {
      thriftHost = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'thriftPort' field */
    public java.lang.Integer getThriftPort() {
      return thriftPort;
    }

    /** Sets the value of the 'thriftPort' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder setThriftPort(int value) {
      validate(fields()[1], value);
      this.thriftPort = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'thriftPort' field has been set */
    public boolean hasThriftPort() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'thriftPort' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder clearThriftPort() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'publicKey' field */
    public java.nio.ByteBuffer getPublicKey() {
      return publicKey;
    }

    /** Sets the value of the 'publicKey' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder setPublicKey(java.nio.ByteBuffer value) {
      validate(fields()[2], value);
      this.publicKey = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'publicKey' field has been set */
    public boolean hasPublicKey() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'publicKey' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo.Builder clearPublicKey() {
      publicKey = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ConnectionInfo build() {
      try {
        ConnectionInfo record = new ConnectionInfo();
        record.thriftHost = fieldSetFlags()[0] ? this.thriftHost : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.thriftPort = fieldSetFlags()[1] ? this.thriftPort : (java.lang.Integer) defaultValue(fields()[1]);
        record.publicKey = fieldSetFlags()[2] ? this.publicKey : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
