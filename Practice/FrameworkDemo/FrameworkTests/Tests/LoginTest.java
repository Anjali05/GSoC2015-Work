package Tests;
import static org.junit.Assert.fail;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import framework.*;;

/*
 * @author Anjali
 */

public class LoginTest {

	@Before
	public void init()
	{
		Driver.Initialize();
	}
	@Test
	public void UserLogin() 
	{
		LoginPage.GoTo();
		LoginPage.LoginAs("anjalis").WithPassword("anjali05").Login();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
		
	}
	
	@After
	public void close()
	{
		Driver.close();
	}

}
