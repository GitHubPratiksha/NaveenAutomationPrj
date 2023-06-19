package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.FooterPOM;
import Resources.CommonUtilities;
import Resources.baseClass;


public class FooterTC extends baseClass {
	
	
	@Test
	public void FooterElements() throws InterruptedException {
	FooterPOM fpo= new FooterPOM(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Information
	fpo.aboutUs().click();
	fpo.deliveryInfo().click();
	fpo.privacyPolicy().click();
	fpo.termsConditions().click();
	
	//Customer Service
	
	fpo.contactUs().click();
	fpo.returns().click();
	fpo.siteMap().click();
	
	//Extras
	
	fpo.brands().click();
	fpo.giftCertificate().click();
	fpo.affiliate().click();
	fpo.specials().click();
	
	//My Account
	
	fpo.myAccount().click();
	fpo.orderHistory().click();
	fpo.wishList().click();
	fpo.newsletter().click();
	

	

}
}