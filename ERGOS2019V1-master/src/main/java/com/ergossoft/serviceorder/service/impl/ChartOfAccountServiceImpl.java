package com.ergossoft.serviceorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ergossoft.serviceorder.model.ChartOfAccounts;
import com.ergossoft.serviceorder.repository.ChartOfAccountsRepository;
import com.ergossoft.serviceorder.service.ChartOfAccountService;
@Service
public class ChartOfAccountServiceImpl implements ChartOfAccountService 
{
@Autowired
private ChartOfAccountsRepository chartOfAccountsrepository;
	@Override
	public List<ChartOfAccounts> getAllChartOfAccounts() {
		// TODO Auto-generated method stub
		return chartOfAccountsrepository.getAllChartOfAccounts();
	}
 
	public ChartOfAccounts getcharofaccountcode(Integer chartOfAccountId) {
		// TODO Auto-generated method stub
		return chartOfAccountsrepository.findById(chartOfAccountId).get();
	}
	
 
}
