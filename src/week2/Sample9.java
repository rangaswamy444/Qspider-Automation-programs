package week2;
//testscript 12
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample9 {

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
		//click on add new customer
		rv1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		//enter customer name
		rv1.findElement(By.name("name")).sendKeys("peterson");
		//click on Archieve tab, hidden divisin pop up will be displayed
		rv1.findElement(By.linkText("Archives")).click();
		//retrieve the text from all the buttons in the hidden division popup
		//click on cancel customer creation button and retrieve
		String s1 = rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
		System.out.println(s1);
		//retrieve text from remain on the page
		String s2 = rv1.findElement(By.xpath("//input[@value='Remain on the Page']")).getAttribute("value");
		System.out.println(s2);
		//click on cancel customer creation button
		rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
		//logout
		rv1.findElement(By.className("logoutImg")).click();
		
	}

}
