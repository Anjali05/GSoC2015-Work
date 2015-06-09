package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

public class EditPage 
{

	public static void Goto() 
	{
		WebElement EditButton= Driver.Instance.findElement(PageObjRef.Edit);
		EditButton.click();
		
	}

	public static UpdateCommand ChangeLastnameTo(String change) 
	{
		
		return new UpdateCommand(change);
	}
	

}
