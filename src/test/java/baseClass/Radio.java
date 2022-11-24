package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("two")).click();
		
		driver.findElement(By.id("bug")).click();
		System.out.println("bar is selected ");

		System.out.println(driver.findElement(By.id("notfoo")).isSelected());
		System.out.println("may be  is enableed ");

		System.out.println(driver.findElement(By.id("maybe")).isEnabled());
		System.out.println("checbox is selected ");
		System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).isSelected());
		
		driver.findElement(By.linkText("FAKE terms and conditions")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
