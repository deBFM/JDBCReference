package test;
import java.sql.*;

public class FirstConnection {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:hsqldb:file:myFileDatabase\\db", "ds", "ds");
		 Statement stmt = con.createStatement();

//	      stmt.executeUpdate( "INSERT INTO CUSTOMER " +
//	         "VALUES(50,'Christian','Ullenboom','Immengarten 6','Hannover')" );

	      ResultSet rs = stmt.executeQuery( "SELECT * FROM Customer" );

	      while ( rs.next() )
	        System.out.printf( "%s, %s %s%n", rs.getString(1),
	                           rs.getString(2), rs.getString(3) );

	      rs.close();

	      stmt.close();
		
	}

}
