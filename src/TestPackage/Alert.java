//Validate title of Facebook page

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//key in setProperty should be in small letter
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("http://output.jsbin.com/usidix/1");  //Open URl
		 driver.manage().window().maximize(); //maximize window
		 driver.findElement(By.xpath("//*[@value='Go!']")).click();
		 Thread.sleep(2000);
		 System.out.println("AlertText is " + driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
		 driver.quit();
	
	}
}
