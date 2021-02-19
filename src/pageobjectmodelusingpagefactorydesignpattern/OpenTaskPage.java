package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage 
{
	@FindBy(linkText="Projects & Customers")
	private WebElement projectsAndCustomersLink;
	public OpenTaskPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnProjectsAndCustomerLink()
	{
		projectsAndCustomersLink.click();
	}
	
}
