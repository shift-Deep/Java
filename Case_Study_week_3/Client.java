package caseStudy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



class Product1 {

	private
	
	String name;
	int amount;
	int code;
	String address;
	int pincode;
	int productid;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}


public class Client extends Product1{
	
	public void addProduct() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Product id");
		int n = sc.nextInt();
		sc.nextLine();
		setProductid(n);
		System.out.println("Enter Name of product");
		String name = sc.nextLine();
		setName(name);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		
		setAmount(amount);
		System.out.println("Enter the code for product");
		int code = sc.nextInt();
		sc.nextLine();
		setCode(code);
		System.out.println("Enter address");
		String address = sc.next();
		setAddress(address);
		
		System.out.println("Enter Pincode");
		int pincode = sc.nextInt();
		setPincode(pincode);
		
		
		
	}
	
	public void Update(Client l) {
		l.addProduct();
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product id"+getProductid()+"Product Name "+getName()+"\n"+"Price "+getAmount()+"\n"+"Product Code "+getCode()+"\n"+"Address "+getAddress()+"\n"+"Pincode "+getPincode()+"\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Client> data = new HashMap<Integer, Client>();
		
		int ch=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n****Enter a choice****\n");
			System.out.println("1. Add a Product \n2. Update a Product\n3. Delete a Product\n4. Get a Product\n5. Get all Products\n6. Exit");
			ch = sc.nextInt();
			if(ch==6) {
				break;
			}
			switch(ch) {
			case 1:
			{
				Client c = new Client();
				c.addProduct();
				data.put(c.getProductid(), c);
				System.out.println("Product added Successfully");
				
				break;
			}
				
			case 2:{
				
				System.out.println("Enter Product id");
				int n = sc.nextInt();
				data.get(n).addProduct();
				System.out.println("Product Updated Successfully \n");
				break;
				
				
			}
			case 3:{
				
				System.out.println("Enter a Product id");
				int n = sc.nextInt();
				data.remove(n);
				System.out.println("Product Deleted \n");
				break;
				
			}
			case 4:{
				System.out.println("Enter a Product id");
				int n = sc.nextInt();
				System.out.println(data.get(n));
				break;
				
			}
			case 5:{
				Set<Integer> s = data.keySet();
				for(Object c:s) {
					System.out.println(data.get(c));
				}
				break;
			}
				
			
			}
						
		}
		
	}

}
