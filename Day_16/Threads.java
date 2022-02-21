package day_16;

public class Threads extends Thread{
	
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object of Thread
		Threads t = new Threads();
		
		//Starting a thread
		t.start();
		
		try {
			// making the main thred to sleep
			Thread.sleep(1000);
		}
		catch(Exception e) {System.out.println(e);}
		
		//Getting name of thread
		System.out.println(t.getName());
		
		//Changing the name of thread
		t.setName("th");
		System.out.println(t.getName());
		try {
			//using join method
			t.join();
		}
		catch(Exception e) 
		{
			System.out.println(e);
			}
		
		System.out.println("Main");
		System.out.println("Main");
		System.out.println("Main");
		
	}

}
