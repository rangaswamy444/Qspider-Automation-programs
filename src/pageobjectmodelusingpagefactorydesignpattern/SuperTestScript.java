package pageobjectmodelusingpagefactorydesignpattern;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import datadrivenframework.ExcelOperation;

public class SuperTestScript 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() throws FileNotFoundException 
	{
		String browser=ExcelOperation.readData("preconfig", 1, 0);
		String	url	=ExcelOperation.readData("preconfig", 1, 1);
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chrome and gecko/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
		@BeforeClass
		public void loginTOActitime() throws FileNotFoundException 
		{
			String un=ExcelOperation.readData("preconfig", 1, 2);
			String pwd=ExcelOperation.readData("preconfig", 1, 3);
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		}
		@AfterClass
		public void logoutFromActitime()
		{
			//logout
			driver.findElement(By.className("logoutImg")).click();
		}
}
