package day_16;

import java.util.*;
import java.util.Map.Entry;
public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// HashMap to store Emp details
		
		HashMap<Integer, Employee> Em = new HashMap<Integer, Employee>();
		int empid = 0;
		while(true) {
			System.out.println("\n****Enter a choice****\n");
			System.out.println("1. Add Employee Details \n2. Update Details\n3. Delete an Employee\n4. Get details of an Empolyee\n5. Get all Employees\n6. Exit");
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch == 6) {
				return;
			}
			switch(ch) {
			case 1:{
				//Adding Employee
				
				System.out.println("Enter Employee Name");
				String s = sc.nextLine();
				System.out.println("Enter Department Name");
				String s1 = sc.nextLine();
				System.out.println("Enter Designation");
				String s2 = sc.nextLine();
				System.out.println("Enter Address");
				String s3 = sc.nextLine();
				System.out.println("Enter Salary");
				int s4 = sc.nextInt();
				System.out.println("Enter Age");
				int s5 = sc.nextInt();
				Employee e = new Employee(s, s4, s3, s5, s1, s2);
				Em.put(++empid, e);
				System.out.println("Employee Added Successfully");
				break;
			}
			case 2:{
				//updating Details
				
				System.out.println("Enter Empid to update details");
				int temp = sc.nextInt();
				System.out.println("Enter Employee Name");
				String s = sc.nextLine();
				System.out.println("Enter Department Name");
				String s1 = sc.nextLine();
				System.out.println("Enter Designation");
				String s2 = sc.nextLine();
				System.out.println("Enter Address");
				String s3 = sc.nextLine();
				System.out.println("Enter Salary");
				int s4 = sc.nextInt();
				System.out.println("Enter Age");
				int s5 = sc.nextInt();
				Employee e = new Employee(s, s4, s3, s5, s1, s2);
				Em.put(temp, e);
				System.out.println("Details Updated Successfully");
				break;
			}
			case 3:{
				//Deleting Employee
				
				System.out.println("Enter empid to delete Employee");
				int t = sc.nextInt();
				Employee s = Em.remove(t);
				System.out.println(s);
				break;
			}
			case 4:{
				//Printing Specific Employee's details
				System.out.println("Enter Empid to get details");
				int t = sc.nextInt();
				System.out.println(Em.get(t));
				break;
			}
			case 5:{
				//Printig all Employee details
				
				Set <Entry<Integer, Employee>> r = Em.entrySet();
				Iterator i = r.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				break;
			}
			
			default:{
			System.out.println("Invalid Choice");	
			}
			}
		
		}
		
		

	}

}
