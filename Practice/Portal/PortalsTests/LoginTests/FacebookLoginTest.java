package LoginTests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import Login.LoggedInCheck;

public class FacebookLoginTest extends CommonTests
{
	static String s="FacebookLogin";
	public FacebookLoginTest() 
	{
		super(s);
		super.index=2;
	}

	@Test
	public void test()
    {
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtFacebookLogin());
	}

}
