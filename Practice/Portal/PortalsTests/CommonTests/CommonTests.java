package CommonTests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import HomepageFeatures.*;
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
	   	Homepage.Goto();
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
