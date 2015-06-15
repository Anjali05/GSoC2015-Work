package framework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * @author Anjali
 */

public class LoginPage 
{
    //opens url
	public static void GoTo() 
	{
		Driver.Instance.get("http://systers.org/systers-dev/doku.php");                                                  
	}

	//takes username
	public static LoginCommand LoginAs(String username) 
	{
		return new LoginCommand(username);
	}

}

