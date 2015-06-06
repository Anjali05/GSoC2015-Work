package LoginTests;
import org.junit.Test;
import junit.framework.Assert;
import CommonTests.CommonTestsLogin;
import Login.LoggedInCheck;
import Login.LoginPage;


public class LoginTest extends CommonTestsLogin
{
	static String s="Login";
	public LoginTest() 
	{
		super(s);
	}

	@Test
	public void test() 
	{
		
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtFacebookLogin());
	}
	

}
