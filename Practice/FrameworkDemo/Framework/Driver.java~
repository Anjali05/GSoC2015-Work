package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//for singleton driver , so that same driver is user for checking
public class Driver 
{
	public static WebDriver Instance;

	public static void Initialize()
	{
		
		Instance =new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	public static void close() 
	{
		Instance.close();
		
	}


}
