package com.kh.bookgenre.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.bookgenre.model.vo.BookGenre;

public class BookGenreDAO {

	private Properties prop = new Properties();

	public BookGenreDAO() {

		try {
			prop.loadFromXML(new FileInputStream("resources/bookgenre-mapper.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int save(Connection conn, BookGenre bookGenre) {

		int result = 0;

		String sql = prop.getProperty("save");

		try (PreparedStatement pstmt = conn.prepareStatement(sql);

		) {

			pstmt.setString(1, bookGenre.getGenreName());
			pstmt.setString(2, bookGenre.getLocationPlace());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public List<BookGenre> findAll(Connection conn) {

		List<BookGenre> bookGenres = new ArrayList<BookGenre>();

		String sql = prop.getProperty("findAll");

		try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rset = pstmt.executeQuery();

		) {

			while (rset.next()) {

				BookGenre bookGenre = new BookGenre(rset.getInt("GENRE_NO"), rset.getString("GENRE_NAME"),
						rset.getString("LOCATION_PLACE")

				);
				bookGenres.add(bookGenre);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bookGenres;

	}

	public int update(Connection conn, BookGenre bookGenre) {

		int result = 0;

		String sql = prop.getProperty("update");

		try (PreparedStatement pstmt = conn.prepareStatement(sql);

		) {
			
			pstmt.setString(1, bookGenre.getLocationPlace());
			pstmt.setString(2, bookGenre.getGenreName());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
	
	public int delete(Connection conn, BookGenre bookGenre) {
		
		int result = 0;
		
		String sql = prop.getProperty("delete");
		
		try(
			PreparedStatement pstmt = conn.prepareStatement(sql);
				
				
				){
			
			pstmt.setString(1, bookGenre.getGenreName());
			pstmt.setString(2, bookGenre.getLocationPlace());
			
			 result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

}
