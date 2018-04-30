package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommentRepository {

	private Comment mapResultSetToComment(ResultSet rs) throws SQLException  {
		Comment c = new Comment();
		c.setId(rs.getInt("id")); 
		c.setContent(rs.getString("content"));
		c.setPublicationDate(rs.getString("publicationDate"));

		return c;
	}
	/**
	 * Fetch every user.
	 * @return all the users
	 * @throws RuntimeException if something went wrong
	 */
	public List<Comment> findAll() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {
			
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery("SELECT * FROM comment");
			
			List<Comment> comments = new ArrayList<>();
			
			while(rs.next()) {			
				Comment c = mapResultSetToComment(rs);
				comments.add(c);
			}
			
			return comments;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Fetch a user by its id.
	 * @param id the user id
	 * @return the user corresponding to the id or null if no user was found
	 * @throws RuntimeException if a problem occurs.
	 */
	public Comment findById(int id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM comment WHERE id = ?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			return mapResultSetToComment(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}

