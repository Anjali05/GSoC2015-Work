package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
    public static String baseURL="http://127.0.0.1:8000/";
	public static void Goto() 
	{
		
		Driver.Instance.get(baseURL);
		
	}

	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}


}
