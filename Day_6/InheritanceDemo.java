package java_ATCS;

class Parent{
	
	void display() {
		System.out.println("i am in Parent Class");
	}
}

class Child1 extends Parent{
	
	void displayChild1() {
		System.out.println("I am in child 1");
	}
}

class Child2 extends Child1{
	void displayChild2() {
		System.out.println("I am in child 2");
	}
}

class Uncle extends Parent{
	void displayUncle() {
		System.out.println("I am in class Uncle");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 kid1 = new Child1();
		kid1.displayChild1();
		kid1.display();
		Child2 kid2 = new Child2();
		kid2.displayChild2();
		kid2.displayChild1();
		kid2.display();
		Uncle u = new Uncle();
		u.displayUncle();
		u.display();
		
		u.display();

	}

}
