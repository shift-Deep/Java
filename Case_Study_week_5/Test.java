package com.pizzamanagement.Ui;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		PizzaServiceImpl Ps = new PizzaServiceImpl();
		//creating Pizza object
		Pizza p1 = new Pizza(2, "Onion", 159, "Jaipur");
		//adding Pizza
		Ps.addPizza(p1);
		System.out.println("Added");
		
		System.out.println(Ps.findPizzaByNo(2));
		System.out.println("Retrived");
		
		//deletion 
		Ps.deletePizza(2);
		System.out.println("Deleted");
	}

}
