package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.UOM;

public interface UOMRepository extends JpaRepository<UOM, Integer> {

	@Query("select u from UOM u where u.status=true")
	List<UOM> getAllUOM();

}
