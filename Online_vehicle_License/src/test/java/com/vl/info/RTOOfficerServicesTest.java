package com.vl.info;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sun.xml.txw2.Document;
import com.vl.info.entities.Address;
import com.vl.info.entities.Applicant;
import com.vl.info.entities.Application;
import com.vl.info.entities.ApplicationStatus;
import com.vl.info.entities.ApplicationType;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.RTOOfficer;
import com.vl.info.entities.Role;
import com.vl.info.entities.User;
import com.vl.info.entities.VehicleType;
import com.vl.info.entities.testResult;
import com.vl.info.entities.Documents;
import com.vl.info.entities.Gender;
import com.vl.info.entities.ModeOfPayment;
import com.vl.info.entities.Nationality;
import com.vl.info.entities.PaymentStatus;
import com.vl.info.entities.RTOOffice;
import com.vl.info.repository.ApplicantRepository;
import com.vl.info.repository.ApplicationRepository;
import com.vl.info.repository.RtoOfficerRepository;
import com.vl.info.repository.UserRepository;
import com.vl.info.services.ApplicationServices;
import com.vl.info.services.RTOOfficerServices;

@SpringBootTest
public class RTOOfficerServicesTest {
	@Mock
	ApplicationRepository apprepo;
	@Mock
	ApplicantRepository applicantrepo;
	@Mock
	UserRepository userrepo;
	
	@Mock
	RtoOfficerRepository rtorepo;
	
	
	@InjectMocks
	private RTOOfficerServices rtoofficerservice;
	
	

	
	@Test
	public void updateApplicationById()//Long applicationNumber);
	{

		final Application app3 = new Application(1L, LocalDate.now(), ApplicationType.DL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.APPROVED, "No");		
		 final Application app4 = new Application(1L, LocalDate.now(), ApplicationType.LL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.APPROVED, "No");

		when(apprepo.findById(1L)).thenReturn(Optional.of(app3));
		when(apprepo.save(app3)).thenReturn(app4);
		assertEquals(app4,rtoofficerservice.updateApplicationById(1L));
	}
	
	
	@Test
	public void getAllPendingApplications()
	{
		Application app3 = new Application(1L, LocalDate.now(), ApplicationType.DL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.PENDING, "No");		
		//when(rtorepo.getAllPendingApplications(app3.getStatus.)).
	assertEquals(app3, rtoofficerservice.getAllPendingApplications());
	}
	
	@Test
	public void getAllRejectedApplications()
	{
		Application app3 = new Application(1L, LocalDate.now(), ApplicationType.DL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.REJECTED, "No");		
		//when(rtorepo.getAllPendingApplications(app3.getStatus.)).
	assertEquals(app3, rtoofficerservice.getAllRejectedApplications());
	}

	@Test
	public void getAllApprovedApplications()
	{
		Application app3 = new Application(1L, LocalDate.now(), ApplicationType.DL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.REJECTED, "No");		
		//when(rtorepo.getAllPendingApplications(app3.getStatus.)).
	assertEquals(app3, rtoofficerservice.getAllApprovedApplications());
	}
	
//	@Test
//    public void updateResultTest()
//	{
//		final Appointment apt1 = new Appointment(12L, testResult.Pass);
//		final Appointment apt2 = new Appointment(12L, testResult.Pass);
//
//		when(apprepo.findById(12L)).thenReturn(Optional.of(apt1));
//		when(apprepo.save(apt1)).thenReturn(apt2);
//		assertEquals(apt2,rtoofficerservice.updateResult(apt1));
//	}

}
