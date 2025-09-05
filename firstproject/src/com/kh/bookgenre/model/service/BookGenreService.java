package com.kh.bookgenre.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.book.model.vo.Book;
import com.kh.bookgenre.model.dao.BookGenreDAO;
import com.kh.bookgenre.model.vo.BookGenre;


public class BookGenreService {

	private Connection conn = null;
	
	public BookGenreService() {
		
		conn = getConnection();
		
	}
			
			
	
	public int save(BookGenre bookgenre) {
		
		int result = new BookGenreDAO().save(conn,bookgenre);
		
		if (result > 0) {
			commit(conn);
		}
		close(conn);
		
		return result;
		
		
	}
	
	public List<BookGenre> findAll(){
		
		List<BookGenre> bookGenres = new BookGenreDAO().findAll(conn);
		
		return bookGenres;
		
	}
	
	public int update(BookGenre bookGenre) {
		
		int result = new BookGenreDAO().update(conn,bookGenre);
		
		if(result > 0) {
			commit(conn);
		}
		
		close(conn);
		
		return result;
		
	}
	
	public int delete(BookGenre bookGenre) {
		
		int result = new BookGenreDAO().delete(conn,bookGenre);
		
		if(result > 0) {
			commit(conn);
		}
		
		close(conn);
		
		return result;
		
	}
	
	
}
