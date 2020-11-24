package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day13DC_ChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		
		//Here we are usingChromeOptions class for using desiredCapabilities
		
		
		ChromeOptions opt = new ChromeOptions();
		
		//to accept insecure certificates
		opt.setAcceptInsecureCerts(true);
		
		//to maximise the window
		opt.addArguments("--start-maximized");
		
		//to open incognito mode
		opt.addArguments("--Incognito");
		
		System.out.println("Browser name is " +opt.getBrowserName());
		
		//to use capabilities instance in webdriver instance, pass object of ChromeOptions class as argument in the constructor
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://cacert.com/");
		
		
		
	}

}
