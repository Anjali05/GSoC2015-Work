package LoginTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginCommand;
import Login.LoginPage;

/*
* @author Anjali
*/

public class GoogleLoginTest extends CommonTests
{

	@Test
	public void test() 
	{
		LoginPage.Goto();
		LoginCommand.GoogleLogin();
		//System.out.println(new GoogleLoginTest().getClass());
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGoogleLogin());
	}

}
