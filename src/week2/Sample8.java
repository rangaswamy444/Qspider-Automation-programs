package week2;
//testscript11
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample8
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
		//select the customer
		rv1.findElement(By.linkText("chandrasekhar")).click();
		//click on delete button
		rv1.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		//a pop up will come then use alert();method store it in a1 i.e alert type
		Alert a1 = rv1.switchTo().alert();
		//retrive text print it on console
		String s1 = a1.getText();
		System.out.println(s1);
		//click on ok button from popup
		a1.accept();
		//retrieve success message
		//print it on console
		String s2 = rv1.findElement(By.className("successmsg")).getText();
		System.out.println(s2);
		//logout
		rv1.findElement(By.className("logoutImg")).click();
	}

}
