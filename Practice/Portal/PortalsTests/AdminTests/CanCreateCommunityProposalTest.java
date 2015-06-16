package AdminTests;
import junit.framework.Assert;
import org.junit.Test;
import AdminFeatures.AdminLogin;
import AdminFeatures.CommunityFormCheck;
import BaseTests.CommonTests;

/*
* @author Anjali
*/

public class CanCreateCommunityProposalTest extends CommonTests
{
  
	@Test
	public void test() 
	{
		AdminLogin.login();
		Assert.assertEquals("Failed",true,CommunityFormCheck.IsForm());
	}
	
}
