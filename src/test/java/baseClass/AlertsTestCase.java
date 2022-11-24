package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
	driver.findElement(By.cssSelector("#accept")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
		
	driver.findElement(By.cssSelector("#confirm")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.cssSelector("#prompt")).click();
	driver.switchTo().alert().sendKeys("Vijayalaxmi");
	driver.switchTo().alert().accept();
	
	driver.findElement(By.cssSelector("#modern")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();

	}

}
