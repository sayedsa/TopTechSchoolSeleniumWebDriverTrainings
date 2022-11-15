package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class O_AuthenticatioPopUps {
	
	public static String username = "admin";
	public static String password = "admin";

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		  //driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
		  //or we can make it dynamic instead of hard coding it as follows: 
		  driver.get("https://"+ username+ ":"+password + "@the-internet.herokuapp.com/basic_auth"); 
		  
		// driver.manage().window().fullscreen();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		

		// driver.close();
	}

}
