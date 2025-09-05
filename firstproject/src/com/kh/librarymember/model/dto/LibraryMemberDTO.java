package com.kh.librarymember.model.dto;

public class LibraryMemberDTO {

	private String memberName;
	private String memberPhone;
	private String newPhone;

	
	public LibraryMemberDTO() {
		super();
	}


	public LibraryMemberDTO(String memberName, String memberPhone, String newPhone) {
		super();
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.newPhone = newPhone;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberPhone() {
		return memberPhone;
	}


	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}


	public String getNewPhone() {
		return newPhone;
	}


	public void setNewPhone(String newPhone) {
		this.newPhone = newPhone;
	}

	
	
	
	
	
}
