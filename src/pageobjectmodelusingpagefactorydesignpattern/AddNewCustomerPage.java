package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
{
	@FindBy(name="name")
	private WebElement customerNameTextField;
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	public AddNewCustomerPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void enterCustomerNameInCustomerTextfield(String name)
	{
		customerNameTextField.sendKeys(name);
	}
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
}
