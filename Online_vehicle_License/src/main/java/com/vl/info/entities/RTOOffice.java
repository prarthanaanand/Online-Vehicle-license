package com.vl.info.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RTO_Office_OVL")
public class RTOOffice
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rtoId;
	private String rtoName;
	
	
	public RTOOffice() {
		super();
	}

	public RTOOffice(int rtoId, String rtoName) {
		super();
		this.rtoId = rtoId;
		this.rtoName = rtoName;
	}
	
	public int getRtoId() {
		return rtoId;
	}
	public void setRtoId(int rtoId) {
		this.rtoId = rtoId;
	}
	public String getRtoName() {
		return rtoName;
	}
	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}

	@Override
	public String toString() {
		return "RTOOffice [rtoId=" + rtoId + ", rtoName=" + rtoName + "]";
	}
	
	
}
