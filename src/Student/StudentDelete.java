package Student;

import java.sql.*;;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "4399";
           try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "DELETE FROM student WHERE stud_no=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(2, "sham");
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A Record was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		

	}

}
