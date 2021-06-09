package com.vl.info.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.info.entities.Application;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.Documents;
import com.vl.info.entities.DrivingLicense;
import com.vl.info.entities.LearnerLicense;
import com.vl.info.repository.LicenceRepository;
import com.vl.info.repository.UserRepository;

@Service
@Transactional 
public class LicenseServices implements ILicenseServices{
	
	@Autowired
	LicenceRepository lrepo;

	@Override
	public Appointment getAppointmentDetails(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LearnerLicense GetLicense(LearnerLicense learnerLincense) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DrivingLicense GetLicens(DrivingLicense learnerLincense) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
