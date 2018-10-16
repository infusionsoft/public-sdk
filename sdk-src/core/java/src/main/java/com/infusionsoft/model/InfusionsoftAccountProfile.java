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
import com.infusionsoft.model.InfusionsoftAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about the company that owns/uses this account
 */
@ApiModel(description = "Information about the company that owns/uses this account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:44:31.010Z")
public class InfusionsoftAccountProfile {
  @SerializedName("address")
  private InfusionsoftAddress address = null;

  @SerializedName("business_goals")
  private List<String> businessGoals = null;

  @SerializedName("business_primary_color")
  private String businessPrimaryColor = null;

  @SerializedName("business_secondary_color")
  private String businessSecondaryColor = null;

  @SerializedName("business_type")
  private String businessType = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("language_tag")
  private String languageTag = null;

  @SerializedName("logo_url")
  private String logoUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phone_ext")
  private String phoneExt = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftAccountProfile address(InfusionsoftAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftAddress getAddress() {
    return address;
  }

  public void setAddress(InfusionsoftAddress address) {
    this.address = address;
  }

  public InfusionsoftAccountProfile businessGoals(List<String> businessGoals) {
    this.businessGoals = businessGoals;
    return this;
  }

  public InfusionsoftAccountProfile addBusinessGoalsItem(String businessGoalsItem) {
    if (this.businessGoals == null) {
      this.businessGoals = new ArrayList<String>();
    }
    this.businessGoals.add(businessGoalsItem);
    return this;
  }

   /**
   * The goals of this business, ie. Grow Business, Convert more leads
   * @return businessGoals
  **/
  @ApiModelProperty(value = "The goals of this business, ie. Grow Business, Convert more leads")
  public List<String> getBusinessGoals() {
    return businessGoals;
  }

  public void setBusinessGoals(List<String> businessGoals) {
    this.businessGoals = businessGoals;
  }

  public InfusionsoftAccountProfile businessPrimaryColor(String businessPrimaryColor) {
    this.businessPrimaryColor = businessPrimaryColor;
    return this;
  }

   /**
   * Get businessPrimaryColor
   * @return businessPrimaryColor
  **/
  @ApiModelProperty(value = "")
  public String getBusinessPrimaryColor() {
    return businessPrimaryColor;
  }

  public void setBusinessPrimaryColor(String businessPrimaryColor) {
    this.businessPrimaryColor = businessPrimaryColor;
  }

  public InfusionsoftAccountProfile businessSecondaryColor(String businessSecondaryColor) {
    this.businessSecondaryColor = businessSecondaryColor;
    return this;
  }

   /**
   * Get businessSecondaryColor
   * @return businessSecondaryColor
  **/
  @ApiModelProperty(value = "")
  public String getBusinessSecondaryColor() {
    return businessSecondaryColor;
  }

  public void setBusinessSecondaryColor(String businessSecondaryColor) {
    this.businessSecondaryColor = businessSecondaryColor;
  }

  public InfusionsoftAccountProfile businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * The type of business
   * @return businessType
  **/
  @ApiModelProperty(value = "The type of business")
  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public InfusionsoftAccountProfile currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public InfusionsoftAccountProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InfusionsoftAccountProfile languageTag(String languageTag) {
    this.languageTag = languageTag;
    return this;
  }

   /**
   * Get languageTag
   * @return languageTag
  **/
  @ApiModelProperty(value = "")
  public String getLanguageTag() {
    return languageTag;
  }

  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }

  public InfusionsoftAccountProfile logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(value = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public InfusionsoftAccountProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfusionsoftAccountProfile phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public InfusionsoftAccountProfile phoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
    return this;
  }

   /**
   * Get phoneExt
   * @return phoneExt
  **/
  @ApiModelProperty(value = "")
  public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  public InfusionsoftAccountProfile timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public InfusionsoftAccountProfile website(String website) {
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
    InfusionsoftAccountProfile accountProfile = (InfusionsoftAccountProfile) o;
    return Objects.equals(this.address, accountProfile.address) &&
        Objects.equals(this.businessGoals, accountProfile.businessGoals) &&
        Objects.equals(this.businessPrimaryColor, accountProfile.businessPrimaryColor) &&
        Objects.equals(this.businessSecondaryColor, accountProfile.businessSecondaryColor) &&
        Objects.equals(this.businessType, accountProfile.businessType) &&
        Objects.equals(this.currencyCode, accountProfile.currencyCode) &&
        Objects.equals(this.email, accountProfile.email) &&
        Objects.equals(this.languageTag, accountProfile.languageTag) &&
        Objects.equals(this.logoUrl, accountProfile.logoUrl) &&
        Objects.equals(this.name, accountProfile.name) &&
        Objects.equals(this.phone, accountProfile.phone) &&
        Objects.equals(this.phoneExt, accountProfile.phoneExt) &&
        Objects.equals(this.timeZone, accountProfile.timeZone) &&
        Objects.equals(this.website, accountProfile.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, businessGoals, businessPrimaryColor, businessSecondaryColor, businessType, currencyCode, email, languageTag, logoUrl, name, phone, phoneExt, timeZone, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftAccountProfile {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessGoals: ").append(toIndentedString(businessGoals)).append("\n");
    sb.append("    businessPrimaryColor: ").append(toIndentedString(businessPrimaryColor)).append("\n");
    sb.append("    businessSecondaryColor: ").append(toIndentedString(businessSecondaryColor)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    languageTag: ").append(toIndentedString(languageTag)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExt: ").append(toIndentedString(phoneExt)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

