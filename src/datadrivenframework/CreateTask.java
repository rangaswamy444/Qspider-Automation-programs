package datadrivenframework;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateTask 
{
	@Test
	public void testCreateTask() throws FileNotFoundException
	{
		//write code to read data
		String url = ExcelOperation.readData("Sheet5", 1, 0);
		String un = ExcelOperation.readData("Sheet5", 1, 1);
		String pwd = ExcelOperation.readData("Sheet5", 1, 2);
		String taskname = ExcelOperation.readData("Sheet5", 1, 3);
		String expectedresult = ExcelOperation.readData("Sheet5", 1, 4);
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get(url);
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f1.findElement(By.name("username")).sendKeys(un);
		f1.findElement(By.name("pwd")).sendKeys(pwd);
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on Add new task
		f1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		//select the customer from the dropdown
		WebElement d1 = f1.findElement(By.name("customerId"));
		Select s1 = new Select(d1);//same code
		s1.selectByIndex(5);//same code
		//select the project from the dropdown
		WebElement d2 = f1.findElement(By.name("projectId"));
		Select s2 = new Select(d2);//same code
		s2.selectByIndex(2);//same code
		//enter the task in task text field
		f1.findElement(By.name("task[0].name")).sendKeys(taskname);
		//select billable from drop down
		WebElement d3 = f1.findElement(By.name("task[0].billingType"));
		Select s3 = new Select(d3);//same code
		s3.selectByIndex(1);//same code
		//click on create task
		f1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		//retrieve success message
		//print it on console
		String actualresult = f1.findElement(By.className("successmsg")).getText();
		ExcelOperation.WriteData("Sheet5", 1, 5, actualresult);
		if(expectedresult.equals(actualresult))
		{
			ExcelOperation.WriteData("Sheet5", 1, 6, "pass");
		}
		else
		{
			ExcelOperation.WriteData("Sheet5", 1, 6, "fail");
		}
	}
	}
