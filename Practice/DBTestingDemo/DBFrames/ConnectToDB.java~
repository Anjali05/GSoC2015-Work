package DBFrames;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConnectToDB 
{

	public static WebDriver Instance;
	public static String screenshot="Test";
	public static Connection con;
	
	public static void Initialize() throws ClassNotFoundException, SQLException
	{
		//screenshot=s;
		//Instance=new FirefoxDriver();
		//Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Class.forName(PageRefObj.JDBCDriver);
		Properties p =new Properties();
		p.put("user", PageRefObj.DBusername);
		p.put("password", PageRefObj.DBpassword);
	    con=DriverManager.getConnection(PageRefObj.ConnectionURL, p);
	}
	
	public static void close() throws IOException, SQLException 
	{
		//File scrshot=((TakesScreenshot)Instance).getScreenshotAs(OutputType.FILE);//TakesScreenshot driver cannot be instantiated
		//FileUtils.copyFile(scrshot, new File("/home/shally/GSOC-2015/Workspace/Local_Workspace/" +
				                         //   "Portal/Screenshots/"+screenshot+(int)(Math.random()*1000000)/100000+".png"));
		//Instance.close();
		con.close();
		
	}
}
