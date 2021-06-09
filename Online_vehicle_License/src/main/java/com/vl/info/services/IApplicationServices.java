package com.vl.info.services;

import org.springframework.stereotype.Service;

import com.vl.info.entities.Application;
import com.vl.info.entities.Appointment;
import com.vl.info.entities.Documents;
@Service
public interface IApplicationServices {
	public Application ApplyFor(Application Application);
	public Application UpdateDocument(Application application);
	public Application addDocument(Long id);
	public Application addFee(double amount);
	public Application getAppointment(Long  id);
	public Appointment getResult(Appointment testResult);
	public Application Updatefeepayment(Application application1);
	
}