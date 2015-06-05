package Tests;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Login.Driver;
import Login.LoggedInCheck;
import Login.LoginPage;


public class LoginTest 
{
    @Before
    public void InitDriver()
    {
    	String s="Login";
    	Driver.Initialize(s);
    	
    }
	@Test
	public void test() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
	}
	
	@After
	public void tearDown()
	{
		try 
		{
			Driver.close();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}


	

}
