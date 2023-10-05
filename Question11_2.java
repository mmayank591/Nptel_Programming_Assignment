import java.sql.*;
import java.lang.*;
public class UpdateData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              String query="";
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
          ~~~THERE IS SOME INVISIBLE CODE HERE~~~
            query="UPDATE Players SET First_Name='Rama',Last_Name='Gopala',Age=24 WHERE UID=1;";
stmt.executeUpdate(query);
          ~~~THERE IS SOME INVISIBLE CODE HERE~~~
            }
                catch(Exception e){ System.out.println(e);}  
	}  
}
