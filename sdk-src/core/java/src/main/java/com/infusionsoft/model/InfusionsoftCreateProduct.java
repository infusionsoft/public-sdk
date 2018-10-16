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
 * InfusionsoftCreateProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:40:42.950Z")
public class InfusionsoftCreateProduct {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("product_desc")
  private String productDesc = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("product_price")
  private Double productPrice = null;

  @SerializedName("product_short_desc")
  private String productShortDesc = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("subscription_only")
  private Boolean subscriptionOnly = null;

  public InfusionsoftCreateProduct active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public InfusionsoftCreateProduct productDesc(String productDesc) {
    this.productDesc = productDesc;
    return this;
  }

   /**
   * Get productDesc
   * @return productDesc
  **/
  @ApiModelProperty(value = "")
  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }

  public InfusionsoftCreateProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public InfusionsoftCreateProduct productPrice(Double productPrice) {
    this.productPrice = productPrice;
    return this;
  }

   /**
   * Get productPrice
   * @return productPrice
  **/
  @ApiModelProperty(value = "")
  public Double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }

  public InfusionsoftCreateProduct productShortDesc(String productShortDesc) {
    this.productShortDesc = productShortDesc;
    return this;
  }

   /**
   * Get productShortDesc
   * @return productShortDesc
  **/
  @ApiModelProperty(value = "")
  public String getProductShortDesc() {
    return productShortDesc;
  }

  public void setProductShortDesc(String productShortDesc) {
    this.productShortDesc = productShortDesc;
  }

  public InfusionsoftCreateProduct sku(String sku) {
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

  public InfusionsoftCreateProduct subscriptionOnly(Boolean subscriptionOnly) {
    this.subscriptionOnly = subscriptionOnly;
    return this;
  }

   /**
   * Get subscriptionOnly
   * @return subscriptionOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionOnly() {
    return subscriptionOnly;
  }

  public void setSubscriptionOnly(Boolean subscriptionOnly) {
    this.subscriptionOnly = subscriptionOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateProduct createProduct = (InfusionsoftCreateProduct) o;
    return Objects.equals(this.active, createProduct.active) &&
        Objects.equals(this.productDesc, createProduct.productDesc) &&
        Objects.equals(this.productName, createProduct.productName) &&
        Objects.equals(this.productPrice, createProduct.productPrice) &&
        Objects.equals(this.productShortDesc, createProduct.productShortDesc) &&
        Objects.equals(this.sku, createProduct.sku) &&
        Objects.equals(this.subscriptionOnly, createProduct.subscriptionOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, productDesc, productName, productPrice, productShortDesc, sku, subscriptionOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateProduct {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productShortDesc: ").append(toIndentedString(productShortDesc)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    subscriptionOnly: ").append(toIndentedString(subscriptionOnly)).append("\n");
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

