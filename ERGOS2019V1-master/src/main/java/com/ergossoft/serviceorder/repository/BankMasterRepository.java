package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.BankMaster;

@Repository
public interface BankMasterRepository extends JpaRepository<BankMaster, Integer>{

	@Query("select bankMaster from BankMaster bankMaster where bankMaster.status=true")
	public List<BankMaster> getActiveBankMasters();
}
