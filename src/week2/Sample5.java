package week2;
//testscript8
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 
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
		//click on add new project 
		rv1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		//select appropriate customer from drop down
		WebElement d1 = rv1.findElement(By.name("customerId"));
		Select s1 = new Select(d1);
		s1.selectByIndex(3);
		//enter project name
		rv1.findElement(By.name("name")).sendKeys("testing project");
		//click on submit button
		rv1.findElement(By.xpath("//input[@value='Create Project']")).click();
		//to retrive success message,we should go for getText();
		//steps are step1.locate text which you want to retrieve
		//step2 use getText()
		//step3 store text in a string variable
		String s = rv1.findElement(By.className("successmsg")).getText();
		//step4 print the variable
		System.out.println(s);
		//logout
		rv1.findElement(By.className("logoutImg")).click();
	}

}
