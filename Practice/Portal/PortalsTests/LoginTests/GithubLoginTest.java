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

public class GithubLoginTest extends CommonTests
{
	@Test
	public void test()
    {
		LoginPage.Goto();
		LoginCommand.GithubLogin();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtGitHUbLogin());
	}

}
