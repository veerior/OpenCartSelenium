package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_2 {

	static WebDriver driver;
	
	public void inital() {
		driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		List <WebElement> headers = driver.findElements(By.xpath("//header[@class='centered-top-container']/div/div/nav/div/div/div/div/div/div/ul/li"));
		System.out.println(headers.size());
		for (WebElement header: headers) {
		System.out.println(header.getText());
		
		}
	}
	
	
	public static void main(String[] args) {
		Assignment4_2 as=new Assignment4_2();
		as.inital();	
	
	
	}
	
}
