package orangeHrmTestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

import orangeHrmWebPages.AddEmployeePage;
import orangeHrmWebPages.HomePage;
import orangeHrmWebPages.LoginPage;
import orangeHrmWebPages.PersonalDetailsPage;
import orangeHrmWebPages.PIMHomePage;

public class TestPIM extends SeleniumUtil {
	WebDriver driver;
	LoginPage getLoginPage;
	HomePage getHomePage;
	PIMHomePage getPIMHomePage;
	PersonalDetailsPage getPersonalDetailsPage;
	AddEmployeePage getAddEmployeePage;

	@BeforeTest
	public void openBrowser() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void precondition() {
		getLoginPage = new LoginPage(driver);
		getHomePage = new HomePage(driver);
		getPIMHomePage = new PIMHomePage(driver);
		getPersonalDetailsPage = new PersonalDetailsPage(driver);
		getAddEmployeePage = new AddEmployeePage(driver);

		getLoginPage.loginIntoOrangeHrm("Admin", "admin123");
		getHomePage.clickOnPIM();
	}

	@Test(priority = 1)
	public void testPIM_Creation() {
		// click on Add button
		getPIMHomePage.clickOnAddButton();
		// fill employee details and save it
		getAddEmployeePage.createEmployee("John", "Wick", 1637);
		// navigate to PIM home page
		getHomePage.clickOnPIM();
		// search for newly created employee
		getPIMHomePage.searchCreatedEmployee(1637);
		// compare search result
		String acutalMsg = getPIMHomePage.getSearchResultMsg();
		String expectedMsg = "(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}

	@Test(priority = 2, dependsOnMethods = "testPIM_Creation")
	public void testPIM_Update() {
		// search created employee
		getPIMHomePage.searchCreatedEmployee(1637);
		// edit created employee
		getPIMHomePage.clickOnEditOfCreatedEmployee();
		// change JobTitle
		getPersonalDetailsPage.updateJobTitle("QA Lead");
		// go to PIM page
		getHomePage.clickOnPIM();
		// search created employee again
		getPIMHomePage.searchCreatedEmployee(1637);
		// check weather JobTitle is updated
		String actualJobTitle = getPIMHomePage.getJobTitleOfSearchedEmployee();
		String expectedJobTitle = "QA Lead";
		System.out.println(actualJobTitle);
		Assert.assertEquals(actualJobTitle, expectedJobTitle);
	}

	@Test(priority = 3, dependsOnMethods = "testPIM_Creation")
	public void testPIM_Delete() {
		// navigate to PIM home page
		getHomePage.clickOnPIM();
		getPIMHomePage = new PIMHomePage(driver);
		// search for newly created employee
		getPIMHomePage.searchCreatedEmployee(1637);
		// select check box and delete it
		getPIMHomePage.deleteCreatedEmployee();
		// validate search result
		String acutalMsg = getPIMHomePage.getSearchResultMsg();
		String expectedMsg = "No Records Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}

	@AfterMethod
	public void postcondition() {
		getHomePage.logoutFromHrm();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
