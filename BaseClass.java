package stepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.createAccountLoginPage;
//import pageObject.createAccountPage;

public class BaseClass {
	public WebDriver ldriver;
	//public createAccountLoginPage createAccountLoginPageObject;
	//public createAccountPage createAccountPageObject;

	
		public static String createRandomString()
		{
			String generatedstring = RandomStringUtils.randomAlphabetic(8);
			
			 String emailaddress=generatedstring+"@gmail.com";
			
			return (emailaddress);
		}
	

}
