//Validate title of Facebook page

package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinExplicitWait
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//key in setProperty should be in small letter
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(5000);
		 driver.navigate().to("https://in.linkedin.com/");  //Open URl
		 driver.manage().window().maximize(); //maximize window
		 JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("window.scrollBy(0,3680)", ""); 
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='Gayatri Iyer: In it to chase my dream | #InItTogether']")));
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']"))));
		 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']"))));
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click()));
		
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']"))));
		 driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click();
		 driver.quit();
		 
		 
		  	
	}
}
