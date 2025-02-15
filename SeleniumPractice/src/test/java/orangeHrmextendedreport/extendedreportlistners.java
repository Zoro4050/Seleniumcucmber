package orangeHrmextendedreport;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import utilities.SeleniumUtil;

public class extendedreportlistners extends SeleniumUtil {
	ExtentReports extentReports;
	ExtentTest extentTest;
	boolean result;
	String empId = "1636";

	@BeforeTest
	public void beforeTest() {
		// open browser and orange HRM
		extentReports = new ExtentReports(".\\ExtentReport\\OrangeHrmPIM.html");
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@BeforeClass
	public void precondition() {
//		extentReports = new ExtentReports(".\\ExtentReport\\OrangeHrmPIM.html");

	}

	@BeforeMethod
	public void startUp() {
		// TODO: setup
		// TODO: login
		// TODO: navigate to Orange HRM PIM page
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));

	}

	@Test(priority = 1)
	public void testPimCreation() {
		// TODO: Code to create PIM and validate
		extentTest = extentReports.startTest("OrangrHRM_PIM_Creation");
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
		Assert.assertEquals(actualEmpId, empId);

	}

	@Test(priority = 2, enabled = true, dependsOnMethods = "testPimCreation")
	public void testPimUpdate() {
		// TODO: Code to update PIM and validate
		extentTest = extentReports.startTest("OrangrHRM_PIM_Update");
		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input "));

		typeRequiredInput(EmpIdField, empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));
		clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']//following::span")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-table-cell-actions .bi-pencil-fill")));
		clickOnElement(driver.findElement(By.xpath("//div[@role='tablist']/div[6]/a")));

		wait.until(ExpectedConditions.textToBe(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div/div"),
				"-- Select --"));
		clickOnElement(driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div")));
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
	public void testPimDelete() {
		// TODO: Code to delete PIM and validate
		extentTest = extentReports.startTest("OrangrHRM_PIM_Delete");
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

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenShot(driver)),
					"Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenShot(driver)),
					"Test Case pass is " + result.getName());
		}
		extentReports.endTest(extentTest);

		clickOnElement(driver.findElement(By.cssSelector(".oxd-userdropdown-tab")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}

	@AfterClass
	public void postcondition() {

	}

	@AfterTest
	public void afterTest() {
		// close browser
		extentReports.flush();
//		driver.quit();

	}

	public static String screenShot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return errflpath;
	}
}
