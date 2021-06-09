package com.vl.info.entities;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Embeddable
public class Address 
{

	private String Housenumber;
	private String city;
	private Long pincode;
	private String Street;
	@OneToOne
	private Applicant applicants;
	
	public Address() {
		super();
	}

	
	public Address(String housenumber, String city, Long pincode, String street, Applicant applicants) {
		super();
		Housenumber = housenumber;
		this.city = city;
		this.pincode = pincode;
		Street = street;
		this.applicants = applicants;
	}

	public Address(String housenumber, String city, Long pincode, String street) {
		super();
		Housenumber = housenumber;
		this.city = city;
		this.pincode = pincode;
		Street = street;
	}


	public String getHousenumber() {
		return Housenumber;
	}

	public void setHouse_number(String housenumber) {
		Housenumber = housenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPincode() {
		return pincode;
	}

	

	public void setPin_code(Long pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public Applicant getApplicants() {
		return applicants;
	}

	public void setApplicants(Applicant applicants) {
		this.applicants = applicants;
	}


	@Override
	public String toString() {
		return "Address [Housenumber=" + Housenumber + ", city=" + city + ", pincode=" + pincode + ", Street=" + Street
				+ ", applicants=" + applicants + "]";
	}
	

}	