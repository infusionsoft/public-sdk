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
 * InfusionsoftCreateOrderItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:40:42.950Z")
public class InfusionsoftCreateOrderItem {
  @SerializedName("description")
  private String description = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("product_id")
  private Long productId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public InfusionsoftCreateOrderItem description(String description) {
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

  public InfusionsoftCreateOrderItem price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Overridable price of the product, if not specified, the default will be used. Must be greater than or equal to 0.
   * @return price
  **/
  @ApiModelProperty(value = "Overridable price of the product, if not specified, the default will be used. Must be greater than or equal to 0.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public InfusionsoftCreateOrderItem productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The id of the product to be added to the order.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The id of the product to be added to the order.")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public InfusionsoftCreateOrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity must be greater than or equal to 1
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Quantity must be greater than or equal to 1")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateOrderItem createOrderItem = (InfusionsoftCreateOrderItem) o;
    return Objects.equals(this.description, createOrderItem.description) &&
        Objects.equals(this.price, createOrderItem.price) &&
        Objects.equals(this.productId, createOrderItem.productId) &&
        Objects.equals(this.quantity, createOrderItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, price, productId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateOrderItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

