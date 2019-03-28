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
 * InfusionsoftRelationship
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftRelationship {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("linked_contact_id")
  private Long linkedContactId = null;

  @SerializedName("relationship_type_id")
  private Long relationshipTypeId = null;

  public InfusionsoftRelationship id(Long id) {
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

  public InfusionsoftRelationship linkedContactId(Long linkedContactId) {
    this.linkedContactId = linkedContactId;
    return this;
  }

   /**
   * Get linkedContactId
   * @return linkedContactId
  **/
  @ApiModelProperty(value = "")
  public Long getLinkedContactId() {
    return linkedContactId;
  }

  public void setLinkedContactId(Long linkedContactId) {
    this.linkedContactId = linkedContactId;
  }

  public InfusionsoftRelationship relationshipTypeId(Long relationshipTypeId) {
    this.relationshipTypeId = relationshipTypeId;
    return this;
  }

   /**
   * Get relationshipTypeId
   * @return relationshipTypeId
  **/
  @ApiModelProperty(value = "")
  public Long getRelationshipTypeId() {
    return relationshipTypeId;
  }

  public void setRelationshipTypeId(Long relationshipTypeId) {
    this.relationshipTypeId = relationshipTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftRelationship relationship = (InfusionsoftRelationship) o;
    return Objects.equals(this.id, relationship.id) &&
        Objects.equals(this.linkedContactId, relationship.linkedContactId) &&
        Objects.equals(this.relationshipTypeId, relationship.relationshipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedContactId, relationshipTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedContactId: ").append(toIndentedString(linkedContactId)).append("\n");
    sb.append("    relationshipTypeId: ").append(toIndentedString(relationshipTypeId)).append("\n");
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

