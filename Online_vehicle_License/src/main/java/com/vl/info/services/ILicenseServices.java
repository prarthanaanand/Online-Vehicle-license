package com.vl.info.services;

import org.springframework.stereotype.Service;

import com.vl.info.entities.Appointment;
import com.vl.info.entities.DrivingLicense;
import com.vl.info.entities.LearnerLicense;

@Service
public interface ILicenseServices {
	
	public Appointment getAppointmentDetails(Appointment appointment);
	public LearnerLicense GetLicense(LearnerLicense learnerLincense);
	public DrivingLicense GetLicens(DrivingLicense learnerLincense);

}