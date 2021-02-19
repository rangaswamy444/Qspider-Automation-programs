package testngbatchexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginLogout 
{
	@Test
	public void testloginlogout()
	{
	System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
	FirefoxDriver rv1 = new FirefoxDriver();
	rv1.get("http://aprasadpc:81/login.do");
	rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	rv1.findElement(By.name("username")).sendKeys("admin");
	rv1.findElement(By.name("pwd")).sendKeys("manager");
	rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	rv1.findElement(By.className("logoutImg")).click();//click on logout
	}
}
