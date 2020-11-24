//Amazon signup

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment6
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
		 driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
		 driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")).click();
			
			  
			  driver.findElement(By.xpath("//*[@type='email']")).sendKeys(
			  "test@yopmail.com");
			  driver.findElement(By.xpath("//*[@id='continue']")).wait(); //two values displayed in xpath tester for same button. Why?
			 	 		 	}
	
}
