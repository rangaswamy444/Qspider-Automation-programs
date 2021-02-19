package week2;
//Testscript19
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample16 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rv1.findElement(By.name("username")).sendKeys("admin");
		//copy admin i.e username and paste it in password textfield,click on enter
		rv1.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a");
		rv1.findElement(By.name("username")).sendKeys(Keys.CONTROL+"c");
		rv1.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v"+Keys.ENTER);
		
		
	}

}
