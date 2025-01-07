package WebElementTwo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyLocator {

//	public static String baseUrl ="https://rahulshettyacademy.com/AutomationPractice/";
	@Test
	public void myfirstTest() throws InterruptedException{

 WebDriverManager.chromedriver().setup();
 WebDriver driver =new ChromeDriver();
 
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 driver.manage().window().maximize();
 
 String headerText = driver.findElement(By.tagName("h1")).getText();
 System.out.println("Header Text: " + headerText);

// xpath
 driver.findElement(By.xpath("//input[@value='radio1']")).click();

// cssselector
 driver.findElement(By.cssSelector("input[value='radio2']")).click();

 driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']")).sendKeys("test");
 
 
 driver.findElement(By.id("dropdown-class-example")).click();

 
 driver.findElement(By.xpath("//option[@value='option3']")).click();
 Thread.sleep(3000);
 driver.findElement(By.id("checkBoxOption2")).click();
 Thread.sleep(3000);
 driver.quit();
	}
	
}

