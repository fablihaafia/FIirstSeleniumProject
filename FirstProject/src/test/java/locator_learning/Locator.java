package locator_learning;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	@Test
	public void myFirstTest() throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
////		create a chromeDriver object named driver.
//		WebDriver driver =new ChromeDriver();
////		got to  web page
//		driver.get("https://www.rokomari.com/book");
////		maximize the browser
//		driver.manage().window().maximize();
////		wait for 5sc
//		Thread.sleep(5000);
////		close the browser window
//		String textString = driver.findElement(By.id("js--search")).getText();
//		System.out.println(textString);
//		driver.quit();
//	   }
		
		WebDriverManager.chromedriver().setup();
//		create a chromeDriver object named driver.
		WebDriver driver =new ChromeDriver();
//		got to  web page
		driver.get("https://www.rokomari.com/book");
//		maximize the browser
		driver.manage().window().maximize();
//		wait for 5sc
		Thread.sleep(5000);
//		close the browser window
		driver.quit();

	}
	}


