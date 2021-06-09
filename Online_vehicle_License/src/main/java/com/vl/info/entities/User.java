package com.vl.info.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users_OVL")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	 @Enumerated(EnumType.STRING)
	private Role Role;
	private  String username;
	private  String email;
	private Long mobilenumber;
	private  String password;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		Role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(Long id, com.vl.info.entities.Role role, String username, String email, Long mobilenumber,
			String password) {
		super();
		this.id = id;
		Role = role;
		this.username = username;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}
	public User(com.vl.info.entities.Role role, String username, String email, Long mobilenumber, String password) {
		super();
		Role = role;
		this.username = username;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Role=" + Role + ", username=" + username + ", email=" + email + ", mobilenumber="
				+ mobilenumber + ", password=" + password + "]";
	}
	
	

	
	
}	