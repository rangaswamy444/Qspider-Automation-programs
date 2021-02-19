package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation 
{
	public static String readData(String sheetname,int rownumber,int cellnumber) throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\testData\\userdata.xlsx");
		try 
		{
			Workbook w1 = WorkbookFactory.create(fis);
		  
			
			String data = w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return data;
		}
		catch(Exception rv1)
		{
			return " ";
		}
	}
	public static void WriteData(String sheetname,int rownumber,int cellnumber,String d) throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\testData\\userdata.xlsx");
		try 
		{
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(d);
			FileOutputStream fos=new FileOutputStream("D:\\testData\\userdata.xlsx");
			w1.write(fos);
		}
		catch(Exception rv1)
		{
			
		}
	}
}
