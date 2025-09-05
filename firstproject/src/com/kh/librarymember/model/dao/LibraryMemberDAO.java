package com.kh.librarymember.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.common.JDBCTemplate;
import com.kh.librarymember.model.vo.LibraryMember;

public class LibraryMemberDAO {

	private Properties prop = new Properties();
	
	
	public LibraryMemberDAO() {
		
		try {
			prop.loadFromXML(new FileInputStream("resources/libarymember-mapper.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	System.out.println(prop + "test");
	}
	
	
	public int memberInsert(Connection conn, LibraryMember lm) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			prop.loadFromXML(new FileInputStream("resources/libarymember-mapper.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String sql = prop.getProperty("memberInsert");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, lm.getMemberName());
			pstmt.setString(2, lm.getMemberPhone());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		
		return result;
		
	}
	
	
	
	
}
