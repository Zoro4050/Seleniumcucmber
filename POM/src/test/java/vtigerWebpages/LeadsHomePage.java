package vtigerWebpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class LeadsHomePage extends SeleniumUtil {

	@FindBy(id = "Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addLeadButton;

	@FindBy(xpath = "//tbody/tr[1] //input[@type='checkbox']")
	private WebElement firstLeadCheckbox;

	@FindBy(xpath = "Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement editLeadButton;

	@FindBy(xpath = "Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement deleteLeadButton;

	// first name field
	@FindBy(css = ".searchRow>th:nth-child(2)")
	private WebElement firstNameField;
	// search button
	@FindBy(css = ".searchRow>th:nth-child(1) .btn-success")
	private WebElement searchButton;
	// delete pop up yes button
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement deleteYesButton;
	// lead detail list
	@FindBy(css = ".listViewEntries>td.listViewEntryValue span.value")
	private List<WebElement> LeadDetails;

	// Function: add lead
	public void addNewLead() {
		clickOnElement(addLeadButton);
	}

	// Function: delete lead
	public void deleteNewlyCreatedLead(String firstname) {
		clickOnElement(firstNameField);
		typeRequiredInput(firstNameField, firstname);
		clickOnElement(searchButton);
		setSleepTime(2000);
		clickOnElement(firstLeadCheckbox);
		clickOnElement(deleteLeadButton);
		clickOnElement(deleteYesButton);
	}

	// Function: edit lead
	public void editNewlyCreatedLead(String firstname) {
		clickOnElement(firstNameField);
		typeRequiredInput(firstNameField, firstname);
		clickOnElement(searchButton);
		setSleepTime(2000);
		clickOnElement(firstLeadCheckbox);
		clickOnElement(editLeadButton);
	}

	// get searched lead details
	public String getNewLeadFirstName(String firstname) {
		clickOnElement(firstNameField);
		typeRequiredInput(firstNameField, firstname);
		clickOnElement(searchButton);
		setSleepTime(2000);
		return LeadDetails.get(1).getText();
	}

	// initialization
	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
