package cnn;

import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNNNews {
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		
	System.setProperty("webdriver.chrome.chromedriber","C:\\Users\\sifat\\eclipse-workspace\\august2020\\August2020Selenium\\Session3\\driver\\chromedriver.exe" );	
    driver = new ChromeDriver();
    driver.get("https://www.cnn.com/");
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@Test
	public void CnnNews() {
	
		//driver.findElement(By.xpath("//span[contains(text(),'Bill Belichick declines Presidential Medal of Freedom offer from Trump')]")).sendKeys(keysToSend);
		driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-1 cn-container_FB6ABAE2-321D-7B94-F5AA-F1400485D96A']")).click();
		
		
		
	}
	
}
