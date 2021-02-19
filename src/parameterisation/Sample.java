package parameterisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// parameterisation has 2 types
//1.@parameterisation 2.@Dataprovider
//@parameterisation with single argument
public class Sample 
{
	@Parameters("t1")
	@Test
	public void testsample(int a)
	{
		System.out.println("value is "+a);
	}
}
