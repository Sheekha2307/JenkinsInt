//Amazon signup

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAssignment7
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//key in setProperty should be in small letter
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(5000);
		 driver.navigate().to("https://www.amazon.in/");  //Open URl
		 driver.manage().window().maximize(); //maximize window
		/* driver.findElement(By.id("nav-link-accountList")).click();
		 
		 id="nav-link-accountList"
		 driver.findElement(By.xpath("//*[text()='Start here.']")).click();
		*/ 
		 Select signup = new Select(driver.findElement(By.xpath("//*[@text()='Account & Lists']")));
		 signup.selectByVisibleText("Start here.");
		 
		 			 	 		 	}
	
}
