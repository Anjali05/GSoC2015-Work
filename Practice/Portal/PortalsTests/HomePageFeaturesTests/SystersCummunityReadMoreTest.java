package HomePageFeaturesTests;
import static org.junit.Assert.fail;
import HomepageFeatures.*;
import org.junit.Assert;
import org.junit.Test;
import CommonTests.CommonTests;
import Login.LoggedInCheck;


public class SystersCummunityReadMoreTest extends CommonTests
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
