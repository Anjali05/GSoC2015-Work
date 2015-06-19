package DBtest;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import DBFrames.ConnectToDB;

/*
 * @author Anjali
 */

/*
 * This creates new tables and validate creation
 */

@RunWith(Parameterized.class)
public class CreateTableDBTest extends CommonTest
{
	private String query;
	private String tablename;
    @Parameters
    public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][]{
				{"create table userEducation(schoolName varchar(50), schoolCity varchar(50))","userEducation"} 
		});
    	
    }
    
    public CreateTableDBTest(String query, String tablename)
    {
    	this.query=query;
    	this.tablename= tablename;
    }
	@Test
	public void test() throws SQLException
	{
		ConnectToDB.stmt.executeUpdate(query);
		System.out.println();

		//Validate
		DatabaseMetaData dbm = ConnectToDB.con.getMetaData();
		// check if table is there
		ResultSet table = dbm.getTables(null, null,tablename, null);
		if (table.next())
		{
		  // Table exists
			System.out.println("Success");
		}
		else {
		  // Table does not exist
			System.out.println("Fail");
		}
		    
	 
	}

}
