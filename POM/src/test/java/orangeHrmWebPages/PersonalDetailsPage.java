package orangeHrmWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtil;

public class PersonalDetailsPage extends SeleniumUtil {

	public PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Job Link
	@FindBy(xpath = "//a[text()='Job']")
	private WebElement jobTab;

	// Job Title Drop down
	@FindBy(xpath = "//div[div[label[text()='Job Title']]]/div[2]/div/div")
	private WebElement jobTitleField;

	// Job Title Drop down Elements
	@FindBy(css = ".oxd-select-dropdown>div>span")
	private List<WebElement> jobTitleOptions;

	// Save Button
	@FindBy(xpath = "//button[@type='submit']	")
	private WebElement saveButton;

	// Function: Update PIM

	public void updateJobTitle(String Title) {
		clickOnElement(jobTab);
		waitForElementToBeClickable(jobTitleField);
		clickOnElement(jobTitleField);

		for (WebElement option : jobTitleOptions) {

			if (option.getText().equalsIgnoreCase(Title)) {
				option.click();
				break;
			}
		}
		clickOnElement(saveButton);

	}

}
