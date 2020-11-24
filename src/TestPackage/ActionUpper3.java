//Drag and drop

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionUpper3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		Actions act = new Actions(driver);
		//Action build1 = act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("assjgdskajgdas").keyUp(Keys.SHIFT).build(); --option 1
		/*
		 * Action build1 = act.keyDown(email,
		 * Keys.SHIFT).sendKeys("type me in upper case").keyUp(Keys.SHIFT).build();
		 * build1.perform();
		 */	
		Action build2 = act.keyDown(email, Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build();
		build2.perform();
		
}
}