package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoggedInCheck 
{

	public static Object IsAt() 
	{
		WebElement check=Driver.Instance.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/h1"));
		String str_check=check.getText();
		System.out.println(str_check);
		 if(str_check.equals("Anjali Kumar"))
		    	return true;
		    else
		       return false;
		
	}

}
