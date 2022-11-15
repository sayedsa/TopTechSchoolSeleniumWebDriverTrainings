package start;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E_BasicMethodsInWebElements {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 	 https://www.sugarcrm.com/au/request-demo/
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println(driver.findElement(By.id("password")).getCssValue("font-family"));
		System.out.println(driver.findElement(By.id("password")).getLocation());
		System.out.println(driver.findElement(By.id("password")).getSize());
		System.out.println(driver.findElement(By.id("password")).getTagName());
		System.out.println(driver.findElement(By.id("password")).getText());
		
		
		System.out.println(driver.findElement(By.id("password")).isEnabled());
		System.out.println(driver.findElement(By.id("password")).isDisplayed());
		System.out.println(driver.findElement(By.id("password")).getRect());
		System.out.println(driver.findElement(By.id("password")).getAttribute("placeholder"));
		
		driver.findElement(By.name("login-button")).click();
		
		
		
		
		
		System.out.println("I am the end of this lecture");

		driver.close();
		
		
	}

}
