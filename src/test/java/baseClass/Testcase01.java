package baseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.MonitoringMail;
import utilities.TestConfig;

public class Testcase01 {
	 static String timeStamp=new SimpleDateFormat("yyyy-MM-dd , hh-mm-ss").format(new Date());


	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
    BaseClass ba=new BaseClass(driver);
   ba.openBrowser(driver);
   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.manage().window().maximize();
 
 WebElement firstName=driver.findElement(By.id("fullName"));
 firstName.sendKeys("Vijayalaxmi Gadagi"+Keys.TAB);
 takesScreenShot(driver,"FirstName");

 driver.findElement(By.id("join")).sendKeys("Intelligent Master");
 takesScreenShot(driver,"join");

 driver.findElement(By.id("getMe")).clear();
 takesScreenShot(driver,"getme");

 driver.findElement(By.id("getMe")).sendKeys("Gadagi"+Keys.TAB);
 
 System.out.println(driver.findElement(By.id("getMe")).getAttribute("value"));
 
 driver.findElement(By.id("clearMe")).clear();
 takesScreenShot(driver,"clearMe");

  System.out.println(driver.findElement(By.id("noEdit")).isEnabled());
  takesScreenShot(driver,"noEdit");

 System.out.println( driver.findElement(By.id("dontwrite")).getAttribute("value"));

 driver.close();
////  PractiseHomePage pra=new PractiseHomePage(driver);
////   PractiseHomePage.clickOnWorkPaceLink();
////   PractiseTestPageElements pel=new PractiseTestPageElements(driver);
//   InputPageElements ipt=new InputPageElements(driver);
//  
//   ipt.setFirstnameTextBox("Vijayalaxmi");
//  
//	ipt.setkeyboardtabTextBox("Intelligent Master");
//	ipt.insideTheTextbox("Aniket Pagi");
//	ipt.setClearTheTextbox("Advik Pagi");
//	System.out.println(ipt.isDisplayededitDisabledTextbox());
//	System.out.println(ipt.isEnablededitDisabledTextbox());
 LocalDateTime myDateObj = LocalDateTime.now();
 DateTimeFormatter formatdate= DateTimeFormatter.ofPattern("E MMM-dd-yyyy HH:mm:ss");
 String formattedDate=myDateObj.format(formatdate);
 System.out.println("Date is :"+formattedDate);
	}
	public static void takesScreenShot(WebDriver driver, String name) throws IOException {
		 

//		     File DestFile=new File("C:/Users/anand/Maven.java/Screenshot");
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File screenshot=ts.getScreenshotAs(OutputType.FILE);



	         FileUtils.copyFile(screenshot, new File("C:/Users/anand/Maven.java/Screenshot/"+name+"_"+timeStamp+".png"));
		
		 Date d=new Date();
		String strDate=d.toString();
		System.out.println(strDate);
		
		
//		MonitoringMail mail=new MonitoringMail();
//		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody,TestConfig.attachmentPath,TestConfig.attachmentName);
	}
		    
	}

}
