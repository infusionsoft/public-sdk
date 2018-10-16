/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: V1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftRestHook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:44:31.010Z")
public class InfusionsoftRestHook {
  @SerializedName("eventKey")
  private String eventKey = null;

  @SerializedName("hookUrl")
  private String hookUrl = null;

  @SerializedName("key")
  private String key = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNVERIFIED("Unverified"),
    
    VERIFIED("Verified"),
    
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public InfusionsoftRestHook eventKey(String eventKey) {
    this.eventKey = eventKey;
    return this;
  }

   /**
   * Get eventKey
   * @return eventKey
  **/
  @ApiModelProperty(value = "")
  public String getEventKey() {
    return eventKey;
  }

  public void setEventKey(String eventKey) {
    this.eventKey = eventKey;
  }

  public InfusionsoftRestHook hookUrl(String hookUrl) {
    this.hookUrl = hookUrl;
    return this;
  }

   /**
   * Get hookUrl
   * @return hookUrl
  **/
  @ApiModelProperty(value = "")
  public String getHookUrl() {
    return hookUrl;
  }

  public void setHookUrl(String hookUrl) {
    this.hookUrl = hookUrl;
  }

  public InfusionsoftRestHook key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InfusionsoftRestHook status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftRestHook restHook = (InfusionsoftRestHook) o;
    return Objects.equals(this.eventKey, restHook.eventKey) &&
        Objects.equals(this.hookUrl, restHook.hookUrl) &&
        Objects.equals(this.key, restHook.key) &&
        Objects.equals(this.status, restHook.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventKey, hookUrl, key, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftRestHook {\n");
    
    sb.append("    eventKey: ").append(toIndentedString(eventKey)).append("\n");
    sb.append("    hookUrl: ").append(toIndentedString(hookUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

