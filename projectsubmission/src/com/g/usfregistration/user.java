package com.g.usfregistration;

public class user {
	private String FirstName;
	private String LastName;
	private String email;
	private Long DOB;
	private Long phno;
	
	
	public String getFirstName(){
		return FirstName;
		
	}
 public void setFirtstName(String FirstName){
	 this.FirstName = FirstName;
 }
 public String getLastName(){
		return LastName;
		
	}
public void setLastName(String LastName){
	 this.LastName = LastName;
}
public String getemail(){
	return email;
	
}
public void setemail(String email){
 this.email = email;
}

public Long getDOB(){
	return DOB;
	
}
public void setDOB(Long DOB){
 this.DOB = DOB;
}

public Long getphno(){
	return phno;
	
}
public void setphno(Long phno){
 this.phno = phno;
}
}