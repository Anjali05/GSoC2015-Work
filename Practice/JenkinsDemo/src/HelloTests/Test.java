package HelloTests;

import static org.junit.Assert.*;
import Hello.HelloWorld;
import junit.framework.Assert;

public class Test 
{

	@org.junit.Test
	public void test() 
	{
		Assert.assertEquals(true, HelloWorld.check());
	}

}
