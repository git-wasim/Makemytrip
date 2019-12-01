package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonUtils.BaseClass;
import pageObjects.CustomerPO;

public class Customer extends BaseClass {
	
	CustomerPO cpo;
	
	@Test(priority=1)
	public void customerModuleDisplayed() throws InterruptedException 
	{
		cpo = new CustomerPO(driver);
		System.out.println("Customer module displayed?"+" "+cpo.customer.isDisplayed());
//		cpo.customer.click();
		
	}	
		
	@Test(priority=2)
	public void customerButton() throws InterruptedException
	{
		cpo.customer.click();
		Thread.sleep(5000);
	}
		
}
