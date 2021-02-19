package testnggroupexecution;

import org.testng.annotations.Test;

public class B 
{
	@Test(groups="ft")
	public void functionalTest()
	{
		System.out.println("functioal testing is completed");
	}
	@Test(groups="IT")
	public void integrationTest()
	{
		System.out.println("integration testing is completed");
	}
	@Test(groups="ST")
	public void systemTest()
	{
		System.out.println("system testing is completed");
	}	
}
