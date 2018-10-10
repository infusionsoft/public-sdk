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

/**
 * InfusionsoftCreditCardAdded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-10T00:36:44.670Z")
public class InfusionsoftCreditCardAdded {
  @SerializedName("address")
  private InfusionsoftAddress address = null;

  @SerializedName("card_type")
  private String cardType = null;

  @SerializedName("contact_id")
  private Long contactId = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("expiration_month")
  private String expirationMonth = null;

  @SerializedName("expiration_year")
  private String expirationYear = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("maestro_issue_number")
  private String maestroIssueNumber = null;

  @SerializedName("maestro_start_date_month")
  private String maestroStartDateMonth = null;

  @SerializedName("maestro_start_date_year")
  private String maestroStartDateYear = null;

  @SerializedName("name_on_card")
  private String nameOnCard = null;

  @SerializedName("validation_message")
  private String validationMessage = null;

  @SerializedName("validation_status")
  private String validationStatus = null;

  public InfusionsoftCreditCardAdded address(InfusionsoftAddress address) {
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

  public InfusionsoftCreditCardAdded cardType(String cardType) {
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

  public InfusionsoftCreditCardAdded contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(value = "")
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public InfusionsoftCreditCardAdded emailAddress(String emailAddress) {
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

  public InfusionsoftCreditCardAdded expirationMonth(String expirationMonth) {
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

  public InfusionsoftCreditCardAdded expirationYear(String expirationYear) {
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

  public InfusionsoftCreditCardAdded id(Long id) {
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

  public InfusionsoftCreditCardAdded maestroIssueNumber(String maestroIssueNumber) {
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

  public InfusionsoftCreditCardAdded maestroStartDateMonth(String maestroStartDateMonth) {
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

  public InfusionsoftCreditCardAdded maestroStartDateYear(String maestroStartDateYear) {
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

  public InfusionsoftCreditCardAdded nameOnCard(String nameOnCard) {
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

  public InfusionsoftCreditCardAdded validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * Get validationMessage
   * @return validationMessage
  **/
  @ApiModelProperty(value = "")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public InfusionsoftCreditCardAdded validationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Get validationStatus
   * @return validationStatus
  **/
  @ApiModelProperty(value = "")
  public String getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreditCardAdded creditCardAdded = (InfusionsoftCreditCardAdded) o;
    return Objects.equals(this.address, creditCardAdded.address) &&
        Objects.equals(this.cardType, creditCardAdded.cardType) &&
        Objects.equals(this.contactId, creditCardAdded.contactId) &&
        Objects.equals(this.emailAddress, creditCardAdded.emailAddress) &&
        Objects.equals(this.expirationMonth, creditCardAdded.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCardAdded.expirationYear) &&
        Objects.equals(this.id, creditCardAdded.id) &&
        Objects.equals(this.maestroIssueNumber, creditCardAdded.maestroIssueNumber) &&
        Objects.equals(this.maestroStartDateMonth, creditCardAdded.maestroStartDateMonth) &&
        Objects.equals(this.maestroStartDateYear, creditCardAdded.maestroStartDateYear) &&
        Objects.equals(this.nameOnCard, creditCardAdded.nameOnCard) &&
        Objects.equals(this.validationMessage, creditCardAdded.validationMessage) &&
        Objects.equals(this.validationStatus, creditCardAdded.validationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cardType, contactId, emailAddress, expirationMonth, expirationYear, id, maestroIssueNumber, maestroStartDateMonth, maestroStartDateYear, nameOnCard, validationMessage, validationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreditCardAdded {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maestroIssueNumber: ").append(toIndentedString(maestroIssueNumber)).append("\n");
    sb.append("    maestroStartDateMonth: ").append(toIndentedString(maestroStartDateMonth)).append("\n");
    sb.append("    maestroStartDateYear: ").append(toIndentedString(maestroStartDateYear)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
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

