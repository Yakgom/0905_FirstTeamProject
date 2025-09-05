package com.kh.librarymember.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.librarymember.model.dao.LibraryMemberDAO;
import com.kh.librarymember.model.dto.LibraryMemberDTO;
import com.kh.librarymember.model.vo.LibraryMember;

public class LibraryMemberService {

	private Connection conn = null;

	
	public LibraryMemberService() {
		
		this.conn = getConnection();
	}
	

	public int memberInsert(LibraryMember lm) {
		
		int result = new LibraryMemberDAO().memberInsert(conn, lm);
		
		if(result > 0) {
			commit(conn);
		}
			close(conn);
		
		return result;
		
	}
	
	
	public int memberUpdate(LibraryMemberDTO ldto) {
		
		if(ldto.getNewPhone().length() > 20) {
			
			return 0;
		}
		
		LibraryMember lm = new LibraryMemberDAO().memberInsert(conn, ldto.getNewPhone());
		if(lm == null) {
			
			return 0;
		}
		
		
	}

}
