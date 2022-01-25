package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

	public static void main(String[] args) {     
		try
        {
           
			Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","4399");
 
            if (con != null)            
                System.out.println("Connected");           
            else           
                System.out.println("Not Connected");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

}
