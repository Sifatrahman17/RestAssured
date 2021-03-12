package tfTest;

import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestJunit {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		// set system property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// create object of Web driver
		driver = new ChromeDriver();
		// go to the Web site
		driver.get("https://techfios.com/billing/?ng=admin/");
		// maximizing the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test
	public void loginTest1() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signing button and click
	
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("login"))));
		driver.findElement(By.name("login")).click();
		// wait for 2 second
		Thread.sleep(2000);

	}	
	
	@Test
	public void loginTest2() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signin button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 sec
		Thread.sleep(2000);

	}
	
	@Test
	public void loginTest3() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signin button and click
		driver.findElement(By.name("login3")).click();
		// wait for 2 sec
		Thread.sleep(2000);

	}
	
	@After
	public void tearDown() {
		// close browser
		driver.close();
	}
	
	

}
	
	
	
		
	
