package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day14ASSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		
		//create object of DesiredCapabilities class
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * 
		 * //To accept SSL certificate, call this method and pass boolean value as true
		 * caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 */
		
		ChromeOptions opt = new ChromeOptions();
		opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://cacert.com/");
		
	}

}
