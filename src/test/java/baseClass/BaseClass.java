package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import readProperties.ReadCommonProperties;

public class BaseClass {

	WebDriver driver;

	public BaseClass(WebDriver ldriver) {
		this.driver = ldriver;
	}

	
	public void openBrowser(WebDriver driver) {
		
		
		driver.get("https://www.letcode.in/edit");
		
	}

	public void cleanup() {
		driver.quit();
	}
}
