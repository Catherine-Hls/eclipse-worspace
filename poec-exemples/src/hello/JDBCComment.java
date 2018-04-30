package hello;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCComment {
	public static Comment mapResultSetToComment(ResultSet rs) throws SQLException  {
		Comment c = new Comment();
		c.setId(rs.getInt("id"));
		c.setContent(rs.getString("content"));
		c.setPublicationDate(rs.getString("getPublicationDate"));
		return c;
	}
	
public static void main(String[] args) {
		CommentRepository commentRepo = new CommentRepository();
/*
		Comment c1 = commentRepo.findById(1);
		System.out.println(c1);
		Comment c2 = commentRepo.findById(2);
		System.out.println(c2);
		Comment c3 = commentRepo.findById(3);
		System.out.println(c3);	*/
	}
	
}