package tfTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TechFiosbillingHomeWork {

	// public static void main(String[] args) {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://techfios.com/billing/?ng=admin/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();

	    driver.findElement(By.xpath("//span[contains(text(),'Bank & Cash')]")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 3);
	    wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//a[contains(text(),'New Account')]"))));
	   
	    driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Jarir");
	    
	    driver.findElement(By.xpath("//input[@id='description']")).sendKeys("CHK Account");
	    
	    driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("$5000");
	    
	    driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("987654321");
	    
	    driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Ali");
	    
	    driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("9402309413");
	    
	    driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("BOA");
	    
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    
	    Thread.sleep(5000);
	    driver.close();
	   
	}

	
}
