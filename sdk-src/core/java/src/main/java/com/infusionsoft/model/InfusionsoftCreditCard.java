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
import com.infusionsoft.model.InfusionsoftContactAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftCreditCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftCreditCard {
  @SerializedName("address")
  private InfusionsoftContactAddress address = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("card_type")
  private String cardType = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("expiration_month")
  private String expirationMonth = null;

  @SerializedName("expiration_year")
  private String expirationYear = null;

  @SerializedName("maestro_issue_number")
  private String maestroIssueNumber = null;

  @SerializedName("maestro_start_date_month")
  private String maestroStartDateMonth = null;

  @SerializedName("maestro_start_date_year")
  private String maestroStartDateYear = null;

  @SerializedName("name_on_card")
  private String nameOnCard = null;

  @SerializedName("verification_code")
  private String verificationCode = null;

  public InfusionsoftCreditCard address(InfusionsoftContactAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftContactAddress getAddress() {
    return address;
  }

  public void setAddress(InfusionsoftContactAddress address) {
    this.address = address;
  }

  public InfusionsoftCreditCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public InfusionsoftCreditCard cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public InfusionsoftCreditCard emailAddress(String emailAddress) {
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

  public InfusionsoftCreditCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public InfusionsoftCreditCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @ApiModelProperty(value = "")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public InfusionsoftCreditCard maestroIssueNumber(String maestroIssueNumber) {
    this.maestroIssueNumber = maestroIssueNumber;
    return this;
  }

   /**
   * Get maestroIssueNumber
   * @return maestroIssueNumber
  **/
  @ApiModelProperty(value = "")
  public String getMaestroIssueNumber() {
    return maestroIssueNumber;
  }

  public void setMaestroIssueNumber(String maestroIssueNumber) {
    this.maestroIssueNumber = maestroIssueNumber;
  }

  public InfusionsoftCreditCard maestroStartDateMonth(String maestroStartDateMonth) {
    this.maestroStartDateMonth = maestroStartDateMonth;
    return this;
  }

   /**
   * Get maestroStartDateMonth
   * @return maestroStartDateMonth
  **/
  @ApiModelProperty(value = "")
  public String getMaestroStartDateMonth() {
    return maestroStartDateMonth;
  }

  public void setMaestroStartDateMonth(String maestroStartDateMonth) {
    this.maestroStartDateMonth = maestroStartDateMonth;
  }

  public InfusionsoftCreditCard maestroStartDateYear(String maestroStartDateYear) {
    this.maestroStartDateYear = maestroStartDateYear;
    return this;
  }

   /**
   * Get maestroStartDateYear
   * @return maestroStartDateYear
  **/
  @ApiModelProperty(value = "")
  public String getMaestroStartDateYear() {
    return maestroStartDateYear;
  }

  public void setMaestroStartDateYear(String maestroStartDateYear) {
    this.maestroStartDateYear = maestroStartDateYear;
  }

  public InfusionsoftCreditCard nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

   /**
   * Get nameOnCard
   * @return nameOnCard
  **/
  @ApiModelProperty(value = "")
  public String getNameOnCard() {
    return nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  public InfusionsoftCreditCard verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * Get verificationCode
   * @return verificationCode
  **/
  @ApiModelProperty(value = "")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreditCard creditCard = (InfusionsoftCreditCard) o;
    return Objects.equals(this.address, creditCard.address) &&
        Objects.equals(this.cardNumber, creditCard.cardNumber) &&
        Objects.equals(this.cardType, creditCard.cardType) &&
        Objects.equals(this.emailAddress, creditCard.emailAddress) &&
        Objects.equals(this.expirationMonth, creditCard.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCard.expirationYear) &&
        Objects.equals(this.maestroIssueNumber, creditCard.maestroIssueNumber) &&
        Objects.equals(this.maestroStartDateMonth, creditCard.maestroStartDateMonth) &&
        Objects.equals(this.maestroStartDateYear, creditCard.maestroStartDateYear) &&
        Objects.equals(this.nameOnCard, creditCard.nameOnCard) &&
        Objects.equals(this.verificationCode, creditCard.verificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cardNumber, cardType, emailAddress, expirationMonth, expirationYear, maestroIssueNumber, maestroStartDateMonth, maestroStartDateYear, nameOnCard, verificationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreditCard {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    maestroIssueNumber: ").append(toIndentedString(maestroIssueNumber)).append("\n");
    sb.append("    maestroStartDateMonth: ").append(toIndentedString(maestroStartDateMonth)).append("\n");
    sb.append("    maestroStartDateYear: ").append(toIndentedString(maestroStartDateYear)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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

