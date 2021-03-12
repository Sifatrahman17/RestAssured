/*
 * package session3;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.After; import org.junit.Assert; import org.junit.Before;
 * import org.junit.Test; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class PracticeWaitAndAssert{ WebDriver driver;
 * 
 * @Before public void launchBrowser() {
 * 
 * System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
 * driver = new ChromeDriver();
 * driver.get("https://techfios.com/billing/?ng=admin/");
 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
 * 
 * @Test public void ElementAndLocator() throws InterruptedException {
 * 
 * // storing web element // element library WebElement USERNAME_FIELD_ELEMENT =
 * driver.findElement(By.xpath("//input[@id='username']")); WebElement
 * PASSWORD_FIELD_ELEMENT =
 * driver.findElement(By.xpath("//input[@id='password']")); WebElement
 * SIGNIN_BUTTON_ELEMENT =
 * driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
 * //WebElement DASHBOARD_PAGE_TITLE_ELEMENT=
 * driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2")); //or
 * //storing web Element using by class // By USERNAME_FIELD_LOCATOR =
 * By.xpath("//input[@id='username']"); // By PASSWORD_FIELD_LOCATOR =
 * By.xpath("//input[@id='password']"); // By SIGNIN_BUTTON_LOCATOR =
 * By.xpath("/html/body/div/div/div/form/div[3]/button"); //By
 * DASHBOARD_PAGE_TITLE_LOCATOR =
 * By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
 * 
 * USERNAME_FIELD_ELEMENT.clear();
 * USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
 * PASSWORD_FIELD_ELEMENT.sendKeys("abc123"); SIGNIN_BUTTON_ELEMENT.click();
 * //or //driver.findElement(SIGNIN_BUTTON_LOCATOR).click();
 * 
 * 
 * // Thread.sleep(2000); // // WebElement DASHBOARD_PAGE_TITLE_ELEMENT=
 * 
 * driver.findElement(By.xpath("//h2[text()=' Dashboard ']")); //
 * Assert.assertEquals("Expected page not found!!",
 * "Dashboard- iBilling",driver.getTitle()); // //or //
 * Assert.assertEquals("Expected page not found!!",
 * "Dashboard- iBilling",DASHBOARD_PAGE_TITLE_ELEMENT.getText());
 * 
 * 
 * }
 * 
 * @After public void TearDown() throws InterruptedException {
 * Thread.sleep(3000); driver.close(); driver.quit(); } }
 */