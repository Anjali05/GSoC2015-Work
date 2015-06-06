package LoginTests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import CommonTests.CommonTestsLogin;
import Login.LoggedInCheck;

public class GoogleLoginTests extends CommonTestsLogin
{

	static String s="GoogleLogin";
	public GoogleLoginTests() 
	{
		super(s);
		super.index=1;
		
	}

	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGoogleLogin());
	}

}
