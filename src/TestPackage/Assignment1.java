//Validate title of Facebook page

package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//key in setProperty should be in small letter
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");  //Open URl
		 driver.manage().window().maximize(); //maximize window
		 System.out.println(driver.getTitle()); //to get title of the page
		 //to compare actual and expected title
		 String actualtitle = driver.getTitle();
		 String expectedtitle = "Facebook – log in or sign up";
		 if(actualtitle.equalsIgnoreCase(expectedtitle))
		 {
			 System.out.println("Test Passed");
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
	}
}
