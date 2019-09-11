package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.MarketingCampaign;
import com.ergossoft.serviceorder.model.PaymentTerms;
import com.ergossoft.serviceorder.model.PhoneType;
import com.ergossoft.serviceorder.model.Priority;
import com.ergossoft.serviceorder.model.Property;

@Repository
public interface PaymentTermsRepository extends JpaRepository<PaymentTerms, Integer>{

	@Query("select paymentTerms from PaymentTerms paymentTerms where paymentTerms.status=true")
	public List<PaymentTerms> getActivePaymentTerms();
}
