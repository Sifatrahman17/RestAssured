package TechfiosCopy;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {
	
		
	WebDriver driver;

	@Before
	public void launchBrowser() {

		// Setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// Creating web driver instance
		driver = new ChromeDriver();

		// Maximizing Browser
		driver.manage().window().maximize();

		// Get to the site
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() throws InterruptedException {

		// Identifying the username field pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// Identifying the password field pass password
		driver.findElement(By.id("password")).sendKeys("abc123");

		// Identifying the signin button and click
		//driver.findElement(By.name("login")).click();

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,10000)");
		
		

	}

}
