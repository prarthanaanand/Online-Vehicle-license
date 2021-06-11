package com.vl.info.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vl.info.entities.Application;
import com.vl.info.entities.ApplicationStatus;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.DrivingLicense;
import com.vl.info.entities.LearnerLicense;
import com.vl.info.entities.RTOOfficer;
@Service
public interface IRTOOfficerServices   {
	
	
	public Application getApplicationByID(Long id);
	public List<Appointment> checkForAppointments();
	//public Application updateApplicationById(Long applicationNumber);
	public Appointment updateResult(Appointment appointment);
	List<Application> getAllPendingApplications(ApplicationStatus status);
	

}