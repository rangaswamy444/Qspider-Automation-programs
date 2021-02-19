package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("file:///C:/Users/aprasad%20pc/Desktop/html/Sample1.html");
		rv1.findElement(By.id("t1")).sendKeys("ranga");
		rv1.findElement(By.id("t2")).sendKeys("ranga");
		rv1.findElement(By.name("login")).click();
		rv1.findElement(By.className("male")).click();
		rv1.findElement(By.id("a1")).click();
		rv1.findElement(By.linkText("facebook")).click();
		String s = rv1.getTitle();
		System.out.println(s);
		rv1.navigate().back();
		rv1.navigate().forward();
		rv1.close();
		
		
	}

}
