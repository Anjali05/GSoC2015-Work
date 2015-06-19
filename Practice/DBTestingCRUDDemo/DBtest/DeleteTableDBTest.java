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
 * This deletes tables and validate deletion
 */

@RunWith(Parameterized.class)
public class DeleteTableDBTest extends CommonTest
{

	private String query;
	private String tablename;
    @Parameters
    public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][]{
				{"drop table userEducation","userEducation"} 
		});
    	
    }
    
    public DeleteTableDBTest(String query, String tablename)
    {
    	this.query=query;
    	this.tablename=tablename;
    }
    
	@Test
	public void test() throws SQLException
	{
		ConnectToDB.stmt.executeUpdate(query);
		System.out.println();
		
		//Validate creation
		DatabaseMetaData dbm = ConnectToDB.con.getMetaData();
		
		// check if table is removed
		ResultSet table = dbm.getTables(null, null,tablename, null);
		if (table.next())
		{
		  // Tabble exists
			System.out.println("Fail");
		}
		else {
		  // Table does not exist
			System.out.println("Success");
		}
		    
	}

}
