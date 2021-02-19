package week2;
//testscript 4
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

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
		//check whether customer dropdown is single select or multiselect
		//locate dropdown
		WebElement dropdown = rv1.findElement(By.name("customerProject.shownCustomer"));
		//create object of select class
		Select s1 = new Select(dropdown);
		//use isMultiple() to check whether dropdown is single (or) multiselect
		boolean t1 = s1.isMultiple();
		System.out.println(t1);
		//use getOptions().size() to count no:options
		int count = s1.getOptions().size();
		System.out.println(count);
		//retrive all options and print it,use getOptions() and getText();
		List<WebElement> l1 = s1.getOptions();
		for(int i=0;i<=3;i++)
		{
			String options = l1.get(i).getText();
			System.out.println(options);
		}
		
		
	}

}
