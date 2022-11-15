package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_PrintAllLinks {

	public static void main(String[] args) throws InterruptedException, WebDriverException {
		/*
		 * G_ActionsClass.java
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo");
		
		
		
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//List<WebElement>allLinks = driver.findElements(By.tagName("option"));
		//List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		List<WebElement>allLinks = driver.findElements(By.tagName("script"));
		System.out.println(allLinks.size());
	
		for(int i=0; i<allLinks.size(); i++) 
			
		{
			//System.out.println(allLinks.get(i).getAttribute("href"));
			System.out.println(allLinks.get(i).getAttribute("type"));
			
			//System.out.println(allLinks.get(i).getText());
			
			
			
		}
		
		
		driver.close();
	}

}
