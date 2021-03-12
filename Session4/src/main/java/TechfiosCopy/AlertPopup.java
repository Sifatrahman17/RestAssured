package TechfiosCopy;




import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopup {
	
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
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() throws InterruptedException {

		// Identifying the username field pass username
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(3000);
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();

		

	}

}
	

