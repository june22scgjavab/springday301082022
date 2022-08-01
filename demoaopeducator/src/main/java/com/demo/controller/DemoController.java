package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.service.DemoServiceImpl;

@Controller
public class DemoController {

	
	@Autowired private DemoServiceImpl demoServiceImpl;
	
	public int display() {
		
		return 1;
	}
	public void callService() {
		demoServiceImpl.display();
	}
	
	public void method() throws Exception{
		throw new Exception("Exception thrown");
	}
}
