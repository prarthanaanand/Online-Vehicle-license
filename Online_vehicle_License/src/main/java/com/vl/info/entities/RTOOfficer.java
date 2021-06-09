package com.vl.info.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RTO_Officer_OVL")
public class RTOOfficer extends User 
{
	@OneToOne
	private Applicant applicant;
	
	@OneToOne
	private Appointment appointment;
	
	@OneToOne
	private RTOOffice office;

	

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public RTOOffice getOffice() {
		return office;
	}

	public void setOffice(RTOOffice office) {
		this.office = office;
	}

	
	public RTOOfficer() {
		super();
	}

	public RTOOfficer(RTOOffice office) {
		super();
		this.office = office;
	}
	
	public RTOOfficer( Appointment appointment) {
		super();
		this.appointment = appointment;
	}

	public RTOOfficer(Applicant applicant) {
		super();
		this.applicant = applicant;
	}

	@Override
	public String toString() {
		return "RTOOfficer [office=" + office + "]";
	}

	
	
	
		
		
}