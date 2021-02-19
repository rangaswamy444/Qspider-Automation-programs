package datadriventesting;
//shortcut of readingData
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReadingData 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	FileInputStream fis=new FileInputStream("D:\\testData\\loginpage.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	String url=w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String un = w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	String pwd = w1.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
	FirefoxDriver rv1 = new FirefoxDriver();
	rv1.get(url);
	rv1.findElement(By.name("username")).sendKeys(un);
	rv1.findElement(By.name("pwd")).sendKeys(pwd);
	rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	 
	}
}
