package com.awzpact.rest.exception;

import java.util.Date;

public class ErrorDetails {
	
	private Date timeStamp;
	private String messsage;
	private String details;
	
	
	public ErrorDetails(Date timeStamp, String messsage, String details) {
		super();
		this.timeStamp = timeStamp;
		this.messsage = messsage;
		this.details = details;
	}
	
	
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
