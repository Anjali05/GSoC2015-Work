package AdminTests;
import org.junit.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import BaseTests.CommonTests;

/*
* @author Anjali
*/

public class CanEditTest extends CommonTests
{
	@Test
	public void test()
	{
		AdminLogin.login();
		EditPage.Goto();
		EditPage.ChangeLastnameTo("Kumar").Update();
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());	
	}

}
