package LoginTests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import CommonTests.CommonTests;
import Login.*;

public class FacebookLoginTest extends CommonTests
{
	static String s="FacebookLogin";
	public FacebookLoginTest() 
	{
		super(s);
	}

	@Test
	public void test()
    {
		LoginPage.Goto();
		LoginCommand.FacebookLogin();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtFacebookLogin());
	}

}
