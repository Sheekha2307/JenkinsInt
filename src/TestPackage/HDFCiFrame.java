//iframe on HDFC site

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCiFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		String Service = System.getProperty("user.dir")+"\\chromDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Service);
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='login_page']")));
		 driver.findElement(By.xpath("//*[@name ='fldLoginUserId']")).sendKeys("Hi");
	}

}
