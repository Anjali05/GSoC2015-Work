package Tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

import Login.Driver;
import Login.LoginPage;

public class CommonTests 
{
	 String s;
	 public CommonTests(String s)
	 {
		this.s=s;
	 }
	 @Before
	 public void InitDriver()
	 {
	   	Driver.Initialize(s);
	   	LoginPage.Goto();
		LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
	    	
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
