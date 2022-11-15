package start;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_BasicMethodsInWebDriver {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		driver.navigate().to("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]")).click();
		Set<String> windowHandleS = driver.getWindowHandles();
		System.out.println(windowHandleS);

		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		System.out.println("************************printing all the elements below**********************************");
		
		
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div/div"));
		System.out.println(allElements);
		
		
		driver.navigate().to("https://selenium.dev");
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println("I am the end of this lecture");
		
		driver.close();
	}

}
