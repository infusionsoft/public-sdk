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
 * InfusionsoftAddressInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftAddressInformation {
  @SerializedName("company")
  private String company = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("line1")
  private String line1 = null;

  @SerializedName("line2")
  private String line2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("zip_code")
  private String zipCode = null;

  @SerializedName("zip_four")
  private String zipFour = null;

  public InfusionsoftAddressInformation company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public InfusionsoftAddressInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InfusionsoftAddressInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InfusionsoftAddressInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InfusionsoftAddressInformation line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(value = "")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public InfusionsoftAddressInformation line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(value = "")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public InfusionsoftAddressInformation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @ApiModelProperty(value = "")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public InfusionsoftAddressInformation middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public InfusionsoftAddressInformation phone(String phone) {
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

  public InfusionsoftAddressInformation region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public InfusionsoftAddressInformation zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public InfusionsoftAddressInformation zipFour(String zipFour) {
    this.zipFour = zipFour;
    return this;
  }

   /**
   * Get zipFour
   * @return zipFour
  **/
  @ApiModelProperty(value = "")
  public String getZipFour() {
    return zipFour;
  }

  public void setZipFour(String zipFour) {
    this.zipFour = zipFour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftAddressInformation addressInformation = (InfusionsoftAddressInformation) o;
    return Objects.equals(this.company, addressInformation.company) &&
        Objects.equals(this.countryCode, addressInformation.countryCode) &&
        Objects.equals(this.firstName, addressInformation.firstName) &&
        Objects.equals(this.lastName, addressInformation.lastName) &&
        Objects.equals(this.line1, addressInformation.line1) &&
        Objects.equals(this.line2, addressInformation.line2) &&
        Objects.equals(this.locality, addressInformation.locality) &&
        Objects.equals(this.middleName, addressInformation.middleName) &&
        Objects.equals(this.phone, addressInformation.phone) &&
        Objects.equals(this.region, addressInformation.region) &&
        Objects.equals(this.zipCode, addressInformation.zipCode) &&
        Objects.equals(this.zipFour, addressInformation.zipFour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, countryCode, firstName, lastName, line1, line2, locality, middleName, phone, region, zipCode, zipFour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftAddressInformation {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipFour: ").append(toIndentedString(zipFour)).append("\n");
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

