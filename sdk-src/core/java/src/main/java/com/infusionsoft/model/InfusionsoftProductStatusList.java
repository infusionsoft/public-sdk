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
import com.infusionsoft.model.InfusionsoftProductStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftProductStatusList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftProductStatusList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("product_statuses")
  private List<InfusionsoftProductStatus> productStatuses = null;

  @SerializedName("sync_token")
  private String syncToken = null;

  public InfusionsoftProductStatusList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InfusionsoftProductStatusList next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public InfusionsoftProductStatusList previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public InfusionsoftProductStatusList productStatuses(List<InfusionsoftProductStatus> productStatuses) {
    this.productStatuses = productStatuses;
    return this;
  }

  public InfusionsoftProductStatusList addProductStatusesItem(InfusionsoftProductStatus productStatusesItem) {
    if (this.productStatuses == null) {
      this.productStatuses = new ArrayList<>();
    }
    this.productStatuses.add(productStatusesItem);
    return this;
  }

   /**
   * Get productStatuses
   * @return productStatuses
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftProductStatus> getProductStatuses() {
    return productStatuses;
  }

  public void setProductStatuses(List<InfusionsoftProductStatus> productStatuses) {
    this.productStatuses = productStatuses;
  }

  public InfusionsoftProductStatusList syncToken(String syncToken) {
    this.syncToken = syncToken;
    return this;
  }

   /**
   * Get syncToken
   * @return syncToken
  **/
  @ApiModelProperty(value = "")
  public String getSyncToken() {
    return syncToken;
  }

  public void setSyncToken(String syncToken) {
    this.syncToken = syncToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftProductStatusList productStatusList = (InfusionsoftProductStatusList) o;
    return Objects.equals(this.count, productStatusList.count) &&
        Objects.equals(this.next, productStatusList.next) &&
        Objects.equals(this.previous, productStatusList.previous) &&
        Objects.equals(this.productStatuses, productStatusList.productStatuses) &&
        Objects.equals(this.syncToken, productStatusList.syncToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, productStatuses, syncToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftProductStatusList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    productStatuses: ").append(toIndentedString(productStatuses)).append("\n");
    sb.append("    syncToken: ").append(toIndentedString(syncToken)).append("\n");
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

