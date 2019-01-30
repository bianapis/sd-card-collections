package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.validation.Valid;
  
/**
 * CardCollectionsWithId
 */
public class CardCollectionsWithId   {
  private String cardCollectionsProcessingReference = null;

  private String productInstanceReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String cardType = null;

  private String cardAccountStatus = null;

  private String cardAccountLimits = null;

  private String configurationOptions = null;

  private String taxReference = null;

  private String transactionRecordReference = null;

  private String billingTransactionReference = null;

  private String paymentTransactionReference = null;

  private String statementReference = null;

  private String cardCollectionsProcessingSchedule = null;

  private Object cardCollectionsProcessingRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return cardCollectionsProcessingReference
  **/

  @JsonGetter("cardCollectionsProcessingReference")
  public String getCardCollectionsProcessingReference() {
    return cardCollectionsProcessingReference;
  }
  
  @JsonSetter("cardCollectionsProcessingReference")
  public void setCardCollectionsProcessingReference(String cardCollectionsProcessingReference) {
    this.cardCollectionsProcessingReference = cardCollectionsProcessingReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  @JsonGetter("productInstanceReference")
  public String getProductInstanceReference() {
    return productInstanceReference;
  }
  
  @JsonSetter("productInstanceReference")
  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return productServiceReference
  **/

  @JsonGetter("productServiceReference")
  public String getProductServiceReference() {
    return productServiceReference;
  }
  
  @JsonSetter("productServiceReference")
  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  @JsonGetter("customerReference")
  public String getCustomerReference() {
    return customerReference;
  }
  
  @JsonSetter("customerReference")
  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardType
  **/

  @JsonGetter("cardType")
  public String getCardType() {
    return cardType;
  }
  
  @JsonSetter("cardType")
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAccountStatus
  **/

  @JsonGetter("cardAccountStatus")
  public String getCardAccountStatus() {
    return cardAccountStatus;
  }
  
  @JsonSetter("cardAccountStatus")
  public void setCardAccountStatus(String cardAccountStatus) {
    this.cardAccountStatus = cardAccountStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAccountLimits
  **/

  @JsonGetter("cardAccountLimits")
  public String getCardAccountLimits() {
    return cardAccountLimits;
  }
  
  @JsonSetter("cardAccountLimits")
  public void setCardAccountLimits(String cardAccountLimits) {
    this.cardAccountLimits = cardAccountLimits;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return configurationOptions
  **/

  @JsonGetter("configurationOptions")
  public String getConfigurationOptions() {
    return configurationOptions;
  }
  
  @JsonSetter("configurationOptions")
  public void setConfigurationOptions(String configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return taxReference
  **/

  @JsonGetter("taxReference")
  public String getTaxReference() {
    return taxReference;
  }
  
  @JsonSetter("taxReference")
  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return transactionRecordReference
  **/

  @JsonGetter("transactionRecordReference")
  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }
  
  @JsonSetter("transactionRecordReference")
  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return billingTransactionReference
  **/

  @JsonGetter("billingTransactionReference")
  public String getBillingTransactionReference() {
    return billingTransactionReference;
  }
  
  @JsonSetter("billingTransactionReference")
  public void setBillingTransactionReference(String billingTransactionReference) {
    this.billingTransactionReference = billingTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return paymentTransactionReference
  **/

  @JsonGetter("paymentTransactionReference")
  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }
  
  @JsonSetter("paymentTransactionReference")
  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return statementReference
  **/

  @JsonGetter("statementReference")
  public String getStatementReference() {
    return statementReference;
  }
  
  @JsonSetter("statementReference")
  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return cardCollectionsProcessingSchedule
  **/

  @JsonGetter("cardCollectionsProcessingSchedule")
  public String getCardCollectionsProcessingSchedule() {
    return cardCollectionsProcessingSchedule;
  }
  
  @JsonSetter("cardCollectionsProcessingSchedule")
  public void setCardCollectionsProcessingSchedule(String cardCollectionsProcessingSchedule) {
    this.cardCollectionsProcessingSchedule = cardCollectionsProcessingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary       
   * @return cardCollectionsProcessingRecord
  **/

  @JsonGetter("cardCollectionsProcessingRecord")
  public Object getCardCollectionsProcessingRecord() {
    return cardCollectionsProcessingRecord;
  }
  
  @JsonSetter("cardCollectionsProcessingRecord")
  public void setCardCollectionsProcessingRecord(Object cardCollectionsProcessingRecord) {
    this.cardCollectionsProcessingRecord = cardCollectionsProcessingRecord;
  }


}

