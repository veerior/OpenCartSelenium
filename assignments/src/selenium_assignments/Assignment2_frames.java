package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_frames {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	driver.findElement(By.xpath("//body/a/img")).click();
	
	
	}
}
