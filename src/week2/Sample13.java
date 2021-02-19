package week2;
//Testscript16
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample13 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\chrome and gecko/geckodriver.exe");
		FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("https://jqueryui.com/resources/demos/droppable/default.html");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//locate source address and store it in a WebElement variable
		WebElement source=rv1.findElement(By.id("draggable"));
		//locate target address and store it in a WebElement variable
		WebElement target=rv1.findElement(By.id("droppable"));
		//create object of Actions class and pass browser control as arg
		Actions a1 = new Actions(rv1);
		//call drag and drop method,pass source and target address
		a1.dragAndDrop(source, target).build().perform();
	}

}
