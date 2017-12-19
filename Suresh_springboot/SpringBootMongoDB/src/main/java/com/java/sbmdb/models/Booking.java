/**
 * 
 */
package com.java.sbmdb.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Customer")
public class Booking{

	@Id
	private String Cust_Id;
	private String Cust_Name;
	private String Address;
	String Destination;
	//Date travelDate;
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getCustId() {
		return Cust_Id;
	}
	public void setCustId(String Cust_Id) {
		this.Cust_Id = Cust_Id;
	}
	public String getCustName() {
		return Cust_Name;
	}
	public void setCustName(String Cust_Name) {
		this.Cust_Name = Cust_Name;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String Destination) {
		this.Destination = Destination;
	}

	

	
	
}
