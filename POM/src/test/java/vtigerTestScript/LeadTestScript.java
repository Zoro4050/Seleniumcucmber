package vtigerTestScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;
import vtigerWebpages.DashboardPage;
import vtigerWebpages.LeadCreationPage;
import vtigerWebpages.LeadEditPage;
import vtigerWebpages.LeadsHomePage;
import vtigerWebpages.LoginPage;

public class LeadTestScript extends SeleniumUtil {

	LoginPage getLoginPage;
	DashboardPage getDashboardPage;
	LeadCreationPage getLeadCreationPage;
	LeadEditPage getLeadEditPage;
	LeadsHomePage getLeadsHomePage;

	@BeforeTest
	public void openBrowser() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}

	@BeforeMethod
	public void precondition() {
		getLoginPage = new LoginPage(driver);
		getDashboardPage = new DashboardPage(driver);
		getLeadCreationPage = new LeadCreationPage(driver);
		getLeadEditPage = new LeadEditPage(driver);
		getLeadsHomePage = new LeadsHomePage(driver);

		getLoginPage.loginIntoVtiger();
		getDashboardPage.createMarketingModule("Lead");
	}

	@Test
	public void testLead_create() {
		getLeadsHomePage.addNewLead();
		getLeadCreationPage.createLead("jhon", "wick");
		getDashboardPage.clickOnLeadHomePage();
		String actualFirstName = getLeadsHomePage.getNewLeadFirstName("jhon");
		Assert.assertEquals(actualFirstName, "jhon");
	}

	@Test
	public void testLead_edit() {
		getLeadsHomePage.editNewlyCreatedLead("jhon");
		getLeadEditPage.editCompanyName("Google");
	}

	@Test
	public void testLead_delete() {
		getLeadsHomePage.deleteNewlyCreatedLead("jhon");
	}

	@AfterMethod
	public void postcondition() {
		getDashboardPage.logout();
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
