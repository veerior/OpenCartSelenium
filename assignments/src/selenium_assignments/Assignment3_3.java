package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment3_3 {

	static WebDriver driver;
	
	@BeforeSuite
	public void initalising() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	@Test (groups="Smoke")
	public void form() throws Exception {
		driver.get("https://demoqa.com/");
		Thread.sleep(3000);
		WebElement firstform=driver.findElement(By.xpath("//div[@class='category-cards']/div[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", firstform);
		firstform.click();
		WebElement secondform=driver.findElement(By.xpath("(//li[@id='item-0'])[2]"));
		secondform.click();	
		Thread.sleep(3000);	
	}
	
	@Test (groups="Regression")
	public void practice_form() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));                   //firstname
		js.executeScript("arguments[0].scrollIntoView(true);", firstname);
		firstname.click();
		firstname.sendKeys("Veera");
		WebElement lastname=driver.findElement(By.id("lastName"));                                         //lastname  
		js.executeScript("arguments[0].scrollIntoView(true);", lastname);
		lastname.click();
		lastname.sendKeys("Beesetti");	
		WebElement email=driver.findElement(By.id("userEmail"));                                           //email  
		js.executeScript("arguments[0].scrollIntoView(true);", email);
		email.click();
		email.sendKeys("veerapratap97@gmail.com");
		WebElement gender=driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label[1]"));  //gender
		js.executeScript("arguments[0].scrollIntoView(true);", gender);
		gender.click();
		
		WebElement phone=driver.findElement(By.id("userNumber"));                                          //phonenumber
		phone.sendKeys("9550142372");
		WebElement dob=driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']"));

		js.executeScript("arguments[0].scrollIntoView(true);", dob);                                      //dob
		dob.click();
		WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		Select s2=new Select(month);
		s2.selectByVisibleText("April");
		WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
		Select s3=new Select(year);
		s3.selectByValue("1994");
		WebElement day=driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[3]/div[6]"));
		day.click();    
		WebElement subject=driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div/div/div/input")); //subject
		subject.sendKeys("sample");
		WebElement hobbies1=driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div/div/label[1]"));        //hobbies
		hobbies1.click();
		WebElement hobbies2=driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div/div[2]/label"));
		hobbies2.click();
		WebElement picture=driver.findElement(By.xpath("//input[@id='uploadPicture']"));                         //picture
		picture.sendKeys("C:\\Users\\Dell\\Downloads\\Book.xlsx");
		WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));                    //address
		address.sendKeys("Hyderabad, Telangana");	
		WebElement state=driver.findElement(By.xpath("//div[@id='state']/div/div/div"));
		state.click();
		WebElement statename=driver.findElement(By.xpath("//div[@id='state']/div/div/div/div/input"));
		statename.sendKeys("Uttar Pradesh");
		statename.sendKeys(Keys.DOWN);
		statename.sendKeys(Keys.ENTER);
		WebElement city=driver.findElement(By.xpath("//div[@id='city']/div/div/div"));
		WebElement cityname=driver.findElement(By.xpath("//div[@id='city']/div/div/div/div/input"));
		cityname.sendKeys("Lucknow");
		cityname.sendKeys(Keys.DOWN);
		cityname.sendKeys(Keys.ENTER);
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();	
		Thread.sleep(2000);
			}
		
	@AfterSuite
	public void closing() {
	driver.close();
	}

}



