package com.vl.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vl.info.entities.Application;
import com.vl.info.entities.ApplicationStatus;

import java.util.*;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long>{

	List<Application> findByStatus(ApplicationStatus status);
	
	
}