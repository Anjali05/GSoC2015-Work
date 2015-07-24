package WebElements;
import org.openqa.selenium.By;

import WebDriver.Driver;

/*
 * @author Anjali
 */

/*
 * Keeps track of different WebElement used in the program
 */
public class PageObjModel 
{

	public static String baseURL="http://127.0.0.1:8000/";
	
	
	//Homepage
	public static By Login= By.xpath("html/body/div[1]/div/div[2]/ul[2]/li[2]/a");
	
	/*
	 * Change
	 */
	public static By MeetupLocations= By.xpath("");
	
	//LoginPage
	public static By username= By.id("id_login");
	public static By password= By.id("id_password");
	public static By SignIn= By.xpath("//button[@type='submit']");


	//Meetup Locations
	public static By MeetupLocationsTitle= By.xpath("html/body/div[2]/h2");
	public static By Map= By.xpath(".//*[@id='map-canvas']");
	//public static By Map= By.xpath("/html/body/div[2]/div[1]/div/div/div[2]");
	public static By SelectLocation= By.xpath("html/body/div[2]/div[2]/div[1]/a");
	
	//Meetup Location
	public static By MeetupLocTitle= By.xpath("html/body/div[2]/div[2]/div[1]/h1");
	public static String meetupLocationSlug="delhi";
	public static By MeetupLocAbout= By.xpath("html/body/div[2]/div[2]/div[3]/div[2]/a");
	public static By MeetupLocAboutTitle= By.xpath("html/body/div[2]/div[2]/div[2]/div/h3");
	
	/*
	 * To be changed after UI is complete
	 */
	public static By MeetupLocUpcoming= By.linkText("Upcoming");
	public static By MeetupLocPast= By.linkText("Past");
	public static By MeetupLocMembers= By.linkText("Members");
	public static By MeetupLocSponsors= By.linkText("Sponsors");
	
	//Meetup Location Actions
	
	/*
	 * To be changed after UI is complete
	 */

	public static By AddNewMeetup= By.linkText("Add New Meetup");
	public static By AddNewMember= By.linkText("Add New Member");
	public static By RemoveMembers= By.linkText("Remove Members");
	public static By ShowJoinRequests= By.linkText("Show Join Requests");
}