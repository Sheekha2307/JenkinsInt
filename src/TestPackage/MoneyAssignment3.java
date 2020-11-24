/*2)Access the link “https://www.moneycontrol.com/markets/indian-indices/” and click on the google ad section on this page which is below the table
*/
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

public class MoneyAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='Moneycontrol/MC_Market/MC_Market_GlobalIndices_728x90']")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='Moneycontrol/MC_Market/MC_Market_GlobalIndices_728x90']")).click();
		
			 }
	}
