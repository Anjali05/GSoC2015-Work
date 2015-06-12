package HomePageFeaturesTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

public class SysterInitiativesReadMoreTest extends CommonTests
{

	static String s="SystersInitiative";
	public SysterInitiativesReadMoreTest() 
	{
		//super(s);
		
	}

	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersInitiativesPage());
	}

}
