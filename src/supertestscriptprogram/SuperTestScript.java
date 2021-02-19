package supertestscriptprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SuperTestScript 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		String browser="chrome";
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.get("http://aprasadpc:81/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chrome and gecko/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://aprasadpc:81/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
		@BeforeClass
		public void loginTOActitime()
		{
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		}
		@AfterClass
		public void logoutFromActitime()
		{
			//logout
			driver.findElement(By.className("logoutImg")).click();
		}
}
