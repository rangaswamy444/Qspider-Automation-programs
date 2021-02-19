package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("file:///C:/Users/aprasad%20pc/Desktop/html/Sample2.html");
		rv1.findElement(By.cssSelector("input[value='login']")).click();//cssSelector
		rv1.close();
	}

}
