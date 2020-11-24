//Create a account in FB

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Test"); //Firstname
		driver.findElement(By.id("u_0_o")).sendKeys("Selenium"); //Lastname
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("9876567835"); //Mobile number or email
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Sainath1234");
		
		Select birthday = new Select(driver.findElement(By.name("birthday_day")));//WHAT IF I PASS NULL HERE?
		birthday.selectByIndex(23);
		
		Select birthmonth = new Select(driver.findElement(By.name("birthday_month")));
		birthmonth.selectByVisibleText("Jul");
		
		
		Select birthyear = new Select(driver.findElement(By.name("birthday_year")));
		birthyear.selectByValue("1989");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@type='submit' and @name='websubmit']")).click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
