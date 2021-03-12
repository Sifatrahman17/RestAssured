package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Toggle_Check_Box_Page {
	
	WebDriver driver;

	public Toggle_Check_Box_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement CHEKED_ON_TOGGLEBOX;

	@FindBy(how = How.NAME, using = "todo[3]")
	WebElement SELECT_SINGLE_ITEM;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVED_ITEM;

	@FindBy(how = How.NAME, using = "allbox")
	WebElement CHEKED_TOGGLE_All_BOX;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVED_All_ITEM;

	public void clickOnAllToggleBox() {
		CHEKED_ON_TOGGLEBOX.click();
	}

	public void selectSingleItem() {
		SELECT_SINGLE_ITEM.click();

	}

	public void removeItem() {
		REMOVED_ITEM.click();

		if (driver.findElement(By.name("todo[3]")).isSelected()) {
			driver.findElement(By.name("submit")).click();
		}

	}

	public void ChekedToggleBox() {
		CHEKED_TOGGLE_All_BOX.click();
	}

	public void removeAllItem() {
		REMOVED_All_ITEM.click();
	
		if (driver.findElement(By.name("allbox")).isSelected()) {
			driver.findElement(By.name("submit")).click();
		}

	}

}
