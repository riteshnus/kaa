/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.bootstrap;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftChannelType implements org.apache.thrift.TEnum {
  HTTP(1),
  HTTP_LP(2);

  private final int value;

  private ThriftChannelType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftChannelType findByValue(int value) { 
    switch (value) {
      case 1:
        return HTTP;
      case 2:
        return HTTP_LP;
      default:
        return null;
    }
  }
}
