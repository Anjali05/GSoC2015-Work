package MeetupPage;

import org.openqa.selenium.WebElement;

import MeetupLocationPageFeatures.MeetupLocationPage;
import WebDriver.Driver;
import WebElements.PageObjModel;

/*
 * @author Anjali
 */

public class MeetupPageFeatures 
{
    //Validates proper navigation to meetup page
	public static boolean CanGotoMeetupPage() 
	{
		//Goto Meetup Page
		Driver.Instance.get(PageObjModel.baseURL+"meetup/"+PageObjModel.meetupLocationSlug+"/"+PageObjModel.MeetupSlug+"/");
		WebElement Date, Time;
		Date= Driver.Instance.findElement(PageObjModel.MeetupDate);
		Time= Driver.Instance.findElement(PageObjModel.MeetupTime);
		String date, time;
		date= Date.getText();
		time= Time.getText();
		
		//Validate
		if(date.startsWith("Date") && time.startsWith("Time"))
			return true;
		else
			return false;
	}

}
