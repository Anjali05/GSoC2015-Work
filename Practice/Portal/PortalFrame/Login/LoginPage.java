package Login;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;
public class LoginPage 
{
    public static String baseURL="http://127.0.0.1:8000/";
    public static int index;
	public static void Goto() 
	{
		
		//Driver.Instance.get(baseURL);
		WebElement login=Driver.Instance.findElement(PageObjRef.Login);
        login.click();
        
	}

	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}


}
