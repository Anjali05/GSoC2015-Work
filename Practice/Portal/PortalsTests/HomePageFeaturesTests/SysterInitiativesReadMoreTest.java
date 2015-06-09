package HomePageFeaturesTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import CommonTests.*;
import CommonTests.CommonTests;
import HomepageFeatures.Homepage;

public class SysterInitiativesReadMoreTest extends CommonTests
{

	static String s="SystersInitiative";
	public SysterInitiativesReadMoreTest() 
	{
		super(s);
		
	}

	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersInitiativesPage());
	}

}
