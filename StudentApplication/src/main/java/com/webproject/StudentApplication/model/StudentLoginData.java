package com.webproject.StudentApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class StudentLoginData {
	
	@Id
	String userName;
	String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "StudentLoginData [userName=" + userName + ", password=" + password + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
