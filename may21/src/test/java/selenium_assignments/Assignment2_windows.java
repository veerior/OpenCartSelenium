package selenium_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Assignment2_windows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		String window1=(String)it.next();
		String window2=(String)it.next();
		driver.switchTo().window(window2);
		WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
		email.click();
		email.sendKeys("veerapratap97@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		

	
	}

}
