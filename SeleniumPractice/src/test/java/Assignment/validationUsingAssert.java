package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class validationUsingAssert extends SeleniumUtil {

	@Test(priority = 1)
	public void testActitimeLoginLogout() {

		setUp("chrome", "https://online.actitime.com/qk/login.do");
		String expectedTitle = "actiTIME - Login";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		typeRequiredInput(driver.findElement(By.name("username")), "admin01");
		typeRequiredInput(driver.findElement(By.name("pwd")), "admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));

		WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		waitForElementToBeVisible(logoutButton);
		String loginExpectedTitle = "actiTIME - Enter Time-Track";
		String loginactualTitle = getPageTitle();
		Assert.assertEquals(loginactualTitle, loginExpectedTitle);
		clickOnElement(logoutButton);
		Assert.assertEquals(actualTitle, expectedTitle);
		/*
		 * https://online.actitime.com/qk/login.do admin01/admin01
		 */
	}

	@Test(priority = 2)
	public void testOrangeHRMLoginLogout() {

		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expectedTitle = "OrangeHRM";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));

		WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
		clickOnElement(logoutButton);
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority = 3)
	public void testVtigerLoginLogout() {

		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		String expectedTitle = "vtiger";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		typeRequiredInput(driver.findElement(By.name("username")), "admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));

		WebElement logoutButton = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		String loginExpectedTitle = "Dashboard";
		String loginactualTitle = getPageTitle();
		Assert.assertEquals(loginactualTitle, loginExpectedTitle);
		clickOnElement(logoutButton);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 4)
	public void testTricentisLoginLogout() {

		setUp("chrome", "https://demowebshop.tricentis.com/login");
		String expectedTitle = "Demo Web Shop. Login";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		typeRequiredInput(driver.findElement(By.name("Email")), "tester01@vomoto.com");
		typeRequiredInput(driver.findElement(By.name("Password")), "Abc@12345");
		clickOnElement(driver.findElement(By.className("login-button")));

		WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
		String loginExpectedTitle = "Demo Web Shop";
		String loginactualTitle = getPageTitle();
		Assert.assertEquals(loginactualTitle, loginExpectedTitle);
		clickOnElement(logoutButton);
		Assert.assertEquals(actualTitle, expectedTitle);

		/*
		 * https://demowebshop.tricentis.com/ tester01@vomoto.com/Abc@12345
		 */
	}
}
