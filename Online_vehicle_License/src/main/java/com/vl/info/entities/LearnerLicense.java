package com.vl.info.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="LearnerLicense_OVL")
public class LearnerLicense {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long LLNumber;
		
		@OneToOne
		private Application application;
		private LocalDate dateOfIssue;
		private LocalDate validTill;
	
	
		@ManyToOne
		private RTOOffice issuedBy;


		public LearnerLicense() {
			super();
			// TODO Auto-generated constructor stub
		}


		public LearnerLicense(long LLNumber, Application application, LocalDate dateOfIssue, LocalDate validTill,
				RTOOffice issuedBy) {
			super();
			LLNumber = LLNumber;
			this.application = application;
			this.dateOfIssue = dateOfIssue;
			this.validTill = validTill;
			this.issuedBy = issuedBy;
		}


		public LearnerLicense(Application application, LocalDate dateOfIssue, LocalDate validTill, RTOOffice issuedBy) {
			super();
			this.application = application;
			this.dateOfIssue = dateOfIssue;
			this.validTill = validTill;
			this.issuedBy = issuedBy;
		}


		public long getLLNumber() {
			return LLNumber;
		}


		public void setLLNumber(Long LLNumber) {
			LLNumber = LLNumber;
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
			return "LearnerLicense [LLNumber=" + LLNumber + ", application=" + application + ", dateOfIssue="
					+ dateOfIssue + ", validTill=" + validTill + ", issuedBy=" + issuedBy + "]";
		}
		
		
}