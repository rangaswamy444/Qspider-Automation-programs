package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage 
{
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	@FindBy(name="name")
	private WebElement projectNameTextField;
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	public AddNewProjectPage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
	}
	public void selectCustomerFromDropdown(String customerName)
	{
		Select s1 = new Select(customerDropdown);
		s1.selectByVisibleText(customerName);
	}
	public void enterProjectNameInProjectNameTextField(String projectName)
	{
		projectNameTextField.sendKeys(projectName);
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
}
