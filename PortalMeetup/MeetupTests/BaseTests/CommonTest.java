package BaseTests;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import PortalHomePage.Homepage;
import WebDriver.Driver;

/*
 * @Copywrite Systers, an Anita Borg Institute Community
 * @author Anjali
 */

public class CommonTest 
{

	@Before
	public void InitDriver()
	{
		//Start Webdriver
		Driver.Initialise();
		
		//Navigating to the portal homepage
		Homepage.Goto(); 
	}
	
	@Test
	public void test()
	{
		fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception 
	{
		//Closing Webdriver after test
		Driver.close();
	}


}
