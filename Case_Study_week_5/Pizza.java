package com.pizzamanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pizza {
	@Id
	private int pizzaNo;
	private String pizzaType;
	private int pizzaPrice;
	private String DeliveryAdd;
	
	public Pizza() {
		
	}
	
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		DeliveryAdd = deliveryAdd;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", DeliveryAdd=" + DeliveryAdd + "]";
	}
	
	
	
	

}
