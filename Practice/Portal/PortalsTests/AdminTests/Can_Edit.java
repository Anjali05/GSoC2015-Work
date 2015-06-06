package AdminTests;
import org.junit.Assert;
import org.junit.Test;

import AdminFeatures.EditPage;
import AdminFeatures.ViewUpdate;
import CommonTests.CommonTestsLogin;
import Login.LoginPage;

public class Can_Edit extends CommonTestsLogin
{
	static String s="EditProfile";
	public Can_Edit() 
	{
		super(s);
		
	}

	@Test
	public void test()
	{
		EditPage.Goto();
		EditPage.ChangeLastnameTo("Kumar").Update();
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());	
	}

}
