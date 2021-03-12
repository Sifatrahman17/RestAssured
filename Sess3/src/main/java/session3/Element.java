package session3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {
	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws InterruptedException {

		WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement USERPASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));

		USERNAME_FIELD_ELEMENT.clear();
		USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
		USERPASSWORD_FIELD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();

		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(
				ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/a/span[1]"))));

		WebElement CUSTOMER_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/a/span[1]"));
		CUSTOMER_FIELD_ELEMENT.click();

		WebElement ADD_CUSTOMER_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
		ADD_CUSTOMER_FIELD_ELEMENT.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Sifat");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sifatrahman17@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9402309413");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("9312 WoodHurst dr.");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Mckinney");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("75072");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[49]/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/ul/li[2]/a")).click();
        
	}

	@After
	public void tearDown() throws InterruptedException {

	Thread.sleep(2000);
		driver.close();
	}

}
//*[@id="rform"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul
