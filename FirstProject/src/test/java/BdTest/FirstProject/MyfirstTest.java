package BdTest.FirstProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyfirstTest {
	@Test
	public void myfirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
//		create a chromeDriver object named driver.
		WebDriver driver =new ChromeDriver();
//		got to  web page
//		driver.get("https://www.rokomari.com/book");
		driver.get("https://www.rokomari.com/book");
//		maximize the browser
		driver.manage().window().maximize();
//		wait for 5sc
//		Thread.sleep(5000);
		WebElement search = driver.findElement(By.id("js--menu-tooltip"));
		search.click();
		
		WebElement cart = driver.findElement(By.id("js-cart-menu"));
		cart.click();
		
		WebElement title =driver.findElement(By.tagName("h2"));
		String textString =title.getText();
		
		System.out.println(textString);
		
		WebElement linkElement = driver.findElement(By.linkText("/corporate?ref=nm"));
//		System.out.println(linkElement.getText());
		linkElement.click();
	
		WebElement text =driver.findElement(By.cssSelector("js--search-filter-toggle tab-slider--trigger"));
		System.out.println(text.getText());
		
	
		Thread.sleep(5000);
//		close the browser window;
		driver.quit();
	}
	
}

