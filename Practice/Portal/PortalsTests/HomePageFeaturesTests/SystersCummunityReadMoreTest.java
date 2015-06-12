package HomePageFeaturesTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;


public class SystersCummunityReadMoreTest extends CommonTests
{

	static String s="CommunityReadMore";
	
	public SystersCummunityReadMoreTest()
	{
		//super(s);
	}
	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersCommunitiesPage());
	}

}
