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
import com.infusionsoft.model.InfusionsoftTagCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftTag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftTag {
  @SerializedName("category")
  private InfusionsoftTagCategory category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public InfusionsoftTag category(InfusionsoftTagCategory category) {
    this.category = category;
    return this;
  }

   /**
   * The tag category reference
   * @return category
  **/
  @ApiModelProperty(value = "The tag category reference")
  public InfusionsoftTagCategory getCategory() {
    return category;
  }

  public void setCategory(InfusionsoftTagCategory category) {
    this.category = category;
  }

  public InfusionsoftTag description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The tag description
   * @return description
  **/
  @ApiModelProperty(value = "The tag description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InfusionsoftTag id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The id for the tag
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id for the tag")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tag name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The tag name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftTag tag = (InfusionsoftTag) o;
    return Objects.equals(this.category, tag.category) &&
        Objects.equals(this.description, tag.description) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.name, tag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftTag {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

