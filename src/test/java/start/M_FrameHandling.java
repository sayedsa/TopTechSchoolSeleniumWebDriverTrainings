package start;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_FrameHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		// driver.manage().window().fullscreen();

		WebElement iframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);

		WebElement tryBttn = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryBttn.click();

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);

		driver.switchTo().parentFrame();
		WebElement runBttn = driver.findElement(By.id("runbtn"));

		Thread.sleep(2000);
		runBttn.click();

		System.out.println("Iam in parent frame");
		/*
		 * Alert alert = driver.switchTo().alert(); // switch to alert
		 * 
		 * String alertMessage= driver.switchTo().alert().getText();
		 * driver.switchTo().alert().accept();
		 * 
		 * // System.out.println(alert.getText());
		 */
		// driver.close();

	}
}
