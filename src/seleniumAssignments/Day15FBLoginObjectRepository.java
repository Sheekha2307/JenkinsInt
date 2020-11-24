package seleniumAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15FBLoginObjectRepository {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("objectrepo.properties"); //for file placed in refeence library of eclipse
		//If property file is placed at local
		//FileInputStream fis = new FileInputStream("C:\\Users\\IB\\Desktop\\Selenium\\objectrepo1.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
				
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  driver.findElement(By.id(prop.getProperty("Email_id_textbox"))).sendKeys("9970072899");
		  driver.findElement(By.xpath(prop.getProperty("Password_textbox"))).sendKeys("Test1234");
		  driver.findElement(By.xpath(prop.getProperty("Login_button"))).click();
		 
	}
		
	

}
