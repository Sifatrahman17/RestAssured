package TechfiosCopy;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;

	@Before
	public void launchBrowserorinit() {    //real world use init

		// Setting up the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sifat\\eclipse-workspace\\august2020\\August2020Selenium\\Session4\\driver\\chromedriver.exe");

		// Creating web driver instance
		driver = new ChromeDriver();

		// Maximizing Browser
		driver.manage().window().maximize();

		// Get to the site
		driver.get("https://techfios.com/billing/?ng=admin/");
       
		 //needimplicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() throws InterruptedException {

		// Identifying the username field pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// Identifying the password field pass password
		driver.findElement(By.id("password")).sendKeys("abc123");

		// Identifying the signin button and click
		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();

		WebElement COUNTRY_DROPDOWN_LOCATOR = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel = new Select(COUNTRY_DROPDOWN_LOCATOR);
		sel.selectByVisibleText("Austria");

	}
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}