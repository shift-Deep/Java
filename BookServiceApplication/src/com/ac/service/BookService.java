package com.ac.service;
import com.ac.dao.*;
import java.util.ArrayList;
import java.util.ArrayList;

import com.ac.bean.Book;
public class BookService {

	public int addBookService(int bookId, String bookName,int bookPrice) {
		int bookGrade = 0;
		if(bookPrice <= 300) {
			bookGrade = 1;
		}
		else if(bookPrice <= 600) {
			bookGrade = 3;
		}
		else {
			bookGrade = 5;
		}
		
		BookDao bDao = new BookDao();
		Book b = new Book();
		b.setBookid(bookId);
		b.setBookTitle(bookName);
		b.setBookPrice(bookPrice);
		b.setGrade(bookGrade);
		
		int updateResult = 0;
		try {
			updateResult = bDao.addProduct(b);
			return updateResult;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			return 0;
		}
		
	
	}
	
	public ArrayList getBookDetailsService(int BookId) {
		BookDao bd = new BookDao();
		ArrayList al = new ArrayList();
		try {
			 al = bd.getBookDetails(BookId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return al;
	}
	
	
	
}
