package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.BaseClass;





public class createAccountLoginPage extends BaseClass  {
	
	public WebDriver ldriver;
	String rstr=createRandomString();
	

	public createAccountLoginPage(WebDriver rdriver)  {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By linkSign_in=By.xpath("//a[normalize-space()='Sign in']");
	By txtEmail_Address=By.xpath("//input[@id='email_create']");
	By btnCreate_an_account=By.xpath("//span[normalize-space()='Create an account']");



	By txtAdd_FirstName=By.xpath("//input[@id='firstname']");
	By txtAdd_LastName=By.xpath("//input[@id='lastname']");
	By txtAdd_Company=By.xpath("//input[@id='company']");
	By txtAdd_Address1=By.xpath("//input[@id='address1']");
	By txtAdd_Address2=By.xpath("//input[@id='address2']");
	By txtAdd_City=By.xpath("//input[@id='city']");

	By dropdownAdd_State=By.xpath("//select[@id='id_state']");
	By txtAdd_Postalcode=By.xpath("//input[@id='postcode']");
	By dropdownAdd_Country=By.xpath("//select[@id='id_country']");
	By txtAdd_phone_mobile=By.xpath("//input[@id='phone_mobile']");
	By txtAdd_alias=By.xpath("//input[@id='alias']");
	By btnRegister= By.xpath("//span[normalize-space()='Register']");
	
	//Action Methos
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	public void clickonlinkSign_in() {
		ldriver.findElement(linkSign_in).click();
	}
	
	public void setEmail_Address(String email) {
		
		ldriver.findElement(txtEmail_Address).sendKeys(rstr);
		
	}
	
	public void click_on_Create_Account_btn() throws InterruptedException {
		
		WebElement element =	ldriver.findElement(btnCreate_an_account);
		JavascriptExecutor js= (JavascriptExecutor)ldriver;
		try {
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(10000);
		
	}
	
	
	
	
	
	
	

	

}
