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
 * RecordRequest
 */
public class RecordRequest   {
  private String recordingRecordType = null;

  private Object recordingRecord = null;

  private String recordingRecordDateTime = null;

  private String empolyeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return recordingRecordType
  **/

  @JsonGetter("recordingRecordType")
  public String getRecordingRecordType() {
    return recordingRecordType;
  }
  
  @JsonSetter("recordingRecordType")
  public void setRecordingRecordType(String recordingRecordType) {
    this.recordingRecordType = recordingRecordType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return recordingRecord
  **/

  @JsonGetter("recordingRecord")
  public Object getRecordingRecord() {
    return recordingRecord;
  }
  
  @JsonSetter("recordingRecord")
  public void setRecordingRecord(Object recordingRecord) {
    this.recordingRecord = recordingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  
   * @return recordingRecordDateTime
  **/

  @JsonGetter("recordingRecordDateTime")
  public String getRecordingRecordDateTime() {
    return recordingRecordDateTime;
  }
  
  @JsonSetter("recordingRecordDateTime")
  public void setRecordingRecordDateTime(String recordingRecordDateTime) {
    this.recordingRecordDateTime = recordingRecordDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier        
   * @return empolyeeBusinessUnitReference
  **/

  @JsonGetter("empolyeeBusinessUnitReference")
  public String getEmpolyeeBusinessUnitReference() {
    return empolyeeBusinessUnitReference;
  }
  
  @JsonSetter("empolyeeBusinessUnitReference")
  public void setEmpolyeeBusinessUnitReference(String empolyeeBusinessUnitReference) {
    this.empolyeeBusinessUnitReference = empolyeeBusinessUnitReference;
  }


}

