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

/**
 * InfusionsoftEmailSendRequestAttachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftEmailSendRequestAttachment {
  @SerializedName("file_data")
  private String fileData = null;

  @SerializedName("file_name")
  private String fileName = null;

  public InfusionsoftEmailSendRequestAttachment fileData(String fileData) {
    this.fileData = fileData;
    return this;
  }

   /**
   * The content of the attachment, encoded in Base64
   * @return fileData
  **/
  @ApiModelProperty(value = "The content of the attachment, encoded in Base64")
  public String getFileData() {
    return fileData;
  }

  public void setFileData(String fileData) {
    this.fileData = fileData;
  }

  public InfusionsoftEmailSendRequestAttachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The filename of the attached file, including extension
   * @return fileName
  **/
  @ApiModelProperty(value = "The filename of the attached file, including extension")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftEmailSendRequestAttachment emailSendRequestAttachment = (InfusionsoftEmailSendRequestAttachment) o;
    return Objects.equals(this.fileData, emailSendRequestAttachment.fileData) &&
        Objects.equals(this.fileName, emailSendRequestAttachment.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileData, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSendRequestAttachment {\n");
    
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

