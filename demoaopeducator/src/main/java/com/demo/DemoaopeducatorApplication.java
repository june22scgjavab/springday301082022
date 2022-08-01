package com.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.controller.DemoController;
import com.demo.utility.LoggerAspect;

@SpringBootApplication
public class DemoaopeducatorApplication implements CommandLineRunner{

	@Autowired
	private DemoController demoController;
	private Log LOGGER=LogFactory.getLog(LoggerAspect.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoaopeducatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//LOGGER.info(demoController.display());
		//demoController.callService();
		  demoController.method();
	}

}
