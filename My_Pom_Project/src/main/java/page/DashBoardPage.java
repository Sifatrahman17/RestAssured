package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage{

	WebDriver driver;

	// create Constructor
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = " //*[@id='page-wrapper']/div[2]/div/h2 ")
	WebElement DashBoard_Header_Title;
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[3]/a/span[1]")
	WebElement Customer_Field;
	@FindBy(how = How.XPATH, using ="//*[@id='side-menu']/li[3]/ul/li[1]/a")
	WebElement CustomerAdd_Field;
	
	//interactive Method
	public void validateDashBoardHeader() {
		
		waitForElement(driver, 5 ,DashBoard_Header_Title);
		Assert.assertEquals(DashBoard_Header_Title.getText(),"Dashboard","DashBoard page not found");
	}	
		
	public void clickOnCustomerButton() {
		Customer_Field.click();
	}

	public void clickOnAddCustomerButton() {
		waitForElement(driver, 3, CustomerAdd_Field);
		CustomerAdd_Field.click();
	}

	
}
