package HomePageFeaturesTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import CommonTests.HomepageCommonTests;
import HomepageFeatures.Homepage;

public class SystersAndCRAwReadMoreTest extends HomepageCommonTests
{
	static String s="SystersCRA-W";
	public SystersAndCRAwReadMoreTest() 
	{
		super(s);
	}

	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersCRAWPage());
	}

}
