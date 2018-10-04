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
import com.infusionsoft.model.InfusionsoftAppointment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftAppointmentList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftAppointmentList {
  @SerializedName("appointments")
  private List<InfusionsoftAppointment> appointments = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("sync_token")
  private String syncToken = null;

  public InfusionsoftAppointmentList appointments(List<InfusionsoftAppointment> appointments) {
    this.appointments = appointments;
    return this;
  }

  public InfusionsoftAppointmentList addAppointmentsItem(InfusionsoftAppointment appointmentsItem) {
    if (this.appointments == null) {
      this.appointments = new ArrayList<InfusionsoftAppointment>();
    }
    this.appointments.add(appointmentsItem);
    return this;
  }

   /**
   * Get appointments
   * @return appointments
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftAppointment> getAppointments() {
    return appointments;
  }

  public void setAppointments(List<InfusionsoftAppointment> appointments) {
    this.appointments = appointments;
  }

  public InfusionsoftAppointmentList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InfusionsoftAppointmentList next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public InfusionsoftAppointmentList previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public InfusionsoftAppointmentList syncToken(String syncToken) {
    this.syncToken = syncToken;
    return this;
  }

   /**
   * Get syncToken
   * @return syncToken
  **/
  @ApiModelProperty(value = "")
  public String getSyncToken() {
    return syncToken;
  }

  public void setSyncToken(String syncToken) {
    this.syncToken = syncToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftAppointmentList appointmentList = (InfusionsoftAppointmentList) o;
    return Objects.equals(this.appointments, appointmentList.appointments) &&
        Objects.equals(this.count, appointmentList.count) &&
        Objects.equals(this.next, appointmentList.next) &&
        Objects.equals(this.previous, appointmentList.previous) &&
        Objects.equals(this.syncToken, appointmentList.syncToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointments, count, next, previous, syncToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftAppointmentList {\n");
    
    sb.append("    appointments: ").append(toIndentedString(appointments)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    syncToken: ").append(toIndentedString(syncToken)).append("\n");
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

