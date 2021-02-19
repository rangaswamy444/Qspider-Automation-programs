package objectrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepo 
{
	public static void main(String [] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\java project work space\\new automation batch\\src\\objectrepository\\app.properties");
		Properties p1 = new Properties();
		p1.load(fis);
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//open browser
		driver.get("http://aprasadpc:81/login.do");//enter url
		String unLoc = p1.getProperty("untf");
		String pwLoc = p1.getProperty("pwtf");
		String logLoc = p1.getProperty("login");
		driver.findElement(By.name(unLoc)).sendKeys("admin");
		driver.findElement(By.name(pwLoc)).sendKeys("manager");
		driver.findElement(By.xpath(logLoc)).click();//click on login
	}
}
	
