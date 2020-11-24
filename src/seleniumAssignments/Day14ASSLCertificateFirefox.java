package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day14ASSLCertificateFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IB\\Downloads\\geckodriver\\geckodriver.exe");
		
		//create object of DesiredCapabilities class
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * 
		 * //To accept SSL certificate, call this method and pass boolean value as true
		 * caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 */
		FirefoxOptions fOpt = new FirefoxOptions();
	//	fOpt.setAcceptInsecureCerts(true);
		fOpt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new FirefoxDriver(fOpt);
		
		driver.get("https://cacert.com/");
		
	}

}
