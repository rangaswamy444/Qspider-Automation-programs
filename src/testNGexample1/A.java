package testNGexample1;
//TestNg
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A 
{
	@BeforeTest                             //1
	public void openBrowser()
	{
		System.out.println("Browser is launched");
	}
	@AfterTest										//7
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
	@BeforeClass									//2
	public void login()
	{
		System.out.println("login is successfull");
	}
	@AfterClass
	public void logout()					//6
	{
		System.out.println("logout is successfull");
	}
}
