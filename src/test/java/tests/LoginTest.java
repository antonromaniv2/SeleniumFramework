package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = utilities.DriverFactory.open();
		driver.get("https://vishnu-main.linksquares.dev/users/sign_in"); 
	}

	@Test
	public void Login() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmail("administrator@example.com");
		loginPage.setPassword("password1234");
		loginPage.clickLogin();
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h1[1]")).getText();
		
		Assert.assertTrue(text.contains("Welcome to Vishnu"));
	}

	@AfterMethod
	public void afterMethod() {
		
		//driver.close();
		
	}
	
}
