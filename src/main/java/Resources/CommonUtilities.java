package Resources;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Arrays;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {
	
	private static final ExpectedConditions ExpectedCondition = null;
	public static WebDriver driver;
	public static double productprice(String price1) {
		
		
			String price =price1;
			String pr[]=price.split("\\s+");
			System.out.println(Arrays.toString(pr));
			String a=pr[0];
			System.out.println("Method:"+a);
			String removeDoller=a;
			String AfterRemoveDoller=removeDoller.replaceAll("[$]","");
			System.out.println("Before parseDouble:"+AfterRemoveDoller);
			double d=Double.parseDouble(AfterRemoveDoller);
			System.out.println("After parseDouble:="+d);
			return d;
		}
	
	public static void explicitWait(int duration, WebElement element) {
		

		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
		   wb.until(ExpectedCondition.visibilityOf(element));
		
		
	}
	
	public static void dropdownHandle(WebElement b, int index) {
		
		WebElement dd= b;
		Select s= new Select(dd);
		s.selectByIndex(index);		
	}
	public static void dropdownByVisibleText(WebElement element1,String str) {
		WebElement dd1= element1;
		Select s1= new Select(dd1);
		s1.selectByVisibleText(str);	
		
	}
	
	public static void mouseHover(WebElement element2, WebDriver driver) throws InterruptedException {
		
		WebElement mh= element2;
		Actions action1= new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(mh).perform();
	}


}
