package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

public class UpdateCommand 
{

	
	private String change;

	public UpdateCommand(String change)
	{
		this.change=change;
	}

	public void Update() 
	{
	   WebElement Lastname=	Driver.Instance.findElement(PageObjRef.Lastname);
	   Lastname.clear();
	   Lastname.sendKeys(change);
	   WebElement Submit=Driver.Instance.findElement(PageObjRef.Submit);
	   Submit.click();
	   
	}

}
