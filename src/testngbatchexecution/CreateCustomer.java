package testngbatchexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer 
{
	@Test
	public void testcreatecustomer()
	{
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rv1.findElement(By.name("username")).sendKeys("admin");
		rv1.findElement(By.name("pwd")).sendKeys("manager");
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		rv1.findElement(By.linkText("Projects & Customers")).click();//click on projects and customers
		rv1.findElement(By.xpath("//input[@value='Add New Customer']")).click();//click on add new customer
		rv1.findElement(By.name("name")).sendKeys("adheera");//enter customer name
		rv1.findElement(By.name("createCustomerSubmit")).click();//click on create customer
		//click on logout
		rv1.findElement(By.className("logoutImg")).click();
	}
}
