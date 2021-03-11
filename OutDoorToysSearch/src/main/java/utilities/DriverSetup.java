package utilities;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverSetup {

	private static WebDriver driver;

	// Method to Launch Chrome Browser
	public static void launchChrome() {
	//	String chromeDriverPath = System.getProperty()+"/OutDoorToysSearch/drivers/chromedriver");
	//	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		String chromeDriverPath="/Users/tejaswiyd/eclipse-workspace/OutDoorToysSearch/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
	}

	// Method to Launch Opera Browser
	public static void launchOpera() {
		String OperaDriverPath = "/Users/tejaswiyd/eclipse-workspace/OutDoorToysSearch/drivers/operadriver"; 
		System.setProperty("webdriver.opera.driver", OperaDriverPath);
		driver = new OperaDriver();  
	}

	// Method to Launch Browser according to the user choice
	public static WebDriver getWebDriver() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter chrome for Chrome and opera for Opera");
		String userChoice = scanner.next();
		if (userChoice.equalsIgnoreCase(AccessProperties.getChromeProperty())) {
			launchChrome();
		} else if (userChoice.equalsIgnoreCase(AccessProperties.getOperaProperty())) {
			launchOpera();
		}
		scanner.close();
		return driver;

	}

}