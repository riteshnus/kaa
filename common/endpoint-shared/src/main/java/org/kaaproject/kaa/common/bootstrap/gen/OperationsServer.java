/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.bootstrap.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OperationsServer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OperationsServer\",\"namespace\":\"org.kaaproject.kaa.common.bootstrap.gen\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"priority\",\"type\":\"int\"},{\"name\":\"publicKey\",\"type\":\"bytes\"},{\"name\":\"supportedChannelsArray\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SupportedChannel\",\"fields\":[{\"name\":\"channelType\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelType\",\"symbols\":[\"HTTP\",\"HTTP_LP\",\"BOOTSTRAP\"]}},{\"name\":\"communicationParameters\",\"type\":[{\"type\":\"record\",\"name\":\"HTTPComunicationParameters\",\"fields\":[{\"name\":\"hostName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"port\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"HTTPLPComunicationParameters\",\"fields\":[{\"name\":\"hostName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"port\",\"type\":\"int\"}]}]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String name;
   private int priority;
   private java.nio.ByteBuffer publicKey;
   private java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> supportedChannelsArray;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public OperationsServer() {}

  /**
   * All-args constructor.
   */
  public OperationsServer(java.lang.String name, java.lang.Integer priority, java.nio.ByteBuffer publicKey, java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> supportedChannelsArray) {
    this.name = name;
    this.priority = priority;
    this.publicKey = publicKey;
    this.supportedChannelsArray = supportedChannelsArray;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return priority;
    case 2: return publicKey;
    case 3: return supportedChannelsArray;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: priority = (java.lang.Integer)value$; break;
    case 2: publicKey = (java.nio.ByteBuffer)value$; break;
    case 3: supportedChannelsArray = (java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'priority' field.
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Sets the value of the 'priority' field.
   * @param value the value to set.
   */
  public void setPriority(java.lang.Integer value) {
    this.priority = value;
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

  /**
   * Gets the value of the 'supportedChannelsArray' field.
   */
  public java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> getSupportedChannelsArray() {
    return supportedChannelsArray;
  }

  /**
   * Sets the value of the 'supportedChannelsArray' field.
   * @param value the value to set.
   */
  public void setSupportedChannelsArray(java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> value) {
    this.supportedChannelsArray = value;
  }

  /** Creates a new OperationsServer RecordBuilder */
  public static org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder newBuilder() {
    return new org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder();
  }
  
  /** Creates a new OperationsServer RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder newBuilder(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder other) {
    return new org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder(other);
  }
  
  /** Creates a new OperationsServer RecordBuilder by copying an existing OperationsServer instance */
  public static org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder newBuilder(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer other) {
    return new org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder(other);
  }
  
  /**
   * RecordBuilder for OperationsServer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OperationsServer>
    implements org.apache.avro.data.RecordBuilder<OperationsServer> {

    private java.lang.String name;
    private int priority;
    private java.nio.ByteBuffer publicKey;
    private java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> supportedChannelsArray;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[2].schema(), other.publicKey);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.supportedChannelsArray)) {
        this.supportedChannelsArray = data().deepCopy(fields()[3].schema(), other.supportedChannelsArray);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing OperationsServer instance */
    private Builder(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer other) {
            super(org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[2].schema(), other.publicKey);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.supportedChannelsArray)) {
        this.supportedChannelsArray = data().deepCopy(fields()[3].schema(), other.supportedChannelsArray);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'priority' field */
    public java.lang.Integer getPriority() {
      return priority;
    }
    
    /** Sets the value of the 'priority' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder setPriority(int value) {
      validate(fields()[1], value);
      this.priority = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'priority' field has been set */
    public boolean hasPriority() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'priority' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder clearPriority() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'publicKey' field */
    public java.nio.ByteBuffer getPublicKey() {
      return publicKey;
    }
    
    /** Sets the value of the 'publicKey' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder setPublicKey(java.nio.ByteBuffer value) {
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
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder clearPublicKey() {
      publicKey = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'supportedChannelsArray' field */
    public java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> getSupportedChannelsArray() {
      return supportedChannelsArray;
    }
    
    /** Sets the value of the 'supportedChannelsArray' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder setSupportedChannelsArray(java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel> value) {
      validate(fields()[3], value);
      this.supportedChannelsArray = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'supportedChannelsArray' field has been set */
    public boolean hasSupportedChannelsArray() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'supportedChannelsArray' field */
    public org.kaaproject.kaa.common.bootstrap.gen.OperationsServer.Builder clearSupportedChannelsArray() {
      supportedChannelsArray = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public OperationsServer build() {
      try {
        OperationsServer record = new OperationsServer();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.priority = fieldSetFlags()[1] ? this.priority : (java.lang.Integer) defaultValue(fields()[1]);
        record.publicKey = fieldSetFlags()[2] ? this.publicKey : (java.nio.ByteBuffer) defaultValue(fields()[2]);
        record.supportedChannelsArray = fieldSetFlags()[3] ? this.supportedChannelsArray : (java.util.List<org.kaaproject.kaa.common.bootstrap.gen.SupportedChannel>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
