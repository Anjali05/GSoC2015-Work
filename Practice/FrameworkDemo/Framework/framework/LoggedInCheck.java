package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * @author Anjali
 */

public class LoggedInCheck 
{

	public static boolean IsAt() 
	{
		
		//Check for logout button to check correct login
		WebElement check=Driver.Instance.findElement(By.xpath(".//*[@id='dokuwiki__usertools']/ul/li[3]/a"));
		String str_check=check.getText();
	    System.out.println(str_check);
	    if(str_check.equals("Logout"))
	    	return true;
	    else
	       return false;
	}

}


