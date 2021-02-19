package objectrepository;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepoUsingXmlFile 
{
	public static void main(String [] args) throws DocumentException
	{
	SAXReader s1 = new SAXReader();
	Document d1 = s1.read("D:\\java project work space\\new automation batch\\src\\objectrepository\\sample.xml");
	String unLoc = d1.selectSingleNode("//login_test/untf").getText();
	String pwdLoc = d1.selectSingleNode("//login_test/pwtf").getText();
	String loginLoc = d1.selectSingleNode("//login_test/login").getText();
	System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();//open browser
	driver.get("http://aprasadpc:81/login.do");//enter url
	driver.findElement(By.name(unLoc)).sendKeys("admin");
	driver.findElement(By.name(pwdLoc)).sendKeys("manager");
	driver.findElement(By.xpath(loginLoc)).click();//click on login
	}
}
	
