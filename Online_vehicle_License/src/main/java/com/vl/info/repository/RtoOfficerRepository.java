package com.vl.info.repository;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.vl.info.entities.Application;
	import com.vl.info.entities.DrivingLicense;
import com.vl.info.entities.LearnerLicense;
import com.vl.info.entities.RTOOfficer;
import com.vl.info.entities.User;
import com.vl.info.entities.Appointment;
@Service
	public interface RtoOfficerRepository extends JpaRepository<Appointment,Long>{
		

		public Appointment updateResult(Appointment appointment);
		

	}