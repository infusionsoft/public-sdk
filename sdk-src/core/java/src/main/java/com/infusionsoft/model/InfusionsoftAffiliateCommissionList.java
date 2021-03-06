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
import com.infusionsoft.model.InfusionsoftAffiliateCommission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftAffiliateCommissionList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftAffiliateCommissionList {
  @SerializedName("commissions")
  private List<InfusionsoftAffiliateCommission> commissions = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  public InfusionsoftAffiliateCommissionList commissions(List<InfusionsoftAffiliateCommission> commissions) {
    this.commissions = commissions;
    return this;
  }

  public InfusionsoftAffiliateCommissionList addCommissionsItem(InfusionsoftAffiliateCommission commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
    this.commissions.add(commissionsItem);
    return this;
  }

   /**
   * Get commissions
   * @return commissions
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftAffiliateCommission> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<InfusionsoftAffiliateCommission> commissions) {
    this.commissions = commissions;
  }

  public InfusionsoftAffiliateCommissionList count(Integer count) {
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

  public InfusionsoftAffiliateCommissionList next(String next) {
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

  public InfusionsoftAffiliateCommissionList previous(String previous) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftAffiliateCommissionList affiliateCommissionList = (InfusionsoftAffiliateCommissionList) o;
    return Objects.equals(this.commissions, affiliateCommissionList.commissions) &&
        Objects.equals(this.count, affiliateCommissionList.count) &&
        Objects.equals(this.next, affiliateCommissionList.next) &&
        Objects.equals(this.previous, affiliateCommissionList.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissions, count, next, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftAffiliateCommissionList {\n");
    
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

