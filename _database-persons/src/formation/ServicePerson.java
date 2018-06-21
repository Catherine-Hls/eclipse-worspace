package formation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import formation.Person;

@ManagedBean (name="serviceperson", eager=true)
@SessionScoped
public class ServicePerson {
	Person person = new Person();
	
	public Person getPerson() {
	return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	public void addperson() throws Exception{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?serverTimezone=UTC", "root", "rootroot");
		String sql ="INSERT INTO person (`lastname`, `firstname`, `birthday`) VALUES (?, ?, ?)";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1, person.getLastname());
	    pstmt.setString(2, person.getFirstname());
	    pstmt.setString(3, person.getBirthday());
	    pstmt.executeUpdate();
	   
	    conn.close();	
	}	
	
	public static Person mapResultSetToPerson(ResultSet rs) throws SQLException {

		Person p = new Person();
		
		p.setLastname(rs.getString("lastname"));
		p.setFirstname(rs.getString("firstname"));
		p.setBirthday(rs.getString("birthday"));
		
		return p;
	}
		
		public List<Person> listperson() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?serverTimezone=UTC", "root", "rootroot");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM person");
				
		List<Person> persons = new ArrayList<>();
		while (rs.next()) {
			Person p = mapResultSetToPerson(rs);
			persons.add(p);
		}
		
	    conn.close();
	  
	    return persons;

	    
	    
			
	}	
	

	

}



	