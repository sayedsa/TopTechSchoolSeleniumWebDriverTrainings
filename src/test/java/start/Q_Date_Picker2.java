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

public class Q_Date_Picker2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		  driver.navigate().to("https://www.redbus.in//"); 
		  
	
		String year = "2023";
		String month = "July";
		String date = "20";
		
		driver.findElement(By.id("onward_cal")).click();
		
	while (true)
	{
		String monthyear = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		String arr [] = monthyear.split(" " );
		
		String mon =arr[0];
		String yr= arr[1];
		
		if (mon.equalsIgnoreCase(month)&& yr.equalsIgnoreCase(year))
			break;
		
		else
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		
		}
		
	List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table//tbody"));
	 for(WebElement ele:alldates)
	 {
		 String dt=ele.getText();
		 if(dt.equals(date))
		 {
			 ele.click();
			 break;
			 
		 }
	 }
	
	}

}
