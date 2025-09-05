package com.kh.librarymember.model.service;

import java.sql.Connection;

import com.kh.librarymember.model.dao.LibraryMemberDAO;
import com.kh.librarymember.model.vo.LibraryMember;

public class LibraryMemberService {

	private Connection conn = null;
	
	public LibraryMemberService() {
		
		this.conn = getConnection();
	}
	
	private Connection getConnection() {
	
		return null;
	}

	private int memberInsert() {
		
		int result = new LibraryMemberDAO().memberInsert(conn, lm);
		
		if(result > 0) {
			commit(conn);
		}
			close(conn);
		
		
		return result;
		
	}
}
