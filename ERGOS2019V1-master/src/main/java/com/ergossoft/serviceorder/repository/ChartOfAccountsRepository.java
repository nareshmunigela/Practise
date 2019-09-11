package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.ChartOfAccounts;

public interface ChartOfAccountsRepository extends JpaRepository<ChartOfAccounts, Integer> {
	@Query("select c from ChartOfAccounts c where c.status=true")
	List<ChartOfAccounts> getAllChartOfAccounts();

}
