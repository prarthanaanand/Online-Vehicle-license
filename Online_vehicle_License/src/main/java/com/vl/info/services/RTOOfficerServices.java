package com.vl.info.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.info.entities.Application;
import com.vl.info.entities.ApplicationStatus;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.DrivingLicense;
import com.vl.info.entities.LearnerLicense;
import com.vl.info.entities.RTOOfficer;
import com.vl.info.repository.ApplicationRepository;
import com.vl.info.repository.RtoOfficerRepository;
import com.vl.info.services.UserServices;

@Transactional 

@Service

public class RTOOfficerServices implements IRTOOfficerServices {


	@Autowired
	private RtoOfficerRepository rtorepo;

	@Autowired
	private ApplicationRepository apprepo;
	
	@Override
	public Application getApplicationByID(Long id) {
		// TODO Auto-generated method stub
		return apprepo.findById(1L).get();
	}

	
	@Override
	public List<Application> getAllPendingApplications(ApplicationStatus status) {
		// TODO Auto-generated method stub
		return apprepo.findByStatus(status);
	}


	@Override
	public Appointment updateResult(Appointment appointment) {
		// TODO Auto-generated method stub
		return rtorepo.updateResult(appointment);
	}


	@Override
	public List<Appointment> checkForAppointments() {
		// TODO Auto-generated method stub
		return rtorepo.findAll();
	}

	
	
}
