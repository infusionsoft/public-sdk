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
import java.time.OffsetDateTime;

/**
 * InfusionsoftEmailSentCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftEmailSentCreate {
  @SerializedName("clicked_date")
  private OffsetDateTime clickedDate = null;

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

  /**
   * Provider that sent the email case insensitive, must be in list [GOOGLE, INFUSIONSOFT].  If omitted gets mapped to UNKNOWN.
   */
  @JsonAdapter(OriginalProviderEnum.Adapter.class)
  public enum OriginalProviderEnum {
    UNKNOWN("UNKNOWN"),
    
    INFUSIONSOFT("INFUSIONSOFT"),
    
    MICROSOFT("MICROSOFT"),
    
    GOOGLE("GOOGLE");

    private String value;

    OriginalProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginalProviderEnum fromValue(String text) {
      for (OriginalProviderEnum b : OriginalProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OriginalProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginalProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginalProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginalProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("original_provider")
  private OriginalProviderEnum originalProvider = null;

  @SerializedName("original_provider_id")
  private String originalProviderId = null;

  @SerializedName("plain_content")
  private String plainContent = null;

  @SerializedName("provider_source_id")
  private String providerSourceId = null;

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

  public InfusionsoftEmailSentCreate clickedDate(OffsetDateTime clickedDate) {
    this.clickedDate = clickedDate;
    return this;
  }

   /**
   * Get clickedDate
   * @return clickedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClickedDate() {
    return clickedDate;
  }

  public void setClickedDate(OffsetDateTime clickedDate) {
    this.clickedDate = clickedDate;
  }

  public InfusionsoftEmailSentCreate contactId(Long contactId) {
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

  public InfusionsoftEmailSentCreate headers(String headers) {
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

  public InfusionsoftEmailSentCreate htmlContent(String htmlContent) {
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

  public InfusionsoftEmailSentCreate id(Long id) {
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

  public InfusionsoftEmailSentCreate openedDate(OffsetDateTime openedDate) {
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

  public InfusionsoftEmailSentCreate originalProvider(OriginalProviderEnum originalProvider) {
    this.originalProvider = originalProvider;
    return this;
  }

   /**
   * Provider that sent the email case insensitive, must be in list [GOOGLE, INFUSIONSOFT].  If omitted gets mapped to UNKNOWN.
   * @return originalProvider
  **/
  @ApiModelProperty(value = "Provider that sent the email case insensitive, must be in list [GOOGLE, INFUSIONSOFT].  If omitted gets mapped to UNKNOWN.")
  public OriginalProviderEnum getOriginalProvider() {
    return originalProvider;
  }

  public void setOriginalProvider(OriginalProviderEnum originalProvider) {
    this.originalProvider = originalProvider;
  }

  public InfusionsoftEmailSentCreate originalProviderId(String originalProviderId) {
    this.originalProviderId = originalProviderId;
    return this;
  }

   /**
   * Provider id that sent the email, must be unique when combined with provider.  If omitted a UUID without dashes is autogenerated for the record.
   * @return originalProviderId
  **/
  @ApiModelProperty(value = "Provider id that sent the email, must be unique when combined with provider.  If omitted a UUID without dashes is autogenerated for the record.")
  public String getOriginalProviderId() {
    return originalProviderId;
  }

  public void setOriginalProviderId(String originalProviderId) {
    this.originalProviderId = originalProviderId;
  }

  public InfusionsoftEmailSentCreate plainContent(String plainContent) {
    this.plainContent = plainContent;
    return this;
  }

   /**
   * Base64 encoded text
   * @return plainContent
  **/
  @ApiModelProperty(value = "Base64 encoded text")
  public String getPlainContent() {
    return plainContent;
  }

  public void setPlainContent(String plainContent) {
    this.plainContent = plainContent;
  }

  public InfusionsoftEmailSentCreate providerSourceId(String providerSourceId) {
    this.providerSourceId = providerSourceId;
    return this;
  }

   /**
   * The email address of the synced email account that generated this message.
   * @return providerSourceId
  **/
  @ApiModelProperty(value = "The email address of the synced email account that generated this message.")
  public String getProviderSourceId() {
    return providerSourceId;
  }

  public void setProviderSourceId(String providerSourceId) {
    this.providerSourceId = providerSourceId;
  }

  public InfusionsoftEmailSentCreate receivedDate(OffsetDateTime receivedDate) {
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

  public InfusionsoftEmailSentCreate sentDate(OffsetDateTime sentDate) {
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

  public InfusionsoftEmailSentCreate sentFromAddress(String sentFromAddress) {
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

  public InfusionsoftEmailSentCreate sentFromReplyAddress(String sentFromReplyAddress) {
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

  public InfusionsoftEmailSentCreate sentToAddress(String sentToAddress) {
    this.sentToAddress = sentToAddress;
    return this;
  }

   /**
   * Get sentToAddress
   * @return sentToAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSentToAddress() {
    return sentToAddress;
  }

  public void setSentToAddress(String sentToAddress) {
    this.sentToAddress = sentToAddress;
  }

  public InfusionsoftEmailSentCreate sentToBccAddresses(String sentToBccAddresses) {
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

  public InfusionsoftEmailSentCreate sentToCcAddresses(String sentToCcAddresses) {
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

  public InfusionsoftEmailSentCreate subject(String subject) {
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
    InfusionsoftEmailSentCreate emailSentCreate = (InfusionsoftEmailSentCreate) o;
    return Objects.equals(this.clickedDate, emailSentCreate.clickedDate) &&
        Objects.equals(this.contactId, emailSentCreate.contactId) &&
        Objects.equals(this.headers, emailSentCreate.headers) &&
        Objects.equals(this.htmlContent, emailSentCreate.htmlContent) &&
        Objects.equals(this.id, emailSentCreate.id) &&
        Objects.equals(this.openedDate, emailSentCreate.openedDate) &&
        Objects.equals(this.originalProvider, emailSentCreate.originalProvider) &&
        Objects.equals(this.originalProviderId, emailSentCreate.originalProviderId) &&
        Objects.equals(this.plainContent, emailSentCreate.plainContent) &&
        Objects.equals(this.providerSourceId, emailSentCreate.providerSourceId) &&
        Objects.equals(this.receivedDate, emailSentCreate.receivedDate) &&
        Objects.equals(this.sentDate, emailSentCreate.sentDate) &&
        Objects.equals(this.sentFromAddress, emailSentCreate.sentFromAddress) &&
        Objects.equals(this.sentFromReplyAddress, emailSentCreate.sentFromReplyAddress) &&
        Objects.equals(this.sentToAddress, emailSentCreate.sentToAddress) &&
        Objects.equals(this.sentToBccAddresses, emailSentCreate.sentToBccAddresses) &&
        Objects.equals(this.sentToCcAddresses, emailSentCreate.sentToCcAddresses) &&
        Objects.equals(this.subject, emailSentCreate.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickedDate, contactId, headers, htmlContent, id, openedDate, originalProvider, originalProviderId, plainContent, providerSourceId, receivedDate, sentDate, sentFromAddress, sentFromReplyAddress, sentToAddress, sentToBccAddresses, sentToCcAddresses, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSentCreate {\n");
    
    sb.append("    clickedDate: ").append(toIndentedString(clickedDate)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    openedDate: ").append(toIndentedString(openedDate)).append("\n");
    sb.append("    originalProvider: ").append(toIndentedString(originalProvider)).append("\n");
    sb.append("    originalProviderId: ").append(toIndentedString(originalProviderId)).append("\n");
    sb.append("    plainContent: ").append(toIndentedString(plainContent)).append("\n");
    sb.append("    providerSourceId: ").append(toIndentedString(providerSourceId)).append("\n");
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

