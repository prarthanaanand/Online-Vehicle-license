package com.vl.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vl.info.entities.Applicant;
import com.vl.info.entities.Application;
import com.vl.info.entities.ApplicationType;
import com.vl.info.entities.Appointment;
import com.vl.info.services.ApplicantServices;
import com.vl.info.services.ApplicationServices;

@RestController
@RequestMapping("api/applicants")
public class ApplicantController {
	@Autowired
	private ApplicantServices applicantServices;
	@Autowired
	private ApplicationServices applicationServices;
	@PostMapping("/applicant")
	public Applicant createApplicant(@RequestBody Applicant applicant) {
		return applicantServices.addApplicant(applicant);
	}
	@PostMapping("/application")
	public ResponseEntity<Application> ApplyFor(@RequestBody Application application){
		
		Application newApplication = applicationServices.ApplyFor(application);
		return new ResponseEntity<Application>(newApplication,HttpStatus.CREATED);
	
	}
	@PatchMapping("/applicant/{id}/applications/{id}/documents")
	public ResponseEntity<Application> addDocument(@PathVariable("id") Long id,@RequestBody Application application){
		
		Application application1 = applicationServices.addDocument(id);
		
		application1.setDocuments(application.getDocuments());
		
		Application updatedApplication = applicationServices.UpdateDocument(application1);
		
		return new ResponseEntity<Application>(updatedApplication,HttpStatus.OK);
    }
	@PatchMapping("/applicant/{id}/applications/{id}/feepayment")
	public ResponseEntity<Application> addFee(@PathVariable("id") Long id,@RequestBody Application application){
		
		Application application1 = applicationServices.addFee(application.getAmountPaid());
		
		application1.setAmountPaid(application.getAmountPaid());
		
		Application updatedApplication = applicationServices.Updatefeepayment(application1);
		
		return new ResponseEntity<Application>(updatedApplication,HttpStatus.OK);
	}
	@GetMapping("/applicant/{id}/applications/{id}/Appointment")
	public ResponseEntity <Application> getAppointment(@PathVariable("id") Long id)
	{
		Application appointment =  applicationServices.getAppointment(id);
		
		return new ResponseEntity<Application>(appointment,HttpStatus.OK);
		
	
	}
	@GetMapping("/applicant/{applicantNumber}/applications/{applicationNumber}/{type}/TestResults")
	public ResponseEntity <Appointment> getResult(@PathVariable ("applicantNumber")Long applicantNumber,@PathVariable ("appicationNumber")Long applicationNumber,@PathVariable ("type") ApplicationType type)
	{
		
		
		return new ResponseEntity<Appointment>(applicantServices.findAppointmentByApplicantIdAndApplicationId(applicantNumber,applicationNumber,type),HttpStatus.OK);
	}
}