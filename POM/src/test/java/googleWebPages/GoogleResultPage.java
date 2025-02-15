package googleWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtil;

public class GoogleResultPage extends SeleniumUtil {

	public String getResultPageTitle() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Go to Google Home']"))));
		String Title = getPageTitle();
		return Title;
	}

	public GoogleResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
