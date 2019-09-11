package com.ergossoft.serviceorder.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ergossoft.serviceorder.model.Users;

 

public interface UserRepository extends JpaRepository<Users, Integer>{

	 
	  @Query("select u from Users u where u.email=?1") List<Users>
	  findUserExist(String email);
	  
	
}
