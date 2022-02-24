package com.service;

import java.util.Map.Entry;
import java.util.Set;
import com.dao.*;
import com.entity.Trainee;

public class TraineeServiceImp implements TraineeService{

	TraineeDao Td = new TraineeDaoImp();
	
	@Override
	public int addTrainee(Trainee t) {
		int Tid = Td.addTrainee(t);
		return Tid;
	}

	@Override
	public Trainee updateTrainee(int Tid, Trainee t) {
		
		return Td.updateTrainee(Tid, t); 
	}

	@Override
	public void deleteTrainee(int Tid) {
		
		Td.deleteTrainee(Tid);
		
	}

	@Override
	public Trainee getTrainee(int Tid) {
		
		return Td.getTrainee(Tid);
	}

	@Override
	public Set<Entry<Integer, Trainee>> getAllTrainees() {
		
		return Td.getAllTrainees();
	}
	
	

}
