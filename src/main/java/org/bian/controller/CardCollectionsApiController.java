/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardCollectionsApiController {

	@Autowired
	CardCollectionsApiService service;
	
	@BQ("payments")
	@Process.ExecutePost
	public BianResponse<PaymentWithIdAndRoot> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Payment> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Process.ExecutePut
	public BianResponse<PaymentWithIdAndRoot> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Payment> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment-terms")
	@Process.RequestPut
	public BianResponse<PaymentTermsWithIdAndRoot> requestPutPaymentTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<PaymentTerms> bianRequest) {
		return BianResponse.forSuccess(service.requestPutPaymentTerms(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payment-terms")
	@Process.RequestPost
	public BianResponse<PaymentTermsWithIdAndRoot> requestPostPaymentTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentTerms> bianRequest) {
		return BianResponse.forSuccess(service.requestPostPaymentTerms(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Process.Retrieve
	public BianResponse<CardCollectionsWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("assignments")
	@Process.Retrieve
	public BianResponse<AssignmentWithIdAndRoot> retrieveAssignments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignments(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Process.Retrieve
	public BianResponse<PaymentWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@BQ("payment-terms")
	@Process.Retrieve
	public BianResponse<PaymentTermsWithIdAndRoot> retrievePaymentTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePaymentTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("resolutions")
	@Process.Retrieve
	public BianResponse<ResolutionWithIdAndRoot> retrieveResolutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<CardCollectionsWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardCollections> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
