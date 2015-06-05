package Tests;
import org.junit.Assert;
import org.junit.Test;

import Login.EditPage;
import Login.LoginPage;
import Login.ViewUpdate;

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
		EditPage.Goto();
		EditPage.ChangeLastnameTo("Kumar").Update();
		Assert.assertEquals("Failed",true,ViewUpdate.HasChanged());	
	}

}
