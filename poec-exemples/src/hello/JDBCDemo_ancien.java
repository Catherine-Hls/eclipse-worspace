package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class JDBCDemo_ancien {

	public static User mapResultSetToUser(ResultSet rs) throws SQLException {
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));
		
		return u;
	}
	public static void main(String[] args) {
		// Connexion au serveur de DB - java 7+
		//appel automatique de la méthode close
		
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/poec?serverTimezone=UTC", "root", "rootroot")) {
			Statement stmt = conn.createStatement();
			//stmt.executeUpdate() // insert into, delete from, update
			//stmt.executeQuery() // select
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM user");
			
			List<User> users = new ArrayList<>();
			while (rs.next()) {
				User u = mapResultSetToUser(rs);
				users.add(u);
			}
			System.out.println(users);
			
			/*while (rs.next()) {
				User u = mapResultSetToUser(rs);
				System.out.println(u);
				System.out.println("-----------------------------------------");
			}*/
			/*for (;;) {
				if(! rs.next()) {
					break;
				}
				User u = mapResultSetToUser(rs);
				System.out.println(u);
				System.out.println("-----------------------------------------");
			}*/
			
		/*	rs.next();
			User u1 = mapResultSetToUser(rs);
			System.out.println(u1);
			System.out.println("-----------------------------------------");
			
			rs.next();
			User u2 = mapResultSetToUser(rs);
			System.out.println(u2);
			System.out.println("-----------------------------------------");*/
			
			/*rs.next();
			User u1 = new User();
			u1.setId(rs.getInt("id"));
			u1.setUsername(rs.getString("username"));
			u1.setPassword(rs.getString("password"));
			u1.setEmail(rs.getString("email"));*/
			
			/*System.out.println(rs.getInt(1));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			System.out.println("-----------------------------------------");
			rs.next();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			System.out.println("-----------------------------------------");*/
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		UserRepository userRepo = new UserRepository();
		List<User> users = userRepo.findAllUsers();
		System.out.println(users);
		
		//User u = userRepo.findUserById();
	}

}
