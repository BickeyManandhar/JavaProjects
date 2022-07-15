package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateOperation {
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
				PreparedStatement ps = conn.prepareStatement("update students set name=?, country=?, email=? where id=?"); // retrieve particular
				ps.setString(1, "Rama");	
				ps.setString(2, "USA");	
				ps.setString(3, "r@gmail.com");	// record from db
				ps.setInt(4, 8); 

				//4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations(insert, update, delete) except "select" operation.(It returns
				// int type value)
				int num = ps.executeUpdate();//it returns int value
				if(num>0) {
					System.out.println("Number of updated records = "+num);
					System.out.println("Record successfully updated. ");
				}
				else {
					System.out.println("Record failed to update. ");
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