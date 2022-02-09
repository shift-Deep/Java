package java_ATCS;

public class Vehicle {
	
	private 
	
	int MaxSpeed;
	int Average;
	int Gears;
	String name;
	
	public
	
	Vehicle(String name) {
		this.name = name;
	}
	
	int getMaxSpeed() {
		return MaxSpeed;
	}

	void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}

	int getAverage() {
		return Average;
	}

	void setAverage(int average) {
		Average = average;
	}

	int getGears() {
		return Gears;
	}
	
	String getName() {
		return this.name;
	}

	void setGears(int gears) {
		Gears = gears;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle V = new Vehicle("Honda");
		V.setAverage(40);
		V.setGears(4);
		V.setMaxSpeed(200);
		System.out.println(" Car Name = "+V.getName()+"\n Average = "+V.getAverage()+"\n Max Speed"+V.getMaxSpeed()+"\n Gears = "+V.getGears());

	}

	

}
