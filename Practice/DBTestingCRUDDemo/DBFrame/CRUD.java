package DBFrame;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author Anjali
 */

public class CRUD 
{

	static ResultSet rs;

        //Creates new table and checks creation 
	public static boolean CanCreate(String Query, String tablename) throws SQLException
	{
		ConnectToDB.stmt.executeUpdate(Query);
		System.out.println();

		//Validate creation
		DatabaseMetaData dbm = ConnectToDB.con.getMetaData();
		
                // To check if table is there
		ResultSet table = dbm.getTables(null, null,tablename, null);
		if (table.next())
		{
		  // Table exists
			return true;
		}
		else 
		{
		  // Table does not exist
			return true;
		}
		
	}
	
        //Inserts new tuple into the created table and verifies
	public static boolean CanInsert(String Query) throws SQLException
	{
		int s=ConnectToDB.stmt.executeUpdate(Query);//returns 1 on successful insertion
		
		//Validate insert
		if(s==1)
		 return true;
		else return false;
	}
	
        //Reads from inserted tuple and verifies
	public static boolean CanRead(String Query) throws SQLException
	{
		rs=ConnectToDB.stmt.executeQuery(Query);
		
		//Validate Read
		if(rs!=null)
		  return true;
		else
		 return false;
	}
	
        //Updates tuple and verifies
	public static boolean CanUpdate(String Query) throws SQLException
	{
		int s=ConnectToDB.stmt.executeUpdate(Query);//returns 1 on successful update
		
		//Validate Update
		if(s==1)
		 return true;
		else return false;
	}

        //Deletes tuple and verifies
	public static boolean CanDelete(String Query) throws SQLException
	{
		int s=ConnectToDB.stmt.executeUpdate(Query);//returns 1 on successful delete
		
		//Validate Delete
		if(s==1)
		 return true;
		else return false;
	}

	
}
