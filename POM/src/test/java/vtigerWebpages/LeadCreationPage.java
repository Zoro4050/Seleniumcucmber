package vtigerWebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class LeadCreationPage extends SeleniumUtil {
	// first name
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstNameField;
	// last name
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameField;
	// save button
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	// Function: Create Lead
	public void createLead(String firstName, String lastName) {
		clickOnElement(firstNameField);
		typeRequiredInput(firstNameField, firstName);
		clickOnElement(lastNameField);
		typeRequiredInput(lastNameField, lastName);
		clickOnElement(saveButton);
	}

	// initialization
	public LeadCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
