package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


//import stepDefinition.Baseclass;

public class createAccountPage{
	WebDriver ldriver;

	public createAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	//Personal Address
	    By patitle=By.xpath("//div[@class='account_creation']//div[@class='clearfix']");
		
	   // By paFirst_Name=By.id("customer_firstname");
	   // By paFirst_Name=By.xpath("//input[@id='customer_firstname']");
		//By paLast_Name=By.xpath("//input[@id='customer_firstname']");
		//By paPassword=By.xpath("//input[@id='passwd']");
	    
	    By txtAdd1firstName=By.xpath("//input[@id='customer_firstname']");
	    By txtAdd1LastName=By.xpath("//input[@id='customer_lastname']");
	    By txtAdd1Password=By.xpath("//input[@id='passwd']");
		
		By txtAdd2_FirstName=By.xpath("//input[@id='firstname']");
		By txtAdd2_LastName=By.xpath("//input[@id='lastname']");
		By txtAdd2_Company=By.xpath("//input[@id='company']");
		By txtAdd2_Address1=By.xpath("//input[@id='address1']");
		By txtAdd2_Address2=By.xpath("//input[@id='address2']");
		By txtAdd_City=By.xpath("//input[@id='city']");

		By dropdownAdd_State=By.xpath("//select[@id='id_state']");
		By txtAdd_Postalcode=By.xpath("//input[@id='postcode']");
		By dropdownAdd_Country=By.xpath("//select[@id='id_country']");
		By txtAdd_phone_mobile=By.xpath("//input[@id='phone_mobile']");
		By txtAdd_alias=By.xpath("//input[@id='alias']");
		By btnRegister= By.xpath("//span[normalize-space()='Register']");
		
		
		
		
		//Personal Address Method
		public void setPersonalFirstName(String firstname)  {
			
			
				ldriver.findElement(txtAdd1firstName).sendKeys(firstname);
			
		}

		public void setPersonalLastName(String lastname) {
			
			ldriver.findElement(txtAdd1LastName).sendKeys(lastname);
			
		}

		public void setPersonalPassword(String password) {
			
			ldriver.findElement(txtAdd1Password).sendKeys(password);
			
		}
		
public void setAddressFirstName(String firstname)  {
		ldriver.findElement(txtAdd2_FirstName).sendKeys(firstname);
			
		}

public void setAddressLastName(String lastname)  {
	ldriver.findElement(txtAdd2_LastName).sendKeys(lastname);
		
	}
public void setAddressCompanyName(String companyname)  {
	ldriver.findElement(txtAdd2_Company).sendKeys(companyname);
	
		}
public void setAddress1(String address1)  {
	ldriver.findElement(txtAdd2_Address1).sendKeys(address1);
	
		}
public void setAddress2(String address2)  {
	ldriver.findElement(txtAdd2_Address2).sendKeys(address2);
	
		}

public void setAddressCity(String city)  {
	ldriver.findElement(txtAdd2_Address2).sendKeys(city);
	
		}

public void setdropdownAdd_State(String value) {
	Select sel=new Select(ldriver.findElement(dropdownAdd_State));
	sel.deselectByVisibleText(value);
}

public void setdropdownAdd_Country(String value) {
	Select sel=new Select(ldriver.findElement(dropdownAdd_Country));
	sel.deselectByVisibleText(value);
}

public void setPostal(String postal)  {
	ldriver.findElement(txtAdd_Postalcode).sendKeys(postal);
	
		}

public void SetMobilenumber(String mobilenumber)  {
	ldriver.findElement(txtAdd_phone_mobile).sendKeys(mobilenumber);
	
		}

public void SetAliasAdd(String aliasAddress)  {
	ldriver.findElement(txtAdd_alias).sendKeys(aliasAddress);
	
		}



public void SetRegister_button_click()  {
	ldriver.findElement(btnRegister).click();
	
		}

}
