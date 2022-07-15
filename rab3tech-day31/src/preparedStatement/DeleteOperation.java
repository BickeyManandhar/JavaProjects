package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteOperation {
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
				PreparedStatement ps = conn.prepareStatement("delete from students where id=?"); // retrieve particular
																									// record from db
				ps.setInt(1, 8); 

				//4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations(insert, update, delete) except "select" operation.(It returns
				// int type value)
				int num = ps.executeUpdate();//it returns int value
				if(num>0) {
					System.out.println("Number of recorded deleted = "+num);
					System.out.println("Record successfully deleted. ");
				}
				else {
					System.out.println("Record failed to delete. ");
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