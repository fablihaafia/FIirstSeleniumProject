package AblHrFor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyLocator {

	@Test
	public void myfirstTest() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://ablhr.akijbakers.io/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.name("username")).sendKeys("rezvi.abl@akij.net");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("Akij@12345");
	    Thread.sleep(3000);
	    driver.findElement(By.id("kt_login_signin_submit")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("a[class='menu-link menu-toggle active'] span[class='menu-text']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[normalize-space()='MOVEMENT ENTRY']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[contains(text(),'Official Tour')]")).click();
	    Thread.sleep(3000);
	    
	    
	    driver.quit();

	}

}

