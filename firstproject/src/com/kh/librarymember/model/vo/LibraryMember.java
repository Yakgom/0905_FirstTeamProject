package com.kh.librarymember.model.vo;

import java.util.Objects;

public class LibraryMember {

	private int memberNo;
	private String memberName;
	private String memberPhone;
	
	
	public LibraryMember() {
		super();
	}


	public LibraryMember(int memberNo, String memberName, String memberPhone) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}


	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
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


	@Override
	public int hashCode() {
		return Objects.hash(memberName, memberNo, memberPhone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryMember other = (LibraryMember) obj;
		return Objects.equals(memberName, other.memberName) && memberNo == other.memberNo
				&& Objects.equals(memberPhone, other.memberPhone);
	}


	@Override
	public String toString() {
		return "LibraryMember [memberNo=" + memberNo + ", memberName=" + memberName + ", memberPhone=" + memberPhone
				+ "]";
	}

	
	
	
	
}
