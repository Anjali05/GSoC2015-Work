package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoggedInCheck 
{

	public static boolean IsAt() 
	{
		WebElement check=Driver.Instance.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/h1"));
		String str_check=check.getText();
		System.out.println(str_check);
		 if(str_check.equals("Anjali Kumar"))
		    	return true;
		    else
		       return false;
		
	}

	public static boolean IsAtFacebookLogin()
	{
		if(Driver.Instance.getCurrentUrl().contains("https://www.facebook.com/login.php"))
		   return true;
		else
			return false;
	}

	public static boolean IsAtGitHUbLogin() 
	{
		if(Driver.Instance.getCurrentUrl().contains("https://github.com/login"))
		 return true;
		else
		 return false;
	}

	public static boolean IsAtGoogleLogin() 
	{

		if(Driver.Instance.getCurrentUrl().contains("https://accounts.google.com/ServiceLogin"))
		 return true;
		else
		 return false;
	}

	public static boolean IsAtTwitterLogin() 
	{
		if(Driver.Instance.getCurrentUrl().contains("https://twitter.com/login/"))
		  return true;
		else
		  return false;
	}

}
