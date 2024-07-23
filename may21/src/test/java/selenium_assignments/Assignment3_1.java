package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assignment3_1 {
	static WebDriver driver;

	
@BeforeTest
	public void initial(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	};

@Test
	public void detail() {
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.name("email")).sendKeys("veerapratap97@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("qwerty");
		driver.findElement(By.id("SubmitLogin")).click();
	}


@AfterTest
 public void close() {
	driver.close();
}

}

