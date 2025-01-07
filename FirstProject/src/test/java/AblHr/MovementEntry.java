package AblHr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovementEntry {

	@Test
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://ablhr.akijbakers.io/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.quit();
	}

}
