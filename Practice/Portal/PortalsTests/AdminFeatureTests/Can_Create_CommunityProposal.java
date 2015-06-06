package AdminFeatureTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import AdminFeatures.CommunityFormCheck;
import Login.*;
import LoginTests.CommonTests;

public class Can_Create_CommunityProposal extends CommonTests
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
