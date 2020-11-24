//Drag and drop

package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//*[text()='Drag me']"));
		WebElement target = driver.findElement(By.xpath("//*[text() ='Drop here']"));
		Actions act = new Actions(driver);
		Action build6 = act.moveToElement(source).dragAndDrop(source, target).build();
		build6.perform();
}
}
