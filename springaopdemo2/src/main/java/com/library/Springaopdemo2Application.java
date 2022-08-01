package com.library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.library.exception.BookException;
import com.library.model.BookDTO;
import com.library.service.BookService;
import com.library.utility.LoggerAspect;

@SpringBootApplication
public class Springaopdemo2Application implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	private static final Log LOGGER=LogFactory.getLog(LoggerAspect.class);
	public static void main(String[] args) {
		SpringApplication.run(Springaopdemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		addBooks();
		
	}

	private void addBooks() {
		
		BookDTO book=new BookDTO();
		book.setId(1);
		book.setName("Spring");
		
		try {
			int id=bookService.addBooks(book);
		    LOGGER.info("SUCCESS");	
		} catch (BookException e) {
			 LOGGER.error(e.getMessage());		
		}
		
		
	}

}
