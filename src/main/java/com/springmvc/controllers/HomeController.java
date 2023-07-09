package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homeController()
	{
		System.out.println("Home is fired ");
		return "Home";
	}
	@ResponseBody
	@RequestMapping(value = "test")
	public String homeControllerTest()
	{
		System.out.println("Test is Fired..");
		return "Configration Testing Passed..";
	}
}
