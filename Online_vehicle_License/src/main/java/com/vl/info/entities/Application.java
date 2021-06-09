package com.vl.info.entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
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
@Table(name="Applications_OVL")
public class Application 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long applicationNumber;
	@OneToOne(mappedBy = "applicant")
	private Applicant applicant;
	
	private LocalDate applicationDate;
	@ManyToOne
	private RTOOffice rtoOffice;
	
	 @Enumerated(EnumType.STRING)
	private ApplicationType type;
	
	@ElementCollection
	private List<Documents> documents;
	
	 @Enumerated(EnumType.STRING)
	private ModeOfPayment  modeOfPayment;
	private double amountPaid;
	
	 @Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@OneToOne(mappedBy="application")
	private Appointment appointment;
	
	// status will be updated by RTO officer. Initially status will be PENDING
	 @Enumerated(EnumType.STRING)
	private ApplicationStatus status;
	private String remarks;
	
	
	public Application() {
		super();
	}


	
	public Application(Applicant applicant) {
		super();
		this.applicant = applicant;
	}



	public Application(Long applicationNumber) {
		super();
		this.applicationNumber = applicationNumber;
	}



	public Application(Applicant applicant, LocalDate applicationDate, RTOOffice rtoOffice, ApplicationType type,
			List<Documents> documents, ModeOfPayment modeOfPayment, double amountPaid, PaymentStatus paymentStatus,
			Appointment appointment, ApplicationStatus status, String remarks) {
		super();
		this.applicant = applicant;
		this.applicationDate = applicationDate;
		this.rtoOffice = rtoOffice;
		this.type = type;
		this.documents = documents;
		this.modeOfPayment = modeOfPayment;
		this.amountPaid = amountPaid;
		this.paymentStatus = paymentStatus;
		this.appointment = appointment;
		this.status = status;
		this.remarks = remarks;
	}



	public Application(Long applicationNumber, Applicant applicant, LocalDate applicationDate, RTOOffice rtoOffice,
			ApplicationType type, List<Documents> documents, ModeOfPayment modeOfPayment, double amountPaid,
			PaymentStatus paymentStatus, Appointment appointment, ApplicationStatus status, String remarks) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicant = applicant;
		this.applicationDate = applicationDate;
		this.rtoOffice = rtoOffice;
		this.type = type;
		this.documents = documents;
		this.modeOfPayment = modeOfPayment;
		this.amountPaid = amountPaid;
		this.paymentStatus = paymentStatus;
		this.appointment = appointment;
		this.status = status;
		this.remarks = remarks;
	}



	public Application(Long applicationNumber, LocalDate applicationDate, ApplicationType type,
			ModeOfPayment modeOfPayment, double amountPaid, PaymentStatus paymentStatus, ApplicationStatus status,
			String remarks) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicationDate = applicationDate;
		this.type = type;
		this.modeOfPayment = modeOfPayment;
		this.amountPaid = amountPaid;
		this.paymentStatus = paymentStatus;
		this.status = status;
		this.remarks = remarks;
	}



	public long getApplicationNumber(Long applicationNumber) {
		return applicationNumber;
	}


	public void setApplicationNumber(Long applicationNumber) {
		this.applicationNumber = applicationNumber;
	}


	public Applicant getApplicant() {
		return applicant;
	}


	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}


	public LocalDate getApplicationDate() {
		return applicationDate;
	}


	public long getApplicationNumber() {
		return applicationNumber;
	}



	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}


	public RTOOffice getRtoOffice() {
		return rtoOffice;
	}


	public void setRtoOffice(RTOOffice rtoOffice) {
		this.rtoOffice = rtoOffice;
	}


	public ApplicationType getType() {
		return type;
	}


	public void setType(ApplicationType type) {
		this.type = type;
	}


	public List<Documents> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}


	public ModeOfPayment getModeOfPayment() {
		return modeOfPayment;
	}


	public void setModeOfPayment(ModeOfPayment modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}


	public double getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public ApplicationStatus getStatus() {
		return status;
	}


	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	@Override
	public String toString() {
		return "Application [applicationNumber=" + applicationNumber + ", applicant=" + applicant + ", applicationDate="
				+ applicationDate + ", rtoOffice=" + rtoOffice + ", type=" + type + ", documents=" + documents
				+ ", modeOfPayment=" + modeOfPayment + ", amountPaid=" + amountPaid + ", paymentStatus=" + paymentStatus
				+ ", appointment=" + appointment + ", status=" + status + ", remarks=" + remarks + "]";
	}
	

	
	
	
}
