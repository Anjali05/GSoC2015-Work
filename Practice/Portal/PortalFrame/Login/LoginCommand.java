package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand 
{


	private String username;
	private String password;
	private int index;
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
		
	    WebElement usrname=Driver.Instance.findElement(By.id("id_login"));
		usrname.clear();
		usrname.sendKeys(username);
		WebElement passwrd=Driver.Instance.findElement(By.id("id_password"));
		passwrd.clear();
		passwrd.sendKeys(password);
		WebElement signUp=Driver.Instance.findElement(By.xpath("//button[@type='submit']"));
		signUp.click();
	}
	
	public void GoogleLogin()
	{
		Driver.Instance.findElement(By.xpath("html/body/div[2]/div[1]/div/a[1]")).click();
	}
	public void FacebookLogin() 
	{
		Driver.Instance.findElement(By.xpath("html/body/div[2]/div[1]/div/a[2]")).click();
		
	}
	public void TwitterLogin() 
	{
		Driver.Instance.findElement(By.xpath("html/body/div[2]/div[1]/div/a[3]")).click();
		
	}
	public void GithubLogin() 
	{
		Driver.Instance.findElement(By.xpath("html/body/div[2]/div[1]/div/a[4]")).click();
	}
	
}
