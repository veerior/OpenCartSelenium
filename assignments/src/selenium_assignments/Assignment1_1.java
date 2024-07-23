package selenium_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

	public class Assignment1_1 {

		public static void main(String[] args) {
			WebDriver Cdriver = new ChromeDriver();
			Cdriver.manage().window().maximize();
			Cdriver.get("https://www.amazon.in/");
			Cdriver.get("https://www.facebook.com/");
			System.out.println(Cdriver.getTitle());
			WebDriver Fdriver = new FirefoxDriver();
			WebDriver Sdriver = new SafariDriver();	
		}

	}
			