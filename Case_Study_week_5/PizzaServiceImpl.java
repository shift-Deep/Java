package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDaoimpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService{
	
	private PizzaDaoimpl pd;
	
	
	
	public PizzaServiceImpl() {
		pd = new PizzaDaoimpl();
	}

	public void addPizza(Pizza p) {
		pd.beginTransaction();
		pd.addPizza(p);
		pd.commitTransaction();
	}

		public void updatePizaa(Pizza p) {
		// TODO Auto-generated method stub
		pd.beginTransaction();
		pd.updatePizaa(p);
		pd.commitTransaction();
	}


	public void deletePizza(int p) {
		// TODO Auto-generated method stub
		pd.beginTransaction();
		pd.deletePizza(p);
		pd.commitTransaction();
	}


	public Pizza findPizzaByNo(int i) {
		// TODO Auto-generated method stub
		pd.beginTransaction();
		Pizza p1 = pd.findPizzaByNo(i);
		pd.commitTransaction();
		return p1;
	}
	
	

}
