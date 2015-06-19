package DBTests;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import DBFrame.ConnectToDB;

/*
 * @author Anjali
 */

/*
 * This reads data from the database according to the query
 */

@RunWith(Parameterized.class)
public class ReadDBTest extends CommonTest
{
  
   private String query;
	
   @Parameters
   public static Collection<Object[]> data(){
	return Arrays.asList(new Object[][]{
			{"select * from userinfo where userId =127"},
			{"select * from userinfo"}
	});
   }
	
	public ReadDBTest(String query)
	{
		this.query= query;
	}
	   
   
   @Test
   public void test() throws SQLException
   {
    ResultSet rs=ConnectToDB.stmt.executeQuery(query);
    System.out.println();
    
    while(rs.next())
    {
    	int id  = rs.getInt("userid");
        int age = rs.getInt("userage");
        String name = rs.getString("username");
        String city = rs.getString("useraddress");
    	System.out.println("\tID : "+id+"\tUsername : "+name
		          +"\tAge :"+age+"\tAddress : "+city);
    }
    
   }
   
}