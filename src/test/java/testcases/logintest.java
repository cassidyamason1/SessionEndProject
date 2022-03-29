package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.saucelabsLogin;

public class logintest extends saucelabsBase{

	@Test
	public void LoginFailureTest() {
		
		saucelabsLogin login = new saucelabsLogin();
		login.LoginFunction("xyz@gmail.com", "Abc@1234!");
	
		WebElement ErrorMessage = driver.findElement(By.xpath("//*[starts-with(text(),'Epic sadface')]"));
		String ActualMessage = ErrorMessage.getText();
		String ExpectedMessage = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertEquals(ActualMessage, ExpectedMessage);
	}
	@Test
	public void LoginSuccessTest() {
		
		saucelabsLogin login2 = new saucelabsLogin();
		login2.LoginFunction("standard_user","secret_sauce");
		
		
	}

}
