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
 * InfusionsoftSimpleProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftSimpleProduct {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shippable")
  private Boolean shippable = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  public InfusionsoftSimpleProduct description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InfusionsoftSimpleProduct id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftSimpleProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfusionsoftSimpleProduct shippable(Boolean shippable) {
    this.shippable = shippable;
    return this;
  }

   /**
   * Get shippable
   * @return shippable
  **/
  @ApiModelProperty(value = "")
  public Boolean isShippable() {
    return shippable;
  }

  public void setShippable(Boolean shippable) {
    this.shippable = shippable;
  }

  public InfusionsoftSimpleProduct sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public InfusionsoftSimpleProduct taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Get taxable
   * @return taxable
  **/
  @ApiModelProperty(value = "")
  public Boolean isTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftSimpleProduct simpleProduct = (InfusionsoftSimpleProduct) o;
    return Objects.equals(this.description, simpleProduct.description) &&
        Objects.equals(this.id, simpleProduct.id) &&
        Objects.equals(this.name, simpleProduct.name) &&
        Objects.equals(this.shippable, simpleProduct.shippable) &&
        Objects.equals(this.sku, simpleProduct.sku) &&
        Objects.equals(this.taxable, simpleProduct.taxable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, shippable, sku, taxable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftSimpleProduct {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippable: ").append(toIndentedString(shippable)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
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

