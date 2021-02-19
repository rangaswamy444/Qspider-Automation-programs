package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample 
{
	public static void main(String[] args) throws AWTException  
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rv1.findElement(By.name("username")).sendKeys("admin");
		rv1.findElement(By.name("pwd")).sendKeys("manager");
		//click on login
		rv1.findElement(By.xpath("//input[@type='submit']")).click();
		//click on users 
		 WebElement c = rv1.findElement(By.linkText("Users"));//perform right click action
		 Actions a1 = new Actions(rv1);
		 a1.contextClick(c).build().perform();
		 Robot r1=new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyPress(KeyEvent.VK_ENTER);
		 
		 
		
	}
}
