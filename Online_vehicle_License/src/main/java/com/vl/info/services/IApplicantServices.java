package com.vl.info.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.info.entities.Applicant;
import com.vl.info.entities.ApplicationType;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.Gender;
import com.vl.info.repository.ApplicantRepository;
@Service
public interface IApplicantServices {
	public Applicant addApplicant(Applicant applicant);

	public Appointment findAppointmentByApplicantIdAndApplicationId(Long applicantNumber, Long applicationNumber,
			ApplicationType type);
	
}