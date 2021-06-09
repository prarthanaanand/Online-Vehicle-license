package com.vl.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vl.info.entities.Applicant;
import com.vl.info.entities.ApplicationType;
import com.vl.info.entities.Appointment;
@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {
	@Query("select a3 from Applicant a inner join a.application a2 inner join a2.appointment a3")

	Appointment findAppointmentByApplicantIdAndApplicationId(Long applicantNumber, Long applicationNumber,
			ApplicationType type);
	


}