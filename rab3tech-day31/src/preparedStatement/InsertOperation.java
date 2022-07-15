package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertOperation {
	static String dbURL = "jdbc:mysql://localhost:3306/studentsdb";
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
				PreparedStatement ps = conn.prepareStatement("insert into students values(?,?,?,?)"); // retrieve
																										// particular
																										// record from
																										// db. Here
																										// there are 4
																										// question
																										// marks inside
																										// bracket which
																										// is to insert
																										// values in
																										// different
																										// column of the
																										// table of same id
				// first question mark is for id, second question mark is for name, third is for
				// country and fourth is for emailId 
				ps.setInt(1, 8);
				ps.setString(2, "Ramesh");
				ps.setString(3, "India");
				ps.setString(4, "r@yahoo.com");

				// 4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations(insert, update, delete) except
				// "select" operation.(It returns
				// int type value)
				int num = ps.executeUpdate();// it returns int value
				if (num > 0) {
					System.out.println("Number of recorded inserted = " + num);
					System.out.println("Record successfully inserted. ");
				} else {
					System.out.println("Number of recorded failed to insert = " + num);
					System.out.println("Record failed to insert. ");
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