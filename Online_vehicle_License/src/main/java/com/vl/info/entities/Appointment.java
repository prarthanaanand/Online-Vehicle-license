package com.vl.info.entities;


import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Appointment_OVL")
public class Appointment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long appointmentNumber;
	private LocalDate testDate;
	private LocalDateTime timeSlot;
	
	 @Enumerated(EnumType.STRING)
	private testResult testResult;
	
	@OneToOne
	private Application application;
	
	@OneToOne(mappedBy = "rTOOfficer")
	private RTOOfficer rTOOfficer;

	public Long getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(Long appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public LocalDate getTestDate() {
		return testDate;
	}

	public void setTestDate(LocalDate testDate) {
		this.testDate = testDate;
	}

	public LocalDateTime getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(LocalDateTime timeSlot) {
		this.timeSlot = timeSlot;
	}

	public testResult getTestResult() {
		return testResult;
	}

	public void setTestResult(testResult testResult) {
		this.testResult = testResult;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public RTOOfficer getrTOOfficer() {
		return rTOOfficer;
	}

	public void setrTOOfficer(RTOOfficer rTOOfficer) {
		this.rTOOfficer = rTOOfficer;
	}

	public Appointment(Long appointmentNumber, LocalDate testDate, LocalDateTime timeSlot,
			com.vl.info.entities.testResult testResult, Application application, RTOOfficer rTOOfficer) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
		this.application = application;
		this.rTOOfficer = rTOOfficer;
	}

	public Appointment(LocalDate testDate, LocalDateTime timeSlot, com.vl.info.entities.testResult testResult,
			Application application) {
		super();
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
		this.application = application;
	}

	public Appointment(RTOOfficer rTOOfficer) {
		super();
		this.rTOOfficer = rTOOfficer;
	}

	public Appointment(Application application) {
		super();
		this.application = application;
	}

	public Appointment(Long appointmentNumber) {
		super();
		this.appointmentNumber = appointmentNumber;
	}

	public Appointment(Long appointmentNumber, com.vl.info.entities.testResult testResult) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.testResult = testResult;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentNumber=" + appointmentNumber + ", testDate=" + testDate + ", timeSlot="
				+ timeSlot + ", testResult=" + testResult + ", application=" + application + ", rTOOfficer="
				+ rTOOfficer + "]";
	}
	
	

	
	
}
