package com.kh.librarymember.controller;

import com.kh.librarymember.model.vo.LibraryMember;

public class LibraryMemberController {

	public int memberInsert(String memberName, String memberPhone) {
		
		LibraryMember lm = new LibraryMember(memberName, memberPhone);
		
		int result = new LibraryMember().memberInsert(lm);
		
		return result;
		
	}
	
}
