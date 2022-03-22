package com.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Demo {
	
	@RequestMapping("/sub")
	public ModelAndView subt(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","root");
		Statement stmt = conn.createStatement();
		//boolean result = stmt.execute("create table test1(eid int, ename varchar(10))");
		
		
		
		//String s = rs.getString("location");
		Map<String, Integer> m1 = new HashMap();
		String s = request.getParameter("s");
		
		ResultSet rs = stmt.executeQuery(s);
		while(rs.next()) {
			m1.put(rs.getString("location"), rs.getInt("count"));
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("s", m1);
		
		return mv;
	}
	

}
