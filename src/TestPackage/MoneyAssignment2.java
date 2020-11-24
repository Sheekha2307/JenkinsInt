/*3)Access the link “https://www.moneycontrol.com/markets/indian-indices/” and click on the facebook link at the bottom of this page*/

package TestPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Facebook']")).click();
		/* driver.findElement(By.xpath("//*[@class= 'ic_topfb']")).click(); */
		
		/*
		 * String mainwindow = driver.getWindowHandle();
		 * System.out.println("main window value is "+mainwindow);
		 */
		
		/*
		 * Set<String> windowvalue = driver.getWindowHandles(); Iterator<String> i =
		 * windowvalue.iterator(); while (i.hasNext()) { System.out.println(i.next());
		 * String childwindow = i.next(); if(childwindow.equalsIgnoreCase(mainwindow)) {
		 * driver.switchTo().window(childwindow);
		 * driver.findElement(By.id("email")).sendKeys("Switched"); } }
		 */
				
				
		
		
		

	}

}
