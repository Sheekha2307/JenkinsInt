package seleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("9970072899");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		TakesScreenshot obj = (TakesScreenshot) driver;
		File SourceFile= obj.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\IB\\Desktop\\Selenium\\Takescreenshot.png");
		FileUtils.copyFile(SourceFile, DestFile); //you will need to download fileutils jar to run this line
		
		
	}

}
