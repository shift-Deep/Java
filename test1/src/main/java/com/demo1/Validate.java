package com.demo1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Validate {
	
	@RequestMapping("/auth")
	public ModelAndView auth(HttpServletRequest request, HttpServletResponse response) {
		
		String uname = request.getParameter("un");
		String passwd = request.getParameter("pd");
		String res = "";
		if(uname.equals(passwd)) {
			res = "Valid";
		}else {
			res = "try again";
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("res", res);
		return mv;
		
	}

}
