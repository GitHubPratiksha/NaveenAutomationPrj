package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.baseClass;

public class FooterPOM  {
	public WebDriver driver;
	public FooterPOM(WebDriver driver2) {
		 this.driver= driver2;
	}
		
	//Information 
	By aboutUs= By.xpath("//a[text()='About Us']");
	By deliveryInfo= By.xpath("//a[text()='Delivery Information']");
	By privacyPolicy= By.xpath("//a[text()='Privacy Policy']");
	By termsConditions= By.xpath("//a[text()='Terms & Conditions']");
	public WebElement aboutUs() {
			
			return driver.findElement(aboutUs);	

	}
	public WebElement deliveryInfo() {
			
			return driver.findElement(deliveryInfo);	

	}
	public WebElement privacyPolicy() {
		
		return driver.findElement(privacyPolicy);	

}
	public WebElement termsConditions() {
		
		return driver.findElement(termsConditions);	

}
	//Customer Service
	By contactUs= By.xpath("//a[text()='Contact Us']");
	By returns= By.xpath("//a[text()='Returns']");
	By siteMap = By.xpath("//a[text()='Site Map']");
	
	public WebElement contactUs() {
			
			return driver.findElement(contactUs);	

	}
	public WebElement returns() {
			
			return driver.findElement(returns);	

	}
	public WebElement siteMap() {
		
		return driver.findElement(siteMap);	

	}

	//Extras
	By brands= By.xpath("//a[text()='Brands']");
	By giftCertificate= By.xpath("//a[text()='Gift Certificates']");
	By affiliate = By.xpath("//a[text()='Affiliate']");
	By specials = By.xpath("//a[text()='Specials']");
	
	public WebElement brands() {
			
			return driver.findElement(brands);	

	}
	public WebElement giftCertificate() {
			
			return driver.findElement(giftCertificate);	

	}
	public WebElement affiliate() {
		
		return driver.findElement(affiliate);	

	}
	public WebElement specials() {
		
		return driver.findElement(specials);	

	}
	
	//My Account
		By myAccount= By.xpath("//a[text()='My Account']");
		By orderHistory= By.xpath("//a[text()='Order History']");
		By wishList = By.xpath("//a[text()='Wish List']");
		By newsletter = By.xpath("//a[text()='Newsletter']");
		
		public WebElement myAccount() {
				
				return driver.findElement(myAccount);	

		}
		public WebElement orderHistory() {
				
				return driver.findElement(orderHistory);	

		}
		public WebElement wishList() {
			
			return driver.findElement(wishList);	

		}
		public WebElement newsletter() {
			
			return driver.findElement(newsletter);	

		}
	
}
