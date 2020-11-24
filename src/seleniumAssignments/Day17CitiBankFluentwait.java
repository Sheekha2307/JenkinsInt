package seleniumAssignments;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day17CitiBankFluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.citibank.co.in/");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,120);
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
		 * "//*[text()='Login']"))));
		 */
		//  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		Wait wait = new FluentWait(driver).withTimeout(40, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Login']"))));
		
		
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[text()='Instagram ']")).click();
		  
		  String mainwindow = driver.getWindowHandle();
		  System.out.println("main window handle is " +mainwindow); Set<String> s =
		  driver.getWindowHandles(); Iterator<String> i=s.iterator(); while
		  (i.hasNext()) { String childwindow = i.next(); if
		  (!mainwindow.equalsIgnoreCase(childwindow)) {
		  driver.switchTo().window(childwindow);
		  driver.findElement(By.xpath("//*[text() = 'I Agree! Take me to Instagram!']")
		  ).click(); } }
		 	}

}
