//Validate title of Facebook page

package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinIframe
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//key in setProperty should be in small letter
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Thread.sleep(5000);
		 driver.navigate().to("https://in.linkedin.com/");  //Open URl
		 driver.manage().window().maximize(); //maximize window
		 Thread.sleep(8000);
		 //driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click();
		 List<WebElement> s= driver.findElements(By.tagName("iframe")); //for frame use tagname and on UI scroll upward till iframe tagname to see details
		//find elements will return the list of elements, hence List <WebElement> type is used
		 for (int i=0; i<s.size(); i++)
		 {
		 System.out.println("Iframe listname is " +s.get(i));
		 }
		 
		 //s is returning all elements so s.size will give you the count of elements. and s.get(i) will give you details of each element in for loop
	//scroll, switch to frame and then click on the element
		 JavascriptExecutor js = (JavascriptExecutor) driver; //javascript executor is package of java which is used for scroll as selenium is not having any method of scroll. 
	// (JavascriptExecutor) driver is type casting. Diver is getting typecasted to javascriptexecutoor interface so that we can execute it as a java script
		 
		 js.executeScript("window.scrollBy(0,3680)", ""); //window.scrollby(x axis, yaxis), arg- this is javascript command. In second argument, nothing is given ("), because we are performing scroll functionality. In case of other we can pass sendkeys etc
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='Gayatri Iyer: In it to chase my dream | #InItTogether']")));
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']")).click();
		 Thread.sleep(5000);
		 	
	}
}
