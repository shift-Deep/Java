package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	
	public void addPizza(Pizza p);
	 public void updatePizaa(Pizza p);
	 public void deletePizza(int p);
	 public Pizza findPizzaByNo(int i);
	 public void commitTransaction();
	 public void beginTransaction();

}
