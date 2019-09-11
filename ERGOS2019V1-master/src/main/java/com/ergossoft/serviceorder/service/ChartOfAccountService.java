package com.ergossoft.serviceorder.service;

import java.util.List;

import com.ergossoft.serviceorder.model.ChartOfAccounts;

public interface ChartOfAccountService 
{
	public List<ChartOfAccounts> getAllChartOfAccounts();

	public ChartOfAccounts getcharofaccountcode(Integer chartOfAccountId);

}
