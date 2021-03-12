package tfTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sifat\\eclipse-workspace\\august2020\\August2020Selenium\\crm\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		driver.quit();
	}
	
}
//webdriver.gecko.driver