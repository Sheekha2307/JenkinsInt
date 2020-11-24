package seleniumAssignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14FBLoginFileHandling {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		
		createFileName("Sheekha");

		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\IB\\Downloads\\chromDriver\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize(); Thread.sleep(5000);
		  driver.findElement(By.id("email")).sendKeys("9970072899");
		  writeFile("Sheekha", "User has entered email id");
		  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
		  writeFile("Sheekha", "User has entered password");
		  driver.findElement(By.xpath("//*[@value='Log In']")).click();
		  writeFile("Sheekha", "User has clicked on log in button");
		 
		  deleteFile("Sheekha");
	}
		
	public static void createFileName(String fileName) throws IOException
	{
		File newfile = new File("C:\\Users\\IB\\Desktop\\Selenium\\" +fileName+ ".txt");
		if(newfile.createNewFile())
		{
			System.out.println("New file is created" +newfile);
		}
		else
		{
			System.out.println("File not created");
		}
	}
	public static void writeFile(String fileName, String text) throws IOException
	{
		FileWriter writefile1 = new FileWriter("C:\\Users\\IB\\Desktop\\Selenium\\" +fileName+ ".txt", true);
		//if boolean is not passed then file will be recreated everytime. if true is passed, then it will append in existing file
		writefile1.append(text);
		writefile1.append("\n");
		writefile1.close();
		
	}
	public static void deleteFile(String fileName)
	{
		File delfile = new File("C:\\Users\\IB\\Desktop\\Selenium\\" +fileName+ ".txt");
		if(delfile.delete())
		{
			System.out.println("FIle is deleted");
		}
		else
		{
			System.out.println("FIle is not deleted");
		}
	}

}
