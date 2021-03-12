package seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocatorTech {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test
	public void learnLocator() {

		// Name Locator
		driver.findElement(By.name("firstname")).sendKeys("abc");

		// ID Locator
		driver.findElement(By.id("sex-0")).click();
		
		//Class Locator
		//driver.findElement(By.className("input-file")).click();
		
		//LinkText Locator
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//PertialLinkText Locator
		//driver.findElement(By.partialLinkText("Product Backend")).click();
		
		//CSS Selector
		driver.findElement(By.cssSelector("input#exp-2")).click();
		//driver.findElement(By.cssSelector("input.input-file")).click();
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		
		//xPath Locator
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Selenium is fun");
		driver.findElement(By.xpath("//input[@name='profession' and @id='profession-0']")).click();
		
		//driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		//driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : Page Change')]")).click();
		
		
	}
	
	@After
	public void tearDown() {
		driver.close(); //closes the browser
		driver.quit();  //kills the process or it closes the object we have created
		
	}


}
