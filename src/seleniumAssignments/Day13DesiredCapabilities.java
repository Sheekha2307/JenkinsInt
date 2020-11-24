package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day13DesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		
		//create object of DesiredCapabilities class
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//To accept insecure certificate, call this method and pass boolean value as true
		caps.setAcceptInsecureCerts(true);

		
		//to use capabilities instance in webdriver instance, pass object of DesiredCapabilities class as argument in the constructor
		//why ChromeDriver is depracated- earlier selenium provided DesriredCapabilities class to provide basic capabilities.
		//But later all browser drivers provided other configurations. So to avoid this, every driver class is providing options class.
		//So through that we can set desrired capabilities. There are things specific to browser like incognito mode is supported by chrome so only chromeoption class will provide it
		
		WebDriver driver = new ChromeDriver(caps);
		
		driver.get("https://cacert.com/");
		
	}

}
