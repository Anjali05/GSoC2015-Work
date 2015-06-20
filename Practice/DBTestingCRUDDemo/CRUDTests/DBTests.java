package CRUDTests;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import DBFrame.CRUD;

/*
 * @author Anjali
 */

/*
 * To maintain order execution of test, i.e, create will happen first n deletion at last. FixedMethodOrder is used
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBTests extends CommonTest
{

	private String TableName= "dummytable";
	private String Query;
	
	//Create table
	@Test
	public void TestA_CreateTest() throws SQLException
	{
		Query="create table "+TableName+"(dummyID Int, dummyName varchar(50)," +
				       " dummyAge int, dummyCity varchar(50))";
		assertEquals("Failed", true, CRUD.CanCreate(Query,TableName));
	}
	
	
	//Insert tuple
	@Test
	public void TestB_InsertTest() throws SQLException
	{
		Query="insert into "+TableName+" values(125,'dummy1', 21, 'dummy2')";
		assertEquals("Failed", true, CRUD.CanInsert(Query));
		//fail("Not yet implemented");
	}
	
	//Read
	@Test
	public void TestC_ReadTest() throws SQLException
	{
		Query="select * from "+TableName+" where dummyID=125";
		assertEquals("Failed", true, CRUD.CanRead(Query));
	}
    
	//Update/Modify tuple
	@Test
	public void TestD_UpdateTest() throws SQLException
	{
		Query="update "+TableName+" set userAge=22 where dummyID=125";
		assertEquals("Failed", true, CRUD.CanUpdate(Query));
	}
	
	
	//delete tuple created
	@Test
	public void TestE_DeleteTest() throws SQLException
	{
		Query="delete from "+TableName+" where dummyID=125";
		assertEquals("Failed", true, CRUD.CanDelete(Query));
	}
}
