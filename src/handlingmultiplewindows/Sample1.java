package handlingmultiplewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 
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
		//click on reports
		rv1.findElement(By.linkText("Reports")).click();
		//click on calender icon
		rv1.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		//a new window will be opened and calender page will be displayed
		//select the date
		//step1:for mainpage use String mainwindow=rv1.getWindowHandle();method
		String mainwindow = rv1.getWindowHandle();
		//step2:To enter in to child page we are using browsercontrol.getWindowHandles():set<String> method
		 Set<String> a1 = rv1.getWindowHandles();
		 for(String s:a1)
		 {
			 if(s.equals(mainwindow))
			 {
				 		
			 }
			 else
			 {
				 rv1.switchTo().window(s);
				 break;
			 }
		 }
		 rv1.findElement(By.className("calendarCurrentMonthWorkingDay")).click();
		 rv1.switchTo().window(mainwindow);
		//click on logout
		 rv1.findElement(By.className("logoutImg")).click();
		 
	}
}	
