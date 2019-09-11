package com.ergossoft.serviceorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.MaterialSize;
@Repository
public interface MaterialSizeRepository extends JpaRepository<MaterialSize, Integer>
{
	public MaterialSize findMaterialSizeBySize(Float size);

}
