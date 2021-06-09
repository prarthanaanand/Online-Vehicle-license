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
	
	private long appointmentNumber;
	private LocalDate testDate;
	private LocalDateTime timeSlot;
	
	 @Enumerated(EnumType.STRING)
	private testResult testResult;
	
	@OneToOne
	private Application application;
	
	@ManyToOne
	private RTOOfficer RTOOfficer;
	
	

	
	public Appointment(Long appointmentNumber, LocalDate testDate, LocalDateTime timeSlot,
			com.vl.info.entities.testResult testResult) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
	}



	public Appointment(long appointmentNumber, com.vl.info.entities.testResult testResult) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.testResult = testResult;
	}



	



	public Appointment(LocalDate testDate, LocalDateTime timeSlot, com.vl.info.entities.testResult testResult,
			com.vl.info.entities.RTOOfficer rTOOfficer) {
		super();
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
		RTOOfficer = rTOOfficer;
	}

		

	public Appointment(long appointmentNumber, LocalDate testDate, LocalDateTime timeSlot,
			com.vl.info.entities.testResult testResult, com.vl.info.entities.RTOOfficer rTOOfficer) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
		RTOOfficer = rTOOfficer;
	}


	public long getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(long appointmentNumber) {
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


	public RTOOfficer getRTOOfficer() {
		return RTOOfficer;
	}


	public void setRTOOfficer(RTOOfficer rTOOfficer) {
		RTOOfficer = rTOOfficer;
	}


	@Override
	public String toString() {
		return "Appointment [appointmentNumber=" + appointmentNumber + ", testDate=" + testDate + ", timeSlot="
				+ timeSlot + ", testResult=" + testResult + ", RTOOfficer=" + RTOOfficer + "]";
	}

	
}
