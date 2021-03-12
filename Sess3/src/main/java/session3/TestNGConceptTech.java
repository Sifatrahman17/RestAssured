package session3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGConceptTech {

	

	
		
	WebDriver driver;
		
		@BeforeMethod
		public void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void logingTest() {
					
			try {
				//storing web element
				//element library
				WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
				WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
				WebElement SINGIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
				
				USERNAME_FIELD_ELEMENT.clear();
				USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
				PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
				
				
				//SINGIN_BUTTON.click();
				SINGIN_BUTTON_ELEMENT.click();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//@AfterMethod
		public void tearDown() {
			
			driver.close();
			driver.quit();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

