package LoginTests;

import junit.framework.Assert;

import org.junit.Test;

import CommonTests.CommonTestsLogin;
import Login.LoggedInCheck;

public class GithubLogintest extends CommonTestsLogin
{
	static String s="GithubLogin";
	public GithubLogintest() 
	{
		super(s);
		super.index=4;
		
	}
	
	@Test
	public void test()
    {
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGitHUbLogin());
	}

}
