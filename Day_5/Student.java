package java_ATCS;

public class Student {
	
	String name;
	int age,class_,roll_no;
	public void inil(){
		name = "amandeep";
		age = 24;
		class_ = 9;
		roll_no = 1602;
		
		
	}
	public void display() {
		System.out.println(name+" "+age+" "+class_+" "+roll_no);
	}

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.inil();
		st1.display();
		
		

	}

}
