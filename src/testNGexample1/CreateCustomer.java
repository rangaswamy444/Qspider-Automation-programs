package testNGexample1;
//TesNG
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomer extends A
{
	@BeforeMethod									//3
	public void retriveTitle()
	{
		System.out.println("create customer title is retrived");
	}
	@Test									//4
	public void testCreateCustomer()
	{
		System.out.println("customer is created successfully");
	}
	@AfterMethod										//5
	public void displaySuccessMsg()
	{
		System.out.println("Display success message of create customer");
	}
}
