package preparedDtatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrievalOperation {
	static String dbURL = "jdbc:mysql://localhost:3306/studentsdb";
	static String username = "root";
	static String password = "Bickey@123";
	static Connection conn = null;

	public static void main(String[] args) {

		try {
			// Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				// Create a connection
				conn = DriverManager.getConnection(dbURL, username, password);
				// Create a statement - two interface available, PreparedStatement and Statement
				PreparedStatement ps = conn.prepareStatement("select * from students where id=?");
				ps.setInt(1, 2); // ?=2

				// Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations except select operation.(It returns
				// int type value)
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("id") + "   " + rs.getString("name") + "   " + rs.getString("country")
							+ "   " + rs.getString("email"));
				}
				// Close the connection
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}