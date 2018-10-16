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
 * InfusionsoftCreateProductImage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T18:56:01.538Z")
public class InfusionsoftCreateProductImage {
  @SerializedName("checksum")
  private String checksum = null;

  @SerializedName("file_data")
  private String fileData = null;

  @SerializedName("file_name")
  private String fileName = null;

  public InfusionsoftCreateProductImage checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * SHA256 checksum of image in Hex.
   * @return checksum
  **/
  @ApiModelProperty(value = "SHA256 checksum of image in Hex.")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public InfusionsoftCreateProductImage fileData(String fileData) {
    this.fileData = fileData;
    return this;
  }

   /**
   * The image data, base64 encoded.
   * @return fileData
  **/
  @ApiModelProperty(required = true, value = "The image data, base64 encoded.")
  public String getFileData() {
    return fileData;
  }

  public void setFileData(String fileData) {
    this.fileData = fileData;
  }

  public InfusionsoftCreateProductImage fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file with extension, must match file data.  Acceptable file types:  [.png, .gif, .jpg, .jpeg].
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "The name of the file with extension, must match file data.  Acceptable file types:  [.png, .gif, .jpg, .jpeg].")
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
    InfusionsoftCreateProductImage createProductImage = (InfusionsoftCreateProductImage) o;
    return Objects.equals(this.checksum, createProductImage.checksum) &&
        Objects.equals(this.fileData, createProductImage.fileData) &&
        Objects.equals(this.fileName, createProductImage.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, fileData, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateProductImage {\n");
    
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
