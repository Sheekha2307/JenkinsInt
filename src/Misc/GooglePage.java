package Misc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GooglePage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.xpath("//*[@class= 'FPdoLc tfB0Bf']/center/input[2]")).
		 * click();
		 * 
		 * TakesScreenshot ts = (TakesScreenshot)driver; File sourceFile =
		 * ts.getScreenshotAs(OutputType.FILE); File destFile = new File
		 * ("C:\\test.docx"); FileUtils.copyFile(sourceFile, destFile);
		 */
		Actions act = new Actions(driver);
		Action build1 = act.keyDown(Keys.F12).sendKeys("This is my first line in console").keyDown(Keys.F12).build();
		build1.perform();
		js.executeScript("window.scrollBy(0,300)", "");

	}

}
