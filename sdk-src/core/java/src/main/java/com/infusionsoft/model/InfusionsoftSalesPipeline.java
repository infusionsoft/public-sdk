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
 * InfusionsoftSalesPipeline
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftSalesPipeline {
  @SerializedName("end_stage")
  private Boolean endStage = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("stage_count")
  private Integer stageCount = null;

  @SerializedName("stage_id")
  private Long stageId = null;

  @SerializedName("stage_name")
  private String stageName = null;

  @SerializedName("stage_order")
  private Integer stageOrder = null;

  public InfusionsoftSalesPipeline endStage(Boolean endStage) {
    this.endStage = endStage;
    return this;
  }

   /**
   * Get endStage
   * @return endStage
  **/
  @ApiModelProperty(value = "")
  public Boolean isEndStage() {
    return endStage;
  }

  public void setEndStage(Boolean endStage) {
    this.endStage = endStage;
  }

  public InfusionsoftSalesPipeline isDefault(Boolean isDefault) {
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

  public InfusionsoftSalesPipeline stageCount(Integer stageCount) {
    this.stageCount = stageCount;
    return this;
  }

   /**
   * Get stageCount
   * @return stageCount
  **/
  @ApiModelProperty(value = "")
  public Integer getStageCount() {
    return stageCount;
  }

  public void setStageCount(Integer stageCount) {
    this.stageCount = stageCount;
  }

  public InfusionsoftSalesPipeline stageId(Long stageId) {
    this.stageId = stageId;
    return this;
  }

   /**
   * Get stageId
   * @return stageId
  **/
  @ApiModelProperty(value = "")
  public Long getStageId() {
    return stageId;
  }

  public void setStageId(Long stageId) {
    this.stageId = stageId;
  }

  public InfusionsoftSalesPipeline stageName(String stageName) {
    this.stageName = stageName;
    return this;
  }

   /**
   * Get stageName
   * @return stageName
  **/
  @ApiModelProperty(value = "")
  public String getStageName() {
    return stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = stageName;
  }

  public InfusionsoftSalesPipeline stageOrder(Integer stageOrder) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftSalesPipeline salesPipeline = (InfusionsoftSalesPipeline) o;
    return Objects.equals(this.endStage, salesPipeline.endStage) &&
        Objects.equals(this.isDefault, salesPipeline.isDefault) &&
        Objects.equals(this.stageCount, salesPipeline.stageCount) &&
        Objects.equals(this.stageId, salesPipeline.stageId) &&
        Objects.equals(this.stageName, salesPipeline.stageName) &&
        Objects.equals(this.stageOrder, salesPipeline.stageOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endStage, isDefault, stageCount, stageId, stageName, stageOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftSalesPipeline {\n");
    
    sb.append("    endStage: ").append(toIndentedString(endStage)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    stageCount: ").append(toIndentedString(stageCount)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
    sb.append("    stageOrder: ").append(toIndentedString(stageOrder)).append("\n");
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

