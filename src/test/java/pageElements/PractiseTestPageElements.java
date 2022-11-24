package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PractiseTestPageElements {
	private WebDriver driver;

	public PractiseTestPageElements(WebDriver rdriver) {
		this.driver=rdriver;
	}
    
	private WebElement inputEditButton=driver.findElement(By.linkText("Edit");
    private WebElement buttonClickButton=driver.findElement(By.linkText("Click"));
	private WebElement selectDrpdownButton=driver.findElement(By.linkText("Drop-Down"));
	private WebElement alertDialogButton=driver.findElement(By.linkText("Dialog"));
	
	public void clickOninputEditButton() {
		inputEditButton.click();
	}
	public void clickOnbuttonClickButton() {
		buttonClickButton.click();
	}
	public void clickOnselectDrpdownButton() {
		selectDrpdownButton.click();
	}
    public void clickalertDialogButton() {
    	alertDialogButton.click();
	}
	    

}
