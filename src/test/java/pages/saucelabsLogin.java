package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.saucelabsBase;

public class saucelabsLogin {

	
	WebDriver driver = saucelabsBase.driver;
	ExtentTest test = saucelabsBase.test;
	
	//===================== Web Elements ================================
	@FindBy(name = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "login-button")
	WebElement LoginButton;

	
	public saucelabsLogin() {
		
		PageFactory.initElements(driver, this); //identify which driver to create the locators
	}
	
	//==================== Functions ======================================
	
	public void LoginFunction(String UsernameVal, String PasswordVal) {
		         
		UserName.sendKeys(UsernameVal);
		//test.log(LogStatus.PASS, "Enter user name", "Username entered successfully");
		Password.sendKeys(PasswordVal);
		//test.log(LogStatus.PASS, "Enter password", "Password entered successfully");
		LoginButton.click();
		//test.log(LogStatus.PASS, "Click on the Login button", "Login button clicked successfully");
	}
		
	
}
