package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class F_CheckBox {

	public static void main(String[] args) throws InterruptedException, WebDriverException {
		/*
		 * G_ActionsClass.java
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		
		
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		  WebElement checkbox = driver.findElement(By.xpath("//input[@id='interest_market_c0']"));
		  
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", checkbox);
		  Thread.sleep(2000);
		  
		  executor.executeScript("arguments[0].click();", checkbox);
		  Thread.sleep(2000);
		  executor.executeScript("arguments[0].click();", checkbox);
		/*
		 * WebElement checkbox =driver.findElement(By.xpath("//input[@id='interest_market_c0']"));
		 * 
		 * checkbox.click(); 
		 * Thread.sleep(2000);
		 *  checkbox.click();
		 * checkbox.isSelected();
		 */
		
		List<WebElement> allBoxex = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allBoxex.size());
		
		driver.close();
	}

}
