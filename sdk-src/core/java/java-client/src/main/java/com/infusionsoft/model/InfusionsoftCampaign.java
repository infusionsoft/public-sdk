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
import com.infusionsoft.model.InfusionsoftGoal;
import com.infusionsoft.model.InfusionsoftSequence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * InfusionsoftCampaign
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-10T00:36:44.670Z")
public class InfusionsoftCampaign {
  @SerializedName("active_contact_count")
  private Integer activeContactCount = null;

  @SerializedName("completed_contact_count")
  private Integer completedContactCount = null;

  @SerializedName("created_by_global_id")
  private Long createdByGlobalId = null;

  @SerializedName("date_created")
  private OffsetDateTime dateCreated = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("goals")
  private List<InfusionsoftGoal> goals = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("published_date")
  private OffsetDateTime publishedDate = null;

  @SerializedName("published_status")
  private Boolean publishedStatus = null;

  @SerializedName("published_time_zone")
  private String publishedTimeZone = null;

  @SerializedName("sequences")
  private List<InfusionsoftSequence> sequences = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  public InfusionsoftCampaign activeContactCount(Integer activeContactCount) {
    this.activeContactCount = activeContactCount;
    return this;
  }

   /**
   * Get activeContactCount
   * @return activeContactCount
  **/
  @ApiModelProperty(value = "")
  public Integer getActiveContactCount() {
    return activeContactCount;
  }

  public void setActiveContactCount(Integer activeContactCount) {
    this.activeContactCount = activeContactCount;
  }

  public InfusionsoftCampaign completedContactCount(Integer completedContactCount) {
    this.completedContactCount = completedContactCount;
    return this;
  }

   /**
   * Get completedContactCount
   * @return completedContactCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedContactCount() {
    return completedContactCount;
  }

  public void setCompletedContactCount(Integer completedContactCount) {
    this.completedContactCount = completedContactCount;
  }

  public InfusionsoftCampaign createdByGlobalId(Long createdByGlobalId) {
    this.createdByGlobalId = createdByGlobalId;
    return this;
  }

   /**
   * Get createdByGlobalId
   * @return createdByGlobalId
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedByGlobalId() {
    return createdByGlobalId;
  }

  public void setCreatedByGlobalId(Long createdByGlobalId) {
    this.createdByGlobalId = createdByGlobalId;
  }

  public InfusionsoftCampaign dateCreated(OffsetDateTime dateCreated) {
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

  public InfusionsoftCampaign errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public InfusionsoftCampaign goals(List<InfusionsoftGoal> goals) {
    this.goals = goals;
    return this;
  }

  public InfusionsoftCampaign addGoalsItem(InfusionsoftGoal goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<InfusionsoftGoal>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftGoal> getGoals() {
    return goals;
  }

  public void setGoals(List<InfusionsoftGoal> goals) {
    this.goals = goals;
  }

  public InfusionsoftCampaign id(Long id) {
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

  public InfusionsoftCampaign locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public InfusionsoftCampaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfusionsoftCampaign publishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

   /**
   * Get publishedDate
   * @return publishedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
  }

  public InfusionsoftCampaign publishedStatus(Boolean publishedStatus) {
    this.publishedStatus = publishedStatus;
    return this;
  }

   /**
   * Get publishedStatus
   * @return publishedStatus
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublishedStatus() {
    return publishedStatus;
  }

  public void setPublishedStatus(Boolean publishedStatus) {
    this.publishedStatus = publishedStatus;
  }

  public InfusionsoftCampaign publishedTimeZone(String publishedTimeZone) {
    this.publishedTimeZone = publishedTimeZone;
    return this;
  }

   /**
   * Get publishedTimeZone
   * @return publishedTimeZone
  **/
  @ApiModelProperty(value = "")
  public String getPublishedTimeZone() {
    return publishedTimeZone;
  }

  public void setPublishedTimeZone(String publishedTimeZone) {
    this.publishedTimeZone = publishedTimeZone;
  }

  public InfusionsoftCampaign sequences(List<InfusionsoftSequence> sequences) {
    this.sequences = sequences;
    return this;
  }

  public InfusionsoftCampaign addSequencesItem(InfusionsoftSequence sequencesItem) {
    if (this.sequences == null) {
      this.sequences = new ArrayList<InfusionsoftSequence>();
    }
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * Get sequences
   * @return sequences
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftSequence> getSequences() {
    return sequences;
  }

  public void setSequences(List<InfusionsoftSequence> sequences) {
    this.sequences = sequences;
  }

  public InfusionsoftCampaign timeZone(String timeZone) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCampaign campaign = (InfusionsoftCampaign) o;
    return Objects.equals(this.activeContactCount, campaign.activeContactCount) &&
        Objects.equals(this.completedContactCount, campaign.completedContactCount) &&
        Objects.equals(this.createdByGlobalId, campaign.createdByGlobalId) &&
        Objects.equals(this.dateCreated, campaign.dateCreated) &&
        Objects.equals(this.errorMessage, campaign.errorMessage) &&
        Objects.equals(this.goals, campaign.goals) &&
        Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.locked, campaign.locked) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.publishedDate, campaign.publishedDate) &&
        Objects.equals(this.publishedStatus, campaign.publishedStatus) &&
        Objects.equals(this.publishedTimeZone, campaign.publishedTimeZone) &&
        Objects.equals(this.sequences, campaign.sequences) &&
        Objects.equals(this.timeZone, campaign.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeContactCount, completedContactCount, createdByGlobalId, dateCreated, errorMessage, goals, id, locked, name, publishedDate, publishedStatus, publishedTimeZone, sequences, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCampaign {\n");
    
    sb.append("    activeContactCount: ").append(toIndentedString(activeContactCount)).append("\n");
    sb.append("    completedContactCount: ").append(toIndentedString(completedContactCount)).append("\n");
    sb.append("    createdByGlobalId: ").append(toIndentedString(createdByGlobalId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    publishedStatus: ").append(toIndentedString(publishedStatus)).append("\n");
    sb.append("    publishedTimeZone: ").append(toIndentedString(publishedTimeZone)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

