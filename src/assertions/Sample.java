package assertions;
//softassertion
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample 
{
		String var1="hello";
		SoftAssert s1=new SoftAssert();
		@Test
		public void testSample()
		{
			s1.assertEquals("HardAssertion","HardAssert");
			System.out.println("first statement executed");
			s1.assertEquals(true,true);
			System.out.println("second statement executed");
			s1.assertEquals(var1,"hello");
			System.out.println("last statement executed successfully");
			s1.assertAll();
		}
}
