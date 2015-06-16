package HomePageFeaturesTests;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/


public class SystersAndCRAwReadMoreTest extends CommonTests
{
	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,Homepage.IsAtSystersCRAWPage());
	}

}
