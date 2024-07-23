package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement custid=driver.findElement(By.xpath("//input[@name='cusid']"));
		custid.sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.close();

	}

}
