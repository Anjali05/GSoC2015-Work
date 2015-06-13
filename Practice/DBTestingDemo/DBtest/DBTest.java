package DBtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import DBFrames.ConnectToDB;
import DBFrames.PageRefObj;

import com.mysql.jdbc.Statement;

public class DBTest extends CommonTest
{


   @Test
   public void test() throws SQLException
   {
    Statement stmt = (Statement) ConnectToDB.con.createStatement();
   // ResultSet r=stmt.executeQuery("Insert into info values('shally',125)");
    ResultSet rs=stmt.executeQuery(PageRefObj.query);
    System.out.println();
    
    while(rs.next())
    {
    	System.out.println("\tID : "+rs.getString(1));
        System.out.println("\tUsername : "+rs.getString(2));
        System.out.println("\tAge : "+rs.getString(3));
        System.out.println("\tAddress : "+rs.getString(4));
    }
    
    
   }
   
}