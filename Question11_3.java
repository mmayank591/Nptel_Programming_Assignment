import java.sql.*;
import java.lang.*;
public class DeleteData {
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
            // Execute the command in order to delete a row from the table
stmt.executeUpdate("DELETE FROM Players WHERE UID = 1;");
          ~~~THERE IS SOME INVISIBLE CODE HERE~~~
            }
                catch(Exception e){ System.out.println(e);}  
	}  
}
