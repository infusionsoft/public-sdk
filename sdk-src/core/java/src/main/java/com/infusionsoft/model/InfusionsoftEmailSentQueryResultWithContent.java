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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftEmailSentQueryResultWithContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T18:56:01.538Z")
public class InfusionsoftEmailSentQueryResultWithContent {
  @SerializedName("contact_id")
  private Long contactId = null;

  @SerializedName("headers")
  private String headers = null;

  @SerializedName("html_content")
  private String htmlContent = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("opened_date")
  private OffsetDateTime openedDate = null;

  @SerializedName("plain_content")
  private String plainContent = null;

  @SerializedName("received_date")
  private OffsetDateTime receivedDate = null;

  @SerializedName("sent_date")
  private OffsetDateTime sentDate = null;

  @SerializedName("sent_from_address")
  private String sentFromAddress = null;

  @SerializedName("sent_from_reply_address")
  private String sentFromReplyAddress = null;

  @SerializedName("sent_to_address")
  private String sentToAddress = null;

  @SerializedName("sent_to_bcc_addresses")
  private String sentToBccAddresses = null;

  @SerializedName("sent_to_cc_addresses")
  private String sentToCcAddresses = null;

  @SerializedName("subject")
  private String subject = null;

  public InfusionsoftEmailSentQueryResultWithContent contactId(Long contactId) {
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

  public InfusionsoftEmailSentQueryResultWithContent headers(String headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public String getHeaders() {
    return headers;
  }

  public void setHeaders(String headers) {
    this.headers = headers;
  }

  public InfusionsoftEmailSentQueryResultWithContent htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * Base64 encoded HTML
   * @return htmlContent
  **/
  @ApiModelProperty(value = "Base64 encoded HTML")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public InfusionsoftEmailSentQueryResultWithContent id(Long id) {
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

  public InfusionsoftEmailSentQueryResultWithContent openedDate(OffsetDateTime openedDate) {
    this.openedDate = openedDate;
    return this;
  }

   /**
   * Get openedDate
   * @return openedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getOpenedDate() {
    return openedDate;
  }

  public void setOpenedDate(OffsetDateTime openedDate) {
    this.openedDate = openedDate;
  }

  public InfusionsoftEmailSentQueryResultWithContent plainContent(String plainContent) {
    this.plainContent = plainContent;
    return this;
  }

   /**
   * Base64 encoded plain text
   * @return plainContent
  **/
  @ApiModelProperty(value = "Base64 encoded plain text")
  public String getPlainContent() {
    return plainContent;
  }

  public void setPlainContent(String plainContent) {
    this.plainContent = plainContent;
  }

  public InfusionsoftEmailSentQueryResultWithContent receivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Get receivedDate
   * @return receivedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(OffsetDateTime receivedDate) {
    this.receivedDate = receivedDate;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
    return this;
  }

   /**
   * Get sentDate
   * @return sentDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentFromAddress(String sentFromAddress) {
    this.sentFromAddress = sentFromAddress;
    return this;
  }

   /**
   * Get sentFromAddress
   * @return sentFromAddress
  **/
  @ApiModelProperty(value = "")
  public String getSentFromAddress() {
    return sentFromAddress;
  }

  public void setSentFromAddress(String sentFromAddress) {
    this.sentFromAddress = sentFromAddress;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentFromReplyAddress(String sentFromReplyAddress) {
    this.sentFromReplyAddress = sentFromReplyAddress;
    return this;
  }

   /**
   * Get sentFromReplyAddress
   * @return sentFromReplyAddress
  **/
  @ApiModelProperty(value = "")
  public String getSentFromReplyAddress() {
    return sentFromReplyAddress;
  }

  public void setSentFromReplyAddress(String sentFromReplyAddress) {
    this.sentFromReplyAddress = sentFromReplyAddress;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentToAddress(String sentToAddress) {
    this.sentToAddress = sentToAddress;
    return this;
  }

   /**
   * Get sentToAddress
   * @return sentToAddress
  **/
  @ApiModelProperty(value = "")
  public String getSentToAddress() {
    return sentToAddress;
  }

  public void setSentToAddress(String sentToAddress) {
    this.sentToAddress = sentToAddress;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentToBccAddresses(String sentToBccAddresses) {
    this.sentToBccAddresses = sentToBccAddresses;
    return this;
  }

   /**
   * Get sentToBccAddresses
   * @return sentToBccAddresses
  **/
  @ApiModelProperty(value = "")
  public String getSentToBccAddresses() {
    return sentToBccAddresses;
  }

  public void setSentToBccAddresses(String sentToBccAddresses) {
    this.sentToBccAddresses = sentToBccAddresses;
  }

  public InfusionsoftEmailSentQueryResultWithContent sentToCcAddresses(String sentToCcAddresses) {
    this.sentToCcAddresses = sentToCcAddresses;
    return this;
  }

   /**
   * Get sentToCcAddresses
   * @return sentToCcAddresses
  **/
  @ApiModelProperty(value = "")
  public String getSentToCcAddresses() {
    return sentToCcAddresses;
  }

  public void setSentToCcAddresses(String sentToCcAddresses) {
    this.sentToCcAddresses = sentToCcAddresses;
  }

  public InfusionsoftEmailSentQueryResultWithContent subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftEmailSentQueryResultWithContent emailSentQueryResultWithContent = (InfusionsoftEmailSentQueryResultWithContent) o;
    return Objects.equals(this.contactId, emailSentQueryResultWithContent.contactId) &&
        Objects.equals(this.headers, emailSentQueryResultWithContent.headers) &&
        Objects.equals(this.htmlContent, emailSentQueryResultWithContent.htmlContent) &&
        Objects.equals(this.id, emailSentQueryResultWithContent.id) &&
        Objects.equals(this.openedDate, emailSentQueryResultWithContent.openedDate) &&
        Objects.equals(this.plainContent, emailSentQueryResultWithContent.plainContent) &&
        Objects.equals(this.receivedDate, emailSentQueryResultWithContent.receivedDate) &&
        Objects.equals(this.sentDate, emailSentQueryResultWithContent.sentDate) &&
        Objects.equals(this.sentFromAddress, emailSentQueryResultWithContent.sentFromAddress) &&
        Objects.equals(this.sentFromReplyAddress, emailSentQueryResultWithContent.sentFromReplyAddress) &&
        Objects.equals(this.sentToAddress, emailSentQueryResultWithContent.sentToAddress) &&
        Objects.equals(this.sentToBccAddresses, emailSentQueryResultWithContent.sentToBccAddresses) &&
        Objects.equals(this.sentToCcAddresses, emailSentQueryResultWithContent.sentToCcAddresses) &&
        Objects.equals(this.subject, emailSentQueryResultWithContent.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, headers, htmlContent, id, openedDate, plainContent, receivedDate, sentDate, sentFromAddress, sentFromReplyAddress, sentToAddress, sentToBccAddresses, sentToCcAddresses, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSentQueryResultWithContent {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openedDate: ").append(toIndentedString(openedDate)).append("\n");
    sb.append("    plainContent: ").append(toIndentedString(plainContent)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    sentFromAddress: ").append(toIndentedString(sentFromAddress)).append("\n");
    sb.append("    sentFromReplyAddress: ").append(toIndentedString(sentFromReplyAddress)).append("\n");
    sb.append("    sentToAddress: ").append(toIndentedString(sentToAddress)).append("\n");
    sb.append("    sentToBccAddresses: ").append(toIndentedString(sentToBccAddresses)).append("\n");
    sb.append("    sentToCcAddresses: ").append(toIndentedString(sentToCcAddresses)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

