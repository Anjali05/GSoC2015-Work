import static org.junit.Assert.fail;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import framework.*;;

/*
 * @author Anjali
 */

public class LoginTst {

	@Before
	public void init()
	{
		Driver.Initialize();
	}
	@Test
	public void UserLogin() 
	{
		LoginPage.GoTo();
		LoginPage.LoginAs("username").WithPassword("password").Login();
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAt());
		
	}
	
	@After
	public void close()
	{
		Driver.close();
	}

}
