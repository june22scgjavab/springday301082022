package com.library.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.library.model.BookDTO;

@Repository
public class BookRepository {

	List<BookDTO> books=new ArrayList<>();
	
	public int addBook(BookDTO book) {
		books.add(book);
		return book.getId();
	}
	
	
	
	
}
