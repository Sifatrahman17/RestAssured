package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinition {
	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() throws InterruptedException {
		System.out.println("User is on the Techfios login page");
		// driver = BrowserFactory.startBrowser();
		driver.get("https://techfios.com/billing/?ng=admin/");
		Thread.sleep(2000);
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String userName) {
		// loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws InterruptedException {
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws InterruptedException {
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws IOException {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	   loginPage.takeScreenshotAtEndOfTest(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}