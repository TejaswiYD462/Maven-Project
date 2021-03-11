package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTitle {
public void verifyTitleOfPage(WebDriver driver) {
		
		//Doing Explict wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-btn")));
		System.out.println("Checking whether the title of the page matches or not");

		//To check whether the test is passed or failed
		String title = driver.getTitle();
		if (title.startsWith("Outdoor toys")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

	}
}
	


