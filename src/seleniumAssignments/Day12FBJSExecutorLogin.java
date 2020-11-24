package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12FBJSExecutorLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));  //storing webelement of email id so that it can be passed as argument in 1st way-- js.executeScript("arguments[0].value='Hi';", email);
		//WebElement login = driver.findElement(By.id("u_0_4"));
		WebElement login = driver.findElement(By.xpath("//*[@value ='Log In']"));
		//WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		
		
		  JavascriptExecutor js =(JavascriptExecutor) driver;
		 
		 // js.executeScript("arguments[0].click();", email)k;
		  js.executeScript("arguments[0].value='Hi';", email);
		js.executeScript("document.getElementById('pass').value ='wongpass';"); //in this 2nd way, we do not need to store webelement. Type type document... in console of chrome and paste the tested text here
		js.executeScript("arguments[0].click();", login);
		  
			/*
			 * 
			 * driver.findElement(By.id("email")).sendKeys("9970072899");
			 * driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
			 * driver.findElement(By.xpath("//*[@value='Log In']")).click();
			 */
		
	}

}
