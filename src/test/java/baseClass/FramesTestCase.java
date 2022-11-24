package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Vijayalaxmi");
		
		driver.findElement(By.name("lname")).sendKeys("Gadagi");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("vijuap.83@gmail.com");

	}

}
