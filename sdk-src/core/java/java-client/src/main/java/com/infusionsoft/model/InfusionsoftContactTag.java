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
import com.infusionsoft.model.InfusionsoftSimpleTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftContactTag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftContactTag {
  @SerializedName("date_applied")
  private OffsetDateTime dateApplied = null;

  @SerializedName("tag")
  private InfusionsoftSimpleTag tag = null;

  public InfusionsoftContactTag dateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
    return this;
  }

   /**
   * Get dateApplied
   * @return dateApplied
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateApplied() {
    return dateApplied;
  }

  public void setDateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
  }

  public InfusionsoftContactTag tag(InfusionsoftSimpleTag tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftSimpleTag getTag() {
    return tag;
  }

  public void setTag(InfusionsoftSimpleTag tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftContactTag contactTag = (InfusionsoftContactTag) o;
    return Objects.equals(this.dateApplied, contactTag.dateApplied) &&
        Objects.equals(this.tag, contactTag.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateApplied, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftContactTag {\n");
    
    sb.append("    dateApplied: ").append(toIndentedString(dateApplied)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

