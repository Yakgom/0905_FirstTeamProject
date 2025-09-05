package com.kh.bookgenre.model.vo;

import java.util.Objects;

public class BookGenre {

	private int genreNo;
	private String genreName;
	private String locationPlace;
	
	
	
	
	
	public BookGenre() {
		super();
	}
	
	public BookGenre(int genreNo, String genreName, String locationPlace) {
		super();
		this.genreNo = genreNo;
		this.genreName = genreName;
		this.locationPlace = locationPlace;
	}
	
	public BookGenre(String genreName, String locationPlace) {
		super();
		this.genreName = genreName;
		this.locationPlace = locationPlace;
	}
	
	public int getGenreNo() {
		return genreNo;
	}
	public String getGenreName() {
		return genreName;
	}
	public String getLocationPlace() {
		return locationPlace;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genreName, genreNo, locationPlace);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookGenre other = (BookGenre) obj;
		return Objects.equals(genreName, other.genreName) && genreNo == other.genreNo
				&& Objects.equals(locationPlace, other.locationPlace);
	}
	
	
	
	
	
}
