package com.mytech.cicdwebapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@GetMapping("sayHello")
	@ResponseBody
	public String sayHello() {
		return "Hi Team This Is CICDAPP....";
	}
	
	@GetMapping(value = "/getFactorial/{no}")
	@ResponseBody
	public long getFactorial(@PathVariable int no) {
	        if (no == 1)     
	            return 1;
	        else {
	            return no * getFactorial(no - 1);    
	        }
	}
	
}
