package HomePageFeaturesTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

public class SystersAndCRAwReadMoreTest extends CommonTests
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
