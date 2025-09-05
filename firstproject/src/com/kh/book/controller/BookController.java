package com.kh.book.controller;

import com.kh.book.model.dto.BookDTO;
import com.kh.book.model.service.BookService;

public class BookController {
	
	public int insertBook(String bookName, String author, String genre) {
		BookDTO bto = new BookDTO(bookName, author, genre);
		
		int result = new BookService().insertBook(bto);
		
		return result;
	}
	
	
	

}
