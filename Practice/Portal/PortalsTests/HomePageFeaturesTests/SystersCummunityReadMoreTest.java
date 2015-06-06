package HomePageFeaturesTests;
import static org.junit.Assert.fail;
import HomepageFeatures.*;
import org.junit.Assert;
import org.junit.Test;
import CommonTests.HomepageCommonTests;
import Login.LoggedInCheck;


public class SystersCummunityReadMoreTest extends HomepageCommonTests
{

	static String s="CommunityReadMore";
	
	public SystersCummunityReadMoreTest()
	{
		super(s);
	}
	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersCommunitiesPage());
	}

}
