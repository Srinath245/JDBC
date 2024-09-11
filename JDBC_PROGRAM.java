package JDBC_CONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_PROGRAM  {

public void Read_table() throws Exception {
        try {
                String url = "jdbc:mysql://localhost:3306/JDBC";
                String user = "root";
                String pass = "5438";


                Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from user_details");

                rs.next();
                System.out.print(rs.getInt(1));
                con.close();
        }
        catch (Exception e)
        {
                System.out.print(" DATABASE NOT CONNECTED " + e);
        }
}



}
