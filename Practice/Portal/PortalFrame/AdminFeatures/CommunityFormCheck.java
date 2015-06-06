package AdminFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Login.*;

public class CommunityFormCheck 
{

	public static boolean IsForm() 
	{
		       //Store the current window handle
				String oldURL = Driver.Instance.getWindowHandle();
				
				//Click operation
				Driver.Instance.findElement(By.xpath("html/body/div[1]/div/" +
						                    "div[2]/ul[1]/li[2]/a")).click();
			    Driver.Instance.findElement(By.xpath("html/body/div[1]/div/div[2]/" +
			    		                   "ul[1]/li[2]/ul/li[2]/a")).click();
			    
			   //Switch to new window opened
			    for(String curURL : Driver.Instance.getWindowHandles())
			    {
			        Driver.Instance.switchTo().window(curURL);
			    }
			        
			   // Perform the check
			    WebElement formtitle=Driver.Instance.findElement(By.xpath("html/body/div[1]/" +
			    		                                         "div/div[2]/div/h1"));
			    String check=formtitle.getText();
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
