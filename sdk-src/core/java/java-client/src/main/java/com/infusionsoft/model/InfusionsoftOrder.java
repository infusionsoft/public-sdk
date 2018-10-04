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
import com.infusionsoft.model.InfusionsoftAddressInformation;
import com.infusionsoft.model.InfusionsoftOrderContactDetails;
import com.infusionsoft.model.InfusionsoftOrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T18:28:33.684Z")
public class InfusionsoftOrder {
  @SerializedName("contact")
  private InfusionsoftOrderContactDetails contact = null;

  @SerializedName("creation_date")
  private String creationDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lead_affiliate_id")
  private Long leadAffiliateId = null;

  @SerializedName("modification_date")
  private String modificationDate = null;

  @SerializedName("order_date")
  private String orderDate = null;

  @SerializedName("order_items")
  private List<InfusionsoftOrderItem> orderItems = null;

  @SerializedName("recurring")
  private Boolean recurring = null;

  @SerializedName("refund_total")
  private Double refundTotal = null;

  @SerializedName("sales_affiliate_id")
  private Long salesAffiliateId = null;

  @SerializedName("shipping_information")
  private InfusionsoftAddressInformation shippingInformation = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("total")
  private Double total = null;

  @SerializedName("total_due")
  private Double totalDue = null;

  @SerializedName("total_paid")
  private Double totalPaid = null;

  public InfusionsoftOrder contact(InfusionsoftOrderContactDetails contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftOrderContactDetails getContact() {
    return contact;
  }

  public void setContact(InfusionsoftOrderContactDetails contact) {
    this.contact = contact;
  }

  public InfusionsoftOrder creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public InfusionsoftOrder id(Long id) {
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

  public InfusionsoftOrder leadAffiliateId(Long leadAffiliateId) {
    this.leadAffiliateId = leadAffiliateId;
    return this;
  }

   /**
   * Get leadAffiliateId
   * @return leadAffiliateId
  **/
  @ApiModelProperty(value = "")
  public Long getLeadAffiliateId() {
    return leadAffiliateId;
  }

  public void setLeadAffiliateId(Long leadAffiliateId) {
    this.leadAffiliateId = leadAffiliateId;
  }

  public InfusionsoftOrder modificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @ApiModelProperty(value = "")
  public String getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
  }

  public InfusionsoftOrder orderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(value = "")
  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public InfusionsoftOrder orderItems(List<InfusionsoftOrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public InfusionsoftOrder addOrderItemsItem(InfusionsoftOrderItem orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<InfusionsoftOrderItem>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftOrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<InfusionsoftOrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public InfusionsoftOrder recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @ApiModelProperty(value = "")
  public Boolean isRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }

  public InfusionsoftOrder refundTotal(Double refundTotal) {
    this.refundTotal = refundTotal;
    return this;
  }

   /**
   * Get refundTotal
   * @return refundTotal
  **/
  @ApiModelProperty(value = "")
  public Double getRefundTotal() {
    return refundTotal;
  }

  public void setRefundTotal(Double refundTotal) {
    this.refundTotal = refundTotal;
  }

  public InfusionsoftOrder salesAffiliateId(Long salesAffiliateId) {
    this.salesAffiliateId = salesAffiliateId;
    return this;
  }

   /**
   * Get salesAffiliateId
   * @return salesAffiliateId
  **/
  @ApiModelProperty(value = "")
  public Long getSalesAffiliateId() {
    return salesAffiliateId;
  }

  public void setSalesAffiliateId(Long salesAffiliateId) {
    this.salesAffiliateId = salesAffiliateId;
  }

  public InfusionsoftOrder shippingInformation(InfusionsoftAddressInformation shippingInformation) {
    this.shippingInformation = shippingInformation;
    return this;
  }

   /**
   * Get shippingInformation
   * @return shippingInformation
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftAddressInformation getShippingInformation() {
    return shippingInformation;
  }

  public void setShippingInformation(InfusionsoftAddressInformation shippingInformation) {
    this.shippingInformation = shippingInformation;
  }

  public InfusionsoftOrder status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InfusionsoftOrder title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InfusionsoftOrder total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public InfusionsoftOrder totalDue(Double totalDue) {
    this.totalDue = totalDue;
    return this;
  }

   /**
   * Get totalDue
   * @return totalDue
  **/
  @ApiModelProperty(value = "")
  public Double getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Double totalDue) {
    this.totalDue = totalDue;
  }

  public InfusionsoftOrder totalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

   /**
   * Get totalPaid
   * @return totalPaid
  **/
  @ApiModelProperty(value = "")
  public Double getTotalPaid() {
    return totalPaid;
  }

  public void setTotalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftOrder order = (InfusionsoftOrder) o;
    return Objects.equals(this.contact, order.contact) &&
        Objects.equals(this.creationDate, order.creationDate) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.leadAffiliateId, order.leadAffiliateId) &&
        Objects.equals(this.modificationDate, order.modificationDate) &&
        Objects.equals(this.orderDate, order.orderDate) &&
        Objects.equals(this.orderItems, order.orderItems) &&
        Objects.equals(this.recurring, order.recurring) &&
        Objects.equals(this.refundTotal, order.refundTotal) &&
        Objects.equals(this.salesAffiliateId, order.salesAffiliateId) &&
        Objects.equals(this.shippingInformation, order.shippingInformation) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.title, order.title) &&
        Objects.equals(this.total, order.total) &&
        Objects.equals(this.totalDue, order.totalDue) &&
        Objects.equals(this.totalPaid, order.totalPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, creationDate, id, leadAffiliateId, modificationDate, orderDate, orderItems, recurring, refundTotal, salesAffiliateId, shippingInformation, status, title, total, totalDue, totalPaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftOrder {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leadAffiliateId: ").append(toIndentedString(leadAffiliateId)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    refundTotal: ").append(toIndentedString(refundTotal)).append("\n");
    sb.append("    salesAffiliateId: ").append(toIndentedString(salesAffiliateId)).append("\n");
    sb.append("    shippingInformation: ").append(toIndentedString(shippingInformation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
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

