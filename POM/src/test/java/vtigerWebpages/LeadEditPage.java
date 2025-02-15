package vtigerWebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class LeadEditPage extends SeleniumUtil {

	// company name field
	@FindBy(id = "Leads_editView_fieldName_company")
	WebElement companyNameField;
	// save button
	@FindBy(css = ".overlayFooter .saveButton")
	WebElement saveButton;

	// Function: edit Lead company name
	public void editCompanyName(String companyname) {
		clickOnElement(companyNameField);
		typeRequiredInput(companyNameField, companyname);
		clickOnElement(saveButton);
	}

	// initialization
	public LeadEditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
