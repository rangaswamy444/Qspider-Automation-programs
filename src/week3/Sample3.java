package week3;
//testscript 22
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("file:///C:/Users/aprasad%20pc/Desktop/html/handlingbulk%20elements/bulkelements.html");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> rv1 = ff.findElements(By.xpath("//input[@type='checkbox']"));
		for( int i = 0;i<rv1.size();i++)
		{
			rv1.get(i).click();
		}
		
	}

}
