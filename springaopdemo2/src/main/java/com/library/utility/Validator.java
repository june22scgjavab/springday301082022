package com.library.utility;

import com.library.exception.BookException;
import com.library.model.BookDTO;

public class Validator {

	public static void validate(BookDTO book) throws BookException {
	String message=null;
     if(!validateId(book.getId())) {
    	 message="Service.INVALID_ID";
     }
     if(!validateName(book.getName())) {
    	message="SERVICE.INVALID_BOOK_NAME"; 
     }
     if(message!=null)
     {
    	 throw new BookException(message);
     }
		
	}

	private static boolean validateName(String name) {
		boolean isValidName=true;
		String regex="^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
		if(!name.matches(regex)) {
			isValidName=false;
		}
		return isValidName;
	}

	private static boolean validateId(int id) {
		boolean isValid=true;
		if(id<=0)
		{
          isValid=false;			
		}
		return isValid;
	}

}
