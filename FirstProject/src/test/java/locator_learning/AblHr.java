package locator_learning;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class AblHr {

	@Test
	public void myfirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("www.*****.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		  WebElement loginHeader =driver.findElement(By.className("site_name_login"));
		  
		System.out.println(loginHeader.getText()) ; 
		  
		 Thread.sleep(1000);
		 
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("it's confidential");
		 
		 Thread.sleep(1000);
		 WebElement password  = driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("*******");
		 Thread.sleep(1000);
		 
		 WebElement loginButton = driver.findElement(By.id("kt_login_signin_submit"));
		 loginButton.click();
		 Thread.sleep(1000);
		 
		 WebElement dashboard = driver.findElement(By.xpath("//li[contains(@class,'menu-item-active menu-item-open')] [last()]"));
		
		 System.out.println(dashboard.getText());
		 Thread.sleep(1000);
		 
		 WebElement personalDetails = driver.findElement(By.xpath("//a[contains(@class,'menu-link menu-toggle acti')] [last()]"));
			
		 System.out.println(personalDetails.getText());
		 personalDetails.click();
//		 Thread.sleep(2000);
		
         WebElement leaveEntry = driver.findElement(By.xpath("//span[normalize-space()='LEAVE ENTRY']"));
		 
		 System.out.println(leaveEntry.getText());
		 leaveEntry.click();
//		 Thread.sleep(2000);
	
        WebElement selectLeave = driver.findElement(By.xpath("//div[contains(text(),'Select Leave type')]"));
		 
		 System.out.println(selectLeave.getText());
		 selectLeave.click();
//		 Thread.sleep(2000);
		 
        WebElement selectType = driver.findElement(By.xpath("//div[normalize-space()='Medical Leave']"));
		 
		 System.out.println(selectType.getText());
		 selectType.click();
		 Thread.sleep(2000);
		 
       WebElement selectStartDate = driver.findElement(By.xpath("//input[@name='appliedFromDate' and @type='date']"));
//       selectStartDate.click();
       selectStartDate.sendKeys("02-26-2025");
//     
//		 selectStartDate.sendKeys("2025-02-26");
//		 Thread.sleep(2000);
//		 Select date = new Select(driver.findElement(By.linkText("the date want to select")));
//		 date.click();
//		 
		 
		 WebElement selectEndDate = driver.findElement(By.xpath("//input[@name='appliedToDate']"));
	     
		 selectEndDate.sendKeys("02-27-2025");
		 Thread.sleep(2000);
		 

		 WebElement Phone = driver.findElement(By.xpath("//input[@name='phoneNo']"));
		 
		 
		 Phone.sendKeys("0987654");
		 Thread.sleep(2000);
		 
		  WebElement address = driver.findElement(By.xpath("//textarea[@name='leaveAddress']"));
			 
			 
			 address.sendKeys("test");
			 Thread.sleep(2000);
			 
    WebElement remarks = driver.findElement(By.xpath("//textarea[@name='leaveReason']"));
			 
			 
    remarks.sendKeys("test");
			 Thread.sleep(2000);
			  WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
				 
				
				 submitBtn.click();
				 Thread.sleep(2000);
			 
		 driver.quit();
		 
		
		
}
}
