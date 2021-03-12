package TechfiosCopy;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
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
		driver.get("https://www.dell.com/en-us");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() throws InterruptedException {

		WebElement PRODUCTS_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		WebElement MONITOR_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));
		WebElement MONITOR_FOR_WORK_LOCATOR = driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[9]/ul/li[2]/a/img"));
		
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCTS_MENU_LOCATOR).build().perform();
		action.moveToElement(MONITOR_MENU_LOCATOR).build().perform();
		//action.moveToElement(MONITOR_FOR_HOME_LOCATOR).build().perform();
		MONITOR_FOR_WORK_LOCATOR.click();
		
		

	}

}

