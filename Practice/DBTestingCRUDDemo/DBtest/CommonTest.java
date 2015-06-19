package DBtest;
import java.io.IOException;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import DBFrames.ConnectToDB;

/*
 * @author Anjali
 */

public class CommonTest
{

	@Before
	public void Init() 
	{
		try 
		{
			ConnectToDB.Initialize();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() throws SQLException
	{
		try 
		{
			ConnectToDB.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
