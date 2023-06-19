package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public WebDriver driver;
	public Properties prop;
	public void initializeDriver() throws IOException {
		
		//Data reading 
		//FileInputStream fs= new FileInputStream("C:\\Users\\dixit\\eclipse-workspace\\MavenDemo\\src\\main\\java\\Resources\\Data.properties");
		
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//accessing data.properties file
		 prop= new Properties();
		//loading the files which is already read
		prop.load(fs);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dixit\\OneDrive\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			 
			//WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); // for specific version add browser version
			//WebDriverManager.chromedriver().setup(); // to run with udpated version of the browser
			driver= new ChromeDriver();  
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dixit\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

			    driver = new FirefoxDriver();   
		
			
		}
		else {
			
			System.out.println("browser value not found");
		}
		
		
		
	}
	
	@BeforeMethod
	//launch URL method 
	public void launchURL() throws IOException {
		
		initializeDriver();
		//this driver has scope
		String url= prop.getProperty("url");
		driver.get(url);
		
		
		
	}
	
	public void assertion() {
		
		SoftAssert sa= new SoftAssert();
		
	}

}
