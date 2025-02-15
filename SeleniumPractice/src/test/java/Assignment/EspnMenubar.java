package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspnMenubar {

	public static void main(String[] args) {
		WebDriver espn = new ChromeDriver();
		espn.manage().window().maximize();
		espn.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		espn.get("https://www.espncricinfo.com/");

		// find menubar
		List<WebElement> menubarlist = espn.findElements(By.cssSelector(
				"body>div #pane-main>section .ds-popper-wrapper>a"));
		System.out.println("Number of options: " + menubarlist.size());

		for (WebElement menu : menubarlist) {
			System.out.println("option:" + menu.getText());
		}
	}

}
