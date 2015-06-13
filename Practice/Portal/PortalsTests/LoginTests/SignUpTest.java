package LoginTests;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BaseTests.CommonTests;
import HomepageFeatures.Homepage;
import Login.LoggedInCheck;
import Login.SignUpCheck;
import Login.SignUpPage;

@RunWith(Parameterized.class)
public class SignUpTest extends CommonTests
{
	private String username;
	private String Email;
	private String password;
	private String Confirmpassword;
	
	@Parameters
	public static Collection<Object[]>data()
	{
		return Arrays.asList(new Object[][]{
				{"xyz","abc@gmail.com","pass12"},
				{" "," "," "}
		});
	}

	public SignUpTest(String username, String Email, String pass)
	{
		this.username=username;
		this.Email= Email;
		this.password=pass;
		this.Confirmpassword=pass;
	}
	
	@Test
	public void test()
	{
		Homepage.Goto();
		SignUpPage.GotoSignUp();
		SignUpPage.EnterUsername(username);
		SignUpPage.EnterEmail(Email);
		SignUpPage.EnterPassword(password);
		SignUpPage.ConfirmPassword(Confirmpassword);
		SignUpPage.ClickSubmit();
		Assert.assertEquals("Failed",true,SignUpCheck.HasSignedUp());
	}

}
