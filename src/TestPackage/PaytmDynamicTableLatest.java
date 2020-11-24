package TestPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmDynamicTableLatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/input")).sendKeys("flight");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/input")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@data-reactid = '167']/input")).sendKeys("Pune");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Suggested Cities']/following-sibling::div[1]/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@data-reactid = '179']/input")).sendKeys("Indore");
		driver.findElement(By.xpath("//*[@data-reactid = '179']/following-sibling::div/div/div/div[2]/div/div/div[2]/span")).click();
		
		
		//*[@data-reactid = '179']/input
		//driver.findElement(By.xpath("//*[@alt='Flights']")).click();
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
