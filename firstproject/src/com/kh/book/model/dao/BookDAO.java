package com.kh.book.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kh.book.model.dto.BookDTO;
import com.kh.common.JDBCTemplate;

public class BookDAO {
	Properties prop = new Properties();
	
	public BookDAO() {
		try {
			prop.loadFromXML(new FileInputStream("resources/book-mapper.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertBook(Connection conn, BookDTO bto) {
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = prop.getProperty("insertBook");
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bto.getBookName());
			pstmt.setString(2, bto.getAuthor());
			pstmt.setString(3, bto.getGenre());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	

}
