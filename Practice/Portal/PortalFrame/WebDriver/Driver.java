package WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver 
{
	public static WebDriver Instance;
	public static String screenshot;
	public static void Initialize(String s)
	{
		screenshot=s;
		Instance=new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void close() throws IOException 
	{
		File scrshot=((TakesScreenshot)Instance).getScreenshotAs(OutputType.FILE);//TakesScreenshot driver cannot be instantiated
		FileUtils.copyFile(scrshot, new File("/home/shally/GSOC-2015/Workspace/Local_Workspace/" +
				                            "Portal/Screenshots/"+screenshot+".png"));
		Instance.close();
		
	}
}
