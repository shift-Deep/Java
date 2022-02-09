package java_ATCS;
public class Employee {
	
	int EmpCode;
	String EmpName;
	String des;
	String MobileNo;
	
	public void display() {
		System.out.println(" Empcode = "+EmpCode+"\n EmpName = "+ EmpName+"\n Designation = "+des+"\n Mobile No. = "+ MobileNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.EmpCode = 1602;
		e1.EmpName = "Amandeep";
		e1.des = "Intern";
		e1.MobileNo = "9982914412";
		
		e1.display();

	}

}
