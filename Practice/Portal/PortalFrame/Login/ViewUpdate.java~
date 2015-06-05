package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewUpdate 
{

	public static boolean HasChanged()
	{
		
		 WebElement New=Driver.Instance.findElement(By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/a"));
		 String check=New.getText();
		 System.out.println(check);
		  if(check.equals("ANJALI SHALLY"))
			  return true;
		  else
			  return false;
	}

}
