package com.ac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class BookDB {
	
	public static Connection getConnection() throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","root"+ "");
		return conn;
	}

}
