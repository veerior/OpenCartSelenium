package selenium_assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Assignment2_actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveByOffset(100, 100).release().build().perform();
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File sstarget=new File("C:\\Users\\Dell\\Desktop\\Selenium course\\Selenium assignments\\screenshot.png");
		try {
			Files.copy(screenshot, sstarget);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
