package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand 
{


	private String username;
	private String password;
	public LoginCommand(String username) 
	{
		this.username = username;

	}
	public LoginCommand WithPassword(String password)
	{
		this.password=password;
		return this;
	}
	public void Login() 
	{
		//Driver.Instance.get(LoginPage.baseURL + "/");
		WebElement login=Driver.Instance.findElement(By.xpath("html" +
				                "/body/div[1]/div/div[2]/ul[2]/li[2]/a"));
		login.click();
		
		WebElement usrname=Driver.Instance.findElement(By.id("id_login"));
		usrname.clear();
		usrname.sendKeys(username);
		WebElement passwrd=Driver.Instance.findElement(By.id("id_password"));
		passwrd.clear();
		passwrd.sendKeys(password);
		WebElement signUp=Driver.Instance.findElement(By.xpath("//button[@type='submit']"));
		signUp.click();
		
		
		
	}
	
}
