package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * @author Anjali
 */

public class LoginCommand 
{
	private String usrname,password;
	public LoginCommand(String username)
	{
		this.usrname=username;
	}

	public LoginCommand WithPassword(String password) 
	{
		this.password=password;
		return this;
	}

	public void Login() 
	{
		
		WebElement login_button=Driver.Instance.findElement(By.linkText("Login"));
		login_button.click();
	    WebElement username, pass, Login;
	    username=Driver.Instance.findElement(By.id("focus__this"));
	    username.clear();
        username.sendKeys(usrname);//change before running
        pass=Driver.Instance.findElement(By.name("p"));
        pass.clear();
        pass.sendKeys(password);//change before running
        
        //login button
        Login=Driver.Instance.findElement(By.xpath(".//*[@id='dw__login']/div/fieldset/input"));
        Login.click();
        
        //Wait for driver to gain focus after javascript finishes running on the page
	    WebDriverWait wait=new WebDriverWait(Driver.Instance, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='dokuwiki__usertools']/ul/li[3]/a")));
        
       
		
	 }

}
