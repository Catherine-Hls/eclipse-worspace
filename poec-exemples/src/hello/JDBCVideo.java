package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class JDBCVideo {
	
	public static Video mapResultSetToVideo(ResultSet rs) throws SQLException  {
		Video v = new Video();
		v.setId(rs.getInt("id"));
		//v.setAuthor(rs.getInt("author"));
		v.setTitle(rs.getString("title"));
		v.setDescription(rs.getString("description"));
		v.setDuration(rs.getInt("duration"));
		v.setPublicationDate(rs.getString("publicationDate"));
		v.setUrlMiniature(rs.getString("UrlMiniature"));
		v.setUrlVideo(rs.getString("UrlVideo"));

		return v;
	}
	
	public static void main(String[] args) {
		VideoRepository videoRepo = new VideoRepository();

		/*Video v1 = videoRepo.findById(4);
		System.out.println(v1);*/
		Video v2 = videoRepo.findById(2);
		System.out.println(v2);
		Video v3 = videoRepo.findById(3);
		System.out.println(v3);	
		
		//List<Video> videos = videoRepo.findAllVideos();
		//System.out.println(videos);
	}
}
