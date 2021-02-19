package pageobjectmodelusingpagefactorydesignpattern;

import org.testng.annotations.Test;

public class CreateProject extends SuperTestScript 
{
	@Test
	public void testCreateProject() 
	{
		//Step 1 create objects of webpage classes
		OpenTaskPage otp = new OpenTaskPage();
		ActiveProjectsAndCustomersPage apcp = new ActiveProjectsAndCustomersPage();
		AddNewProjectPage anpp = new AddNewProjectPage();
		//step2 convert testcase in to testscript
		otp.clickOnProjectsAndCustomerLink();
		apcp.clickOnAddNewProjectButton();
		anpp.selectCustomerFromDropdown("rangaswamy");
		anpp.enterProjectNameInProjectNameTextField("circuit theory");
		anpp.clickOnCreateProjectButton();
		String s = apcp.retrieveSuccessMessage();
		System.out.println(s);
	}
}
