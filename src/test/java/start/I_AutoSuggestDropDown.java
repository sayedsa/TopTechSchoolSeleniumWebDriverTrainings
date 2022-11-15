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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class I_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException, WebDriverException {
		/*
		 * Alert ! I could not run test successfully due to elementNotinteractibleException. 
		 * Few options mentioned below were applied but still did not work
		 * 
		 * Need further action to resolve this issue
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		
		
		
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * WebElement From = driver.findElement(By.xpath("//span[text()='From']"));
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.visibilityOf(From));
		 * wait.until(ExpectedConditions.elementToBeClickable(From)); 
		 * From.click();
		 */
		/*
		 * WebElement From = driver.findElement(By.xpath("//span[text()='From']"));
		 * 
		 * WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3000));
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//span[text()='From")));
		 *  From.click();
		 */
		//Actions action = new Actions(driver);
		//action.moveToElement(From);
		/*
		 * From.sendKeys("Seattle");
		 *  From.sendKeys(Keys.ARROW_DOWN);
		 * From.sendKeys(Keys.ENTER);
		 */
		/*
		 * driver.findElement(By.xpath("//span[text()='From']")).click();
		 * driver.findElement(By.xpath("//span[text()='From']")).sendKeys("seattle");
		 * driver.findElement(By.xpath("//span[text()='From']")).sendKeys(Keys.
		 * ARROW_DOWN); 
		 * driver.findElement(By.xpath("//span[text()='From']")).click();
		 */
		/*
		 * WebElement From = driver.findElement(By.xpath("//span[text()='From']"));
		 * WebElement From = driver.findElement(By.xpath("//span[text()='From']")).click();
		 *  //WebElement FromText = driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * 
		 */		
		
		  WebElement From = driver.findElement(By.xpath("//span[text()='From']"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", From);
		 
		
		  From.click();
		  From.sendKeys("Seattle");
		  From.sendKeys(Keys.ARROW_DOWN); 
		  From.sendKeys(Keys.ENTER);
		 
		//driver.close();
	}

}
