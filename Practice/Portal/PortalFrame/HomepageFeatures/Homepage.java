package HomepageFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Login.Driver;

public class Homepage 
{
    static String URL;
    static WebElement ReadMore;
    public static String baseURL="http://127.0.0.1:8000/";
    public static void Goto()
    {
    	Driver.Instance.get(baseURL);
		
	}
	public static boolean IsAtSystersCommunitiesPage() 
	{
	    ReadMore=Driver.Instance.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/a"));
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("http://anitaborg.org/get-involved/systers/"))
		   return true;
		else
			return false;
	}
	public static boolean IsAtSystersCRAWPage() 
	{
	    ReadMore=Driver.Instance.findElement(By.xpath("html/body/div[2]/div[4]/div[1]/a"));
		ReadMore.click();
		
		for(String curURL : Driver.Instance.getWindowHandles())
	    {
	        Driver.Instance.switchTo().window(curURL);
	    }
		
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("http://anitaborg.org/get-involved/systers/systers-co-sponsored-cra-w-lists/"))
		   return true;
		else
			return false;
	}
	public static boolean IsAtSystersInitiativesPage() 
	{
		ReadMore=Driver.Instance.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/a"));
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
			
		if(URL.equals("http://anitaborg.org/get-involved/systers/systers-initiatives/"))
			 return true;
		else
			 return false;
	}
	public static Object IsAtSystersTechnicalInitiativePage() 
	{
		ReadMore=Driver.Instance.findElement(By.xpath("html/body/div[2]/div[5]/div[2]/a"));
		ReadMore.click();
			
		for(String curURL : Driver.Instance.getWindowHandles())
	    {	
			Driver.Instance.switchTo().window(curURL);
	    }
			
		URL=Driver.Instance.getCurrentUrl();
		System.out.println(URL);
			
		if(URL.equals("http://anitaborg.org/get-involved/systers/technical-interests/"))
			 return true;
		else
			 return false;
		
	}
	

}
