package orangeHrmAnnotations;

import org.testng.annotations.Test;

import utilities.SeleniumUtil;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OrangeHrmPIM extends SeleniumUtil {
	String empId = "1636";

	@Test(priority = 1)
	public void createEmpId() {

		clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[3]")));
		typeRequiredInput(driver.findElement(By.name("firstName")), "hary");
		typeRequiredInput(driver.findElement(By.name("lastName")), "tom");

		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-grid-2 .oxd-input"));
		clickOnElement(EmpIdField);
		EmpIdField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		typeRequiredInput(EmpIdField, empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));

		waitTillUrlContains("viewPersonalDetails");
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		typeRequiredInput(driver.findElement(By.cssSelector(".oxd-form-row .oxd-input ")), empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));

		List<WebElement> empDetails = driver.findElements(By.cssSelector(".oxd-table-card>div>div>div"));
		String actualEmpId = empDetails.get(1).getText();
//		System.out.println(actualEmpId);
		Assert.assertEquals(actualEmpId, empId);

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "createEmpId")
	public void updateEmpId() {
		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input "));

		typeRequiredInput(EmpIdField, empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));
		clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']//following::span")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-table-cell-actions .bi-pencil-fill")));
		clickOnElement(driver.findElement(By.xpath("//div[@role='tablist']/div[6]/a")));
//		waitForElementToBeVisible(driver.findElement(By.xpath("//h6[text()='Job Details']")));

//		WebElement dropDown = driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div"));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Job Title']")));
		wait.until(ExpectedConditions.textToBe(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div/div"),
				"-- Select --"));
		clickOnElement(driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div")));
//		clickOnElement(driver.findElement(By.cssSelector(".oxd-select-text--arrow")));
		List<WebElement> options = driver.findElements(By.cssSelector(".oxd-select-dropdown>div>span"));
		options.get(0).click();
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));

		EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input "));
		typeRequiredInput(EmpIdField, empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));

		List<WebElement> empDetails = driver.findElements(By.cssSelector(".oxd-table-card>div>div>div"));
		String actualJobTitle = empDetails.get(4).getText();
		System.out.println(actualJobTitle);
		Assert.assertEquals(actualJobTitle, "Account Assistant");
	}

	@Test(priority = 3, enabled = true)
	public void deleteEmpId() {
		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input "));

		typeRequiredInput(EmpIdField, empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));
		clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']//following::span")));
		clickOnElement(driver.findElement(By.xpath("// i[@class='oxd-icon bi-trash']")));
		clickOnElement(driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")));

		String actualRcordFound = driver.findElement(By.cssSelector(".orangehrm-paper-container .oxd-text--span"))
				.getText();
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"No Records Found"));
		Assert.assertEquals(actualRcordFound, "No Records Found");
	}

	@BeforeMethod
	public void beforeMethod() {
		// login navigate to PIM employee list
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
	}

	@AfterMethod
	public void afterMethod() {
		// logout
		clickOnElement(driver.findElement(By.cssSelector(".oxd-userdropdown-tab")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}

	@BeforeTest
	public void beforeTest() {
		// open browser and orange HRM
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterTest
	public void afterTest() {
		// close browser
		driver.quit();

	}

}
