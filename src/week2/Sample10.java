package week2;
//testscript 13
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample10 
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
		//click on Add new task
		rv1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		//select the customer from the dropdown
		WebElement d1 = rv1.findElement(By.name("customerId"));
		Select s1 = new Select(d1);//same code
		s1.selectByIndex(4);//same code
		//select the project from the dropdown
		WebElement d2 = rv1.findElement(By.name("projectId"));
		Select s2 = new Select(d2);//same code
		s2.selectByIndex(1);//same code
		//enter project name
		rv1.findElement(By.name("projectName")).sendKeys("antenna");
		//enter the task in task text field
		rv1.findElement(By.name("task[0].name")).sendKeys("designing");
		//select billable from drop down
		WebElement d3 = rv1.findElement(By.name("task[0].billingType"));
		Select s3 = new Select(d3);//same code
		s3.selectByIndex(1);//same code
		//click on create task
		rv1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		//retrieve success message
		//print it on console
		String s4 = rv1.findElement(By.className("successmsg")).getText();
		System.out.println(s4);
		//click on customer dropdown
		WebElement d4 = rv1.findElement(By.name("customerProject.shownCustomer"));
		Select s5 = new Select(d4);//same code
		s5.selectByIndex(3);//same code
		//click on show task 
		rv1.findElement(By.xpath("//input[@value='Show Tasks']")).click();
		//select the task
		rv1.findElement(By.linkText("designing")).click();
		//delete the task
		rv1.findElement(By.xpath("//input[@value='Delete This Task']")).click();
		//to retrieve text from pop up call alert(); method and store in a1 i.e; a1 is alert type
		Alert a1 = rv1.switchTo().alert();
		//click on ok button from popup
		a1.accept();
		//retrieve success message print it on console
		String s6 = rv1.findElement(By.className("successmsg")).getText();
		System.out.println(s6);
		//logout
		rv1.findElement(By.className("logoutImg")).click();
	}

}
