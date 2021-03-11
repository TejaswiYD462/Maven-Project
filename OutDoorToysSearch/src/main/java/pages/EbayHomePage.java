package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayHomePage {
	
	//Method to locate the searchtextbox
	public void searchTextBoxLocator(WebDriver driver) {
		System.out.println("Writing outdoor toys in the search text box locator");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchbox.sendKeys("Outdoor toys");
	}
	
	//Method to locate search button and click
	public void searchBtnLocator(WebDriver driver) {
		System.out.println("Clicking on the search button");
		WebElement searchbtn = driver.findElement(By.id("gh-btn"));
		searchbtn.click();
	}

}
