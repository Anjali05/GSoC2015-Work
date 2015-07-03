package CommunityAdminPageTests;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityTransferOwnership;

/*
* @author Anjali
*/
/*
 * Checks if the community admin is able to transfer community ownership to other existing community member
 */
public class TransferCommunityOwnershipTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, CommunityTransferOwnership.CanTransferOwnership());
	}

}
