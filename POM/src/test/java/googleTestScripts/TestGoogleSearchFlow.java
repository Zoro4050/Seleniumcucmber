package googleTestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googleWebPages.GoogleResultPage;
import googleWebPages.GoogleSearchPage;
import utilities.SeleniumUtil;

public class TestGoogleSearchFlow extends SeleniumUtil {

	GoogleResultPage getResultPage;
	GoogleSearchPage getSearchPage;

	@BeforeTest()
	public void precondition() {
		setUp("chrome", "https://www.google.com");
		getResultPage = new GoogleResultPage(driver);
		getSearchPage = new GoogleSearchPage(driver);
	}

	@Test
	public void testSearchFlow() {
		getSearchPage.searchText("selenium");
		String expectedPageTitle = "selenium - Google Search";
		String actualPageTitle = getResultPage.getResultPageTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}

	@AfterTest()
	public void postcondition() {
//		driver.quit();
	}
}
