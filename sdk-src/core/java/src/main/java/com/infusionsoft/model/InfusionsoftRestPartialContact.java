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
import com.infusionsoft.model.InfusionsoftCompanyReference;
import com.infusionsoft.model.InfusionsoftContactAddress;
import com.infusionsoft.model.InfusionsoftCustomFieldValue;
import com.infusionsoft.model.InfusionsoftEmailAddress;
import com.infusionsoft.model.InfusionsoftFaxNumber;
import com.infusionsoft.model.InfusionsoftPhoneNumber;
import com.infusionsoft.model.InfusionsoftSocialAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftRestPartialContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftRestPartialContact {
  @SerializedName("addresses")
  private List<InfusionsoftContactAddress> addresses = null;

  @SerializedName("anniversary")
  private OffsetDateTime anniversary = null;

  @SerializedName("birthday")
  private OffsetDateTime birthday = null;

  @SerializedName("company")
  private InfusionsoftCompanyReference company = null;

  @SerializedName("contact_type")
  private String contactType = null;

  @SerializedName("custom_fields")
  private List<InfusionsoftCustomFieldValue> customFields = null;

  @SerializedName("date_created")
  private OffsetDateTime dateCreated = null;

  @SerializedName("email_addresses")
  private List<InfusionsoftEmailAddress> emailAddresses = null;

  @SerializedName("email_opted_in")
  private Boolean emailOptedIn = null;

  /**
   * Gets or Sets emailStatus
   */
  @JsonAdapter(EmailStatusEnum.Adapter.class)
  public enum EmailStatusEnum {
    UNENGAGEDMARKETABLE("UnengagedMarketable"),
    
    SINGLEOPTIN("SingleOptIn"),
    
    DOUBLEOPTIN("DoubleOptin"),
    
    CONFIRMED("Confirmed"),
    
    UNENGAGEDNONMARKETABLE("UnengagedNonMarketable"),
    
    NONMARKETABLE("NonMarketable"),
    
    LOCKDOWN("Lockdown"),
    
    BOUNCE("Bounce"),
    
    HARDBOUNCE("HardBounce"),
    
    MANUAL("Manual"),
    
    ADMIN("Admin"),
    
    SYSTEM("System"),
    
    LISTUNSUBSCRIBE("ListUnsubscribe"),
    
    FEEDBACK("Feedback"),
    
    SPAM("Spam"),
    
    INVALID("Invalid");

    private String value;

    EmailStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailStatusEnum fromValue(String text) {
      for (EmailStatusEnum b : EmailStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmailStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EmailStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("email_status")
  private EmailStatusEnum emailStatus = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("fax_numbers")
  private List<InfusionsoftFaxNumber> faxNumbers = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("lead_source_id")
  private Long leadSourceId = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("phone_numbers")
  private List<InfusionsoftPhoneNumber> phoneNumbers = null;

  @SerializedName("preferred_locale")
  private String preferredLocale = null;

  @SerializedName("preferred_name")
  private String preferredName = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("social_accounts")
  private List<InfusionsoftSocialAccount> socialAccounts = null;

  /**
   * Gets or Sets sourceType
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    WEBFORM("WEBFORM"),
    
    LANDINGPAGE("LANDINGPAGE"),
    
    IMPORT("IMPORT"),
    
    MANUAL("MANUAL"),
    
    API("API"),
    
    OTHER("OTHER"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source_type")
  private SourceTypeEnum sourceType = null;

  @SerializedName("spouse_name")
  private String spouseName = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftRestPartialContact addresses(List<InfusionsoftContactAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public InfusionsoftRestPartialContact addAddressesItem(InfusionsoftContactAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftContactAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<InfusionsoftContactAddress> addresses) {
    this.addresses = addresses;
  }

  public InfusionsoftRestPartialContact anniversary(OffsetDateTime anniversary) {
    this.anniversary = anniversary;
    return this;
  }

   /**
   * Get anniversary
   * @return anniversary
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAnniversary() {
    return anniversary;
  }

  public void setAnniversary(OffsetDateTime anniversary) {
    this.anniversary = anniversary;
  }

  public InfusionsoftRestPartialContact birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }

  public InfusionsoftRestPartialContact company(InfusionsoftCompanyReference company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyReference getCompany() {
    return company;
  }

  public void setCompany(InfusionsoftCompanyReference company) {
    this.company = company;
  }

  public InfusionsoftRestPartialContact contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

   /**
   * Get contactType
   * @return contactType
  **/
  @ApiModelProperty(value = "")
  public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public InfusionsoftRestPartialContact customFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InfusionsoftRestPartialContact addCustomFieldsItem(InfusionsoftCustomFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
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

  public InfusionsoftRestPartialContact dateCreated(OffsetDateTime dateCreated) {
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

  public InfusionsoftRestPartialContact emailAddresses(List<InfusionsoftEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public InfusionsoftRestPartialContact addEmailAddressesItem(InfusionsoftEmailAddress emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftEmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<InfusionsoftEmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public InfusionsoftRestPartialContact emailOptedIn(Boolean emailOptedIn) {
    this.emailOptedIn = emailOptedIn;
    return this;
  }

   /**
   * Get emailOptedIn
   * @return emailOptedIn
  **/
  @ApiModelProperty(value = "")
  public Boolean isEmailOptedIn() {
    return emailOptedIn;
  }

  public void setEmailOptedIn(Boolean emailOptedIn) {
    this.emailOptedIn = emailOptedIn;
  }

  public InfusionsoftRestPartialContact emailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
    return this;
  }

   /**
   * Get emailStatus
   * @return emailStatus
  **/
  @ApiModelProperty(value = "")
  public EmailStatusEnum getEmailStatus() {
    return emailStatus;
  }

  public void setEmailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
  }

  public InfusionsoftRestPartialContact familyName(String familyName) {
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

  public InfusionsoftRestPartialContact faxNumbers(List<InfusionsoftFaxNumber> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public InfusionsoftRestPartialContact addFaxNumbersItem(InfusionsoftFaxNumber faxNumbersItem) {
    if (this.faxNumbers == null) {
      this.faxNumbers = new ArrayList<>();
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

  public InfusionsoftRestPartialContact givenName(String givenName) {
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

  public InfusionsoftRestPartialContact id(Long id) {
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

  public InfusionsoftRestPartialContact jobTitle(String jobTitle) {
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

  public InfusionsoftRestPartialContact lastUpdated(OffsetDateTime lastUpdated) {
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

  public InfusionsoftRestPartialContact leadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
    return this;
  }

   /**
   * Get leadSourceId
   * @return leadSourceId
  **/
  @ApiModelProperty(value = "")
  public Long getLeadSourceId() {
    return leadSourceId;
  }

  public void setLeadSourceId(Long leadSourceId) {
    this.leadSourceId = leadSourceId;
  }

  public InfusionsoftRestPartialContact middleName(String middleName) {
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

  public InfusionsoftRestPartialContact ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public InfusionsoftRestPartialContact phoneNumbers(List<InfusionsoftPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public InfusionsoftRestPartialContact addPhoneNumbersItem(InfusionsoftPhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
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

  public InfusionsoftRestPartialContact preferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
    return this;
  }

   /**
   * Get preferredLocale
   * @return preferredLocale
  **/
  @ApiModelProperty(example = "en_US", value = "")
  public String getPreferredLocale() {
    return preferredLocale;
  }

  public void setPreferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  public InfusionsoftRestPartialContact preferredName(String preferredName) {
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

  public InfusionsoftRestPartialContact prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public InfusionsoftRestPartialContact socialAccounts(List<InfusionsoftSocialAccount> socialAccounts) {
    this.socialAccounts = socialAccounts;
    return this;
  }

  public InfusionsoftRestPartialContact addSocialAccountsItem(InfusionsoftSocialAccount socialAccountsItem) {
    if (this.socialAccounts == null) {
      this.socialAccounts = new ArrayList<>();
    }
    this.socialAccounts.add(socialAccountsItem);
    return this;
  }

   /**
   * Get socialAccounts
   * @return socialAccounts
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftSocialAccount> getSocialAccounts() {
    return socialAccounts;
  }

  public void setSocialAccounts(List<InfusionsoftSocialAccount> socialAccounts) {
    this.socialAccounts = socialAccounts;
  }

  public InfusionsoftRestPartialContact sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public InfusionsoftRestPartialContact spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

   /**
   * Get spouseName
   * @return spouseName
  **/
  @ApiModelProperty(value = "")
  public String getSpouseName() {
    return spouseName;
  }

  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }

  public InfusionsoftRestPartialContact suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @ApiModelProperty(value = "")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public InfusionsoftRestPartialContact timeZone(String timeZone) {
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

  public InfusionsoftRestPartialContact website(String website) {
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
    InfusionsoftRestPartialContact restPartialContact = (InfusionsoftRestPartialContact) o;
    return Objects.equals(this.addresses, restPartialContact.addresses) &&
        Objects.equals(this.anniversary, restPartialContact.anniversary) &&
        Objects.equals(this.birthday, restPartialContact.birthday) &&
        Objects.equals(this.company, restPartialContact.company) &&
        Objects.equals(this.contactType, restPartialContact.contactType) &&
        Objects.equals(this.customFields, restPartialContact.customFields) &&
        Objects.equals(this.dateCreated, restPartialContact.dateCreated) &&
        Objects.equals(this.emailAddresses, restPartialContact.emailAddresses) &&
        Objects.equals(this.emailOptedIn, restPartialContact.emailOptedIn) &&
        Objects.equals(this.emailStatus, restPartialContact.emailStatus) &&
        Objects.equals(this.familyName, restPartialContact.familyName) &&
        Objects.equals(this.faxNumbers, restPartialContact.faxNumbers) &&
        Objects.equals(this.givenName, restPartialContact.givenName) &&
        Objects.equals(this.id, restPartialContact.id) &&
        Objects.equals(this.jobTitle, restPartialContact.jobTitle) &&
        Objects.equals(this.lastUpdated, restPartialContact.lastUpdated) &&
        Objects.equals(this.leadSourceId, restPartialContact.leadSourceId) &&
        Objects.equals(this.middleName, restPartialContact.middleName) &&
        Objects.equals(this.ownerId, restPartialContact.ownerId) &&
        Objects.equals(this.phoneNumbers, restPartialContact.phoneNumbers) &&
        Objects.equals(this.preferredLocale, restPartialContact.preferredLocale) &&
        Objects.equals(this.preferredName, restPartialContact.preferredName) &&
        Objects.equals(this.prefix, restPartialContact.prefix) &&
        Objects.equals(this.socialAccounts, restPartialContact.socialAccounts) &&
        Objects.equals(this.sourceType, restPartialContact.sourceType) &&
        Objects.equals(this.spouseName, restPartialContact.spouseName) &&
        Objects.equals(this.suffix, restPartialContact.suffix) &&
        Objects.equals(this.timeZone, restPartialContact.timeZone) &&
        Objects.equals(this.website, restPartialContact.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, anniversary, birthday, company, contactType, customFields, dateCreated, emailAddresses, emailOptedIn, emailStatus, familyName, faxNumbers, givenName, id, jobTitle, lastUpdated, leadSourceId, middleName, ownerId, phoneNumbers, preferredLocale, preferredName, prefix, socialAccounts, sourceType, spouseName, suffix, timeZone, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftRestPartialContact {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    anniversary: ").append(toIndentedString(anniversary)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    emailOptedIn: ").append(toIndentedString(emailOptedIn)).append("\n");
    sb.append("    emailStatus: ").append(toIndentedString(emailStatus)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    leadSourceId: ").append(toIndentedString(leadSourceId)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    socialAccounts: ").append(toIndentedString(socialAccounts)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    spouseName: ").append(toIndentedString(spouseName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

