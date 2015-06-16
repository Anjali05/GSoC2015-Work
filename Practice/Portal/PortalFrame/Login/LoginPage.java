package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class LoginPage 
{
    public static int index;
	public static void Goto() 
	{
		WebElement login=Driver.Instance.findElement(PageObjRef.Login);
        login.click();   
	}

	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}


}
