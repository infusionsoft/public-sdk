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
 * InfusionsoftHistoricalCounts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-28T18:08:25.347Z")
public class InfusionsoftHistoricalCounts {
  @SerializedName("24_hours")
  private Integer _24Hours = null;

  @SerializedName("30_days")
  private Integer _30Days = null;

  public InfusionsoftHistoricalCounts _24Hours(Integer _24Hours) {
    this._24Hours = _24Hours;
    return this;
  }

   /**
   * Get _24Hours
   * @return _24Hours
  **/
  @ApiModelProperty(value = "")
  public Integer get24Hours() {
    return _24Hours;
  }

  public void set24Hours(Integer _24Hours) {
    this._24Hours = _24Hours;
  }

  public InfusionsoftHistoricalCounts _30Days(Integer _30Days) {
    this._30Days = _30Days;
    return this;
  }

   /**
   * Get _30Days
   * @return _30Days
  **/
  @ApiModelProperty(value = "")
  public Integer get30Days() {
    return _30Days;
  }

  public void set30Days(Integer _30Days) {
    this._30Days = _30Days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftHistoricalCounts historicalCounts = (InfusionsoftHistoricalCounts) o;
    return Objects.equals(this._24Hours, historicalCounts._24Hours) &&
        Objects.equals(this._30Days, historicalCounts._30Days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_24Hours, _30Days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftHistoricalCounts {\n");
    
    sb.append("    _24Hours: ").append(toIndentedString(_24Hours)).append("\n");
    sb.append("    _30Days: ").append(toIndentedString(_30Days)).append("\n");
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

