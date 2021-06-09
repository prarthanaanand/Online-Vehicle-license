package com.vl.info.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Documents
{
	private String photo;
	private String idProof;
	private String addressProof;
	
	public Documents() {
		super();
	}

	public Documents(String photo, String idProof, String addressProof) {
		super();
		this.photo = photo;
		this.idProof = idProof;
		this.addressProof = addressProof;
	}
	
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}


	@Override
	public String toString() {
		return "Documents [photo=" + photo + ", idProof=" + idProof + ", addressProof=" + addressProof + "]";
	}
	
	
}
