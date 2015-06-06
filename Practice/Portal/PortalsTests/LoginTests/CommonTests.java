package LoginTests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;

import Login.Driver;
import Login.LoginPage;

public class CommonTests 
{
	 String s;
	 public static int index;
	 public CommonTests(String s)
	 {
		this.s=s;
	 }
	 @Before
	 public void InitDriver()
	 {
	   	Driver.Initialize(s);
	   	LoginPage.Goto();
	   	
	   	//Default login
	   	switch(index)
	   	{
	   	//Google Login
	   	case 1:LoginPage.LoginAs("dummy").WithPassword("dummy").GoogleLogin();
	           break;
	   	//Facebook Login
	   	 case 2: LoginPage.LoginAs("dummy").WithPassword("dummy").FacebookLogin();
	   	         break;
	   	 //Twitter Login
	   	 case 3:LoginPage.LoginAs("dummy").WithPassword("dummy").TwitterLogin();
                break;
	   	 //Github Login        
	   	 case 4: LoginPage.LoginAs("dummy").WithPassword("dummy").GithubLogin();
	             break;
	     //Portal Login by default
	   	 default:LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
	   	         break;
	   	}
	   
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
