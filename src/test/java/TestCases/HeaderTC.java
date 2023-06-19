package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AddToCartPOM;
import PageObjectModel.HeaderPOM;
import Resources.CommonUtilities;
import Resources.Constants;
import Resources.baseClass;

public class HeaderTC extends baseClass {
	@Test
	public void HeaderElements() {
		
		HeaderPOM hpo= new HeaderPOM(driver);
		AddToCartPOM apo= new AddToCartPOM(driver);
		
		//Currency
		
		hpo.currency().click();
		hpo.currecnyoption().click();
		
		//Phone
		
		hpo.phone().click();
		hpo.name().sendKeys(Constants.name);
		hpo.email().sendKeys(Constants.email);
		hpo.enquiry().sendKeys(Constants.enquiry);
		hpo.submit().click();
		
		//My Account
		
		hpo.myAccount().click();
		hpo.login().click();
		hpo.accountEmail().sendKeys(Constants.accountEmail);
		hpo.password().sendKeys(Constants.password);
		hpo.emailLogin().click();
		
		//WishList
		
		hpo.wishList().click();
		apo.search().sendKeys(Constants.searchIphone);
		apo.searchBtn().click();
		
		
		
	}
	
	

}
