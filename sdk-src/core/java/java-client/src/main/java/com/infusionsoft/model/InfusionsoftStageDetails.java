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
import com.infusionsoft.model.InfusionsoftCheckListItemDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftStageDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-10T00:36:44.670Z")
public class InfusionsoftStageDetails {
  @SerializedName("check_list_items")
  private List<InfusionsoftCheckListItemDetails> checkListItems = null;

  @SerializedName("probability")
  private Integer probability = null;

  @SerializedName("stage_order")
  private Integer stageOrder = null;

  @SerializedName("target_num_days")
  private Integer targetNumDays = null;

  public InfusionsoftStageDetails checkListItems(List<InfusionsoftCheckListItemDetails> checkListItems) {
    this.checkListItems = checkListItems;
    return this;
  }

  public InfusionsoftStageDetails addCheckListItemsItem(InfusionsoftCheckListItemDetails checkListItemsItem) {
    if (this.checkListItems == null) {
      this.checkListItems = new ArrayList<InfusionsoftCheckListItemDetails>();
    }
    this.checkListItems.add(checkListItemsItem);
    return this;
  }

   /**
   * Get checkListItems
   * @return checkListItems
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftCheckListItemDetails> getCheckListItems() {
    return checkListItems;
  }

  public void setCheckListItems(List<InfusionsoftCheckListItemDetails> checkListItems) {
    this.checkListItems = checkListItems;
  }

  public InfusionsoftStageDetails probability(Integer probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Get probability
   * @return probability
  **/
  @ApiModelProperty(value = "")
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(Integer probability) {
    this.probability = probability;
  }

  public InfusionsoftStageDetails stageOrder(Integer stageOrder) {
    this.stageOrder = stageOrder;
    return this;
  }

   /**
   * Get stageOrder
   * @return stageOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getStageOrder() {
    return stageOrder;
  }

  public void setStageOrder(Integer stageOrder) {
    this.stageOrder = stageOrder;
  }

  public InfusionsoftStageDetails targetNumDays(Integer targetNumDays) {
    this.targetNumDays = targetNumDays;
    return this;
  }

   /**
   * Get targetNumDays
   * @return targetNumDays
  **/
  @ApiModelProperty(value = "")
  public Integer getTargetNumDays() {
    return targetNumDays;
  }

  public void setTargetNumDays(Integer targetNumDays) {
    this.targetNumDays = targetNumDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftStageDetails stageDetails = (InfusionsoftStageDetails) o;
    return Objects.equals(this.checkListItems, stageDetails.checkListItems) &&
        Objects.equals(this.probability, stageDetails.probability) &&
        Objects.equals(this.stageOrder, stageDetails.stageOrder) &&
        Objects.equals(this.targetNumDays, stageDetails.targetNumDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkListItems, probability, stageOrder, targetNumDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftStageDetails {\n");
    
    sb.append("    checkListItems: ").append(toIndentedString(checkListItems)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    stageOrder: ").append(toIndentedString(stageOrder)).append("\n");
    sb.append("    targetNumDays: ").append(toIndentedString(targetNumDays)).append("\n");
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

