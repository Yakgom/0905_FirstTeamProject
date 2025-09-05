package com.kh.book.model.dto;

public class BookDTO {
	private String bookName;
	private String author;
	private String genre;
	private String location;
	private String bookLoan;
	
	
	public BookDTO() {
		super();
	}
	
	public BookDTO(String bookName, String author, String genre) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
	}

	public BookDTO(String bookName, String author, String genre, String location, String bookLoan) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.location = location;
		this.bookLoan = bookLoan;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBookLoan() {
		return bookLoan;
	}

	public void setBookLoan(String bookLoan) {
		this.bookLoan = bookLoan;
	}
	
	
	
	

}
