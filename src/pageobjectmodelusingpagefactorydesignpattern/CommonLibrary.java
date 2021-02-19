package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonLibrary 
{
	public void selectOptionFromDropdownUsingIndex(WebElement dropdownAddress,int index)
	{
		Select s1 = new Select(dropdownAddress);
		s1.selectByIndex(index);
	}
	public void selectOptionFromDropdownUsingVisibleText(WebElement dropdownAddress,String option)
	{
		Select s1 = new Select(dropdownAddress);
		s1.selectByVisibleText(option);
	}
	public void clickOnOkButtonInAlertPopup()
	{
		SuperTestScript.driver.switchTo().alert().accept();
	}
	public void clickOnCancelButtonInAlertPopup()
	{
		SuperTestScript.driver.switchTo().alert().dismiss();
	}
	public String retrieveMessageFromAlertPopup()
	{
		return SuperTestScript.driver.switchTo().alert().getText();
	}
}
