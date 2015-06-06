package AdminFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Login.Driver;

public class UpdateCommand 
{

	
	private String change;

	public UpdateCommand(String change)
	{
		this.change=change;
	}

	public void Update() 
	{
	   WebElement Lastname=	Driver.Instance.findElement(By.id("id_last_name"));
	   Lastname.clear();
	   Lastname.sendKeys(change);
	   WebElement Submit=Driver.Instance.findElement(By.id("submit-id-save"));
	   Submit.click();
	   
	}

}
