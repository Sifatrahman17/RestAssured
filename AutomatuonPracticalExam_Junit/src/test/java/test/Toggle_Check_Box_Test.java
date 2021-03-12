package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Toggle_Check_Box_Page;
import util.BrowserFactory;

public class Toggle_Check_Box_Test {
	
	WebDriver driver;

	@Test
	public void CheckAndRemoveButtonTest() {
		driver = BrowserFactory.startBrowser();
		Toggle_Check_Box_Page toggle_Check_Box_Page = PageFactory.initElements(driver, Toggle_Check_Box_Page.class);
		toggle_Check_Box_Page.clickOnAllToggleBox();
		toggle_Check_Box_Page.selectSingleItem();
		toggle_Check_Box_Page.removeItem();
		toggle_Check_Box_Page.ChekedToggleBox();
		toggle_Check_Box_Page.removeAllItem();
	}


}
