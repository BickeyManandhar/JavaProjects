package com.dto;

public class UserDto {

	String username;
	String email;
	String password;
	String contactnum;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactnum() {
		return contactnum;
	}
	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(String username, String email, String password, String contactnum) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.contactnum = contactnum;
	}
	public UserDto(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	
	}
	@Override
	public String toString() {
		return "UserDto [username=" + username + ", email=" + email + ", password=" + password + ", contactnum="
				+ contactnum + "]";
	}
	

}
