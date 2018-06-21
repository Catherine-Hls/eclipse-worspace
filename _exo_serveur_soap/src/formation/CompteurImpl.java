package formation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;

@WebService
public class CompteurImpl implements Compteur {

	private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    public CompteurImpl() {
    	
    	try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
	    connect = DriverManager.getConnection("jdbc:mysql://localhost/compteurdb?serverTimezone=UTC&user=root&password=rootroot");
    		Class.forName("com.mysql.cj.jdbc.Driver");
	    	statement = connect.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public void ecrire (String user, Integer cpt) {
		String req = String.format("update compteurs set compteur=%d where user='%s'",cpt, user);
		try {
			statement.execute(req);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Integer lire (String user) {
		String req = String.format("select value from compteurs where user='%s'", user);
		Integer v = 0;
		try {
			resultSet = statement.executeQuery(req);
	    	v= resultSet.getInt(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

    



}