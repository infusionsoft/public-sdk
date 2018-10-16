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
import com.infusionsoft.model.InfusionsoftFaxNumber;
import com.infusionsoft.model.InfusionsoftPhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftRestUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T20:40:42.950Z")
public class InfusionsoftRestUser {
  @SerializedName("address")
  private InfusionsoftAddress address = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("created_by")
  private Long createdBy = null;

  @SerializedName("date_created")
  private OffsetDateTime dateCreated = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("fax_numbers")
  private List<InfusionsoftFaxNumber> faxNumbers = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("global_user_id")
  private Long globalUserId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("infusionsoft_id")
  private String infusionsoftId = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("last_updated_by")
  private Long lastUpdatedBy = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("partner")
  private Boolean partner = null;

  @SerializedName("phone_numbers")
  private List<InfusionsoftPhoneNumber> phoneNumbers = null;

  @SerializedName("preferred_name")
  private String preferredName = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    INVITED("Invited"),
    
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftRestUser address(InfusionsoftAddress address) {
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

  public InfusionsoftRestUser companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public InfusionsoftRestUser createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public InfusionsoftRestUser dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public InfusionsoftRestUser emailAddress(String emailAddress) {
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

  public InfusionsoftRestUser familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public InfusionsoftRestUser faxNumbers(List<InfusionsoftFaxNumber> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public InfusionsoftRestUser addFaxNumbersItem(InfusionsoftFaxNumber faxNumbersItem) {
    if (this.faxNumbers == null) {
      this.faxNumbers = new ArrayList<InfusionsoftFaxNumber>();
    }
    this.faxNumbers.add(faxNumbersItem);
    return this;
  }

   /**
   * Get faxNumbers
   * @return faxNumbers
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftFaxNumber> getFaxNumbers() {
    return faxNumbers;
  }

  public void setFaxNumbers(List<InfusionsoftFaxNumber> faxNumbers) {
    this.faxNumbers = faxNumbers;
  }

  public InfusionsoftRestUser givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public InfusionsoftRestUser globalUserId(Long globalUserId) {
    this.globalUserId = globalUserId;
    return this;
  }

   /**
   * Get globalUserId
   * @return globalUserId
  **/
  @ApiModelProperty(value = "")
  public Long getGlobalUserId() {
    return globalUserId;
  }

  public void setGlobalUserId(Long globalUserId) {
    this.globalUserId = globalUserId;
  }

  public InfusionsoftRestUser id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftRestUser infusionsoftId(String infusionsoftId) {
    this.infusionsoftId = infusionsoftId;
    return this;
  }

   /**
   * Get infusionsoftId
   * @return infusionsoftId
  **/
  @ApiModelProperty(value = "")
  public String getInfusionsoftId() {
    return infusionsoftId;
  }

  public void setInfusionsoftId(String infusionsoftId) {
    this.infusionsoftId = infusionsoftId;
  }

  public InfusionsoftRestUser jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public InfusionsoftRestUser lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public InfusionsoftRestUser lastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")
  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public InfusionsoftRestUser middleName(String middleName) {
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

  public InfusionsoftRestUser partner(Boolean partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartner() {
    return partner;
  }

  public void setPartner(Boolean partner) {
    this.partner = partner;
  }

  public InfusionsoftRestUser phoneNumbers(List<InfusionsoftPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public InfusionsoftRestUser addPhoneNumbersItem(InfusionsoftPhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<InfusionsoftPhoneNumber>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<InfusionsoftPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public InfusionsoftRestUser preferredName(String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

   /**
   * Get preferredName
   * @return preferredName
  **/
  @ApiModelProperty(value = "")
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public InfusionsoftRestUser status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InfusionsoftRestUser timeZone(String timeZone) {
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

  public InfusionsoftRestUser website(String website) {
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
    InfusionsoftRestUser restUser = (InfusionsoftRestUser) o;
    return Objects.equals(this.address, restUser.address) &&
        Objects.equals(this.companyName, restUser.companyName) &&
        Objects.equals(this.createdBy, restUser.createdBy) &&
        Objects.equals(this.dateCreated, restUser.dateCreated) &&
        Objects.equals(this.emailAddress, restUser.emailAddress) &&
        Objects.equals(this.familyName, restUser.familyName) &&
        Objects.equals(this.faxNumbers, restUser.faxNumbers) &&
        Objects.equals(this.givenName, restUser.givenName) &&
        Objects.equals(this.globalUserId, restUser.globalUserId) &&
        Objects.equals(this.id, restUser.id) &&
        Objects.equals(this.infusionsoftId, restUser.infusionsoftId) &&
        Objects.equals(this.jobTitle, restUser.jobTitle) &&
        Objects.equals(this.lastUpdated, restUser.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, restUser.lastUpdatedBy) &&
        Objects.equals(this.middleName, restUser.middleName) &&
        Objects.equals(this.partner, restUser.partner) &&
        Objects.equals(this.phoneNumbers, restUser.phoneNumbers) &&
        Objects.equals(this.preferredName, restUser.preferredName) &&
        Objects.equals(this.status, restUser.status) &&
        Objects.equals(this.timeZone, restUser.timeZone) &&
        Objects.equals(this.website, restUser.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, createdBy, dateCreated, emailAddress, familyName, faxNumbers, givenName, globalUserId, id, infusionsoftId, jobTitle, lastUpdated, lastUpdatedBy, middleName, partner, phoneNumbers, preferredName, status, timeZone, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftRestUser {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    globalUserId: ").append(toIndentedString(globalUserId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    infusionsoftId: ").append(toIndentedString(infusionsoftId)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

