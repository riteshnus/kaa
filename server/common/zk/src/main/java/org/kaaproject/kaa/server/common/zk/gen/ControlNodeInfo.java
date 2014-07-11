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
public class ControlNodeInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ControlNodeInfo\",\"namespace\":\"org.kaaproject.kaa.server.common.zk.gen\",\"fields\":[{\"name\":\"connectionInfo\",\"type\":{\"type\":\"record\",\"name\":\"ConnectionInfo\",\"fields\":[{\"name\":\"thriftHost\",\"type\":\"string\"},{\"name\":\"thriftPort\",\"type\":\"int\"},{\"name\":\"publicKey\",\"type\":[\"bytes\",\"null\"]}]}},{\"name\":\"operationsServerCount\",\"type\":\"int\"},{\"name\":\"bootstrapServerCount\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo connectionInfo;
   private int operationsServerCount;
   private int bootstrapServerCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ControlNodeInfo() {}

  /**
   * All-args constructor.
   */
  public ControlNodeInfo(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo connectionInfo, java.lang.Integer operationsServerCount, java.lang.Integer bootstrapServerCount) {
    this.connectionInfo = connectionInfo;
    this.operationsServerCount = operationsServerCount;
    this.bootstrapServerCount = bootstrapServerCount;
  }

  @Override
public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  @Override
public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return connectionInfo;
    case 1: return operationsServerCount;
    case 2: return bootstrapServerCount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @Override
@SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: connectionInfo = (org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo)value$; break;
    case 1: operationsServerCount = (java.lang.Integer)value$; break;
    case 2: bootstrapServerCount = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'connectionInfo' field.
   */
  public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }

  /**
   * Sets the value of the 'connectionInfo' field.
   * @param value the value to set.
   */
  public void setConnectionInfo(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo value) {
    this.connectionInfo = value;
  }

  /**
   * Gets the value of the 'operationsServerCount' field.
   */
  public java.lang.Integer getOperationsServerCount() {
    return operationsServerCount;
  }

  /**
   * Sets the value of the 'operationsServerCount' field.
   * @param value the value to set.
   */
  public void setOperationsServerCount(java.lang.Integer value) {
    this.operationsServerCount = value;
  }

  /**
   * Gets the value of the 'bootstrapServerCount' field.
   */
  public java.lang.Integer getBootstrapServerCount() {
    return bootstrapServerCount;
  }

  /**
   * Sets the value of the 'bootstrapServerCount' field.
   * @param value the value to set.
   */
  public void setBootstrapServerCount(java.lang.Integer value) {
    this.bootstrapServerCount = value;
  }

  /** Creates a new ControlNodeInfo RecordBuilder */
  public static org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder();
  }

  /** Creates a new ControlNodeInfo RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder other) {
    return new org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder(other);
  }

  /** Creates a new ControlNodeInfo RecordBuilder by copying an existing ControlNodeInfo instance */
  public static org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo other) {
    return new org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder(other);
  }

  /**
   * RecordBuilder for ControlNodeInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ControlNodeInfo>
    implements org.apache.avro.data.RecordBuilder<ControlNodeInfo> {

    private org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo connectionInfo;
    private int operationsServerCount;
    private int bootstrapServerCount;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.connectionInfo)) {
        this.connectionInfo = data().deepCopy(fields()[0].schema(), other.connectionInfo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.operationsServerCount)) {
        this.operationsServerCount = data().deepCopy(fields()[1].schema(), other.operationsServerCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bootstrapServerCount)) {
        this.bootstrapServerCount = data().deepCopy(fields()[2].schema(), other.bootstrapServerCount);
        fieldSetFlags()[2] = true;
      }
    }

    /** Creates a Builder by copying an existing ControlNodeInfo instance */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo other) {
            super(org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.connectionInfo)) {
        this.connectionInfo = data().deepCopy(fields()[0].schema(), other.connectionInfo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.operationsServerCount)) {
        this.operationsServerCount = data().deepCopy(fields()[1].schema(), other.operationsServerCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bootstrapServerCount)) {
        this.bootstrapServerCount = data().deepCopy(fields()[2].schema(), other.bootstrapServerCount);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'connectionInfo' field */
    public org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo getConnectionInfo() {
      return connectionInfo;
    }

    /** Sets the value of the 'connectionInfo' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder setConnectionInfo(org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo value) {
      validate(fields()[0], value);
      this.connectionInfo = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'connectionInfo' field has been set */
    public boolean hasConnectionInfo() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'connectionInfo' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder clearConnectionInfo() {
      connectionInfo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'operationsServerCount' field */
    public java.lang.Integer getOperationsServerCount() {
      return operationsServerCount;
    }

    /** Sets the value of the 'operationsServerCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder setOperationsServerCount(int value) {
      validate(fields()[1], value);
      this.operationsServerCount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'operationsServerCount' field has been set */
    public boolean hasOperationsServerCount() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'operationsServerCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder clearOperationsServerCount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'bootstrapServerCount' field */
    public java.lang.Integer getBootstrapServerCount() {
      return bootstrapServerCount;
    }

    /** Sets the value of the 'bootstrapServerCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder setBootstrapServerCount(int value) {
      validate(fields()[2], value);
      this.bootstrapServerCount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'bootstrapServerCount' field has been set */
    public boolean hasBootstrapServerCount() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'bootstrapServerCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.ControlNodeInfo.Builder clearBootstrapServerCount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ControlNodeInfo build() {
      try {
        ControlNodeInfo record = new ControlNodeInfo();
        record.connectionInfo = fieldSetFlags()[0] ? this.connectionInfo : (org.kaaproject.kaa.server.common.zk.gen.ConnectionInfo) defaultValue(fields()[0]);
        record.operationsServerCount = fieldSetFlags()[1] ? this.operationsServerCount : (java.lang.Integer) defaultValue(fields()[1]);
        record.bootstrapServerCount = fieldSetFlags()[2] ? this.bootstrapServerCount : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
