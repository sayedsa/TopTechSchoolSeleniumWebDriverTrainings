package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_ImplicitWait {

	/*
	 * There are multiple types of waits/timeouts used:

� Implicitywait()

� Thread.Sleep()

� PageLoadTimeout()

� setScriptTimeout()
ImplicityWait is applicable to all web elements on the page.

- Page load timeout in selenium can be defined as the time that a script grants for a web page to load or be displayed.
 In case the page loads within the timeout limit, the script continues to run. However, in the other case where the timeout limit is exceeded,
  the script stops and gives a timeout exception.

Syntax: pageLoadTimeout(long time,java.util.concurrent.TimeUnit unit);

Example: driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

Here, the WebDriver instance waits for 30 seconds for every page to get loaded before throwing an exception. 
If the page is not loaded in 30 seconds of time, then it throws TimedOutException at run time.

- Implicit wait is a process in which it notifies the web driver to wait for some specific time to check if any element is not available on a web page.
 Only after the wait is over, it throws an exception �Nosuchelemtfound� if it does not find any element on the web page immediately.

Syntax: implicitlyWait(long time, java.util.concurrent.TimeUnit unit);

Example: driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

Selenium Timeouts must be included to create effective, comprehensive and seamlessly running test cases.
 We can user implicitlyWait() and PageLoadTimeout() in the same script example:

@Before("@setup")

public void sUp() {

driver.manage().deleteAllCookies();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

}

However, we should try to avoid configuring pageLoadTimeout() until and unless the Test Specification explicitly mentions about the same.
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		  driver.navigate().to("https://www.ebay.com.au/"); WebElement electornics = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Electronics']"));
		  
		  System.out.println(" ******************Here is the MovetoElement actions lecture********************* ");
		  
		  Actions actions2 = new Actions(driver); 
		  actions2.moveToElement(electornics).perform();
		  
		  WebElement cameras =  driver.findElement(By.xpath("//a[text()='Cameras']"));
		  actions2.moveToElement(cameras).perform();
		  
		   actions2.moveToElement(cameras).click().perform();
	}

}
