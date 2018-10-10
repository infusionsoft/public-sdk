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
import com.infusionsoft.model.InfusionsoftCompanyAddress;
import com.infusionsoft.model.InfusionsoftCompanyFaxNumber;
import com.infusionsoft.model.InfusionsoftCompanyPhoneNumber;
import com.infusionsoft.model.InfusionsoftCustomFieldValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftCreateOrPatchCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-10T00:36:44.670Z")
public class InfusionsoftCreateOrPatchCompany {
  @SerializedName("address")
  private InfusionsoftCompanyAddress address = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("custom_fields")
  private List<InfusionsoftCustomFieldValue> customFields = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("fax_number")
  private InfusionsoftCompanyFaxNumber faxNumber = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("opt_in_reason")
  private String optInReason = null;

  @SerializedName("phone_number")
  private InfusionsoftCompanyPhoneNumber phoneNumber = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftCreateOrPatchCompany address(InfusionsoftCompanyAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyAddress getAddress() {
    return address;
  }

  public void setAddress(InfusionsoftCompanyAddress address) {
    this.address = address;
  }

  public InfusionsoftCreateOrPatchCompany companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public InfusionsoftCreateOrPatchCompany customFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InfusionsoftCreateOrPatchCompany addCustomFieldsItem(InfusionsoftCustomFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<InfusionsoftCustomFieldValue>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftCustomFieldValue> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
  }

  public InfusionsoftCreateOrPatchCompany emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public InfusionsoftCreateOrPatchCompany faxNumber(InfusionsoftCompanyFaxNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyFaxNumber getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(InfusionsoftCompanyFaxNumber faxNumber) {
    this.faxNumber = faxNumber;
  }

  public InfusionsoftCreateOrPatchCompany notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InfusionsoftCreateOrPatchCompany optInReason(String optInReason) {
    this.optInReason = optInReason;
    return this;
  }

   /**
   * Get optInReason
   * @return optInReason
  **/
  @ApiModelProperty(value = "")
  public String getOptInReason() {
    return optInReason;
  }

  public void setOptInReason(String optInReason) {
    this.optInReason = optInReason;
  }

  public InfusionsoftCreateOrPatchCompany phoneNumber(InfusionsoftCompanyPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(InfusionsoftCompanyPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public InfusionsoftCreateOrPatchCompany website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateOrPatchCompany createOrPatchCompany = (InfusionsoftCreateOrPatchCompany) o;
    return Objects.equals(this.address, createOrPatchCompany.address) &&
        Objects.equals(this.companyName, createOrPatchCompany.companyName) &&
        Objects.equals(this.customFields, createOrPatchCompany.customFields) &&
        Objects.equals(this.emailAddress, createOrPatchCompany.emailAddress) &&
        Objects.equals(this.faxNumber, createOrPatchCompany.faxNumber) &&
        Objects.equals(this.notes, createOrPatchCompany.notes) &&
        Objects.equals(this.optInReason, createOrPatchCompany.optInReason) &&
        Objects.equals(this.phoneNumber, createOrPatchCompany.phoneNumber) &&
        Objects.equals(this.website, createOrPatchCompany.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, customFields, emailAddress, faxNumber, notes, optInReason, phoneNumber, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateOrPatchCompany {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    optInReason: ").append(toIndentedString(optInReason)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

