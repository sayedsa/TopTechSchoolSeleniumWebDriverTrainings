package start;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_BrowserCommands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Get browser info
		driver.getTitle();
		driver.getCurrentUrl();
		
		//Browser navigation
		//Convenient
		driver.get("https://selenium.dev");
		//Longer way
		driver.navigate().to("https://selenium.dev");
		driver.navigate().forward();
		driver.navigate().back();
		//Refresh the current page
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
