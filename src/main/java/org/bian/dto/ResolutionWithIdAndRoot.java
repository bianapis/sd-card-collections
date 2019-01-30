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
 * ResolutionWithIdAndRoot
 */
public class ResolutionWithIdAndRoot   {
  private String cardCollectionsResolutionReference = null;

  private String cardCollectionsProcessingReference = null;

  private Object cardCollectionsProcessingRecord = null;

  private String cardCollectionsProcessingSchedule = null;

  private Object cardCollectionsResolutionDecisionRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardCollectionsResolutionReference
  **/

  @JsonGetter("cardCollectionsResolutionReference")
  public String getCardCollectionsResolutionReference() {
    return cardCollectionsResolutionReference;
  }
  
  @JsonSetter("cardCollectionsResolutionReference")
  public void setCardCollectionsResolutionReference(String cardCollectionsResolutionReference) {
    this.cardCollectionsResolutionReference = cardCollectionsResolutionReference;
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
   * @return cardCollectionsResolutionDecisionRecord
  **/

  @JsonGetter("cardCollectionsResolutionDecisionRecord")
  public Object getCardCollectionsResolutionDecisionRecord() {
    return cardCollectionsResolutionDecisionRecord;
  }
  
  @JsonSetter("cardCollectionsResolutionDecisionRecord")
  public void setCardCollectionsResolutionDecisionRecord(Object cardCollectionsResolutionDecisionRecord) {
    this.cardCollectionsResolutionDecisionRecord = cardCollectionsResolutionDecisionRecord;
  }


}

