package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PractiseHomePage {

	private static WebDriver driver;

	public PractiseHomePage(WebDriver rdriver) {
		PractiseHomePage.driver = rdriver;
	}

	private static WebElement workSpaceLink = driver.findElement(By.partialLinkText("Workspace"));

	public static void clickOnWorkPaceLink() {
		workSpaceLink.click();
	}

}
