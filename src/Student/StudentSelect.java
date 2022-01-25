package Student;

import java.sql.*;;

public class StudentSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "4399";
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "SELECT * FROM student";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			
			while (result.next()){
				String stud_no = result.getString(1);
				String stud_name = result.getString(2);
				String stud_DOB = result.getString(3);
				String stud_DOJ = result.getString(4);
				
				String output = "Student #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, stud_no, stud_name, stud_DOB, stud_DOJ));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}

}
