package selectInterface;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	static String dbURL = "jdbc:mysql://localhost:3306/employeedb-day1";
	static String username = "root";
	static String password = "Bickey@123";
	static Connection conn = null;

	public static void main(String[] args) {

		try {
			// 1. Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				// 2. Create a connection
				conn = DriverManager.getConnection(dbURL, username, password);
				// 3. Create a statement - two interface available, PreparedStatement and
				// Statement
				/*
				 * PreparedStatement ps =
				 * conn.prepareStatement("select * from students where id=?"); // retrieve
				 * particular // record from db ps.setInt(1, 2); // ?=2
				 */

				Statement s = conn.createStatement(); // no parameter here
				String sql_query = "delete from employee where id=12"; // create a String
																									// variable and give
																									// sql query
				// to it with required values also.

				// 4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations except select operation.(It returns
				// int type value)
				int num = s.executeUpdate(sql_query); // pass the string variable that is story sql query as its
														// parameter
				if (num > 0) {
					System.out.println("Number of recorded deleted = " + num);
					System.out.println("Record successfully deleted. ");
				} else {
					System.out.println("Number of recorded failed to delete = " + num);
					System.out.println("Record failed to delete. ");
				}
				// 5. Close the connection
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}