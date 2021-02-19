package datadrivenframework;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginLogoutTC_01 
{
	@Test
	public void testLoginLogout_01() throws FileNotFoundException
	{
		//write code to readData
		String url = ExcelOperation.readData("TC_01", 1, 0);
		String un = ExcelOperation.readData("TC_01", 1, 1);
		String pwd = ExcelOperation.readData("TC_01", 1, 2);
		String expected = ExcelOperation.readData("TC_01", 1, 3);
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get(url);
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f1.findElement(By.name("username")).sendKeys(un);
		f1.findElement(By.name("pwd")).sendKeys(pwd);
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		String actualresult = f1.getTitle();
		ExcelOperation.WriteData("TC_01", 1, 4, actualresult);
		if(expected.equals(actualresult))
		{
			ExcelOperation.WriteData("TC_01", 1, 5, "pass");
		}
		else
		{
			ExcelOperation.WriteData("TC_01", 1, 5, "fail");
		}
	}
}
