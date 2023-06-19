package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.MainPagePOM;
import Resources.CommonUtilities;
import Resources.baseClass;

public class MainPageTC extends baseClass{
	
	//public WebDriver driver;
	@Test
	public void MainPage() throws InterruptedException {
		
		MainPagePOM mpo= new MainPagePOM(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Desktop mousehover
		CommonUtilities.mouseHover(mpo.desktop(), driver);
		mpo.showAllDesktop().click();
		
		//Laptop and Notebooks
		CommonUtilities.mouseHover(mpo.laptopDesktop(), driver);
		mpo.showAllLapDesk().click();
		
		//Component mousehover
		CommonUtilities.mouseHover(mpo.components(), driver);
		
		//MP3 Player
		CommonUtilities.mouseHover(mpo.mp3(), driver);
		mpo.mp3options().click();
		}

}
