package com.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.library.exception.BookException;
import com.library.model.BookDTO;
import com.library.service.BookService;

@SpringBootTest
class Springaopdemo2ApplicationTests {

	@Autowired
	private BookService bookService;
	@Test
	void addBooksValidTest() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("Learning Java");
		//3) Call the Service method to add book
		// capture the return type 
		int actualId=bookService.addBooks(book);
		int expectedId=2;
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals(expectedId, actualId);
		//Assertions.assertSame(expectedId, actualId);
	}
	
	@Test
	void addBooksInvalidIdTest() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the invalid valid data in BookDTO object
		book.setId(-2);
		book.setName("Learning Java");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("Service.INVALID_ID", exception.getMessage());
		
	}
	@Test
	void addBooksInvalidBookNameTest() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("learning Java");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}
	@Test
	void addBooksInvalidBookNameTest2() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("Learning java");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}
	@Test
	void addBooksInvalidBookNameTest3() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("learning java");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}
	
	@Test
	void addBooksInvalidBookNameTest4() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("LEARNING JAVA");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}
	
	@Test
	void addBooksInvalidBookNameTest5() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("lEARNING jAVA");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}
	@Test
	void addBooksInvalidBookNameTest6() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("Learning#Java");
		//3) Call the Service method to add book
		// capture the return type 
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	}

}
