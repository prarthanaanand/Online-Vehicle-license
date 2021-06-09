package com.vl.info;

import static org.mockito.Mockito.when;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;

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
	public void getApplicationByIdTest() {
		
		Application app = new Application(1L);
		when(apprepo.getById(1L)).thenReturn(app);
		Assertions.assertEquals(app, rtoofficerservice.getApplicationByID(1L));
	}
	
	
	@Test
	public void getAllPendingApplicationsTest()
	{
		Application app3 = new Application(1L, LocalDate.now(), ApplicationType.DL, ModeOfPayment.UPI, 1500, PaymentStatus.Approved, ApplicationStatus.PENDING, "No");		
		//when(rtorepo.getAllPendingApplications(app3.getStatus.)).
	Assertions.assertEquals(app3, rtoofficerservice.getAllPendingApplications(ApplicationStatus.PENDING));
	}
	
	@Test
	public void checkForAppointmentstest() {
		
		List<Appointment> appo = new ArrayList<Appointment>();
		appo.add(new Appointment(1L));
		appo.add(new Appointment(2L));
     when(rtorepo.findAll()).thenReturn(appo);
     Assertions.assertEquals(2, rtoofficerservice.checkForAppointments().size());
}
	@Test
    public void updateResultTest()
	{
		final Appointment apt1 = new Appointment(12L, testResult.Pass);
		final Appointment apt2 = new Appointment(12L, testResult.Pass);

		when(rtorepo.findById(12L)).thenReturn(Optional.of(apt1));
		when(rtorepo.save(apt1)).thenReturn(apt2);
		Assertions.assertEquals(apt2,rtoofficerservice.updateResult(apt1));
	}

}
