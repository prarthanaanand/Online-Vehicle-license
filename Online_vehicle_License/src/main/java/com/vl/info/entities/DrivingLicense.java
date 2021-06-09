package com.vl.info.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="DrivingLicense")
public class DrivingLicense 
{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long drivingLicenseNumber;
		
		@OneToOne
		private Application application;
		private LocalDate dateOfIssue;
		private LocalDate validTill;
		@ManyToOne
		private RTOOffice issuedBy;
		
		public DrivingLicense() {
			super();
		}

		public DrivingLicense(long drivingLicenseNumber, Application application, LocalDate dateOfIssue,
				LocalDate validTill, RTOOffice issuedBy) {
			super();
			this.drivingLicenseNumber = drivingLicenseNumber;
			this.application = application;
			this.dateOfIssue = dateOfIssue;
			this.validTill = validTill;
			this.issuedBy = issuedBy;
		}

		public DrivingLicense(Application application, LocalDate dateOfIssue, LocalDate validTill, RTOOffice issuedBy) {
			super();
			this.application = application;
			this.dateOfIssue = dateOfIssue;
			this.validTill = validTill;
			this.issuedBy = issuedBy;
		}

		public long getDrivingLicenseNumber() {
			return drivingLicenseNumber;
		}

		public void setDrivingLicenseNumber(long drivingLicenseNumber) {
			this.drivingLicenseNumber = drivingLicenseNumber;
		}

		public Application getApplication() {
			return application;
		}

		public void setApplication(Application application) {
			this.application = application;
		}

		public LocalDate getDateOfIssue() {
			return dateOfIssue;
		}

		public void setDateOfIssue(LocalDate dateOfIssue) {
			this.dateOfIssue = dateOfIssue;
		}

		public LocalDate getValidTill() {
			return validTill;
		}

		public void setValidTill(LocalDate validTill) {
			this.validTill = validTill;
		}

		public RTOOffice getIssuedBy() {
			return issuedBy;
		}

		public void setIssuedBy(RTOOffice issuedBy) {
			this.issuedBy = issuedBy;
		}

		@Override
		public String toString() {
			return "DrivingLicense [drivingLicenseNumber=" + drivingLicenseNumber + ", application=" + application
					+ ", dateOfIssue=" + dateOfIssue + ", validTill=" + validTill + ", issuedBy=" + issuedBy + "]";
		}
		
	
		
}		