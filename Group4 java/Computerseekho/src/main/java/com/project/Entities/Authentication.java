package com.project.Entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="Authentication")
public class Authentication 
{
	
	private int authenticationId;
	private String userName;
	private String password;
	
	
	
	public Authentication() 
	{
		
	}

	

	public Authentication(int authenticationId, String username, String password) {
		super();
		this.authenticationId = authenticationId;
		this.userName = userName;
		this.password = password;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(int authenticationId) {
		this.authenticationId = authenticationId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	
	

	
	
	
		

}
