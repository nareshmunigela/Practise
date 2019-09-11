package com.ergossoft.serviceorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.CustomerBankDetail;

public interface CustomerBankDetailRepository extends JpaRepository<CustomerBankDetail, Integer> {

	/*
	 * @Query("select c from CustomerBankDetail c where  c.accountNumber=?1 and c.customerId = ?2 "
	 * ) CustomerBankDetail findByAccNumAndCustIdAndRouNum(String accountNumber, int
	 * customerId);
	 */
}
