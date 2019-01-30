/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardCollectionsApiService {

	PaymentWithIdAndRoot executePostPayments(String crReferenceId, Payment request);
	
	PaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, Payment request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	PaymentTermsWithIdAndRoot requestPutPaymentTerms(String crReferenceId, String bqReferenceId, PaymentTerms request);
	
	PaymentTermsWithIdAndRoot requestPostPaymentTerms(String crReferenceId, PaymentTerms request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CardCollectionsWithId retrieve(String crReferenceId);
	
	AssignmentWithIdAndRoot retrieveAssignments(String crReferenceId, String bqReferenceId);
	
	PaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	PaymentTermsWithIdAndRoot retrievePaymentTerms(String crReferenceId, String bqReferenceId);
	
	ResolutionWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId);
	
	CardCollectionsWithId update(String crReferenceId, CardCollections request);
	
}
