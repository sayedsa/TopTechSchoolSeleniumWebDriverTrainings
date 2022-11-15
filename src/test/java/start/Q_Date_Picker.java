package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q_Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * It needs further examples
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		WebElement textBarr = driver.findElement(By.xpath("//input[@id='dob']"));
		textBarr.click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select select = new Select(dropDown);

		select.selectByVisibleText("Aug");

		WebElement dropDown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select2 =new Select(dropDown2);
		select2.selectByVisibleText("1925");

	}

}
