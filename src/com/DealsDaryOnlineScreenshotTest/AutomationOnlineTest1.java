package com.DealsDaryOnlineScreenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationOnlineTest1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File tempfile = tss.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./ScreenShot/" + timeStamp + "getCallery1.png");
	    FileUtils.copyFile(tempfile, permfile);
	    driver.manage().window().minimize();
	    driver.quit();
	}
}
