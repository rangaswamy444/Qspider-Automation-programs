package week3;
import java.io.File;
import java.io.IOException;
//testscript 20
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Sample1 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://aprasadpc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//1.create obect of EventFiringWebDriver class
		//2.pass the browser control to EventFiringWebDriver object.
		EventFiringWebDriver e1 = new EventFiringWebDriver(rv1);
		//3.using refence variable ,call getScreenshotAs();method.
		//4.pass outputType.FILE as an argument ,for getScreenshotAs method.
		//5.store the address of screenshot in a variable of FILE Type.
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		//In D drive it creates one folder i.e in that folder only image will be saved.
		File f2 = new File("D:\\screenshot\\login.jpg");
		//To transfer the screenshot from source location to Target location we use one mehod called moveFilemethod.
		FileUtils.moveFile(f1,f2);
	}

}
