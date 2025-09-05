package com.kh.bookgenre.controller;

import java.util.List;

import com.kh.bookgenre.model.service.BookGenreService;
import com.kh.bookgenre.model.vo.BookGenre;

public class BookGenreController {

	
	
	public int save(String genreName,String locationPlace) {
		
		BookGenre bookGenre = new BookGenre(genreName,locationPlace);
		
		int result = new BookGenreService().save(bookGenre);
		
		return result;
		
	}
	
	public List<BookGenre> findAll(){
		
		List<BookGenre> bookGenres = new BookGenreService().findAll();
		
		
		return bookGenres;
		
		
	}
	
	public int update(String genreName,String locationPlace) {
		
		BookGenre bookGenre = new BookGenre(genreName,locationPlace);
		
		int result = new BookGenreService().update(bookGenre);
		
		return result;
		
	}
	
	public int delete(String genreName,String locationPlace) {
		
		BookGenre bookGenre = new BookGenre(genreName , locationPlace);
		
		int result = new BookGenreService().delete(bookGenre);
		
		return result;
		
		
	}
	
}
