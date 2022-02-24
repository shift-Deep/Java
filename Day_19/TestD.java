package databaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class TestD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","root");
		Statement stmt = conn.createStatement();
		boolean result = stmt.execute("create table test1(eid int, ename varchar(10))");
		System.out.println(result);
		
		conn.close();
	}

}
