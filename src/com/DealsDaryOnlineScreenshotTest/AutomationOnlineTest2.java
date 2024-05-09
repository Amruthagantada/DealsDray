package com.DealsDaryOnlineScreenshotTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationOnlineTest2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File tempfile = tss.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./ScreenShot/" + timeStamp + "getCallerycall2.png");
	    FileUtils.copyFile(tempfile, permfile);
	    driver.manage().window().minimize();
	    driver.quit();
}
}
