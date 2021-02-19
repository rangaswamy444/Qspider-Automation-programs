package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://www.facebook.com");
		String s = rv1.getCurrentUrl();
		System.out.println(s);
		
	}

}
