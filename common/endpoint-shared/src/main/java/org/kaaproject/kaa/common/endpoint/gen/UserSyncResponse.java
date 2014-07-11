/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"userAttachResponse\",\"type\":[{\"type\":\"record\",\"name\":\"UserAttachResponse\",\"fields\":[{\"name\":\"result\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}}]},\"null\"]},{\"name\":\"endpointAttachResponses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointAttachResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"endpointKeyHash\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}]}},\"null\"]},{\"name\":\"endpointDetachResponses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointDetachResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}]}},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse userAttachResponse;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> endpointAttachResponses;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> endpointDetachResponses;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public UserSyncResponse() {}

  /**
   * All-args constructor.
   */
  public UserSyncResponse(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse userAttachResponse, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> endpointAttachResponses, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> endpointDetachResponses) {
    this.userAttachResponse = userAttachResponse;
    this.endpointAttachResponses = endpointAttachResponses;
    this.endpointDetachResponses = endpointDetachResponses;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userAttachResponse;
    case 1: return endpointAttachResponses;
    case 2: return endpointDetachResponses;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userAttachResponse = (org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse)value$; break;
    case 1: endpointAttachResponses = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse>)value$; break;
    case 2: endpointDetachResponses = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userAttachResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse getUserAttachResponse() {
    return userAttachResponse;
  }

  /**
   * Sets the value of the 'userAttachResponse' field.
   * @param value the value to set.
   */
  public void setUserAttachResponse(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse value) {
    this.userAttachResponse = value;
  }

  /**
   * Gets the value of the 'endpointAttachResponses' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> getEndpointAttachResponses() {
    return endpointAttachResponses;
  }

  /**
   * Sets the value of the 'endpointAttachResponses' field.
   * @param value the value to set.
   */
  public void setEndpointAttachResponses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> value) {
    this.endpointAttachResponses = value;
  }

  /**
   * Gets the value of the 'endpointDetachResponses' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> getEndpointDetachResponses() {
    return endpointDetachResponses;
  }

  /**
   * Sets the value of the 'endpointDetachResponses' field.
   * @param value the value to set.
   */
  public void setEndpointDetachResponses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> value) {
    this.endpointDetachResponses = value;
  }

  /** Creates a new UserSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder();
  }
  
  /** Creates a new UserSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder(other);
  }
  
  /** Creates a new UserSyncResponse RecordBuilder by copying an existing UserSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for UserSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserSyncResponse>
    implements org.apache.avro.data.RecordBuilder<UserSyncResponse> {

    private org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse userAttachResponse;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> endpointAttachResponses;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> endpointDetachResponses;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userAttachResponse)) {
        this.userAttachResponse = data().deepCopy(fields()[0].schema(), other.userAttachResponse);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointAttachResponses)) {
        this.endpointAttachResponses = data().deepCopy(fields()[1].schema(), other.endpointAttachResponses);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endpointDetachResponses)) {
        this.endpointDetachResponses = data().deepCopy(fields()[2].schema(), other.endpointDetachResponses);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing UserSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.userAttachResponse)) {
        this.userAttachResponse = data().deepCopy(fields()[0].schema(), other.userAttachResponse);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointAttachResponses)) {
        this.endpointAttachResponses = data().deepCopy(fields()[1].schema(), other.endpointAttachResponses);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endpointDetachResponses)) {
        this.endpointDetachResponses = data().deepCopy(fields()[2].schema(), other.endpointDetachResponses);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'userAttachResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse getUserAttachResponse() {
      return userAttachResponse;
    }
    
    /** Sets the value of the 'userAttachResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder setUserAttachResponse(org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse value) {
      validate(fields()[0], value);
      this.userAttachResponse = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'userAttachResponse' field has been set */
    public boolean hasUserAttachResponse() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'userAttachResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder clearUserAttachResponse() {
      userAttachResponse = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'endpointAttachResponses' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> getEndpointAttachResponses() {
      return endpointAttachResponses;
    }
    
    /** Sets the value of the 'endpointAttachResponses' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder setEndpointAttachResponses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse> value) {
      validate(fields()[1], value);
      this.endpointAttachResponses = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'endpointAttachResponses' field has been set */
    public boolean hasEndpointAttachResponses() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'endpointAttachResponses' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder clearEndpointAttachResponses() {
      endpointAttachResponses = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'endpointDetachResponses' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> getEndpointDetachResponses() {
      return endpointDetachResponses;
    }
    
    /** Sets the value of the 'endpointDetachResponses' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder setEndpointDetachResponses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse> value) {
      validate(fields()[2], value);
      this.endpointDetachResponses = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'endpointDetachResponses' field has been set */
    public boolean hasEndpointDetachResponses() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'endpointDetachResponses' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse.Builder clearEndpointDetachResponses() {
      endpointDetachResponses = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public UserSyncResponse build() {
      try {
        UserSyncResponse record = new UserSyncResponse();
        record.userAttachResponse = fieldSetFlags()[0] ? this.userAttachResponse : (org.kaaproject.kaa.common.endpoint.gen.UserAttachResponse) defaultValue(fields()[0]);
        record.endpointAttachResponses = fieldSetFlags()[1] ? this.endpointAttachResponses : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachResponse>) defaultValue(fields()[1]);
        record.endpointDetachResponses = fieldSetFlags()[2] ? this.endpointDetachResponses : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachResponse>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
