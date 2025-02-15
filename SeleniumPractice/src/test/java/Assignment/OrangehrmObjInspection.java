package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmObjInspection {

	public static void main(String[] args) {
		// create instance of chrome and open Orangehrm
		WebDriver hrmDriver = new ChromeDriver();
		hrmDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// implicitwait
		hrmDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// locate username field and perform operation
		hrmDriver.findElement(By.name("username")).sendKeys("Admin");

		// locate password field and perform operation
		hrmDriver.findElement(By.name("password")).sendKeys("admin123");

		// locate login button and perform operation
		hrmDriver.findElement(By.className("orangehrm-login-button")).click();

		// locate logout button and perform operation
		hrmDriver.findElement(By.className("oxd-userdropdown-name")).click();
		hrmDriver.findElement(By.linkText("Logout")).click();

	}
}
//DOUBT not entering username and password
