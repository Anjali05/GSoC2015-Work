package PageElements;
import org.openqa.selenium.By;

public class PageObjRef
{
	//HomePage Elements
	public static By CommunityTab = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/a");
	public static By ChooseCommunity = By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[2]/ul/li[2]/a");
    public static By ReadMore1 = By.xpath("html/body/div[2]/div[2]/div[1]/a");
    public static By ReadMore2 = By.xpath("html/body/div[2]/div[4]/div[1]/a");
    public static By ReadMore3 = By.xpath("html/body/div[2]/div[3]/div[2]/a");
    public static By ReadMore4 = By.xpath("html/body/div[2]/div[5]/div[2]/a");
    
    //Community Proposal Form
    public static By FormTitle = By.xpath("html/body/div[1]/div/div[2]/div/h1");
    
    //Login Page
    public static By Login= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
    public static By username=By.id("id_login");
    public static By password=By.id("id_password");
    public static By SignIn=By.xpath("//button[@type='submit']");
    public static By Google=By.xpath("html/body/div[2]/div[1]/div/a[4]");
    public static By Facebook=By.xpath("html/body/div[2]/div[1]/div/a[3]");
    public static By Github=By.xpath("html/body/div[2]/div[1]/div/a[2]");
    public static By Twitter=By.xpath("html/body/div[2]/div[1]/div/a[1]");
    
    
    //User/Admin Profile Page
    public static By Edit= By.xpath("html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/a");
    public static By Lastname= By.id("id_last_name");
    public static By Submit=By.id("submit-id-save");
    public static By UpdatedName=By.xpath("html/body/div[1]/div/div[2]/ul[2]/li/a");
}
