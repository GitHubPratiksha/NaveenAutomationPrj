package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPagePOM {
	
	public WebDriver driver;
	
	 //Desktop 
	By desktop = By.xpath("//*[contains(text(),'Desktops')][1]");
	By showAllDesktop = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[2]");
	
	//Laptop and Notebooks
	
	By laptopDesktop= By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[1]");
	By showAllLapDesk= By.xpath("//*[contains(text(),'Show All Laptops & Notebooks')]");
	
	//Components 
	 
	By components = By.xpath("(//*[contains(text(),'Components')])[1]");
	By showAllCompo= By.xpath("(//*[contains(text(),'Show All Components')])[1]");
	
	//Tablets
	
	By tablets= By.xpath("(//*[contains(text(),'Tablets')])[1]");
	
	//Software
	
	By software = By.xpath("(//*[contains(text(),'Software')])[2]");
	
	//Phones and PDAs
	
	By phone= By.xpath("(//*[contains(text(),'Phones & PDAs')])[1]");
	
	//Cameras
	
	By cameras= By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33'])[1]");
	
	//MP3 Player
	
	By mp3= By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34'])[1]");
	By mp3options= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34_52']");
	
	public MainPagePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver2;
	}

	public WebElement desktop(){
		
		return driver.findElement(desktop);
	}
	
	public WebElement showAllDesktop() {
		
		return driver.findElement(showAllDesktop);
	}
	public WebElement laptopDesktop() {
		
		return driver.findElement(laptopDesktop);
	}
	public WebElement showAllLapDesk() {
		
		return driver.findElement(showAllLapDesk);
	}
	public WebElement components() {
		
		return driver.findElement(components);
	}
	public WebElement showAllCompo() {
		
		return driver.findElement(showAllCompo);
		
	}
	public WebElement tablets() {
		
		return driver.findElement(tablets);
	}
	public WebElement software() {
		
		return driver.findElement(software);
	}
	public WebElement phone() {
		
		return driver.findElement(phone);
	}
	public WebElement cameras() {
		return driver.findElement(cameras);
	}
	public WebElement mp3() {
		
		return driver.findElement(mp3);
	}
	public WebElement mp3options() {
		
		return driver.findElement(mp3options);
	}
}
