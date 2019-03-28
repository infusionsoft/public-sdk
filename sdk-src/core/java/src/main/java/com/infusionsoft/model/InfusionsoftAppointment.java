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
 * InfusionsoftAppointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftAppointment {
  @SerializedName("contact_id")
  private Long contactId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("remind_time")
  private Integer remindTime = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("user")
  private Long user = null;

  public InfusionsoftAppointment contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Required for pop-up reminders
   * @return contactId
  **/
  @ApiModelProperty(value = "Required for pop-up reminders")
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public InfusionsoftAppointment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InfusionsoftAppointment endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public InfusionsoftAppointment location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public InfusionsoftAppointment remindTime(Integer remindTime) {
    this.remindTime = remindTime;
    return this;
  }

   /**
   * Value in minutes before start_date to show pop-up reminder.  Acceptable values are [5,10,15,30,60,120,240,480,1440,2880]
   * @return remindTime
  **/
  @ApiModelProperty(value = "Value in minutes before start_date to show pop-up reminder.  Acceptable values are [5,10,15,30,60,120,240,480,1440,2880]")
  public Integer getRemindTime() {
    return remindTime;
  }

  public void setRemindTime(Integer remindTime) {
    this.remindTime = remindTime;
  }

  public InfusionsoftAppointment startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public InfusionsoftAppointment title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InfusionsoftAppointment user(Long user) {
    this.user = user;
    return this;
  }

   /**
   * Required only for pop-up reminders
   * @return user
  **/
  @ApiModelProperty(value = "Required only for pop-up reminders")
  public Long getUser() {
    return user;
  }

  public void setUser(Long user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftAppointment appointment = (InfusionsoftAppointment) o;
    return Objects.equals(this.contactId, appointment.contactId) &&
        Objects.equals(this.description, appointment.description) &&
        Objects.equals(this.endDate, appointment.endDate) &&
        Objects.equals(this.location, appointment.location) &&
        Objects.equals(this.remindTime, appointment.remindTime) &&
        Objects.equals(this.startDate, appointment.startDate) &&
        Objects.equals(this.title, appointment.title) &&
        Objects.equals(this.user, appointment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, description, endDate, location, remindTime, startDate, title, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftAppointment {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    remindTime: ").append(toIndentedString(remindTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

