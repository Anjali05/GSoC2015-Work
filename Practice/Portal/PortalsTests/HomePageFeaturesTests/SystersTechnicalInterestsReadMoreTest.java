package HomePageFeaturesTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import CommonTests.HomepageCommonTests;
import HomepageFeatures.Homepage;

public class SystersTechnicalInterestsReadMoreTest extends HomepageCommonTests
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
