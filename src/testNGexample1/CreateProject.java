package testNGexample1;
//TestNG
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateProject extends A
{
	@BeforeMethod               //3
	public void retriveTitle()
	{
		System.out.println("create project title is retrived");
	}
	@Test                       //4
	public void testCreateProject()
	{
		System.out.println("project is created successfully");
	}
	@AfterMethod                //5
	public void displaySuccessMsg()
	{
		System.out.println("Display success message of create project");
	}
}
