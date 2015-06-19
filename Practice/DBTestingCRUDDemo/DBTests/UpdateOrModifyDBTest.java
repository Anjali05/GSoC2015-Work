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

/*This modifies/updates the database by inserting new row or
 * updating an existing row
 */

@RunWith(Parameterized.class)
public class UpdateOrModifyDBTest extends CommonTest
{
	private String query;
	
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][]{
				{"insert into userinfo values(130, 'Abhishek', 24, 'Bangalore')"},
				{"UPDATE userinfo SET userAge=20 where userName in ('Harry')"}
		});
	}
	
	public UpdateOrModifyDBTest(String query)
	{
		this.query=query;
	}
	
	@Test
	public void test() throws SQLException
	{
		ConnectToDB.stmt.executeUpdate(query);
		System.out.println();
		
		//Validate 
		ResultSet rs=ConnectToDB.stmt.executeQuery("select * from userinfo");
		System.out.println();
		    
		    while(rs.next())
		    {
		    	System.out.println("\tID : "+rs.getString(1)+"\tUsername : "+rs.getString(2)
				          +"\tAge :"+rs.getString(3)+"\tAddress : "+rs.getString(4));
		    }
		    
	 }
		
}


