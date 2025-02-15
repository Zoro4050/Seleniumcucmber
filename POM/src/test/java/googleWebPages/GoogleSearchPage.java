package googleWebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtil;

public class GoogleSearchPage extends SeleniumUtil {

	@FindBy(name = "q")
	private WebElement searchInputFild;

	@FindBy(css = "ul.G43f7e>li>div>*:nth-child(2)>div>*:first-child>span")
	private List<WebElement> suggestionList;

	public WebElement getSearchInputFild() {
		return searchInputFild;
	}

	public void searchText(String text) {
//		searchInputFild.click();
		typeRequiredInput(searchInputFild, text);
		wait.until(ExpectedConditions.textToBe(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>div>*:first-child>span"),
				text));
		suggestionList.get(0).click();
	}

	// initialization
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
