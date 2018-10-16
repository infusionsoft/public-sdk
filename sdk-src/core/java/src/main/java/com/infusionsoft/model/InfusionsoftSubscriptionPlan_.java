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
 * InfusionsoftSubscriptionPlan_
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:44:31.010Z")
public class InfusionsoftSubscriptionPlan_ {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("cycle")
  private Integer cycle = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("number_of_cycles")
  private Integer numberOfCycles = null;

  @SerializedName("plan_price")
  private Double planPrice = null;

  @SerializedName("subscription_plan_index")
  private Integer subscriptionPlanIndex = null;

  @SerializedName("subscription_plan_name")
  private String subscriptionPlanName = null;

  @SerializedName("url")
  private String url = null;

  public InfusionsoftSubscriptionPlan_ active(Boolean active) {
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

  public InfusionsoftSubscriptionPlan_ cycle(Integer cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Get cycle
   * @return cycle
  **/
  @ApiModelProperty(value = "")
  public Integer getCycle() {
    return cycle;
  }

  public void setCycle(Integer cycle) {
    this.cycle = cycle;
  }

  public InfusionsoftSubscriptionPlan_ frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public InfusionsoftSubscriptionPlan_ id(Long id) {
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

  public InfusionsoftSubscriptionPlan_ numberOfCycles(Integer numberOfCycles) {
    this.numberOfCycles = numberOfCycles;
    return this;
  }

   /**
   * Get numberOfCycles
   * @return numberOfCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfCycles() {
    return numberOfCycles;
  }

  public void setNumberOfCycles(Integer numberOfCycles) {
    this.numberOfCycles = numberOfCycles;
  }

  public InfusionsoftSubscriptionPlan_ planPrice(Double planPrice) {
    this.planPrice = planPrice;
    return this;
  }

   /**
   * Get planPrice
   * @return planPrice
  **/
  @ApiModelProperty(value = "")
  public Double getPlanPrice() {
    return planPrice;
  }

  public void setPlanPrice(Double planPrice) {
    this.planPrice = planPrice;
  }

  public InfusionsoftSubscriptionPlan_ subscriptionPlanIndex(Integer subscriptionPlanIndex) {
    this.subscriptionPlanIndex = subscriptionPlanIndex;
    return this;
  }

   /**
   * Get subscriptionPlanIndex
   * @return subscriptionPlanIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionPlanIndex() {
    return subscriptionPlanIndex;
  }

  public void setSubscriptionPlanIndex(Integer subscriptionPlanIndex) {
    this.subscriptionPlanIndex = subscriptionPlanIndex;
  }

  public InfusionsoftSubscriptionPlan_ subscriptionPlanName(String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
    return this;
  }

   /**
   * Get subscriptionPlanName
   * @return subscriptionPlanName
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionPlanName() {
    return subscriptionPlanName;
  }

  public void setSubscriptionPlanName(String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
  }

  public InfusionsoftSubscriptionPlan_ url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftSubscriptionPlan_ subscriptionPlan_ = (InfusionsoftSubscriptionPlan_) o;
    return Objects.equals(this.active, subscriptionPlan_.active) &&
        Objects.equals(this.cycle, subscriptionPlan_.cycle) &&
        Objects.equals(this.frequency, subscriptionPlan_.frequency) &&
        Objects.equals(this.id, subscriptionPlan_.id) &&
        Objects.equals(this.numberOfCycles, subscriptionPlan_.numberOfCycles) &&
        Objects.equals(this.planPrice, subscriptionPlan_.planPrice) &&
        Objects.equals(this.subscriptionPlanIndex, subscriptionPlan_.subscriptionPlanIndex) &&
        Objects.equals(this.subscriptionPlanName, subscriptionPlan_.subscriptionPlanName) &&
        Objects.equals(this.url, subscriptionPlan_.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, cycle, frequency, id, numberOfCycles, planPrice, subscriptionPlanIndex, subscriptionPlanName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftSubscriptionPlan_ {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfCycles: ").append(toIndentedString(numberOfCycles)).append("\n");
    sb.append("    planPrice: ").append(toIndentedString(planPrice)).append("\n");
    sb.append("    subscriptionPlanIndex: ").append(toIndentedString(subscriptionPlanIndex)).append("\n");
    sb.append("    subscriptionPlanName: ").append(toIndentedString(subscriptionPlanName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

