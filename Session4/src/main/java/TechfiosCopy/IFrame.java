package TechfiosCopy;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
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
		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() throws InterruptedException {
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();

		

		

	}

}
