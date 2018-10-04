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
import com.infusionsoft.model.InfusionsoftEmailSendRequestAttachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftEmailSendRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftEmailSendRequest {
  @SerializedName("address_field")
  private String addressField = null;

  @SerializedName("attachments")
  private List<InfusionsoftEmailSendRequestAttachment> attachments = null;

  @SerializedName("contacts")
  private List<Long> contacts = new ArrayList<Long>();

  @SerializedName("html_content")
  private String htmlContent = null;

  @SerializedName("plain_content")
  private String plainContent = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("user_id")
  private Long userId = null;

  public InfusionsoftEmailSendRequest addressField(String addressField) {
    this.addressField = addressField;
    return this;
  }

   /**
   * Email field of each Contact record to address the email to, such as &#39;Email&#39;, &#39;EmailAddress2&#39;, &#39;EmailAddress3&#39; or &#39;_CustomFieldName&#39;, defaulting to the contact&#39;s primary email
   * @return addressField
  **/
  @ApiModelProperty(value = "Email field of each Contact record to address the email to, such as 'Email', 'EmailAddress2', 'EmailAddress3' or '_CustomFieldName', defaulting to the contact's primary email")
  public String getAddressField() {
    return addressField;
  }

  public void setAddressField(String addressField) {
    this.addressField = addressField;
  }

  public InfusionsoftEmailSendRequest attachments(List<InfusionsoftEmailSendRequestAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public InfusionsoftEmailSendRequest addAttachmentsItem(InfusionsoftEmailSendRequestAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<InfusionsoftEmailSendRequestAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments to be sent with each copy of the email, maximum of 10 with size of 1MB each
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments to be sent with each copy of the email, maximum of 10 with size of 1MB each")
  public List<InfusionsoftEmailSendRequestAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<InfusionsoftEmailSendRequestAttachment> attachments) {
    this.attachments = attachments;
  }

  public InfusionsoftEmailSendRequest contacts(List<Long> contacts) {
    this.contacts = contacts;
    return this;
  }

  public InfusionsoftEmailSendRequest addContactsItem(Long contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * An array of Contact Ids to receive the email
   * @return contacts
  **/
  @ApiModelProperty(required = true, value = "An array of Contact Ids to receive the email")
  public List<Long> getContacts() {
    return contacts;
  }

  public void setContacts(List<Long> contacts) {
    this.contacts = contacts;
  }

  public InfusionsoftEmailSendRequest htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * The HTML-formatted content of the email, encoded in Base64
   * @return htmlContent
  **/
  @ApiModelProperty(value = "The HTML-formatted content of the email, encoded in Base64")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public InfusionsoftEmailSendRequest plainContent(String plainContent) {
    this.plainContent = plainContent;
    return this;
  }

   /**
   * The plain-text content of the email, encoded in Base64
   * @return plainContent
  **/
  @ApiModelProperty(value = "The plain-text content of the email, encoded in Base64")
  public String getPlainContent() {
    return plainContent;
  }

  public void setPlainContent(String plainContent) {
    this.plainContent = plainContent;
  }

  public InfusionsoftEmailSendRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the email
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "The subject line of the email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public InfusionsoftEmailSendRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The infusionsoft user to send the email on behalf of
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The infusionsoft user to send the email on behalf of")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftEmailSendRequest emailSendRequest = (InfusionsoftEmailSendRequest) o;
    return Objects.equals(this.addressField, emailSendRequest.addressField) &&
        Objects.equals(this.attachments, emailSendRequest.attachments) &&
        Objects.equals(this.contacts, emailSendRequest.contacts) &&
        Objects.equals(this.htmlContent, emailSendRequest.htmlContent) &&
        Objects.equals(this.plainContent, emailSendRequest.plainContent) &&
        Objects.equals(this.subject, emailSendRequest.subject) &&
        Objects.equals(this.userId, emailSendRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressField, attachments, contacts, htmlContent, plainContent, subject, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSendRequest {\n");
    
    sb.append("    addressField: ").append(toIndentedString(addressField)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    plainContent: ").append(toIndentedString(plainContent)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
