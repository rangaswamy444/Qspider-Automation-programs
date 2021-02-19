package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	@FindBy(className="successmsg")
	private WebElement successMessage;
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
	}
	public String retrieveSuccessMessage()
	{
		return successMessage.getText();
	}
	public void clickOnAddNewProjectButton()
	{
		addNewProjectButton.click();
	}
}
