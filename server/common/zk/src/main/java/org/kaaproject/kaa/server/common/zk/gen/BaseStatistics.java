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
public class BaseStatistics extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BaseStatistics\",\"namespace\":\"org.kaaproject.kaa.server.common.zk.gen\",\"fields\":[{\"name\":\"processedRequestCount\",\"type\":\"int\"},{\"name\":\"registeredUsersCount\",\"type\":\"int\"},{\"name\":\"deltaCalculationCount\",\"type\":\"int\"},{\"name\":\"timeStarted\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int processedRequestCount;
   private int registeredUsersCount;
   private int deltaCalculationCount;
   private long timeStarted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public BaseStatistics() {}

  /**
   * All-args constructor.
   */
  public BaseStatistics(java.lang.Integer processedRequestCount, java.lang.Integer registeredUsersCount, java.lang.Integer deltaCalculationCount, java.lang.Long timeStarted) {
    this.processedRequestCount = processedRequestCount;
    this.registeredUsersCount = registeredUsersCount;
    this.deltaCalculationCount = deltaCalculationCount;
    this.timeStarted = timeStarted;
  }

  @Override
public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  @Override
public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return processedRequestCount;
    case 1: return registeredUsersCount;
    case 2: return deltaCalculationCount;
    case 3: return timeStarted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @Override
@SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: processedRequestCount = (java.lang.Integer)value$; break;
    case 1: registeredUsersCount = (java.lang.Integer)value$; break;
    case 2: deltaCalculationCount = (java.lang.Integer)value$; break;
    case 3: timeStarted = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'processedRequestCount' field.
   */
  public java.lang.Integer getProcessedRequestCount() {
    return processedRequestCount;
  }

  /**
   * Sets the value of the 'processedRequestCount' field.
   * @param value the value to set.
   */
  public void setProcessedRequestCount(java.lang.Integer value) {
    this.processedRequestCount = value;
  }

  /**
   * Gets the value of the 'registeredUsersCount' field.
   */
  public java.lang.Integer getRegisteredUsersCount() {
    return registeredUsersCount;
  }

  /**
   * Sets the value of the 'registeredUsersCount' field.
   * @param value the value to set.
   */
  public void setRegisteredUsersCount(java.lang.Integer value) {
    this.registeredUsersCount = value;
  }

  /**
   * Gets the value of the 'deltaCalculationCount' field.
   */
  public java.lang.Integer getDeltaCalculationCount() {
    return deltaCalculationCount;
  }

  /**
   * Sets the value of the 'deltaCalculationCount' field.
   * @param value the value to set.
   */
  public void setDeltaCalculationCount(java.lang.Integer value) {
    this.deltaCalculationCount = value;
  }

  /**
   * Gets the value of the 'timeStarted' field.
   */
  public java.lang.Long getTimeStarted() {
    return timeStarted;
  }

  /**
   * Sets the value of the 'timeStarted' field.
   * @param value the value to set.
   */
  public void setTimeStarted(java.lang.Long value) {
    this.timeStarted = value;
  }

  /** Creates a new BaseStatistics RecordBuilder */
  public static org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder();
  }

  /** Creates a new BaseStatistics RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder other) {
    return new org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder(other);
  }

  /** Creates a new BaseStatistics RecordBuilder by copying an existing BaseStatistics instance */
  public static org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics other) {
    return new org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder(other);
  }

  /**
   * RecordBuilder for BaseStatistics instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BaseStatistics>
    implements org.apache.avro.data.RecordBuilder<BaseStatistics> {

    private int processedRequestCount;
    private int registeredUsersCount;
    private int deltaCalculationCount;
    private long timeStarted;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.processedRequestCount)) {
        this.processedRequestCount = data().deepCopy(fields()[0].schema(), other.processedRequestCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.registeredUsersCount)) {
        this.registeredUsersCount = data().deepCopy(fields()[1].schema(), other.registeredUsersCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.deltaCalculationCount)) {
        this.deltaCalculationCount = data().deepCopy(fields()[2].schema(), other.deltaCalculationCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timeStarted)) {
        this.timeStarted = data().deepCopy(fields()[3].schema(), other.timeStarted);
        fieldSetFlags()[3] = true;
      }
    }

    /** Creates a Builder by copying an existing BaseStatistics instance */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics other) {
            super(org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.SCHEMA$);
      if (isValidValue(fields()[0], other.processedRequestCount)) {
        this.processedRequestCount = data().deepCopy(fields()[0].schema(), other.processedRequestCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.registeredUsersCount)) {
        this.registeredUsersCount = data().deepCopy(fields()[1].schema(), other.registeredUsersCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.deltaCalculationCount)) {
        this.deltaCalculationCount = data().deepCopy(fields()[2].schema(), other.deltaCalculationCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timeStarted)) {
        this.timeStarted = data().deepCopy(fields()[3].schema(), other.timeStarted);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'processedRequestCount' field */
    public java.lang.Integer getProcessedRequestCount() {
      return processedRequestCount;
    }

    /** Sets the value of the 'processedRequestCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder setProcessedRequestCount(int value) {
      validate(fields()[0], value);
      this.processedRequestCount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'processedRequestCount' field has been set */
    public boolean hasProcessedRequestCount() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'processedRequestCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder clearProcessedRequestCount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'registeredUsersCount' field */
    public java.lang.Integer getRegisteredUsersCount() {
      return registeredUsersCount;
    }

    /** Sets the value of the 'registeredUsersCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder setRegisteredUsersCount(int value) {
      validate(fields()[1], value);
      this.registeredUsersCount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'registeredUsersCount' field has been set */
    public boolean hasRegisteredUsersCount() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'registeredUsersCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder clearRegisteredUsersCount() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'deltaCalculationCount' field */
    public java.lang.Integer getDeltaCalculationCount() {
      return deltaCalculationCount;
    }

    /** Sets the value of the 'deltaCalculationCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder setDeltaCalculationCount(int value) {
      validate(fields()[2], value);
      this.deltaCalculationCount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'deltaCalculationCount' field has been set */
    public boolean hasDeltaCalculationCount() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'deltaCalculationCount' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder clearDeltaCalculationCount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'timeStarted' field */
    public java.lang.Long getTimeStarted() {
      return timeStarted;
    }

    /** Sets the value of the 'timeStarted' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder setTimeStarted(long value) {
      validate(fields()[3], value);
      this.timeStarted = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /** Checks whether the 'timeStarted' field has been set */
    public boolean hasTimeStarted() {
      return fieldSetFlags()[3];
    }

    /** Clears the value of the 'timeStarted' field */
    public org.kaaproject.kaa.server.common.zk.gen.BaseStatistics.Builder clearTimeStarted() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public BaseStatistics build() {
      try {
        BaseStatistics record = new BaseStatistics();
        record.processedRequestCount = fieldSetFlags()[0] ? this.processedRequestCount : (java.lang.Integer) defaultValue(fields()[0]);
        record.registeredUsersCount = fieldSetFlags()[1] ? this.registeredUsersCount : (java.lang.Integer) defaultValue(fields()[1]);
        record.deltaCalculationCount = fieldSetFlags()[2] ? this.deltaCalculationCount : (java.lang.Integer) defaultValue(fields()[2]);
        record.timeStarted = fieldSetFlags()[3] ? this.timeStarted : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
