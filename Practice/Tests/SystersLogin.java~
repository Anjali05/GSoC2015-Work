import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SystersLogin {

	    public WebDriver driver;
	    public String url="http://systers.org/systers-dev/doku.php";
	
	@Before
	public void Initialize()
	{
		
	       System.setProperty("webdriver.chrome.driver",
				"/home/shally/GSOC-2015/Workspace/Local_Workspace/chromedriver");//second parameter is 
		                                                                          //the location to chrome driver
              driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);           
	}
	
	@Test
	public void Login_Success() throws Exception 
	{
	     driver.get(url);
	     WebElement login_button=driver.findElement(By.linkText("Login"));
	     login_button.click();
			
	     //passing username and password
	     WebElement username, pass, Login, check;
	     username=driver.findElement(By.id("focus__this"));
	     username.clear();
	     username.sendKeys("dummyusername");//change before running
   	     pass=driver.findElement(By.name("p"));
   	     pass.clear();
  	     pass.sendKeys("dummypassword");//change before running
	     Login=driver.findElement(By.xpath(".//*[@id='dw__login']/div/fieldset/input"));
	     Login.click();
	     
	     //Check for logout button to check correct login
	     check=driver.findElement(By.xpath(".//*[@id='dokuwiki__usertools']/ul/li[3]/a"));
	     String str_check=check.getText();
	     System.out.println(str_check);
 	     Assert.assertEquals("Logout", str_check);
		    
	 
	}
	
	@Test
	public void Login_Fail()
	{
	     driver.get(url);
	     WebElement login_button=driver.findElement(By.linkText("Login"));
	     login_button.click();
		 
	     //Pass wrong combination of username and password
	     WebElement username, pass, Login, check;
	     username=driver.findElement(By.id("focus__this"));
	     username.clear();
	     username.sendKeys("xyz");
  	     pass=driver.findElement(By.name("p"));
  	     pass.clear();
 	     pass.sendKeys("abc");
	     Login=driver.findElement(By.xpath(".//*[@id='dw__login']/div/fieldset/input"));
	     Login.click();
	     
	     //check for logout button
	     check=driver.findElement(By.xpath(".//*[@id='dokuwiki__usertools']/ul/li[3]/a"));
	     String str_check=check.getText();
	     System.out.println(str_check);
	}
	
	@After
	public void close_driver()
	{
	     driver.close();
	}

}
