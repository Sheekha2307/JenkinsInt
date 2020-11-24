package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99DemoSiteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@name,'uid')]")).sendKeys("1303");
		/*
		 * driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Guru99");
		 * driver.findElement(By.xpath("//*[@type='submit']")).click();
		 */	}

}