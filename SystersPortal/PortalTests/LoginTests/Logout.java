package LoginTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import BaseTests.CommonTests;
import Login.LoginPage;
import Login.LogoutCheck;

/*
* @author Anjali
*/

/*
 * Tests Logout
 */
public class Logout extends CommonTests
{

	@Test
	public void test() 
	{
		//Login
	    LoginPage.LoginAs("anjali").WithPassword("anjali").Login();
		
	    //Validate logout
	    Assert.assertEquals(true, LogoutCheck.HasLoggedOut());
	}

}
