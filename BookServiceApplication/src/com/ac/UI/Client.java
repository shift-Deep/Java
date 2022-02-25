package com.ac.UI;

import java.util.Scanner;
import com.ac.service.*;
import java.util.ArrayList;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int BookId=0;
		String Booktitle="";
		int Bookprice=0;
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Enter a choice");
			System.out.println("1. Add Book\n2. print all books\n3. Exit");
			int ch = s.nextInt();
			s.nextLine();
			if(ch==3) {
				return;
			}
			switch(ch){
				case 1:
					System.out.println("Enter BookId");
					BookId = s.nextInt();
					s.nextLine();
					System.out.println("Enter Book Titile");
					Booktitle = s.nextLine();	
					System.out.println("Enter Book price");
					Bookprice = s.nextInt();
					BookService BookService = new BookService(); 
					   int updateCount = BookService.addBookService(BookId, Booktitle, Bookprice); 
			  
					System.out.println("inserted "+updateCount+" record   Success");
					break;
				case 2:
					System.out.println("Enter Bookid");
					int Bid = s.nextInt();
					s.nextLine();
					BookService bs = new BookService();
					ArrayList rs = bs.getBookDetailsService(Bid);
					System.out.println(rs);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}

	}

}
