package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class espnMouseHover {

	public static void main(String[] args) {
		WebDriver espn = new ChromeDriver();
		espn.manage().window().maximize();
		espn.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		espn.get("https://www.espncricinfo.com/");

		Actions mouse = new Actions(espn);

		// find menubar
		List<WebElement> menubarlist = espn
				.findElements(By.cssSelector("body>div #pane-main>section .ds-popper-wrapper>a"));
		System.out.println("Number of options: " + menubarlist.size());

		for (int i = 0; i < menubarlist.size(); i++) {
			mouse.moveToElement(menubarlist.get(i)).perform();
			System.out.println("option:" + menubarlist.get(i).getText());

		}
	}

}
