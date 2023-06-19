package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPOM {
	public WebDriver driver;
	By search= By.xpath("//input[@name='search']");
	By searchBtn= By.xpath("//span[@class='input-group-btn']");
	By addToCart= By.xpath("//div[@class='button-group']/button[@type='button']");
	public By productprice= By.xpath("//p[@class=\'price\']");
	By cartclick= By.xpath("//div[@id='cart']");
	By totalAmount= By.xpath("(//td[@class='text-right'])[12]");
	
	
	public AddToCartPOM(WebDriver driver2) {
		this.driver= driver2;
	}
	public WebElement search() {
		
		return driver.findElement(search);	

}
	public WebElement searchBtn() {
		return driver.findElement(searchBtn);
	}
	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}
	public WebElement productprice() {
		
		return driver.findElement(productprice);	

	}
	public WebElement cartclick() {
		
		return driver.findElement(cartclick);	

	}
		
	public WebElement totalAmount() {
		
		return driver.findElement(totalAmount);	

	}
	
	}
