package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
		driver.findElement(By.linkText("New Tours")).click();
		Thread.sleep(5000); //to close the ad pop-up on the page
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		country.click();
		Select s1=new Select(country);
		s1.selectByVisibleText("KUWAIT");
		driver.close();
		}

}
