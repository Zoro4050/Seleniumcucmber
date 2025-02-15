package vtigerWebpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class DashboardPage extends SeleniumUtil {

	@FindBy(id = "div#appnavigator>div>span")
	private WebElement appnavigator;

	@FindBy(css = "div.app-list>*:nth-child(2)")
	private WebElement marketingbutton;

	@FindBy(css = "#mCSB_8_container>li>a .module-name")
	private List<WebElement> marketingOptions;
	// adminlogo
	@FindBy(xpath = "//span[@title='Vtiger Administrator(admin)']")
	private WebElement adminlogo;
	// sign out button
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutButton;
	// lead home page button
	@FindBy(xpath = "//ul[@oldtitle='Leads']")
	WebElement leadHomePageButton;

	// create marketing modules such as lead,contact,etc
	public void createMarketingModule(String module) {
		clickOnElement(appnavigator);
		performMouseHoverOperation(marketingbutton);

		for (WebElement option : marketingOptions) {
			if (option.getText().equalsIgnoreCase(module)) {
				option.click();
				break;
			}
		}

	}

	// logout from vtiger
	public void logout() {
		clickOnElement(adminlogo);
		clickOnElement(signOutButton);
	}

	// Function: Click on lead home page button
	public void clickOnLeadHomePage() {
		clickOnElement(leadHomePageButton);
	}

	// initialization
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
