package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//testscript 14
public class Sample11 
{

	public static void main(String[] args) 
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
		//perform right click action on projects and customers
		WebElement projectandcustomersAddress=rv1.findElement(By.linkText("Projects & Customers"));
		//create object of action class,pass browser control to the actions class object
		Actions a1 = new Actions(rv1);
		//using the reference variable of action class,call contextclick(); method
		//and pass webElement address as an argument
		a1.contextClick(projectandcustomersAddress).build().perform();
	}

}
