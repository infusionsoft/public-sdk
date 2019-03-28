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
import java.time.OffsetDateTime;

/**
 * InfusionsoftCheckListItemDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftCheckListItemDetails {
  @SerializedName("description")
  private String description = null;

  @SerializedName("done_date")
  private OffsetDateTime doneDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("instance_id")
  private Long instanceId = null;

  @SerializedName("item_order")
  private Integer itemOrder = null;

  @SerializedName("required")
  private Boolean required = null;

  public InfusionsoftCheckListItemDetails description(String description) {
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

  public InfusionsoftCheckListItemDetails doneDate(OffsetDateTime doneDate) {
    this.doneDate = doneDate;
    return this;
  }

   /**
   * Get doneDate
   * @return doneDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDoneDate() {
    return doneDate;
  }

  public void setDoneDate(OffsetDateTime doneDate) {
    this.doneDate = doneDate;
  }

  public InfusionsoftCheckListItemDetails id(Long id) {
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

  public InfusionsoftCheckListItemDetails instanceId(Long instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @ApiModelProperty(value = "")
  public Long getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }

  public InfusionsoftCheckListItemDetails itemOrder(Integer itemOrder) {
    this.itemOrder = itemOrder;
    return this;
  }

   /**
   * Get itemOrder
   * @return itemOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getItemOrder() {
    return itemOrder;
  }

  public void setItemOrder(Integer itemOrder) {
    this.itemOrder = itemOrder;
  }

  public InfusionsoftCheckListItemDetails required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCheckListItemDetails checkListItemDetails = (InfusionsoftCheckListItemDetails) o;
    return Objects.equals(this.description, checkListItemDetails.description) &&
        Objects.equals(this.doneDate, checkListItemDetails.doneDate) &&
        Objects.equals(this.id, checkListItemDetails.id) &&
        Objects.equals(this.instanceId, checkListItemDetails.instanceId) &&
        Objects.equals(this.itemOrder, checkListItemDetails.itemOrder) &&
        Objects.equals(this.required, checkListItemDetails.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, doneDate, id, instanceId, itemOrder, required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCheckListItemDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    doneDate: ").append(toIndentedString(doneDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    itemOrder: ").append(toIndentedString(itemOrder)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

