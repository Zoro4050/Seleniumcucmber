package Assignment;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtil;

public class orangeHrm extends SeleniumUtil {

	public static void main(String[] args) {
		orangeHrm emp = new orangeHrm();
		emp.createEmpId();
		emp.editemp();
		emp.deleteEmp();
	}

	public void createEmpId() {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin123");

		// employ id creation
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		clickOnElement(driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[3]")));
		typeRequiredInput(driver.findElement(By.name("firstName")), "hary");
		typeRequiredInput(driver.findElement(By.name("lastName")), "tom");

		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-grid-2 .oxd-input"));
		clickOnElement(EmpIdField);
		EmpIdField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		String empId = "1636";
		typeRequiredInput(EmpIdField, empId);

		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		waitTillUrlContains("viewPersonalDetails");
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		typeRequiredInput(driver.findElement(By.cssSelector(".oxd-form-row .oxd-input ")), empId);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));

		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));

		String recordFound = driver.findElement(By.cssSelector(".orangehrm-paper-container .oxd-text--span")).getText();

		if (recordFound.equalsIgnoreCase("(1) Record Found")) {
			System.out.println("New eployee created sucessfully");
		} else {
			System.out.println("Employee is not created");
		}

	}

	public void editemp() {
		clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']//following::span")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-table-cell-actions .bi-pencil-fill")));
		clickOnElement(driver.findElement(By.xpath("//div[@role='tablist']/div[6]/a")));
		waitForElementToBeVisible(driver.findElement(By.xpath("//h6[text()='Job Details']")));

		WebElement dropDown = driver.findElement(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div"));
		// instead of sleep use wait condition expect text to be

		wait.until(ExpectedConditions.textToBe(By.xpath("//div[div[label[text()='Job Title']]]/div[2]/div/div"),
				"-- Select --"));

		clickOnElement(dropDown);
		List<WebElement> options = driver.findElements(By.cssSelector(".oxd-select-dropdown>div>span"));
		options.get(0).click();
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));

		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input "));
		clickOnElement(EmpIdField);
		EmpIdField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		String empId = "1636";
		typeRequiredInput(EmpIdField, empId);

		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));

		wait.until(ExpectedConditions.textToBe(By.cssSelector(".orangehrm-paper-container .oxd-text--span"),
				"(1) Record Found"));

		List<WebElement> empDetails = driver.findElements(By.cssSelector(".oxd-table-card>div>div>div"));

		String jobtitle = empDetails.get(4).getText();
		if (jobtitle.equals("Account Assistant")) {
			System.out.println("Job title updated to " + jobtitle);
		} else {
			System.out.println("Job title not updated");
		}

	}
	

	public void deleteEmp() {
//		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox' and @value='0']//following::span")));
		clickOnElement(driver.findElement(By.xpath("// i[@class='oxd-icon bi-trash']")));
		clickOnElement(driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")));
//		WebElement EmpIdField = driver.findElement(By.cssSelector(".oxd-form-row .oxd-input"));
//		clickOnElement(EmpIdField);
//		typeRequiredInput(EmpIdField, "1636");
	}

}
