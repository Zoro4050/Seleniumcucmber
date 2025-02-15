package utilities;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;
	public FileInputStream fis;
	public Properties prop;
	public String filePath;

	public Properties getPropertyFileInstance(String filePath) {

		prop = new Properties();
		try {
			fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	public String getDataFromPropertyFile(String key) {
		return prop.getProperty(key);
	}

	public WebDriver setUp(String browsername, String url) {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(url);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		return driver;
	}

	protected void setSleepTime(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

		}
	}

	public void waitTillUrlContains(String title) {
		wait.until(ExpectedConditions.urlContains(title));

	}

	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public Boolean isElementPresent(WebElement element) {
		waitForElementToBeVisible(element);
		return element.isDisplayed();
	}

	public boolean isElementEnabled(WebElement element) {
		waitForElementToBeVisible(element);
		return element.isEnabled();
	}

	public void clickOnElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	public void typeRequiredInput(WebElement element, String input) {
		waitForElementToBeClickable(element);
		element.clear();
		element.sendKeys(input);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public Select getDropDownInstance(WebElement element) {
		return new Select(element);
	}

	public String getTextFromElement(WebElement element) {
		waitForElementToBeVisible(element);
		return element.getText();
	}

	public List<WebElement> getDropDownOptions(WebElement element) {
		Select select = getDropDownInstance(element);
		return select.getOptions();
	}

	public String getAttributeNameForElement(WebElement element, String attribute) {
		waitForElementToBeVisible(element);
		return element.getAttribute(getPageTitle(attribute));
	}

	public WebElement getActitveElement() {
		return driver.switchTo().activeElement();
	}

	public void performMouseHoverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}

}
