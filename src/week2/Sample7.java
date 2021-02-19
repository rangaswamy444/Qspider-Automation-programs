package week2;
//test script10
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample7 
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
		//click on archieve selected customers and project button
		rv1.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
		//call alert(); method and store it in  a1 i.e a1 is alert type
		Alert a1= rv1.switchTo().alert();
		//retrieve the text
		String s= a1.getText();
		//print it on console
		System.out.println(s);
		//click on ok
		a1.accept();
		rv1.close();
		
		
	}

}
