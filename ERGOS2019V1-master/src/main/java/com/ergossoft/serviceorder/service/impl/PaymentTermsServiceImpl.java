package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.MarketingCampaign;
import com.ergossoft.serviceorder.model.PaymentTerms;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Priority;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.MarketingCampaignRepository;
import com.ergossoft.serviceorder.repository.PaymentTermsRepository;
import com.ergossoft.serviceorder.repository.PhoneTypeRepository;
import com.ergossoft.serviceorder.repository.PriorityRepository;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.service.MarketingCampaignService;
import com.ergossoft.serviceorder.service.PaymentTermsService;
import com.ergossoft.serviceorder.service.PhoneTypeService;
import com.ergossoft.serviceorder.service.PriorityService;
import com.ergossoft.serviceorder.service.PropertyService;
import com.ergossoft.serviceorder.service.RelationshipTypeService;

@Service
public class PaymentTermsServiceImpl implements PaymentTermsService {

	@Autowired
	private PaymentTermsRepository paymentTermsRepo;
 
	@Override
	public List<CommonDTO> getAllPaymentTerms() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE MarketingCampaign LIST
			List<PaymentTerms> paymentTermsList = paymentTermsRepo.getActivePaymentTerms();

			paymentTermsList.forEach(paymentTerms -> {
				commonDtoList.add(
						new CommonDTO(paymentTerms.getPaymentTermId(), paymentTerms.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

}
