package com.library;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.any;
import org.springframework.boot.test.context.SpringBootTest;

import com.library.exception.BookException;
import com.library.model.BookDTO;
import com.library.repository.BookRepository;
import com.library.service.BookService;

@SpringBootTest
class Springaopdemo2ApplicationTests2 {
    
	// @Mock is used with reference of the class which will be mocked
	@Mock
	private BookRepository bookRepository;
	
	// The object with @Mock annotation will be injected in the object with
	// @InjectMocks
	@InjectMocks
	private BookService bookService=new BookService();
	
	@Test
	void addBooksValidTest() throws BookException {
		//1) Create the BookDTO object
		BookDTO book = new BookDTO();
		//2) Set the valid data in BookDTO object
		book.setId(2);
		book.setName("Learning Java");
		// We are mocking the method call and return value of Mock object
		Mockito.when(bookRepository.addBook(book)).thenReturn(2);	
       // Mockito.when(bookRepository.addBook(any())).thenReturn(2);	
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
	    Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
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
		  Mockito.when(bookRepository.addBook(book)).thenReturn(-1);
		BookException exception=Assertions.assertThrows(BookException.class, ()->bookService.addBooks(book));
		
		//4)call Assertions, assertEquals or
		// assertSame method
		Assertions.assertEquals("SERVICE.INVALID_BOOK_NAME", exception.getMessage());
		
	} 

}
