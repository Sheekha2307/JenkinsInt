/*Access the link “https://www.moneycontrol.com/markets/indian-indices/”
and print the company name who LTP value is the lowest and print the company name whose volumn is the highest 
*/

package TestPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyAssignment1_Opt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().window().maximize();
		//driver.findElements(By.xpath("//*[@class= 'indices']/div/div/table/tbody/tr/td/p/a"))     company name
		
		int row = driver.findElements(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr/td[2]")).size();
		//System.out.println(row);
		//System.out.println(driver.findElement(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr/td[2]")).getText());
		List<Double> LTP_Prices = new ArrayList<>();
		List<Integer> Volume_value =new ArrayList<>();
		List<String> Company_name = new ArrayList<>();
		
		  for (int i= 1; i<=row; i++) 
		  { 
			String ltp_value = driver.findElement(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[2]")).getText();
			String volume_value = driver.findElement(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[4]")).getText();
			String Companyname = driver.findElement(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[1]")).getText();
			//why is following not working?- String ltp_value = driver.findElements(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[2]")).get(i).getText();
		  	System.out.println("Company name is "+Companyname+ " and ltp_value is " +ltp_value+ "and volume_value is "+volume_value ); 
		  	Double ltp = Double.valueOf(ltp_value.replace(",", ""));
		  	LTP_Prices.add(ltp);
		  	Integer volume = Integer.valueOf(volume_value);
		  	Volume_value.add(volume);
		  	
		  }
		  System.out.println("ltp miniminum value is "+Collections.min(LTP_Prices));
		  System.out.println("volume maximum value is "+Collections.max(Volume_value));
		 Double min_ltp_value = Collections.min(LTP_Prices);
		 Integer max_volume_value = Collections.max(Volume_value);
			/*
			 * int index = Company_name.indexOf(min_ltp_value);
			 * System.out.println("Company name of min ltp is "
			 * +driver.findElement(By.xpath(
			 * "//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+index+"]/td[1]")).
			 * getText());
			 */
		 int index1 = Company_name.indexOf(max_volume_value);
		 System.out.println("Company name of min ltp is " +driver.findElement(By.xpath("//*[@id='indices_stocks']/div/div/div//tbody[2]/tr/td[" +index1+ "]")).getText());
		 
		 
		 System.out.println("Company name of max volumne is "+Volume_value.indexOf(max_volume_value));
			/*
			 * for (int i=1; i<=row; i++) if (driver.findElement(By.xpath(
			 * "//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[4]")).getText()
			 * .valueOf(Volume_value). { System.out.println(driver.findElement(By.xpath(
			 * "//*[@id='indices_stocks']/div/div/div//tbody[2]/tr["+i+"]/td[4]")).getText()
			 * ); } else { System.out.println("Kya gadbad h"); }
			 */
	}
		  
		 
		 		}
		
	

