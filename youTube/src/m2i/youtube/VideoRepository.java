package m2i.youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoRepository {
	private Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
		// map the video
		Video v = new Video();
		v.setId(rs.getInt("id")); 
		v.setTitle(rs.getString("title"));
		v.setDescription(rs.getString("description"));
		v.setDuration(rs.getInt("duration"));
		v.setUrlminiature(rs.getString("urlminiature"));
		v.setUrlvideo(rs.getString("urlvideo"));
		v.setPublicationdate(rs.getString("registrationdate"));

		// map the user
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		//u.setPassword(rs.getString("password"));
		//u.setEmail(rs.getString("email"));
		u.setUrlavatar(rs.getString("urlavatar"));
		u.setRegistrationdate(rs.getString("registrationdate"));
		
		// map the comments
		Comment c = new Comment();
		c.setId(rs.getInt("id"));
		c.setContent(rs.getString("content"));
		c.setPublicationdate(rs.getString("publicationdate"));
		
		// map the relation video authored by user 
		v.setUser_id(u);
		
		return v;
	}


	/**
	 * Fetch a video by its id.
	 * @param id the video id
	 * @return the video corresponding to the id or null if no user was found
	 * @throws RuntimeException if a problem occurs.
	 */
	public Video findById(int id) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			// fetch the video
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT video.id, video.title, video.description, video.duration, video.urlminiature, video.urlvideo, video.publicationdate, user.username, user.registrationdate, user.urlavatar, comment.content, comment.publicationdate, user.id\r" + 
							"FROM video \r" + 
							"INNER JOIN user\r" + 
							"ON video.user_id = user.id\r" + 
							"INNER JOIN comment\r" + 
							"ON video.user_id = comment.user_id;");
			//pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			// fetch the author of the video
		/*	int authorId = rs.getInt("author_id");
			
			PreparedStatement pstmtAuthor = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtAuthor.setInt(1, authorId);
			
			ResultSet rsAuthor = pstmtAuthor.executeQuery();
			if(! rsAuthor.next()) { // should not be possible
				throw new RuntimeException("Video has no author"); 
			}*/
			
			// build the video instance from both resultSets
			return  mapResultSetToVideo(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void findTrending() {
		// TODO Auto-generated method stub
		
	}


	public void findRecommended() {
		// TODO Auto-generated method stub
		
	}


	public void findByID(long l) {
		// TODO Auto-generated method stub
		
	}


	
}
