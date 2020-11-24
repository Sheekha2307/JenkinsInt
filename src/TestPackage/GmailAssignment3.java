package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%2Blogin%2Burl%26rlz%3D1C1GCEA_enIN898IN898%26oq%3Dgmail%2Blogin%2Burl%26aqs%3Dchrome..69i57j0l3.5289j0j4%26sourceid%3Dchrome%26ie%3DUTF-8&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.manage().window().fullscreen();
		 System.out.println("Current URL is " + driver.getCurrentUrl());
		 String title = driver.getTitle();
		 System.out.println("Title is " + title);
		 System.out.println("Hashcode by navigate method is " + driver.navigate().hashCode());
		 System.out.println("Hashcode by navigate method is " + driver.hashCode());
		 driver.navigate().refresh();
		 driver.quit();
	
	}

}
