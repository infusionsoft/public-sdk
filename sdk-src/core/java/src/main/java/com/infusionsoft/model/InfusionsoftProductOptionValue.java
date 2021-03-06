/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.89421
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftProductOptionValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftProductOptionValue {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("index")
  private Long index = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("price_adjustment")
  private Double priceAdjustment = null;

  @SerializedName("sku")
  private String sku = null;

  public InfusionsoftProductOptionValue id(Long id) {
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

  public InfusionsoftProductOptionValue index(Long index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public InfusionsoftProductOptionValue isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public InfusionsoftProductOptionValue label(String label) {
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

  public InfusionsoftProductOptionValue priceAdjustment(Double priceAdjustment) {
    this.priceAdjustment = priceAdjustment;
    return this;
  }

   /**
   * Get priceAdjustment
   * @return priceAdjustment
  **/
  @ApiModelProperty(value = "")
  public Double getPriceAdjustment() {
    return priceAdjustment;
  }

  public void setPriceAdjustment(Double priceAdjustment) {
    this.priceAdjustment = priceAdjustment;
  }

  public InfusionsoftProductOptionValue sku(String sku) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftProductOptionValue productOptionValue = (InfusionsoftProductOptionValue) o;
    return Objects.equals(this.id, productOptionValue.id) &&
        Objects.equals(this.index, productOptionValue.index) &&
        Objects.equals(this.isDefault, productOptionValue.isDefault) &&
        Objects.equals(this.label, productOptionValue.label) &&
        Objects.equals(this.priceAdjustment, productOptionValue.priceAdjustment) &&
        Objects.equals(this.sku, productOptionValue.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, index, isDefault, label, priceAdjustment, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftProductOptionValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    priceAdjustment: ").append(toIndentedString(priceAdjustment)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

