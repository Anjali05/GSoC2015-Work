package Tests;

import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Login.*;

public class Can_Edit 
{
	 @Before
	 public void InitDriver()
	 {
	   	String s="EditProfile";
	   	Driver.Initialize(s);
	    	
	  }

	@Test
	public void test()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
		EditPage.Goto();
		EditPage.ChangeLastnameTo("Shally").Update();
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());
		
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
