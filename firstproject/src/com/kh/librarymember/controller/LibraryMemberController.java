package com.kh.librarymember.controller;

import com.kh.librarymember.model.dto.LibraryMemberDTO;
import com.kh.librarymember.model.service.LibraryMemberService;
import com.kh.librarymember.model.vo.LibraryMember;

public class LibraryMemberController {

	public int memberInsert(String memberName, String memberPhone) {
		
		LibraryMember lm = new LibraryMember(memberName, memberPhone);
		
		int result = new LibraryMemberService().memberInsert(lm);
		
		return result;
		
	}
	
	
	public int memberUpdate(String memberName, String memberPhone, String newPhone) {
		
		LibraryMemberDTO ldto = new LibraryMemberDTO(memberName, memberPhone, newPhone);
		
		int result = new LibraryMemberService().memberUpdate(ldto);
		
		return result;
		
		
	}
	
}
