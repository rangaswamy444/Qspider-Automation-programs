package supertestscriptprogram;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateCustomer extends SuperTestScript
{
	@Test
	public void testCreateCustomer()
	{
		//click on projects and customers
		driver.findElement(By.linkText("Projects & Customers")).click();
		//click on add new customer
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		//enter customer name
		driver.findElement(By.name("name")).sendKeys("ranga234");
		//click on create customer
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
}
