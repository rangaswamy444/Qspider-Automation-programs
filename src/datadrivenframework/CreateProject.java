package datadrivenframework;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProject 
{
	@Test
	public void testCreateProject() throws FileNotFoundException
	{
		//write code to read data
		String url = ExcelOperation.readData("Sheet4", 1, 0);
		String un = ExcelOperation.readData("Sheet4", 1, 1);
		String pwd = ExcelOperation.readData("Sheet4", 1, 2);
		String projectname = ExcelOperation.readData("Sheet4", 1, 3);
		String expectedresult = ExcelOperation.readData("Sheet4", 1, 4);
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get(url);
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f1.findElement(By.name("username")).sendKeys(un);
		f1.findElement(By.name("pwd")).sendKeys(pwd);
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on projects and customers
		f1.findElement(By.linkText("Projects & Customers")).click();
		//click on add new project 
		f1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		//select appropriate customer from drop down
		WebElement d1 = f1.findElement(By.name("customerId"));
		Select s1 = new Select(d1);
		s1.selectByIndex(4);
		//enter project name
		f1.findElement(By.name("name")).sendKeys(projectname);
		//click on submit button
		f1.findElement(By.xpath("//input[@value='Create Project']")).click();
		//to retrive success message,we should go for getText();
		//steps are step1.locate text which you want to retrieve
		//step2 use getText()
		//step3 store text in a string variable
		String actualresult = f1.findElement(By.className("successmsg")).getText();
		ExcelOperation.WriteData("Sheet4", 1, 5, actualresult);
		if(expectedresult.equals(actualresult))
		{
			ExcelOperation.WriteData("Sheet4", 1, 6, "pass");
		}
		else
		{
			ExcelOperation.WriteData("Sheet4", 1, 6, "fail");
		}
	}
}
