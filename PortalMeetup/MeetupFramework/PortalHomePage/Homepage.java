package PortalHomePage;

import MeetupPageFeatures.PageObjModel;
import WebDriver.Driver;

/*
 * @Copywrite Systers, an Anita Borg Institute Community
 * @author Anjali
 */

public class Homepage 
{

	public static void Goto() 
	{
	   Driver.Instance.get(PageObjModel.baseURL);
	}

}
