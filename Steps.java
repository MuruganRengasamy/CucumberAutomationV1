package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObject.createAccountLoginPage;








public class Steps extends BaseClass {

	WebDriver ldriver;
	//createAccountLoginPage	createAccountLoginPageObject;
	
	

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

@When("User enter PersonalFirstName as {string}")
public void user_enter_PersonalFirstName_as(String string) {
   
}

@When("User enter RersonalLastName as {string}")
public void user_enter_RersonalLastName_as(String string) {
   
}

@When("User enter PersonalPassword as {string}")
public void user_enter_PersonalPassword_as(String string) {
    
}

@When("user enter FirstName as {string}")
public void user_enter_FirstName_as(String string) {
   
}

@When("User enter LastName as {string}")
public void user_enter_LastName_as(String string) {
   
}

@When("User enter Address as {string}")
public void user_enter_Address_as(String string) {
    
}

@When("User enter City as {string}")
public void user_enter_City_as(String string) {
   
}

@When("User select State as {string}")
public void user_select_State_as(String string) {
    
}

@When("User enter Postal Code as {string}")
public void user_enter_Postal_Code_as(String string) {
   
}

@When("User enter Country as {string}")
public void user_enter_Country_as(String string) {
    
}

@When("User enter Mobile Number as {string}")
public void user_enter_Mobile_Number_as(String string) {
   
}

@When("User enter Alias Address as {string}")
public void user_enter_Alias_Address_as(String string) {
   
}

@When("User click Register button")
public void user_click_Register_button() {
   
}
@When("User click Add to the card")
public void user_click_Add_to_the_card() {
 
}

@When("User click Tshirt")
public void user_click_Tshirt() {
  
}

@When("User select tshirt")
public void user_select_tshirt() {
   
}

@When("User click to the Add to the card")
public void user_click_to_the_Add_to_the_card() {
   
}

@When("User click proceed to checkout")
public void user_click_proceed_to_checkout() {
   
}


@When("User logout this page")
public void user_logout_this_page() {
   
}







}
