
package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageElements.InputPageElements;
import pageElements.PractiseHomePage;
import pageElements.PractiseTestPageElements;

public class InputPageTest {
	WebDriver driver;

	@Test
	public static void inputPagetestCase(WebDriver driver) {
		BaseClass b = new BaseClass(driver);
		PractiseHomePage homePage = new PractiseHomePage(driver);
		homePage.clickOnWorkPaceLink();
		PractiseTestPageElements prc = new PractiseTestPageElements(driver);
		prc.clickOninputEditButton();
		InputPageElements ip = new InputPageElements(driver);
		ip.setFirstnameTextBox("Vijayalaxmi");
		ip.setkeyboardtabTextBox("Intelligent Master");
		ip.insideTheTextbox("Aniket Pagi");
		ip.setClearTheTextbox("Advik Pagi");
		System.out.println(ip.isDisplayededitDisabledTextbox());
		System.out.println(ip.isEnablededitDisabledTextbox());
	}

}
