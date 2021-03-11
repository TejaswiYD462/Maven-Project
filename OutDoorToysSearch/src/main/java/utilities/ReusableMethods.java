package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	
	//Method to implement implicit wait
	public void doWait(WebDriver driver) {
		System.out.println("Doing implicit wait");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

	}
    
	//Method to maximize the window
	public void doMaximize(WebDriver driver) {
		System.out.println("Maximizing the Window");
		driver.manage().window().maximize();
	}
	
	//Method to implement explicit wait 
	public void doExternalWait(WebDriver driver) {
		System.out.println("Doing External Wait");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-btn")));
	}
	
	//Method to take Screenshot
	public void captureScreenShot(WebDriver driver)
	{
		System.out.println("Taking the screenshot");
	try {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	TakesScreenshot ScrObj = (TakesScreenshot) driver;

	Thread.sleep(3000);

	File CaptureImg = ScrObj.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(CaptureImg, new File("./Screenshots/" + timeStamp + "_screenshot.png"));
	}
	catch (Exception e) {
	e.printStackTrace();
	System.out.println("Error occured while Capturing Screenshot");
	}

	}
	
	//Method to close the browser
	public void doclose(WebDriver driver)
	{
		System.out.println("Closing the driver");
		driver.close();
	}
}


