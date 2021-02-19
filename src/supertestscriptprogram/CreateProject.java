package supertestscriptprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProject extends SuperTestScript
{
	@Test
	public void testCreateProject()
	{
		//click on projects and customers
		driver.findElement(By.linkText("Projects & Customers")).click();
		//click on add new project 
		driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
		//select appropriate customer from drop down
		WebElement d1 = driver.findElement(By.name("customerId"));
		Select s1 = new Select(d1);
		s1.selectByVisibleText("ranga234");
		//enter project name
		driver.findElement(By.name("name")).sendKeys("styris");
		//click on submit button
		driver.findElement(By.xpath("//input[@value='Create Project']")).click();
	}
}
