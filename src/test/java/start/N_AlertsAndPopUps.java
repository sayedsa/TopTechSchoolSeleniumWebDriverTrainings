package start;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N_AlertsAndPopUps {

	public static void main(String[] args) {
		/* What is Alert on the page appear ? 
		 * An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
		 * It notifies the user with some specific information or error, asks for permission to perform certain tasks 
		 * and it also provides warning messages as well.
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Click the link to activate the alert
		driver.findElement(By.linkText("See an example alert")).click();

		
		//Interface Alert has the following methods: accept(), dismiss();,getText();,sendKeys();
		// Implementation and usage is as follows:	WebDriver.TargetLocator.alert()
		
		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("");
		driver.switchTo().alert().getText();
		
		
		
	}

}
