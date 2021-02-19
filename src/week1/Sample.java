package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chrome and geckodrivers/chromedriver.exe");
		ChromeDriver rv1 = new ChromeDriver();
		rv1.get("https://actitime.jmr.co.za/actitime/login.do");
		rv1.navigate().refresh();
		rv1.close();
		
	}

}
