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
import com.infusionsoft.model.InfusionsoftCreateRestCustomFieldOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftCreateRestCustomFieldOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftCreateRestCustomFieldOption {
  @SerializedName("label")
  private String label = null;

  @SerializedName("options")
  private List<InfusionsoftCreateRestCustomFieldOption> options = null;

  public InfusionsoftCreateRestCustomFieldOption label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InfusionsoftCreateRestCustomFieldOption options(List<InfusionsoftCreateRestCustomFieldOption> options) {
    this.options = options;
    return this;
  }

  public InfusionsoftCreateRestCustomFieldOption addOptionsItem(InfusionsoftCreateRestCustomFieldOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<InfusionsoftCreateRestCustomFieldOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftCreateRestCustomFieldOption> getOptions() {
    return options;
  }

  public void setOptions(List<InfusionsoftCreateRestCustomFieldOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateRestCustomFieldOption createRestCustomFieldOption = (InfusionsoftCreateRestCustomFieldOption) o;
    return Objects.equals(this.label, createRestCustomFieldOption.label) &&
        Objects.equals(this.options, createRestCustomFieldOption.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateRestCustomFieldOption {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

