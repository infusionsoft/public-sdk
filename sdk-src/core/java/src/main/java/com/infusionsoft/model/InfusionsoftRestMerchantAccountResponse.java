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
import com.infusionsoft.model.InfusionsoftMerchant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftRestMerchantAccountResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-16T18:56:01.538Z")
public class InfusionsoftRestMerchantAccountResponse {
  @SerializedName("default_merchant_account")
  private Long defaultMerchantAccount = null;

  @SerializedName("merchant_accounts")
  private List<InfusionsoftMerchant> merchantAccounts = null;

  public InfusionsoftRestMerchantAccountResponse defaultMerchantAccount(Long defaultMerchantAccount) {
    this.defaultMerchantAccount = defaultMerchantAccount;
    return this;
  }

   /**
   * Get defaultMerchantAccount
   * @return defaultMerchantAccount
  **/
  @ApiModelProperty(value = "")
  public Long getDefaultMerchantAccount() {
    return defaultMerchantAccount;
  }

  public void setDefaultMerchantAccount(Long defaultMerchantAccount) {
    this.defaultMerchantAccount = defaultMerchantAccount;
  }

  public InfusionsoftRestMerchantAccountResponse merchantAccounts(List<InfusionsoftMerchant> merchantAccounts) {
    this.merchantAccounts = merchantAccounts;
    return this;
  }

  public InfusionsoftRestMerchantAccountResponse addMerchantAccountsItem(InfusionsoftMerchant merchantAccountsItem) {
    if (this.merchantAccounts == null) {
      this.merchantAccounts = new ArrayList<InfusionsoftMerchant>();
    }
    this.merchantAccounts.add(merchantAccountsItem);
    return this;
  }

   /**
   * Get merchantAccounts
   * @return merchantAccounts
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftMerchant> getMerchantAccounts() {
    return merchantAccounts;
  }

  public void setMerchantAccounts(List<InfusionsoftMerchant> merchantAccounts) {
    this.merchantAccounts = merchantAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftRestMerchantAccountResponse restMerchantAccountResponse = (InfusionsoftRestMerchantAccountResponse) o;
    return Objects.equals(this.defaultMerchantAccount, restMerchantAccountResponse.defaultMerchantAccount) &&
        Objects.equals(this.merchantAccounts, restMerchantAccountResponse.merchantAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMerchantAccount, merchantAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftRestMerchantAccountResponse {\n");
    
    sb.append("    defaultMerchantAccount: ").append(toIndentedString(defaultMerchantAccount)).append("\n");
    sb.append("    merchantAccounts: ").append(toIndentedString(merchantAccounts)).append("\n");
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

