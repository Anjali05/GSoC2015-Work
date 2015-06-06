package LoginTests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import Login.LoggedInCheck;

public class TwitterLoginTest extends CommonTests
{
    static String s="TwitterLogin";
	public TwitterLoginTest()
	{
		super(s);
		super.index=3;
	}

	@Test
	public void test()
	{
		Assert.assertEquals("Failed",true,LoggedInCheck.IsAtTwitterLogin());
	}

}
