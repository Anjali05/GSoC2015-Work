package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditPage 
{

	public static void Goto() 
	{
		WebElement EditButton= Driver.Instance.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/a"));
		EditButton.click();
		
	}

	public static UpdateCommand ChangeLastnameTo(String change) 
	{
		
		return new UpdateCommand(change);
	}
	

}
