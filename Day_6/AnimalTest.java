package java_ATCS;

class Animal{
	void display() {
		System.out.println("I am an Animal");
	}
}

class Dog extends Animal{
	void display() {
		System.out.println("I am a Dog");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog Tommy = new Dog();
		Tommy.display();

	}

}
