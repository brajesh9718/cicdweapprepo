package com.mytech.cicdwebapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mytech.cicdwebapp.service.Calculator;

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
	public int getFactorial(@PathVariable int no) {
		Calculator cal = (x) -> {
			int fact =1;
			if(x==0)
				return 1;
			else if(x>0) {
				for (int i = 1; i <= x;i++) {
					fact = fact * i;
				}
				return fact;
			}
			return fact;
			
		};		
		return cal.getFactorial(no);
	}
	
}
