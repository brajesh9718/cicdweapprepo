package com.mytech.cicdwebapp.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mytech.cicdwebapp.dto.Address;
import com.mytech.cicdwebapp.dto.User;
import com.mytech.cicdwebapp.service.CalculatorFuntionalInterface;

@Controller
public class HomeController {
	
	ArrayList<User> users = new ArrayList<User>();

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@GetMapping("sayHello")
	@ResponseBody
	public String sayHello() {
		return "Hi Team This Is CICDAPP....";
	}
	
	//URL to request =  http://localhost:<Port>/spring-mvc-example/getUserById/102?no=3
		@RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
		@ResponseBody
		public User getUserById(@PathVariable int id) {
			try {
				Address address = new Address();
				address.setAid(2);
				address.setAdd("Mathura");
				User user1 = new User();
				user1.setUid(101);
				user1.setUsername("Ram");
				user1.setAddress(address);
				User user2 = new User();
				user2.setUid(102);
				user2.setUsername("Shyam");
				user2.setAddress(address);
				User user3 = new User();
				user3.setUid(103);
				user3.setUsername("Radha");
				user3.setAddress(address);
				users.add(user1);
				users.add(user3);
				users.add(user2);

				// Using Jdk1.8 Stream API
				User userObj = users.stream().filter(data -> data.getUid() == id).findFirst().get();
				return userObj;
			} catch (Exception e) {
				System.out.println("Exception occur " + e);
			}
			return null;
		}

		//Use Lamda Expression by rest call
		@RequestMapping(value = "/add")
		@ResponseBody
		public String getCalc(@RequestParam int no1, @RequestParam int no2) {
			CalculatorFuntionalInterface calc = (a, b) -> {
				return a + b;
			};
			return "Addition of numbers : " + calc.add(no1, no2);
		}
	
}
