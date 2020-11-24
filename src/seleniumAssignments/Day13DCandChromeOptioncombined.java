package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day13DCandChromeOptioncombined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//To accept insecure certificate, call this method and pass boolean value as true
		caps.setAcceptInsecureCerts(true);
		
		
		
		//Here we are usingChromeOptions class for using desiredCapabilities
		ChromeOptions opt = new ChromeOptions();
		
		//opt.setAcceptInsecureCerts(true); -- accepting by DesiredCapabilities
		
		//to maximise the window
		opt.addArguments("--start-maximized");
		
		//to open incognito mode
		opt.addArguments("--Incognito");
		
		System.out.println("Browser name is " +opt.getBrowserName());
		
		//Now we have two objects of DesiredCapabilities and ChromeOptions. so to use both the settig, we need to merge both
		opt.merge(caps);
		
		//now we can pass opt object as it is now merged with caps, hence both configs will be loaded and hence ChromeDriver is not marked as Deprecated
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://cacert.com/");
		
		
		
	}

}
