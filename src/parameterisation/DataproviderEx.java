package parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//parameterisation has 2 types
//1.@parameterisation 2.@Dataprovider
//@Dataprovider program
public class DataproviderEx 
{
	@DataProvider(name="testData")
	public Object [][] getData()
	{
		Object [][] rv1=new Object[3][2];
		rv1[0][0]="admin1";
		rv1[0][1]="mana ger1";
		rv1[1][0]="admin@#";
		rv1[1][1]="mana#$%";
		
		rv1[2][0]="admin1@34";
		rv1[2][1]="mana ger1@123";		
		return rv1;
		
	}
	@Test(dataProvider="testData")
	public void testLoginLogout(String username,String pwd)
	{
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		rv1.findElement(By.name("username")).sendKeys(username);
		rv1.findElement(By.name("pwd")).sendKeys(pwd);
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	}
	
}
