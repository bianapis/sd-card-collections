/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardCollectionsApiServiceImpl implements CardCollectionsApiService {

	public PaymentWithIdAndRoot executePostPayments(String crReferenceId, Payment request){
		return JsonReader.read("executePost-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public PaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, Payment request){
		return JsonReader.read("executePut-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public PaymentTermsWithIdAndRoot requestPutPaymentTerms(String crReferenceId, String bqReferenceId, PaymentTerms request){
		return JsonReader.read("requestPut-PaymentTermsWithIdAndRoot.json",new TypeReference<PaymentTermsWithIdAndRoot>(){});
	}
	
	public PaymentTermsWithIdAndRoot requestPostPaymentTerms(String crReferenceId, PaymentTerms request){
		return JsonReader.read("requestPost-PaymentTermsWithIdAndRoot.json",new TypeReference<PaymentTermsWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardCollectionsWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardCollectionsWithId.json",new TypeReference<CardCollectionsWithId>(){});
	}
	
	public AssignmentWithIdAndRoot retrieveAssignments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssignmentWithIdAndRoot.json",new TypeReference<AssignmentWithIdAndRoot>(){});
	}
	
	public PaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentWithIdAndRoot.json",new TypeReference<PaymentWithIdAndRoot>(){});
	}
	
	public PaymentTermsWithIdAndRoot retrievePaymentTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentTermsWithIdAndRoot.json",new TypeReference<PaymentTermsWithIdAndRoot>(){});
	}
	
	public ResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ResolutionWithIdAndRoot.json",new TypeReference<ResolutionWithIdAndRoot>(){});
	}
	
	public CardCollectionsWithId update(String crReferenceId, CardCollections request){
		return JsonReader.read("update-CardCollectionsWithId.json",new TypeReference<CardCollectionsWithId>(){});
	}
	
}
