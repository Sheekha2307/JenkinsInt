package seleniumAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14AFBLoginRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("");
		
		Robot rbt = new Robot();
		
		  rbt.keyPress(KeyEvent.VK_9);
		  rbt.keyPress(KeyEvent.VK_9);
		  rbt.keyPress(KeyEvent.VK_7); 
		  rbt.keyPress(KeyEvent.VK_0);
		  rbt.keyPress(KeyEvent.VK_0); 
		  rbt.keyPress(KeyEvent.VK_7);
		  rbt.keyPress(KeyEvent.VK_2); 
		  rbt.keyPress(KeyEvent.VK_8);
		  rbt.keyPress(KeyEvent.VK_9); 
		  rbt.keyPress(KeyEvent.VK_9);
		  
		  
		 
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
		rbt.keyPress(KeyEvent.VK_SHIFT);
		rbt.keyPress(KeyEvent.VK_T); //By default lower case is printed hence we use shift to use upper case
		rbt.keyRelease(KeyEvent.VK_SHIFT);
		rbt.keyPress(KeyEvent.VK_E);
		rbt.keyPress(KeyEvent.VK_S);
		rbt.keyPress(KeyEvent.VK_T);
		rbt.keyPress(KeyEvent.VK_1);
		rbt.keyPress(KeyEvent.VK_2);
		rbt.keyPress(KeyEvent.VK_3);
		rbt.keyPress(KeyEvent.VK_4);
		
		driver.findElement(By.xpath("//*[@value='Log In']"));
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
