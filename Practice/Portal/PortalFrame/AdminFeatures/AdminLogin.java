package AdminFeatures;
import Login.LoginPage;

/*
 * @author Anjali
 */

public class AdminLogin 
{
	public static void login()
	{
		LoginPage.Goto();
		LoginPage.LoginAs("Anjali").WithPassword("anjali").Login();
	}
}
