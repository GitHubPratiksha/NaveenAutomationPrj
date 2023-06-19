package TestCases;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.AddToCartPOM;
import Resources.CommonUtilities;
import Resources.Constants;
import Resources.baseClass;

public class AddToCartTC extends baseClass {


@Test
public void MainPage() throws InterruptedException {

	AddToCartPOM apo=new AddToCartPOM(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//search iphone
	apo.search().sendKeys(Constants.searchIphone);
	apo.searchBtn().click();
	apo.addToCart().click();

	//price of iphone stored inside a string 
	
	String price1 = apo.productprice().getText();
	double d1= CommonUtilities.productprice(price1);
	
	apo.search().clear();
	
	//search samsung

		apo.search().sendKeys(Constants.searchSamsung);
		apo.searchBtn().click();
		apo.addToCart().click();
	
		//price of iphone stored inside a string 
		
		String price2 = apo.productprice().getText();
		double d2= CommonUtilities.productprice(price2);
		
		
		//total price
		
		double total= d1+d2;
		System.out.println("Total" +total);
		Thread.sleep(3000);
		
		
		//get text cart price
		
		apo.cartclick().click();
		String price3=apo.totalAmount().getText();
		double d3= CommonUtilities.productprice(price3);
		System.out.println("Cart Amount" +d3);
		
		if(total==d3) {
			System.out.println("Total amount matched");
		}else
		{
			System.out.println("Total amount not matched");
		}
	
	}
}
	
