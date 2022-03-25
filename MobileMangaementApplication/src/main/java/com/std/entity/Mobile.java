package com.std.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity class for table creation


@Entity
public class Mobile {
	
	@Id
	private int mobileId;
	private String mobileType;
	private int mobilePrice;
	private int mobileWarenty;
	private int mobileIMEINumber;
	
	
	public Mobile() {
		
	}


	public int getMobileId() {
		return mobileId;
	}


	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}


	public String getMobileType() {
		return mobileType;
	}


	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}


	public int getMobilePrice() {
		return mobilePrice;
	}


	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}


	public int getMobileWarenty() {
		return mobileWarenty;
	}


	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}


	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}


	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}


	public Mobile(int mobileId, String mobileType, int mobilePrice, int mobileWarenty, int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}


	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileType=" + mobileType + ", mobilePrice=" + mobilePrice
				+ ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber=" + mobileIMEINumber + "]";
	}
	
	

}
