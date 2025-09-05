package com.kh.book.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;

import com.kh.book.model.dao.BookDAO;
import com.kh.book.model.dto.BookDTO;

public class BookService {
	private Connection conn = null;
	
	
	
	public BookService() {
		this.conn = getConnection();
	}



	public int insertBook(BookDTO bto) {
		int result = new BookDAO().insertBook(conn, bto);
		
		if(result > 0) {
			commit(conn);
		}
		close(conn);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	

}
