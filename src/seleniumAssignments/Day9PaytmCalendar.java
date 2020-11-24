package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9PaytmCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@alt='Flights']")).click();
		//driver.findElement(By.xpath("//*[@class='fl-input _1SYQ _1HOQ']")).click(); //why is it not working??
		driver.findElement(By.xpath("//*[@name='Departure-Date']")).click();
		
		  int row = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr")).size();
		  int col = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr[1]/td")).size(); //if tr[1] is not given then index out of bound error will be thrown
		 
	
		  for(int i =1; i<= row/2; i++) 
		  {
			  for(int j=1; j<=col/2; j++) 
			  { 
			String date = driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr[" +i+ "]/td[" +j+ "]")).get(1).getText(); //if get(0) is used and if some dates are inactive in the current calendar, then also index out of bound error will be thrown
			if (date.equalsIgnoreCase("15"))
			{
				System.out.println(date);
				driver.findElements(By.xpath("//*[@class='ombl']/table/tbody/tr[" +i+ "]/td[" +j+ "]/div/div/div")).get(1).click(); 
				//findelements is used because two value will be returned
				//in xpath date variable is not passed as date is having xpath along with .get(1).getText()- row 30
			}
			  }
		  }
		  
	}

}