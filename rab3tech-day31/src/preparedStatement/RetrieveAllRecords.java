package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveAllRecords {
	static String dbURL = "jdbc:mysql://localhost:3306/studentsdb";
	static String username = "root";
	static String password = "Bickey@123";
	static Connection conn = null;

	public static void main(String[] args) {

		try {
			//1. Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				//2. Create a connection
				conn = DriverManager.getConnection(dbURL, username, password);
				//3. Create a statement - two interface available, PreparedStatement and Statement
				PreparedStatement ps = conn.prepareStatement("select * from students"); // retrieve all
																						// record from db

				//4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations except select operation.(It returns
				// int type value)
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					// System.out.println(rs.getInt("id") + "   " + rs.getString("name") + "   " + rs.getString("country") + "   " + rs.getString("email")); 
					 //OR we can do
					
					System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3)+ "   " + rs.getString(4));
				}
				//5. Close the connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}