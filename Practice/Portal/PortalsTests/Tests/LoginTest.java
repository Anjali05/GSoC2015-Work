package Tests;
import org.junit.Test;
import junit.framework.Assert;
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
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
	}
	

}
