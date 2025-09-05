package com.kh.book.model.vo;

import java.sql.Date;
import java.util.Objects;

public class Book {
	private int bookNo;
	private String bookName;
	private String author;
	private int bookCode;
	private String bookLoan;
	private Date bookEnrollDate;
	
	
	public Book() {
		super();
	}
	public Book(int bookNo, String bookName, String author, int bookCode, String bookLoan, Date bookEnrollDate) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.bookCode = bookCode;
		this.bookLoan = bookLoan;
		this.bookEnrollDate = bookEnrollDate;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public int getBookCode() {
		return bookCode;
	}
	public String getBookLoan() {
		return bookLoan;
	}
	public Date getBookEnrollDate() {
		return bookEnrollDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookCode, bookEnrollDate, bookLoan, bookName, bookNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookCode == other.bookCode
				&& Objects.equals(bookEnrollDate, other.bookEnrollDate) && Objects.equals(bookLoan, other.bookLoan)
				&& Objects.equals(bookName, other.bookName) && bookNo == other.bookNo;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", author=" + author + ", bookCode=" + bookCode
				+ ", bookLoan=" + bookLoan + ", bookEnrollDate=" + bookEnrollDate + "]";
	}
	
	
	
	
	
	

}
