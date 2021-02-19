package testNGassertions;

import org.dom4j.DocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class OpenGoogleValidateGooglePage 
{
	public static void main(String [] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//open browser
		driver.get("https://www.google.com/");//enter url
		try
		{
			Assert.assertEquals("Google", driver.getTitle());
			System.out.println("test pass");
		}
		catch(AssertionError rv)
		{
			System.out.println("test fail");
		}
	}
}
