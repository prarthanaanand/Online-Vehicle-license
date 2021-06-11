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
	private RTOOffice office;

	public RTOOfficer() {
		super();
	}

	public RTOOfficer(RTOOffice office) {
		super();
		this.office = office;
	}

	public RTOOffice getOffice() {
		return office;
	}

	public void setOffice(RTOOffice office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return "RTOOfficer [office=" + office + "]";
	}

	
	
	
		
		
}