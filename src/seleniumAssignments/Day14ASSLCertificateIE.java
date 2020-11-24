package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day14ASSLCertificateIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\IB\\Downloads\\IEDriver\\IEDriverServer.exe");
		
		//create object of DesiredCapabilities class
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * 
		 * //To accept SSL certificate, call this method and pass boolean value as true
		 * caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 */
		
		InternetExplorerOptions fOpt = new InternetExplorerOptions();
		fOpt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new InternetExplorerDriver(fOpt);
		
		driver.get("https://cacert.com/");
		
	}

}
