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
 * AssignmentWithIdAndRoot
 */
public class AssignmentWithIdAndRoot   {
  private String cardCollectionsAssignmentDecisionReference = null;

  private String cardCollectionsProcessingReference = null;

  private String customerBehaviorModel = null;

  private String customerReference = null;

  private String customerCreditRatingAssessmentReference = null;

  private String customerCreditRatingAssessment = null;

  private String collectionAgencyReference = null;

  private String collectionAgencyAgreement = null;

  private Object cardCollectionsProcessingRecord = null;

  private Object cardCollectionsAssignmentDecisionRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return cardCollectionsAssignmentDecisionReference
  **/

  @JsonGetter("cardCollectionsAssignmentDecisionReference")
  public String getCardCollectionsAssignmentDecisionReference() {
    return cardCollectionsAssignmentDecisionReference;
  }
  
  @JsonSetter("cardCollectionsAssignmentDecisionReference")
  public void setCardCollectionsAssignmentDecisionReference(String cardCollectionsAssignmentDecisionReference) {
    this.cardCollectionsAssignmentDecisionReference = cardCollectionsAssignmentDecisionReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModel
  **/

  @JsonGetter("customerBehaviorModel")
  public String getCustomerBehaviorModel() {
    return customerBehaviorModel;
  }
  
  @JsonSetter("customerBehaviorModel")
  public void setCustomerBehaviorModel(String customerBehaviorModel) {
    this.customerBehaviorModel = customerBehaviorModel;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return customerCreditRatingAssessmentReference
  **/

  @JsonGetter("customerCreditRatingAssessmentReference")
  public String getCustomerCreditRatingAssessmentReference() {
    return customerCreditRatingAssessmentReference;
  }
  
  @JsonSetter("customerCreditRatingAssessmentReference")
  public void setCustomerCreditRatingAssessmentReference(String customerCreditRatingAssessmentReference) {
    this.customerCreditRatingAssessmentReference = customerCreditRatingAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return customerCreditRatingAssessment
  **/

  @JsonGetter("customerCreditRatingAssessment")
  public String getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }
  
  @JsonSetter("customerCreditRatingAssessment")
  public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return collectionAgencyReference
  **/

  @JsonGetter("collectionAgencyReference")
  public String getCollectionAgencyReference() {
    return collectionAgencyReference;
  }
  
  @JsonSetter("collectionAgencyReference")
  public void setCollectionAgencyReference(String collectionAgencyReference) {
    this.collectionAgencyReference = collectionAgencyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return collectionAgencyAgreement
  **/

  @JsonGetter("collectionAgencyAgreement")
  public String getCollectionAgencyAgreement() {
    return collectionAgencyAgreement;
  }
  
  @JsonSetter("collectionAgencyAgreement")
  public void setCollectionAgencyAgreement(String collectionAgencyAgreement) {
    this.collectionAgencyAgreement = collectionAgencyAgreement;
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
   * @return cardCollectionsAssignmentDecisionRecord
  **/

  @JsonGetter("cardCollectionsAssignmentDecisionRecord")
  public Object getCardCollectionsAssignmentDecisionRecord() {
    return cardCollectionsAssignmentDecisionRecord;
  }
  
  @JsonSetter("cardCollectionsAssignmentDecisionRecord")
  public void setCardCollectionsAssignmentDecisionRecord(Object cardCollectionsAssignmentDecisionRecord) {
    this.cardCollectionsAssignmentDecisionRecord = cardCollectionsAssignmentDecisionRecord;
  }


}

