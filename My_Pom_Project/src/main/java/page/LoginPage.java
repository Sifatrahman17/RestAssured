package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	//create Constructor
	public LoginPage(WebDriver driver) {
     this.driver = driver;
	}

	// library of Elements
	@FindBy(how = How.ID, using = "username")
	WebElement UserName_Field;

	@FindBy(how = How.ID, using = "password")
	WebElement PassWord_Field;

	@FindBy(how = How.NAME, using = "login")
	WebElement Submit_Field;

	// Method to interact with the Elements
	public void enterUserName(String UserName) {
		UserName_Field.sendKeys(UserName);
	}

	public void enterpassWord(String passWord) {
		PassWord_Field.sendKeys(passWord);
	}

	public void clickOnSignInButton() {
		Submit_Field.click();

		
	}

}
