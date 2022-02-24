package com.service;

import java.util.Map.Entry;
import java.util.Set;

import com.entity.Trainee;

public interface TraineeService {

	int addTrainee(Trainee t);
	Trainee updateTrainee(int Tid, Trainee t);
	void deleteTrainee(int Tid);
	Trainee getTrainee(int Tid);
	Set<Entry<Integer,Trainee>> getAllTrainees();
	
	
}
