package com.vl.info.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Applicant_OVL")
	public class Applicant extends User
	{
		
	    private Gender gender;
	    private LocalDate dateOfBirth;
	    private LocalDate placeOfBirth;
	    private String qualification;
	    
	    @OneToOne(mappedBy = "application")
	    private Application application;

		@Enumerated(EnumType.STRING)
	    private Nationality  nationality;
	    
	    @Embedded
	    private List<Address> Address;
	    
	    @Enumerated(EnumType.STRING)
	    private VehicleType vehicleType;
	    private String vehicleNumber;
	    	    
	    public Applicant() {
			super();
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public LocalDate getPlaceOfBirth() {
			return placeOfBirth;
		}

		public void setPlaceOfBirth(LocalDate placeOfBirth) {
			this.placeOfBirth = placeOfBirth;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		
		 public Application getApplication() {
				return application;
			}

			public void setApplication(Application application) {
				this.application = application;
			}

		public Nationality getNationality() {
			return nationality;
		}

		public void setNationality(Nationality nationality) {
			this.nationality = nationality;
		}

		public List<Address> getAddress() {
			return Address;
		}

		public void setAddress(List<Address> address) {
			Address = address;
		}

		public VehicleType getVehicleType() {
			return vehicleType;
		}

		public void setVehicleType(VehicleType vehicleType) {
			this.vehicleType = vehicleType;
		}

		public String getVehicleNumber() {
			return vehicleNumber;
		}

		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}

		public Applicant(Gender gender, LocalDate dateOfBirth, LocalDate placeOfBirth, String qualification,
				Nationality nationality, List<com.vl.info.entities.Address> address, VehicleType vehicleType,
				String vehicleNumber) {
			super();
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
			this.placeOfBirth = placeOfBirth;
			this.qualification = qualification;
			this.nationality = nationality;
			Address = address;
			this.vehicleType = vehicleType;
			this.vehicleNumber = vehicleNumber;
		}

		

		

		
		public Applicant(Long id, com.vl.info.entities.Role role, String username, String email, Long mobilenumber,
				String password, Gender gender, LocalDate dateOfBirth, LocalDate placeOfBirth, String qualification,
				Application application, Nationality nationality, List<com.vl.info.entities.Address> address,
				VehicleType vehicleType, String vehicleNumber) {
			super();
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
			this.placeOfBirth = placeOfBirth;
			this.qualification = qualification;
			this.application = application;
			this.nationality = nationality;
			Address = address;
			this.vehicleType = vehicleType;
			this.vehicleNumber = vehicleNumber;
		}

		public Applicant( LocalDate dateOfBirth, String qualification, Nationality nationality,
				VehicleType vehicleType, String vehicleNumber) {
			super();
			this.dateOfBirth = dateOfBirth;
			this.qualification = qualification;
			this.nationality = nationality;
			this.vehicleType = vehicleType;
			this.vehicleNumber = vehicleNumber;
		}

		
		public Applicant( Application application) {
			super();
			this.application = application;
		}

		@Override
		public String toString() {
			return "Applicant [gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth
					+ ", qualification=" + qualification + ", nationality=" + nationality + ", Address=" + Address
					+ ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
		}

		
		

}		