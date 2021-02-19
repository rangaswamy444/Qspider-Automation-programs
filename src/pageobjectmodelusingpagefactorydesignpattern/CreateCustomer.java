package pageobjectmodelusingpagefactorydesignpattern;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import datadrivenframework.ExcelOperation;

public class CreateCustomer extends SuperTestScript 
{
	@Test
	public void testCreateCustomer() throws FileNotFoundException 
	{
		//Step 1 create objects of webpage classes
		OpenTaskPage otp = new OpenTaskPage();
		ActiveProjectsAndCustomersPage apcp = new ActiveProjectsAndCustomersPage();
		AddNewCustomerPage ancp = new AddNewCustomerPage();
		//step 2 readData from Excel
		 String customername = ExcelOperation.readData("createcustomer", 1, 0);
		 String expectedresult = ExcelOperation.readData("createcustomer", 1, 1);
		//step 3 convert testcase in to testscript
		otp.clickOnProjectsAndCustomerLink();
		apcp.clickOnAddNewCustomerButton();
		ancp.enterCustomerNameInCustomerTextfield(customername);
		ancp.clickOnCreateCustomerButton();
		String actualresult = apcp.retrieveSuccessMessage();
		//step 4 validate testscript
		 String status = ValidationOperation.verifyTheTestScript(expectedresult, actualresult);
		//step 5 Write actual result and status in Excel
		ExcelOperation.WriteData("createcustomer", 1, 2, actualresult);
		ExcelOperation.WriteData("createcustomer", 1, 3, status);
		
	}
}
