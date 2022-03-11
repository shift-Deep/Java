package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;

import com.pizzamanagement.model.Pizza;

public class PizzaDaoimpl implements PizzaDao {
	
	private EntityManager entityManager;
	public PizzaDaoimpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	public void addPizza(Pizza p) {
		entityManager.persist(p);
		
	}

	
	public void updatePizaa(Pizza p) {
		// TODO Auto-generated method stub
		entityManager.merge(p);
	}

	
	public void deletePizza(int p) {
		// TODO Auto-generated method stub
		
		entityManager.remove(entityManager.find(Pizza.class, p));
		
		
	}

	
	public Pizza findPizzaByNo(int i) {
		// TODO Auto-generated method stub
		Pizza p = entityManager.find(Pizza.class, i);
		return p;
	
	}
	
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}

	
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	

}
