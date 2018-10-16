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
import com.infusionsoft.model.InfusionsoftBasicCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftTaggedCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:44:31.010Z")
public class InfusionsoftTaggedCompany {
  @SerializedName("company")
  private InfusionsoftBasicCompany company = null;

  @SerializedName("date_applied")
  private OffsetDateTime dateApplied = null;

  public InfusionsoftTaggedCompany company(InfusionsoftBasicCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftBasicCompany getCompany() {
    return company;
  }

  public void setCompany(InfusionsoftBasicCompany company) {
    this.company = company;
  }

  public InfusionsoftTaggedCompany dateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
    return this;
  }

   /**
   * Get dateApplied
   * @return dateApplied
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateApplied() {
    return dateApplied;
  }

  public void setDateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftTaggedCompany taggedCompany = (InfusionsoftTaggedCompany) o;
    return Objects.equals(this.company, taggedCompany.company) &&
        Objects.equals(this.dateApplied, taggedCompany.dateApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, dateApplied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftTaggedCompany {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    dateApplied: ").append(toIndentedString(dateApplied)).append("\n");
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

