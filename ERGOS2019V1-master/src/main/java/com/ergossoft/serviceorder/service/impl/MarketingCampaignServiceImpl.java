package com.ergossoft.serviceorder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.dto.CommonDTO;
import com.ergossoft.serviceorder.model.MarketingCampaign;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Priority;
import com.ergossoft.serviceorder.model.Property;
import com.ergossoft.serviceorder.model.RelationshipType;
import com.ergossoft.serviceorder.repository.MarketingCampaignRepository;
import com.ergossoft.serviceorder.repository.PhoneTypeRepository;
import com.ergossoft.serviceorder.repository.PriorityRepository;
import com.ergossoft.serviceorder.repository.PropertyRepository;
import com.ergossoft.serviceorder.repository.RelationshipTypeRepository;
import com.ergossoft.serviceorder.service.MarketingCampaignService;
import com.ergossoft.serviceorder.service.PhoneTypeService;
import com.ergossoft.serviceorder.service.PriorityService;
import com.ergossoft.serviceorder.service.PropertyService;
import com.ergossoft.serviceorder.service.RelationshipTypeService;

@Service
public class MarketingCampaignServiceImpl implements MarketingCampaignService {

	@Autowired
	private MarketingCampaignRepository marketingCampaignRepo;

	@Override
	public List<CommonDTO> getAllMarketingCampaigns() {
		List<CommonDTO> commonDtoList = new ArrayList<>();
		try {

			// TO GET ONLY ACTIVE MarketingCampaign LIST
			List<MarketingCampaign> marketingCampaignsList = marketingCampaignRepo.getActiveMarketingCampaigns();

			marketingCampaignsList.forEach(marketingCampaign -> {
				commonDtoList.add(
						new CommonDTO(marketingCampaign.getMarketingcampaignId(), marketingCampaign.getDescription()));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return commonDtoList;
	}

}
