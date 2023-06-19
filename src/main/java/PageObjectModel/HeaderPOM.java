package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPOM {
	
	public HeaderPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver= driver2;
	}
	
	public WebDriver driver;
	
	//Currency
	By currency= By.xpath("//div[@class='btn-group']");
	By currecnyoption= By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[1]");
	
	//Phone
	By phone= By.xpath("//i[@class='fa fa-phone']");
	By name= By.xpath("//input[@name='name']");
	By email= By.xpath("//input[@name='email']");
	By enquiry= By.xpath("//textarea[@name='enquiry']");
	By submit= By.xpath("//input[@type='submit']");
	
	//My account
	By myAccount= By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'])[1]");
	By login= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	By accountEmail= By.xpath("//input[@name='email']");
	By password= By.xpath("//input[@name='password']");
	By emailLogin= By.xpath("//input[@type='submit']");
	
	//WishList
	
	By wishList= By.xpath("//a[@id='wishlist-total']");
	By iphoneWishLst= By.xpath("(//button[@type='button'])[10]");
	By samsungWishLst= By.xpath("");
	
	
	//Currency methods
	public WebElement currency() {
		return driver.findElement(currency);
		
	}
	public WebElement currecnyoption() {
		
		return driver.findElement(currecnyoption);
	}
	
	
	//Phone methods 
	
	public WebElement phone() {
		
		return driver.findElement(phone);
	}
	
	public WebElement name() {
		
		return driver.findElement(name);
	}
	public WebElement email() {
		
		return driver.findElement(email);
	}

	public WebElement enquiry() {
		
		return driver.findElement(enquiry);
	}
	
	public WebElement submit() {
		
		return driver.findElement(submit);
	}
	//My account methods
	public WebElement myAccount() {
		return driver.findElement(myAccount);
		
	}
	
	public WebElement login() {
		
		return driver.findElement(login);
	}
	
	public WebElement accountEmail() {
		
		return driver.findElement(accountEmail);
	}
	
	public WebElement password() {
		
		return driver.findElement(password);	
	}
	
	public WebElement emailLogin() {
		
		return driver.findElement(emailLogin);
	}
	public WebElement wishList() {
		
		return driver.findElement(wishList);
	}
	
}

