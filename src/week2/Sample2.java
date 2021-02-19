package week2;
//testscript5
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 
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
		//click on reports
		rv1.findElement(By.linkText("Reports")).click();
		//locate dropdrown and store address
		WebElement dropdown = rv1.findElement(By.name("users"));
		//create select class object and pass the address
		Select s1 = new Select(dropdown);
		//create single select (or) multiselect
		boolean t1=s1.isMultiple();
		if(t1)
		{
			s1.selectByIndex(0);
			s1.selectByIndex(1);
			s1.selectByIndex(2);
			s1.deselectByIndex(0);
			s1.deselectByIndex(1);
		}
		else
		{
			System.out.println("errormessage");
		}
			
			
		}
		
	}

