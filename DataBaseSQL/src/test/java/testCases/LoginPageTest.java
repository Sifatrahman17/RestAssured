package testCases;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;

	@BeforeMethod
	public void setUp() {
		initializeDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	public void LoginTest() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
	//	loginpage.enterUserName("demo@techfios.com");
		 loginpage.enterUserName(DatabasePage.getData("username"));
		String uName = DatabasePage.getData("username");
		System.out.println("username:" + uName);
		Thread.sleep(5000);

		loginpage.enterPassword(DatabasePage.getData("password"));
		String pass = DatabasePage.getData("password");
		System.out.println("password:" + pass);
		Thread.sleep(5000);
		loginpage.clickSignInButton();

		takeScreenshotAtEndOfTest(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
