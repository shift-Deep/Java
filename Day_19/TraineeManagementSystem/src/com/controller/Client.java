package com.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.entity.Trainee;
import com.service.TraineeService;
import com.service.TraineeServiceImp;

public class Client {

	public static void main(String[] args) {
		
		TraineeService Ts = new TraineeServiceImp();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n****Enter a choice****\n");
			System.out.println("1. Add a Trainee \n2. Update a Trainee\n3. Delete a Trainee\n4. Get a Trainee\n5. Get all Trainees\n6. Exit");
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch == 6) {
				return;
			}
			switch(ch) {
			case 1:
				System.out.println("Enter to add trainee details");
				System.out.println("Enter Trainee Name");
				String tname = sc.nextLine();
				System.out.println("Enter Department Name");
				String dep = sc.nextLine();
				System.out.println("Enter address");
				String add = sc.nextLine();
				System.out.println("Enter Email id");
				String email = sc.nextLine();
				
				Trainee t1 = new Trainee(tname, dep, add, email);
				int Tid = Ts.addTrainee(t1);
				System.out.println("Trainee added" + Tid);
				break;
			case 2:
				System.out.println("Enter to add trainee details");
				System.out.println("Enter Tid");
				int Tid1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Trainee Name");
				String tname1 = sc.nextLine();
				System.out.println("Enter Department Name");
				String dep1 = sc.nextLine();
				System.out.println("Enter address");
				String add1 = sc.nextLine();
				System.out.println("Enter Email id");
				String email1 = sc.nextLine();
				
				Trainee t2 = new Trainee(tname1, dep1, add1, email1);
				Trainee t3 = Ts.updateTrainee(Tid1, t2);
				System.out.println(t3);
				break;
			case 3:
				System.out.println("Enter Tid");
				int Tid3 = sc.nextInt();
				Ts.deleteTrainee(Tid3);
				System.out.println("Deleted");
				break;
			case 4:
				System.out.println("Enter Tid");
				int Tid4 = sc.nextInt();
				Trainee t = Ts.getTrainee(Tid4);
				System.out.println(t);
				break;
			case 5:
				Set<Entry<Integer,Trainee>> result = Ts.getAllTrainees();
				Iterator<Entry<Integer,Trainee>> itr = result.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				
				}
				break;
			default:
				System.out.println("invalid");
				break;
			}
			
		}

	}

}
