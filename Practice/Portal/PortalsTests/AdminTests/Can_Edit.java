package AdminTests;
import org.junit.Assert;
import org.junit.Test;

import AdminFeatures.AdminLogin;
import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import CommonTests.CommonTests;
import Login.LoginPage;

public class Can_Edit extends CommonTests
{
	static String s="EditProfile";
	public Can_Edit() 
	{
		super(s);
		
	}

	@Test
	public void test()
	{
		AdminLogin.login();
		EditPage.Goto();
		EditPage.ChangeLastnameTo("Kumar").Update();
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());	
	}

}
