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
 * PaymentWithIdAndRoot
 */
public class PaymentWithIdAndRoot   {
  private String cardCollectionsPaymentNotificationReference = null;

  private String cardCollectionsProcessingReference = null;

  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private Object cardCollectionsProcessingRecord = null;

  private Object cardCollectionsPaymentNotificationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardCollectionsPaymentNotificationReference
  **/

  @JsonGetter("cardCollectionsPaymentNotificationReference")
  public String getCardCollectionsPaymentNotificationReference() {
    return cardCollectionsPaymentNotificationReference;
  }
  
  @JsonSetter("cardCollectionsPaymentNotificationReference")
  public void setCardCollectionsPaymentNotificationReference(String cardCollectionsPaymentNotificationReference) {
    this.cardCollectionsPaymentNotificationReference = cardCollectionsPaymentNotificationReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return paymentTransaction
  **/

  @JsonGetter("paymentTransaction")
  public String getPaymentTransaction() {
    return paymentTransaction;
  }
  
  @JsonSetter("paymentTransaction")
  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary   
   * @return cardCollectionsPaymentNotificationRecord
  **/

  @JsonGetter("cardCollectionsPaymentNotificationRecord")
  public Object getCardCollectionsPaymentNotificationRecord() {
    return cardCollectionsPaymentNotificationRecord;
  }
  
  @JsonSetter("cardCollectionsPaymentNotificationRecord")
  public void setCardCollectionsPaymentNotificationRecord(Object cardCollectionsPaymentNotificationRecord) {
    this.cardCollectionsPaymentNotificationRecord = cardCollectionsPaymentNotificationRecord;
  }


}

