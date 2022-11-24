package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class InputPageElements {
	private WebDriver driver;

	public InputPageElements(WebDriver rdriver) {
		this.driver = rdriver;
	}

	 WebElement firstnameTextBox = driver.findElement(By.id("fullName"));

	 WebElement keyboardtabTextBox = driver.findElement(By.id("join"));

	 WebElement insideTheTextbox = driver.findElement(By.id("getMe"));
	 WebElement clearTheTextbox = driver.findElement(By.id("clearMe"));
	 WebElement editDisabledTextbox = driver.findElement(By.id("noEdit"));
	 WebElement confirmTextBox = driver.findElement(By.id("dontwrite"));

	public void setClearTheTextbox(String str) {
		clearTheTextbox.sendKeys(str);
	}

	public void setFirstnameTextBox(String str) {
		firstnameTextBox.sendKeys(str);
	}

	public void setkeyboardtabTextBox(String str) {
		keyboardtabTextBox.sendKeys(str);
	}

	public void insideTheTextbox(String str) {
		insideTheTextbox.sendKeys(str);
	}

	public boolean isEnablededitDisabledTextbox() {
		return editDisabledTextbox.isEnabled();
	}

	public boolean isDisplayededitDisabledTextbox() {
		return editDisabledTextbox.isDisplayed();
	}

	public String getconfirmTextBox() {
		String str = confirmTextBox.getText();
		return str;
	}

}
