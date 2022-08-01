package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.exception.BookException;
import com.library.model.BookDTO;
import com.library.repository.BookRepository;
import com.library.utility.Validator;
@Service
public class BookService {

    @Autowired
	private BookRepository bookRepository;
	public int addBooks(BookDTO book) throws BookException {
		Validator.validate(book);
		bookRepository.addBook(book);
		return book.getId();
	}

}
