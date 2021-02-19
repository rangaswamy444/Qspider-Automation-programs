package parameterisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//parameterisation has 2 types
//1.@parameterisation 2.@Dataprovider
//@parameterisation with two arguments
public class Sample1 
{
	@Parameters({"t1","t2"})
	@Test
	public void testsample(double a,int b)
	{
		System.out.println("value is "+a);
		System.out.println("value is "+b);
	}
}
