package com.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//import com.dao.TraineeDao;
import com.entity.Trainee;

public class TraineeDaoImp implements TraineeDao {
	
	int Tid = 100;
	HashMap<Integer,Trainee> Tdata = new HashMap<Integer, Trainee>();

	@Override
	public int addTrainee(Trainee t) {
		Tdata.put(++Tid, t);
		return Tid;
	}

	@Override
	public Trainee updateTrainee(int Tid, Trainee t) {
		Tdata.put(Tid, t);
		return Tdata.get(this.Tid); 
	}

	@Override
	public void deleteTrainee(int Tid) {
		// TODO Auto-generated method stub
		Tdata.remove(Tid);
		
	}

	@Override
	public Trainee getTrainee(int Tid) {
		
		return Tdata.get(Tid);
	}

	@Override
	public Set<Entry<Integer, Trainee>> getAllTrainees() {
		Set<Entry<Integer, Trainee>> AllData = Tdata.entrySet();
		return AllData;
	}
	
	

}
