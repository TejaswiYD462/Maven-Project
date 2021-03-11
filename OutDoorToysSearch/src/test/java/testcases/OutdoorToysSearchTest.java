package testcases;


import java.io.FileOutputStream;
import java.io.PrintStream;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import pages.EbayHomePage;
import pages.OutdoorToysSearchPage;
import utilities.AccessProperties;
import utilities.DriverSetup;
import utilities.ReusableMethods;
import utilities.VerifyTitle;

public class OutdoorToysSearchTest {

	static WebDriver driver;
	static String baseUrl;
	WebDriverWait wait = null;
	//List<WebElement> ele = new ArrayList<WebElement>();

	// Method to setup the driver
	public WebDriver setupDriver() { 
		driver = DriverSetup.getWebDriver();

		return driver;
	}

	// Method to navigate to the url
	private void navigateUrl() {
		System.out.println("Navigating to the URL");
		baseUrl = AccessProperties.getUrl();
		driver.get(baseUrl);

	}

	// Main Method
	public static void main(String args[]) throws Exception {

		// Creating object of ReusableMethods class to access all the method present in
		// the ReusableMethods class
		ReusableMethods reuse = new ReusableMethods();

		// Creating the object of Validation class
		OutdoorToysSearchTest main = new OutdoorToysSearchTest();

		// Setting up the driver
		WebDriver driver = main.setupDriver();

		// Implicit Wait
		reuse.doWait(driver);
		
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));

		// Navigating to the url
		main.navigateUrl();

		// Explicit wait
		reuse.doExternalWait(driver);

		// Calling method to maximize
		reuse.doMaximize(driver);

		// Implicit Wait
		reuse.doWait(driver);
		
		// Creating object of SearchPageTest class to access all the method present in the SearchPageTest
		EbayHomePage home = new EbayHomePage();

		// Calling method to locate the textbox
		home.searchTextBoxLocator(driver);
		
		//Calling method to take screenshot
		reuse.captureScreenShot(driver);

		// Calling method to locate the search button
		home.searchBtnLocator(driver);
		

		// Creating object of validation class
		VerifyTitle valid = new VerifyTitle();

		// Calling method validate to check whether the title of the page is as same or not
		valid.verifyTitleOfPage(driver);
		
		// Creating object of the main class HomePage
		OutdoorToysSearchPage search = new OutdoorToysSearchPage();

		// Calling method to print all the href value of all the link present on that page
		search.printHrefValue(driver);

		// Calling method to check whether link contain portable word or not and clicking it
		 search.hrefEqualsPortable(driver);

		// Calling method to take screenshot of the result page
		reuse.captureScreenShot(driver);

		Thread.sleep(2000);

		// Calling method to close the browser
		reuse.doclose(driver);
	}
}
