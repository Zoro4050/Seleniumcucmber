package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidationDropdown {

	public static void main(String[] args) {
		WebDriver year = new ChromeDriver();
		year.manage().window().maximize();
		year.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		year.get("https://demo.automationtesting.in/Register.html");

		// locate year dropdown
		WebElement dropdown = year.findElement(By.id("yearbox"));

		// is dropdown displayed
		System.out.println("is dropdown visible? " + dropdown.isDisplayed());

		// is enabled
		System.out.println("is dropdown enabled? " + dropdown.isEnabled());

		// create instance of select
		Select slt = new Select(dropdown);

		// perform operations using select class instance
		System.out.println("Default value? " + slt.getFirstSelectedOption().getText());

		// is dropdown multi
		System.out.println("is dropdown multiselect? " + slt.isMultiple());

		// get options
		List<WebElement> options = slt.getOptions();
		System.out.println("Total number of options: " + options.size());

		// select a value and validate
		slt.selectByValue("2000");
		System.out.println("selected value: " + slt.getFirstSelectedOption().getText());

		// asecending
		List<Integer> yers = new ArrayList<Integer>();

		for (int i = 1; i < options.size(); i++) {
			int yr = Integer.parseInt(options.get(i).getText());
			yers.add(yr);
		}

		ArrayList<Integer> copylist = new ArrayList<>(yers);
//		copylist.addAll(yers);

		Collections.sort(copylist);

		boolean isasecending = yers.equals(copylist);

		if (isasecending) {
			System.out.println("Years are in Asecending order.");
		} else {
			System.out.println("Years are not in Ascending order.");
		}
	}

}
