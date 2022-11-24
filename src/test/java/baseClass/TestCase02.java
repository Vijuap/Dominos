package baseClass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import utilities.MonitoringMail;
import utilities.TestConfig;

public class TestCase02 {
WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
	}
	public static Logger log =  Logger.getLogger(TestCase02.class.getName());
	@Test
	public void testcaseButtons() {
		driver.findElement(By.id("home")).click();
		PropertyConfigurator.configure("C:\\Users\\anand\\Maven.java\\src\\test\\java\\readProperties\\log4j.properties");
		driver.navigate().back();
		log.info("Browser navigated backwards");
		System.out.println(driver.findElement(By.id("position")).getLocation());
		log.info("button location is found");

		System.out.println(driver.findElement(By.id("color")).getCssValue("color"));
		log.info("Button Css value is found");

		System.out.println(driver.findElement(By.id("property")).getSize());
		
		System.out.println(driver.findElement(By.id("isDisabled")).isEnabled());
		
		Actions act =new Actions(driver);
		WebElement btnHold=driver.findElement(By.xpath("//h2[normalize-space()='Button Hold!']"));
		act.clickAndHold(btnHold).build().perform();
		

		
	}
	
	@AfterTest
	public void sendMailAndCloseBrowser() {
		
}
	
}
