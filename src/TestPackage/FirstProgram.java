package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
 
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		/*
		 * Driver.findElement(By.name("email")).sendKeys("This is my first Program");
		 * Driver.findElement(By.id("pass")).sendKeys("Wrong Password");
		 * Driver.findElement(By.id("u_0_b")).click(); Thread.sleep(5000);
		 Driver.findElement(By.xpath("//input[@name='sex' and @value=1]")).click();
		Driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		* Driver.navigate().back(); Driver.navigate().forward();
		 * Driver.navigate().refresh();
		 * Driver.close(); //to close current window Driver.quit(); //to close all
		 * windows opened by webdriver
		 *
		 *///For dropdown use select class
		Select birthmonth = new Select (Driver.findElement(By.xpath("//select[@id='month']")));
		birthmonth.selectByIndex(6);
		//select[@id='month']
	}

}