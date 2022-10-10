package electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
	Connection con = null;
	Statement st = null;
	
	public Conn() {
		try {
			con = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "manager456");
			st = con.createStatement();
		}
		catch(SQLException se) {
			System.out.println("SQL Exception occured");
			se.printStackTrace();
		}
	}
}
