package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Purchase {
WebDriver ldriver;
	public Purchase(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	 By purchaseCard=By.xpath("//b[normalize-space()='Cart']");
	 By purchaseT_Shirts=By.xpath("//li[@class='sfHoverForce sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']");
     By purchaseSort_By=By.xpath("//li[@class='sfHoverForce sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']");
     By purchaseAdd_To_Card=By.xpath("//li[@class='sfHoverForce sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']");
     By puchaseproceedToCheckout=By.xpath("//span[normalize-space()='Proceed to checkout']");
     
     
     public void setpurchaseCard(String card)  {
			
	ldriver.findElement(purchaseCard).sendKeys(card);
		
}
     
     public void setpurchasetshirt(String tshirt)  {
			
    		ldriver.findElement(purchaseT_Shirts).sendKeys(tshirt);
    			
    	}
     
     public void setpurchase(String sort_by)  {
			
 		ldriver.findElement(purchaseSort_By).sendKeys(sort_by);
 		
 			
 	}
     public void setpurchaseAdd_To_Card(String addtocard)  {
			
  		ldriver.findElement(purchaseSort_By).sendKeys(addtocard);
  		
  			
  	}
     public void setpuchaseproceedToCheckout(String proceedtocheckout)  {
			
   		ldriver.findElement(purchaseSort_By).sendKeys(proceedtocheckout);
   		
   			
   	}
     
}