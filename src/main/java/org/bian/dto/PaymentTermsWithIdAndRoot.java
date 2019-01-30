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
 * PaymentTermsWithIdAndRoot
 */
public class PaymentTermsWithIdAndRoot   {
  private String cardCollectionsPaymentTermsRenegotiationReference = null;

  private String cardCollectionsProcessingReference = null;

  private String configurationOptions = null;

  private String correspondenceReference = null;

  private String correspondenceContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private Object cardCollectionsProcessingRecord = null;

  private Object cardCollectionsPaymentTermsRenegotiationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return cardCollectionsPaymentTermsRenegotiationReference
  **/

  @JsonGetter("cardCollectionsPaymentTermsRenegotiationReference")
  public String getCardCollectionsPaymentTermsRenegotiationReference() {
    return cardCollectionsPaymentTermsRenegotiationReference;
  }
  
  @JsonSetter("cardCollectionsPaymentTermsRenegotiationReference")
  public void setCardCollectionsPaymentTermsRenegotiationReference(String cardCollectionsPaymentTermsRenegotiationReference) {
    this.cardCollectionsPaymentTermsRenegotiationReference = cardCollectionsPaymentTermsRenegotiationReference;
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
   * @return correspondenceReference
  **/

  @JsonGetter("correspondenceReference")
  public String getCorrespondenceReference() {
    return correspondenceReference;
  }
  
  @JsonSetter("correspondenceReference")
  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondenceContent
  **/

  @JsonGetter("correspondenceContent")
  public String getCorrespondenceContent() {
    return correspondenceContent;
  }
  
  @JsonSetter("correspondenceContent")
  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return documentReference
  **/

  @JsonGetter("documentReference")
  public String getDocumentReference() {
    return documentReference;
  }
  
  @JsonSetter("documentReference")
  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return documentContent
  **/

  @JsonGetter("documentContent")
  public String getDocumentContent() {
    return documentContent;
  }
  
  @JsonSetter("documentContent")
  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
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
   * @return cardCollectionsPaymentTermsRenegotiationRecord
  **/

  @JsonGetter("cardCollectionsPaymentTermsRenegotiationRecord")
  public Object getCardCollectionsPaymentTermsRenegotiationRecord() {
    return cardCollectionsPaymentTermsRenegotiationRecord;
  }
  
  @JsonSetter("cardCollectionsPaymentTermsRenegotiationRecord")
  public void setCardCollectionsPaymentTermsRenegotiationRecord(Object cardCollectionsPaymentTermsRenegotiationRecord) {
    this.cardCollectionsPaymentTermsRenegotiationRecord = cardCollectionsPaymentTermsRenegotiationRecord;
  }


}

