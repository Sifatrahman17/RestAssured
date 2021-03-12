package tfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loginTest1();
		tearDown();
		
		launchBrowser();
		loginTest2();
		tearDown();
		
		launchBrowser();
		loginTest3();
		tearDown();
	}

	public static void launchBrowser() {
		// set system property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// create ojbect of webdriver
		driver = new ChromeDriver();
		// go to the website
		driver.get("https://techfios.com/billing/?ng=admin/");
		// maximizing the window
		driver.manage().window().maximize();
	}

	public static void loginTest1() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signin button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 sec
		Thread.sleep(2000);

	}
	
	public static void loginTest2() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signin button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 sec
		Thread.sleep(2000);

	}
	
	public static void loginTest3() throws InterruptedException {
		// identify User name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Signin button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 sec
		Thread.sleep(2000);

	}

	public static void tearDown() {
		// close browser
		driver.close();
	}

}