package com.ac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

import com.ac.bean.Book;
public class BookDao {
	
	public int addProduct(Book b) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = BookDB.getConnection();
			String ins_str = "insert into book values(?,?,?,?)";
			pstmt = con.prepareStatement(ins_str);
			pstmt.setInt(1,b.getBookid());
			pstmt.setString(2, b.getBookTitle());
			pstmt.setInt(3, b.getBookPrice());
			pstmt.setInt(4, b.getGrade());
			int updateCount = pstmt.executeUpdate();
			con.close();
			return updateCount;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public ArrayList getBookDetails(int Bookid) throws Exception {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = BookDB.getConnection();
		String sel_str = "Select booktitle,bookprice from book where bookid=?";
		pstmt = con.prepareStatement(sel_str);
		pstmt.setInt(1, Bookid);
		rs = pstmt.executeQuery();
		ArrayList result = new ArrayList();
		if(rs.next()) {
			result.add(rs.getString(1));
			result.add(rs.getString(2));
		}
		else {
			result.add("Invalid id");
		}
		return result;
	}

}
