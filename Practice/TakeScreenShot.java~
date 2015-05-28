import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShot {

	public WebDriver driver;
	String url="http://google.com";
	
	@Test
	public void BrowserTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/shally/GSOC-2015/Workspace/MyWork_Gsoc_2015/chromedriver");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("testing")).sendKeys("test");//condition for test to fail
		
		
		
	}
	
	//takes screenshot of every test
	@After
    public void tearDown() throws IOException 
	{
		File scrshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//TakesScreenshot driver cannot be instantiated
		FileUtils.copyFile(scrshot, new File("/home/shally/GSOC-2015/screenshot1.png"));//copy the screen shot to the destination file
	    driver.close();
	}
	
	
	

}
