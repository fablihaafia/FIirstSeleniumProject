package WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
//		got to  web page
		driver.get("https://www.rokomari.com/book");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		maximize the browser
		driver.manage().window().maximize();
//		wait for 5sc
		Thread.sleep(5000);
		
//		xpath er syntx
//		xpath =//tagname[@attribute='value]'
//		CssSelector =tagname[attribute='value]'
		WebElement radioOption = driver.findElement(By.xpath("//fieldset/legend"));
		System.out.println(radioOption.getText());
		
		WebElement radioOption2 = driver.findElement(By.cssSelector("fieldset > legend"));
		System.out.println(radioOption2.getText());
//		
		WebElement radioOption3 = driver.findElement(By.xpath("//input[@name='radioButton' and @value='radio1']"));
		System.out.println(radioOption2.getText());
		radioOption3.click();
		Thread.sleep(5000);
		
	    WebElement radioOption4 = driver.findElement(By.cssSelector("input[value='radio2'][name='radioButton']"));
	
	   radioOption4.click();
	   Thread.sleep(5000);
		WebElement switchTab = driver.findElement(By.xpath("//input[contains(@value,'dio3')]"));
		switchTab.click();
		Thread.sleep(5000);
//		
		WebElement confirmButton = driver.findElement(By.cssSelector("input[value*='dio2']"));
		confirmButton.click();
		
		WebElement confirmButton2 = driver.findElement(By.xpath("//input [starts-with(@id,'con')]"));
		confirmButton2.click();
		Thread.sleep(5000);
//		iframe
		
		driver.get(baseUrl);
		driver.switchTo().frame(0);
	driver.findElement(By.cssSelector("label[for='radio-1']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	
	driver.get(baseUrl);
	driver.switchTo().frame(0);
	Select select = new Select(driver.findElement(By.id("cars")));
	select.selectByIndex(0);
	
driver.findElement(By.cssSelector("option[value='opel']")).click();
driver.switchTo().defaultContent();
Thread.sleep(5000);
		
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
//		Actions actions =new Actions(driver);
		Actions actions =new Actions(driver);
		WebElement main =driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		
		actions.clickAndHold(main).build().perform();

		Thread.sleep(5000);
		WebElement subItem =driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		actions.clickAndHold(subItem).build().perform();

		Thread.sleep(5000);
 
		

		
//	close the browser window;
	driver.quit();
		

	}
	
}

