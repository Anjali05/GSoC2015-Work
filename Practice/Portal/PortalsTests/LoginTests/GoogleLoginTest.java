package LoginTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginCommand;
import Login.LoginPage;

public class GoogleLoginTest extends CommonTests
{

	static String s="GoogleLogin";
	public GoogleLoginTest() 
	{
		super(s);
		
	}

	@Test
	public void test() 
	{
		LoginPage.Goto();
		LoginCommand.GoogleLogin();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGoogleLogin());
	}

}
