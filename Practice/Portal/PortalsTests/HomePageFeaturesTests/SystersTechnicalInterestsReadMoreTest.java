package HomePageFeaturesTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

public class SystersTechnicalInterestsReadMoreTest extends CommonTests
{

	static String s="SystersTechnicalInitiative";
	public SystersTechnicalInterestsReadMoreTest() 
	{
		super(s);
		
	}

	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersTechnicalInitiativePage());
	}

}
