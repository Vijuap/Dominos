package baseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestcase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement drp1=driver.findElement(By.cssSelector("#fruits"));
		
		Select drp=new Select(drp1);
		drp.selectByVisibleText("Apple");
		
		WebElement drp2=driver.findElement(By.cssSelector("#superheros"));
		Select drp02=new Select(drp1);
	if (drp02.isMultiple()){
		drp02.selectByValue("Ant-Man");
		drp02.selectByValue("Aquaman");
		drp02.selectByValue("The Avengers");

	}
	Thread.sleep(1000);
	 WebElement drp3=driver.findElement(By.cssSelector("#lang"));
	 Select drp03=new Select(drp3);

	 List<WebElement> drpOptions=drp03.getOptions();

for (WebElement w: drpOptions) {
	if (w.getText().equalsIgnoreCase("c#")) {
		w.click();
		WebElement drp03Selected=drp03.getFirstSelectedOption();
		System.out.println(drp03Selected.getText());
	}
}

WebElement drp4=driver.findElement(By.cssSelector("#country"));
Select drp04=new Select(drp4);
drp04.selectByVisibleText("India");
WebElement drp04Selected=drp04.getFirstSelectedOption();
System.out.println(drp04Selected.getText());
	 driver.close();
	}

}
