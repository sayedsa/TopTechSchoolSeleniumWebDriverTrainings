package start;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Java Script Executor
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().scriptTimeout(​Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to get title of the page
		String script = " return document.title;";
		String title = (String) js.executeScript(script);
		System.out.println(title);

		// How to click a button

		driver.switchTo().frame("iframeResult");
		/*
		 * js.executeScript("myFunction()");
		 *  Thread.sleep(2000); 
		 *  String alertText = driver.switchTo().alert().getText();
		 *  System.out.println(alertText);
		 * driver.switchTo().alert().accept();
		 */

		WebElement tryBttn = driver.findElement(By.xpath("//button[text()='Try it']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", tryBttn);
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();

		// How to highligt a web element
		WebElement tryBttn2 = driver.findElement(By.xpath("//button[text()='Try it']"));
		js.executeScript("arguments[0].style.border='5px solid red'", tryBttn2);

		
		// How to scroll down to the ..
		driver.navigate().to("https://www.w3schools.com");
		
		WebElement learnHowtoBttn =driver.findElement(By.xpath("//a[text()='LEARN HOW TO']"));
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", learnHowtoBttn);
		Thread.sleep(500); 
		String buttnText = learnHowtoBttn.getText();
		System.out.println(buttnText);
		learnHowtoBttn.click();
		
	}

}
