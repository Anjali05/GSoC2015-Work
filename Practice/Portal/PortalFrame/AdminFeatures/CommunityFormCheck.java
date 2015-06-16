package AdminFeatures;
import org.openqa.selenium.WebElement;
import PageElements.PageObjRef;
import WebDriver.Driver;

/*
* @author Anjali
*/

public class CommunityFormCheck 
{

	public static boolean IsForm() 
	{
		       //Store the current window handle
				String oldURL = Driver.Instance.getWindowHandle();
				
				//Click operation
				Driver.Instance.findElement(PageObjRef.CommunityTab).click();
			    Driver.Instance.findElement(PageObjRef.ChooseCommunity).click();
			    
			   //Switch to new window opened
			    for(String curURL : Driver.Instance.getWindowHandles())
			    {
			        Driver.Instance.switchTo().window(curURL);
			    }
			        
			   // Perform the check
			    WebElement FormTitle=Driver.Instance.findElement(PageObjRef.FormTitle);
			    String check=FormTitle.getText();
			    System.out.println(check); 
			    //Close the new window
			   // Driver.Instance.close();

			    //Switch back to original window
		        //Driver.Instance.switchTo().window(oldURL);
		        
		        if(check.equals("Anita Borg Institute Community Proposal Form"))
		        	return true;
		        else
		        	return false;
		        		
	}

}
