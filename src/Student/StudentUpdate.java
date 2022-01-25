package Student;

import java.sql.*;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "4399";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

		String sql = "UPDATE student SET stud_no=?, stud_name=?, stud_DOB=?, stud_DOJ=?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "2");
		statement.setString(2, "sham");
		statement.setString(3, "14/07/1999");
		statement.setString(4, "05/02/2022");

		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
			System.out.println("An existing record was updated successfully!");
		}


	} catch (SQLException ex) {
		ex.printStackTrace();
	}}
	}


