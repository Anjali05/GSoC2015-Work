package Tests;

import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Login.*;
import Login.LoggedInCheck;
import Login.LoginPage;

public class Can_Create_CommunityProposal 
{

	 @Before
	 public void InitDriver()
	    {
	    	String s="CommunityProposal";
	    	Driver.Initialize(s);
	    	
	    }
	@Test
	public void test() 
	{
		LoginPage.Goto();
		Assert.assertEquals("Failed",true,CommunityFormCheck.IsForm());
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
