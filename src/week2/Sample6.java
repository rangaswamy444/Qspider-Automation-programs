package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

//test script 9
public class Sample6 
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
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on projects and customers
		rv1.findElement(By.linkText("Projects & Customers")).click();
		//retrieve text from add new customer
		//print it on console
		String s = rv1.findElement(By.xpath("//input[@value='Add New Customer']")).getAttribute("value");
		System.out.println(s);
		rv1.close();
		

	}

}
