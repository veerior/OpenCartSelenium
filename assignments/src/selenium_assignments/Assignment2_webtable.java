package selenium_assignments;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List rows=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		int rowsize=rows.size();
		for (int i=1;i<=rowsize;i++)
		{
			WebElement name=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]"));
			System.out.println(name.getText());
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("veerapratap97@gmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("qwerty1234");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

	}

}
