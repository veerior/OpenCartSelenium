package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3_2 {

	static WebDriver driver;
	
	@BeforeTest
	public void initialisation() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@DataProvider (name= "data")
	public Object[][] dp(){
		Object[][] data=new Object[2][2];
		data[0][0]="veerapratap97@gmail.com";
		data[0][1]="qwerty";
		data[1][0]="sejalkumar16@gmail.com";
		data[1][1]="qwertyuiop";
		return data;
	}
	
	
	@Test (dataProvider="data")
public void DP(String email, String pwd) {
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@AfterTest
	public void closing() {
//		driver.close();
	}
	
}
