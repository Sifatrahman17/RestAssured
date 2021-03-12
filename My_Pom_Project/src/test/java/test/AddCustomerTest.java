package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterpassWord("abc123");
		loginPage.clickOnSignInButton();

		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashBoardHeader();
		dashBoardPage.clickOnCustomerButton();
		dashBoardPage.clickOnAddCustomerButton();

		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertUserName("Selenium");
		addCustomerPage.insertCompanyName("Techfios");
		addCustomerPage.insertEmailAddress("abc@Techfion.com");
		addCustomerPage.enterCountryName("Paraguay");
		
	}

}
