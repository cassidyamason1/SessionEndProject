package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;

public class saucelabsBase {

	public static WebDriver driver;
	public static ExtentTest test;
	
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
