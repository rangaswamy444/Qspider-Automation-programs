package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		// TODO Auto-generated method stub
	FileInputStream fis=new FileInputStream("D:\\testData\\userdata.xlsx");
	 Workbook w1 = WorkbookFactory.create(fis);
	  Sheet s1 = w1.getSheet("Sheet1");
	  Row r1 = s1.getRow(3);
	  Cell c1 = r1.getCell(1);
	  String s2 = c1.getStringCellValue();
	  System.out.println(s2);
	}

}
