package seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sifat\\eclipse-workspace\\august2020\\August2020Selenium\\Session2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void practiceLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Sifat");
		driver.findElement(By.name("lastname")).sendKeys("rahman");
		driver.findElement(By.name("Password")).sendKeys("abc123");
		// driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		// driver.findElement(By.partialLinkText("Product Backend")).click();
		driver.findElement(By.cssSelector("input#sex-1")).click();
		//driver.findElement(By.cssSelector("input-file")).click();
        driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
	}

}
