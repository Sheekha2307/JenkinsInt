//Actions and Action class

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//*[@value='Log In']"));
		WebElement fbImage = driver.findElement(By.xpath("//*[@class='lfloat _ohe']/div/img"));
		Actions act = new Actions(driver);
		
		/* click on login button by Actions and Action Class
		 * Action build1 = act.moveToElement(login).doubleClick().build(); ///first
		 * option create action class build1.perform();
		 * 
		 * act.moveToElement(login).click().build().perform(); //second option on object
		 * of actions class
		 */
		//Action build3 = act.dragAndDrop(fbImage, login).build();
		//build3.perform();
		
		/*
		 * Action build4 = act.moveToElement(fbImage).contextClick().build(); //right
		 * click image build4.perform();
		 */
		Action build5 =act.contextClick(fbImage).build(); //right click without using moveToElement
		build5.perform();
	}

}
