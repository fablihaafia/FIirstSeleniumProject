package BdTest.FirstProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyLocator {
	@Test
	public void myfirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
//		create a chromeDriver object named driver.
		WebDriver driver =new ChromeDriver();
//		got to  web page
//		driver.get("https://www.rokomari.com/book");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		maximize the browser
		driver.manage().window().maximize();
//		wait for 5sc
//		Thread.sleep(5000);
		WebElement checkBoxOption = driver.findElement(By.id("checkBoxOption1"));
		checkBoxOption.click();
//		
		WebElement switchTab = driver.findElement(By.className("switch-tab"));
		System.out.println(switchTab.getText());
//		
		WebElement title =driver.findElement(By.tagName("h1"));
		String textString =title.getText();
		
		System.out.println(textString);
//		
		WebElement linkElement = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		System.out.println("Link tag name" + linkElement.getTagName());
//		linkElement.click();
//		
//		WebElement partialLink = driver.findElement(By.partialLinkText("Free Access to InterviewQues"));
//		System.out.println("Link Test" + partialLink.getText());
		
//	
		WebElement inputElement =driver.findElement(By.xpath("//input[@id='autocomplete']"));
		inputElement.sendKeys("test test");
//		System.out.println(text.getText());
		WebElement inputSelector =driver.findElement(By.cssSelector("input[name='enter-name'"));
		inputSelector.sendKeys("test test");
		
	
		Thread.sleep(5000);
//		close the browser window;
		driver.quit();
	}
	
}

