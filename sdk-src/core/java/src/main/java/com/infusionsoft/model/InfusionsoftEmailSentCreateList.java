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
import com.infusionsoft.model.InfusionsoftEmailSentCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftEmailSentCreateList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:44:31.010Z")
public class InfusionsoftEmailSentCreateList {
  @SerializedName("emails")
  private List<InfusionsoftEmailSentCreate> emails = null;

  public InfusionsoftEmailSentCreateList emails(List<InfusionsoftEmailSentCreate> emails) {
    this.emails = emails;
    return this;
  }

  public InfusionsoftEmailSentCreateList addEmailsItem(InfusionsoftEmailSentCreate emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<InfusionsoftEmailSentCreate>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftEmailSentCreate> getEmails() {
    return emails;
  }

  public void setEmails(List<InfusionsoftEmailSentCreate> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftEmailSentCreateList emailSentCreateList = (InfusionsoftEmailSentCreateList) o;
    return Objects.equals(this.emails, emailSentCreateList.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSentCreateList {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

