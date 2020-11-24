package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmDynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://paytm.com/");
		 driver.findElement(By.xpath("//*[@alt='Flights']")).click();
		 driver.findElement(By.xpath("//*[@name='Departure-Date']")).click();
		 int row = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr")).size();//always select java.util import
		 //loop can be run on count hence used size and int instead of list<WebElement>
		 int col = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr/td")).size();
		 
		 for(int i=1; i<row; i++) //index starting from 1 in this case as 0 is for header
		 {
			 for(int j=1; j<col; j++)
			 {
				 //each value will return two records one for each month, hence creating next loop for selecting one value out of both
				 
				 List<WebElement> path = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr[" +i+ "]/td[" +j+ "]/div/div/div"));
				 //can we use int and get size in above line?
				 for(int k=0; k<path.size(); k++)
				 {
					 System.out.println(path.get(k).getText());
					 path.get(k).click();
				 }
			 }
		 }
		 
		 		 
		 
		 
		 driver.quit();
	}

}
