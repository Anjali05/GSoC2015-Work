package Login;

import org.openqa.selenium.WebElement;

import PageElements.PageObjRef;
import WebDriver.Driver;

public class SignUpPage 
{

	static WebElement signup, username, Email, password, Confirmpassword, Submit;
	public static void GotoSignUp()
	{
	    signup = Driver.Instance.findElement(PageObjRef.SignUp);
		signup.click();
	}
	
	public static void CheckSignup()
	{
		
	}

	public static void EnterUsername(String usrname) 
	{
		
		username=Driver.Instance.findElement(PageObjRef.SignUpUsername);
		username.clear();
		username.sendKeys(usrname);
	}

	public static void EnterEmail(String email) 
	{
		Email=Driver.Instance.findElement(PageObjRef.SignUpEmail);
		Email.clear();
		Email.sendKeys(email);
		
	}

	public static void EnterPassword(String Password) 
	{
		password=Driver.Instance.findElement(PageObjRef.SignUpPassword);
		password.clear();
		password.sendKeys(Password);
		
	}

	public static void ConfirmPassword(String confirmpassword) 
	{
		Confirmpassword=Driver.Instance.findElement(PageObjRef.SignUpConfirmPassword);
		Confirmpassword.clear();
		Confirmpassword.sendKeys(confirmpassword);
		
	}

	public static void ClickSubmit() 
	{
		Submit=Driver.Instance.findElement(PageObjRef.SignUpSubmit);
		Submit.click();
	}
	
}
