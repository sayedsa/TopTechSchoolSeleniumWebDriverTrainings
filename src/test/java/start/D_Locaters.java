package start;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Locaters {

	public static void main(String[] args) {
		/*
		 * lecture of the day (5-26-2022) Locators
		 * selenium 4 new relative locators
		 */

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.getTitle();
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(title);

		driver.manage().deleteAllCookies();
		WebElement MyAccount = driver.findElement(By.name(""));
		WebElement login = driver.findElement(By.id(""));
		WebElement email = driver.findElement(By.className(""));
		WebElement password = driver.findElement(By.linkText(""));
		WebElement loginBttn = driver.findElement(By.partialLinkText(""));
		WebElement loginBttn1 = driver.findElement(By.tagName(""));
		WebElement loginBttn2 = driver.findElement(By.xpath(""));
		WebElement loginBttn3 = driver.findElement(By.cssSelector(""));
		
		
		MyAccount.click();
		login.click();
		email.sendKeys("sayed@gmail.com");
		password.sendKeys("InfoTechAcademy");
		loginBttn.click();
		
		
			  // ************ Selenium 4 relative locators ******************
		
		WebElement password1 = driver.findElement(By.id("password"));
		WebElement email1 = driver.findElement(with(By.tagName("input")).above(password));
		
		WebElement email2 = driver.findElement(By.id("email"));
		WebElement password2 = driver.findElement(with(By.tagName("input")).below(email2));
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		WebElement cancelButton = driver.findElement(with(By.tagName("button")).toLeftOf(submitButton));
		   
		WebElement cancelButton1 = driver.findElement(By.id("cancel"));
		WebElement submitButton1 = driver.findElement(with(By.tagName("button")).toRightOf(cancelButton));
	
		WebElement emailAddressLabel = driver.findElement(By.id("lbl-email"));
		WebElement emailAddressField = driver.findElement(with(By.tagName("input")).near(emailAddressLabel));
		
		
		

	}

}
