package LoginTests;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoggedInCheck;
import Login.LoginCommand;
import Login.LoginPage;

public class TwitterLoginTest extends CommonTests
{
    static String s="TwitterLogin";
	public TwitterLoginTest()
	{
		super(s);
	}

	@Test
	public void test()
	{
		LoginPage.Goto();
		LoginCommand.TwitterLogin();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtTwitterLogin());
	}

}
