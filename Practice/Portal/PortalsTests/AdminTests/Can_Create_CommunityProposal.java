package AdminTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import AdminFeatures.CommunityFormCheck;
import CommonTests.CommonTestsLogin;
import Login.*;

public class Can_Create_CommunityProposal extends CommonTestsLogin
{
  
    static String s="CanCreateCommunity";
	public Can_Create_CommunityProposal() 
	{
		super(s);
		
	}
	@Test
	public void test() 
	{
		Assert.assertEquals("Failed",true,CommunityFormCheck.IsForm());
	}
	
}
