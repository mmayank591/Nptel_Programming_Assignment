import java.sql.*;
import java.lang.*;
public class InsertData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
          ~~~THERE IS SOME INVISIBLE CODE HERE~~~
            String query="insert into PLAYERS(UID,first_name,last_name,age)"+"values(?,?,?,?)";
PreparedStatement preparedStmt = conn.prepareStatement(query);
PreparedStmt.setInt(1, 1);
PreparedStmt.setString(2, "Ram");
PreparedStmt.setString(3, "Gopal");
PreparedStmt.setInt(4, 26);
PreparedStmt.execute();
PreparedStatement preparedStmt 2 = conn.prepareStatement(query);
PreparedStmt2.setInt(1, 1);
PreparedStmt2.setString(2, "John");
PreparedStmt2.setString(3, "Mayer");
PreparedStmt2.setInt(4, 22);
PreparedStmt2.execute();

      ~~~THERE IS SOME INVISIBLE CODE HERE~~~
        }catch(Exception e){ System.out.println(e);}  
	}  
}
