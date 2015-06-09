package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

public class ViewUpdate 
{

	public static boolean HasChanged()
	{
		
		 WebElement UpdatedName=Driver.Instance.findElement(PageObjRef.UpdatedName);
		 String check=UpdatedName.getText();
		 System.out.println(check);
		  if(check.equals("ANJALI KUMAR"))
			  return true;
		  else
			  return false;
	}

}
