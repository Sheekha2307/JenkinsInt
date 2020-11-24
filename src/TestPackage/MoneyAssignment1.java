/*Access the link “https://www.moneycontrol.com/markets/indian-indices/”
and print the company name who LTP value is the lowest and print the company name whose volumn is the highest 
*/

package TestPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().window().maximize();
		//driver.findElements(By.xpath("//*[@class= 'indices']/div/div/table/tbody/tr/td/p/a"))     company name
		
		
		//*[text()='Asian Paints']
		
		List<WebElement> ltp_value_xpath = driver.findElements(By.xpath("//*[contains(@id, 'ltp')]"));
		for (int i = 0; i<ltp_value_xpath.size(); i++)
		{
			String companyname = driver.findElements(By.xpath("//*[@class= 'indices']/div/div/table/tbody/tr/td/p/a")).get(i).getText();
			String ltpvalue = driver.findElements(By.xpath("//*[contains(@id, 'ltp')]")).get(i).getText();
			String volume = driver.findElements(By.xpath("//*[contains(@id, 'pchg')]//following :: td[1]")).get(i).getText();
			//if (ltpvalue.)
			System.out.println("CompanyName is " +companyname+ " and LTP value is " +ltpvalue+ " and Volume value is "+volume );
			//System.out.println("Volume value is " +volume);
	
		}
		driver.quit();
		
		

	}

}
