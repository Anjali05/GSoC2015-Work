package LoginTests;
import org.junit.Test;
import junit.framework.Assert;

import CommonTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginPage;


public class LoginTest extends CommonTests
{
	static String s="Login";
	public LoginTest() 
	{
		super(s);
	}

	@Test
	public void test() 
	{
		LoginPage.Goto();
		LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
	}
	

}
