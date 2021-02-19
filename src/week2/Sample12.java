package week2;
//Testscript 15
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample12 
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
		//move cursor to settings
		WebElement settings=rv1.findElement(By.linkText("Settings"));
		//creating action class object
		Actions a1 = new Actions(rv1);
		//double click on settings
		//by using action class reference variable,call doubleclick(WebElement);method
		a1.moveToElement(settings).doubleClick().build().perform();
		//click on Add new billing type
		rv1.findElement(By.xpath("//input[@value='Add New Billing Type']")).click();
		//Billing type name
		rv1.findElement(By.name("name0")).sendKeys("kgf2");
		//create Billing type
		rv1.findElement(By.xpath("//input[@value='Create Billing Type(s)']")).click();
		//retrive success message
		String s = rv1.findElement(By.className("successmsg")).getText();
		//print it on console
		System.out.println(s);
		//select the billing type that you created
		rv1.findElement(By.linkText("kgf2")).click();
		//click on delete this billing type
		rv1.findElement(By.xpath("//input[@value='Delete this billing type']")).click();
		//A popup message will be displayed
		Alert a2 = rv1.switchTo().alert();
		//click on ok button
		a2.accept();
		//retrieve success message
		String s1 = rv1.findElement(By.className("successmsg")).getText();
		//print it on console
		System.out.println(s1);
		
		
	}

}
