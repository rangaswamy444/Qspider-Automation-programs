package week3;
//frame assignment
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		//entering url
		rv1.get("file:///C:/Users/aprasad%20pc/Desktop/html/framehandling/frame.html");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter name
		rv1.findElement(By.id("t1")).sendKeys("raghu");
		//entering in to frame element 
		rv1.switchTo().frame("frame1");
		//entering the phonenumber in frame element
		rv1.findElement(By.xpath("//input[@type='text']")).sendKeys("12234546");
		//transfer the control from frame page to main page
		rv1.switchTo().defaultContent();
		//entering password
		rv1.findElement(By.id("t2")).sendKeys("ranga");
		//entering in to frame element of dropdown
		rv1.switchTo().frame("frame2");
		//transfer the control from frame page to main page
		rv1.switchTo().defaultContent();
		//entering the email
		rv1.findElement(By.id("t3")).sendKeys("abcd@gmail.com");
		//entering in to frame element 
		rv1.switchTo().frame("frame3\"");
		//entering the radio button in frame element
		rv1.findElement(By.xpath("//input[@type='radio']")).click();
		//transfer the control from frame page to main page
		rv1.switchTo().defaultContent();
	}

}
