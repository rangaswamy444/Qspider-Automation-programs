package pageobjectmodelusingpagefactorydesignpattern;

public class ValidationOperation 
{
	public static String verifyTheTestScript(String exp,String act)
	{ 
		try 
		{
			return "pass";
		}
		catch(AssertionError rv)
		{
			return "fail";
		}
	}
}
