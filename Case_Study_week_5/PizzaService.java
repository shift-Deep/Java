package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {

	
	 public void addPizza(Pizza p);
	 public void updatePizaa(Pizza p);
	 public void deletePizza(int p);
	 public Pizza findPizzaByNo(int i);
	
	
}
