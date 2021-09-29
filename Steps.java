package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObject.createAccountLoginPage;








public class Steps extends BaseClass {

	WebDriver ldriver;
	createAccountLoginPage	createAccountLoginPageObject;
	
	

@Given("User login Chrome Browser")
public void user_login_Chrome_Browser() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//Drivers//chromedriver.exe"); 
	ldriver =new ChromeDriver();
	createAccountLoginPageObject= new createAccountLoginPage(ldriver);
	
   
}

@When("Users open URL {string}")
public void users_open_URL(String url) {
	ldriver.get(url);
   
}

@When("Click sign in")
public void click_sign_in() {
	createAccountLoginPageObject.clickonlinkSign_in();
}

@Then("User can view Create Account Page")
public void user_can_view_Create_Account_Page() {

	
	String Actual_pagetitle=createAccountLoginPageObject.getPageTitle();
	String expected="Login - My Store";
	Assert.assertEquals(expected,Actual_pagetitle);
	
	
   
}

@When("User Enter email as {string}")
public void user_Enter_email_as(String email) {
	createAccountLoginPageObject.setEmail_Address(email);
    
}

@When("User  click on Create Account button")
public void user_click_on_Create_Account_button() throws InterruptedException {
	createAccountLoginPageObject.click_on_Create_Account_btn();
  
}






}
