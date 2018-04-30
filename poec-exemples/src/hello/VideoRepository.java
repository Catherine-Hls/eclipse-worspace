package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoRepository {
	private Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
		// maps the video
		Video v = new Video();
		v.setId(rs.getInt("id")); 
		v.setTitle(rs.getString("title"));

		// maps the user
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));
		
		// maps the relation video authored by user 
		v.setAuthor(u);
		
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
					conn.prepareStatement("SELECT video.title, video.description, video.duration, video.urlminiature, video.urlvideo, video.publicationdate, user.username, user.avatarurl, comment.content, comment.publicationdate \r\n" + 
							"FROM video \r\n" + 
							"INNER JOIN user\r\n" + 
							"ON video.user_id = user.id\r\n" + 
							"INNER JOIN comment\r\n" + 
							"ON video.user_id = comment.user_id;");
			/*pstmtVideo.setInt(1, id);*/
			
			ResultSet rs = pstmt.executeQuery();
			if(! rs.next()) { 
				return null; 
			}
			
			/*// fetch the author of the video
			int authorId = rsVideo.getInt("author_id");
			
			PreparedStatement pstmtAuthor = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtAuthor.setInt(1, authorId);
			
			ResultSet rsAuthor = pstmtAuthor.executeQuery();
			if(! rsAuthor.next()) { // should not be possible
				throw new RuntimeException("Video has no author"); 
			}
			
			// build the video instance from both resultSets
*/			return  mapResultSetToVideo(rs);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
