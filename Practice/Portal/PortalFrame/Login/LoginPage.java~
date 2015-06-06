package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
    public static String baseURL="http://127.0.0.1:8000/";
    public static int index;
	public static void Goto() 
	{
		
		Driver.Instance.get(baseURL);
		WebElement login=Driver.Instance.findElement(By.xpath("html" +
                "/body/div[1]/div/div[2]/ul[2]/li[2]/a"));
        login.click();
        
	}

	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}


}
