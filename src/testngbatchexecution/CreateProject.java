package testngbatchexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProject 
{
	@Test
	public void testcreateproject()
	{
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rv1.findElement(By.name("username")).sendKeys("admin");
		rv1.findElement(By.name("pwd")).sendKeys("manager");
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on projects and customers
		rv1.findElement(By.linkText("Projects & Customers")).click();
		//click on add new project 
		rv1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		//select appropriate customer from drop down
		WebElement d1 = rv1.findElement(By.name("customerId"));
		Select s1 = new Select(d1);
		s1.selectByVisibleText("adheera");
		//enter project name
		rv1.findElement(By.name("name")).sendKeys("kgf project");
		//click on submit button
		rv1.findElement(By.xpath("//input[@value='Create Project']")).click();
		//click on logout
		rv1.findElement(By.className("logoutImg")).click();
		
	}
}
