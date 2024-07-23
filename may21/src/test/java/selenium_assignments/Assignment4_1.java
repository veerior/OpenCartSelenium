package selenium_assignments;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment4_1 {
	static WebDriver driver;

@BeforeTest
public void Before() {
driver= new ChromeDriver();
}

@DataProvider (name="logindetails")
public Object[][] info() throws Exception {
	
	String path="C:\\Users\\Dell\\Documents\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
	XSSFRow row1=sheet.getRow(0);
	
	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println(rows);
	System.out.println(cols);
	
	Object[][] details= new Object[rows+1][cols];
	
	for(int r=0;r<=rows;r++) {
		XSSFRow row=sheet.getRow(r);
		for (int c=0;c<cols;c++) {
			XSSFCell cell = row.getCell(c);
			String value=cell.getStringCellValue();
			
			details[r][c]=row.getCell(c).getStringCellValue();
			System.out.println(details[r][c]);
		}
			
	}
	
return details;
}

@Test(dataProvider = "logindetails")
public void print(String username, String pwd) {
	driver.get("https://demo.guru99.com/V4/");
	WebElement user=driver.findElement(By.name("uid"));
	user.sendKeys(username);
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys(pwd);
	driver.findElement(By.name("btnLogin")).click();
	driver.switchTo().alert().accept();
}

@AfterTest
public void closing() {
	driver.close();
}

}