package LocatorTwo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyLocator {
//	public static String baseUrl ="https://jqueryui.com/checkboxradio/";
//	public static String baseUrl ="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_option";
	public static String baseUrl ="https://demoqa.com/menu";
	@Test
	public void myfirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
//		create a chromeDriver object named driver.
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.rokomari.com/book");
//		got to  web page
//		driver.get("https://www.rokomari.com/book");
//		
//		maximize the browser
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demoqa.com/menu");
		Thread.sleep(5000);
//	close the browser window;
	driver.quit();
		

	}
	
}

