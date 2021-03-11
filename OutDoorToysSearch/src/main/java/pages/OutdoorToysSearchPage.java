package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutdoorToysSearchPage {
	List<WebElement> ele = new ArrayList<WebElement>();
	WebDriver driver;

	// Method to print all href value of all the links
	public void printHrefValue(WebDriver driver) {
		System.out.println("Printing all the links");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement ele : links) {
			System.out.println(ele.getAttribute("href"));

		}
	}

	// Method to check whether href value contains the word 'Portable' and click on
	// the first item
	public void hrefEqualsPortable(WebDriver driver) {
		System.out.println("Checking whether the link contains the word Portable and clicking on that link");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement ele : links) {
			String hrefValue = ele.getAttribute("href");
			if (hrefValue.contains("Portable")) {
				ele.click();
				break;

			}
		}
	}

}
