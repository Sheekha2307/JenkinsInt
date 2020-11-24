package Misc;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompanySelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//to change property line
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://example.com/doc.html");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("toc-link")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> itr = windowhandles.iterator();
		while (itr.hasNext())
		{
			String childwindow = itr.next();
			if (!mainWindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
		}
		
	}

}

System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://example.com/doc.html");

//maximise the window(optional)
driver.manage().window().maximize();
		
//we are using implicit wait here so that driver will wait for 10s for finding any webelement
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//using getWindowHandle method we are retrieving the cusrrent window handle and storing it in a String variable as this method returns a string
String mainwindow = driver.getWindowHandle();

WebElement Terms = driver.findElement(By.id("toc-link"));
	
Terms.click();

//getWindowhandles method we are using to get the info about all the open windows , this method returns a set type collection hence 
//hence we are storing the info in set of type string , object s
Set<String> s = driver.getWindowHandles();

Iterator<String> i = s.iterator();

//while loop to access the set, condition used is , while i is having any value
while (i.hasNext())
{	
	System.out.println(i.next());
	
	  String Childwindow = i.next(); // we are storing next value as a childwindow
	  
	  //if loop is checking whether mainwindow and child window are same , if they are not same then only further code is executed
	  if (!mainwindow.equalsIgnoreCase(Childwindow)) 
	  {
	  driver.switchTo().window(Childwindow); // switch to child windwow
	  // click on the I accept 
	  driver.findElement(By.id("accept")).click();
	   
	  }	 
	
}

driver.switchTo().window(mainwindow);

driver.findElement(By.id("mydocpdf")).click();





Type a message

