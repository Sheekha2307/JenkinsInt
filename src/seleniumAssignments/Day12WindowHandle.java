package seleniumAssignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.citibank.co.in/");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Instagram ']")).click();
		
		String mainwindow = driver.getWindowHandle();
		System.out.println("main window handle is " +mainwindow);
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		while (i.hasNext())
		{
			String childwindow = i.next();
			if (!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//*[text() = 'I Agree! Take me to Instagram!']")).click();
			}
		}
	}

}
