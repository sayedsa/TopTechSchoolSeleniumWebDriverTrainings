package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_WebTable {

	public static void main(String[] args) throws InterruptedException, WebDriverException {
		/*
		 * R_WebTable needs the following: step 1: switch to frame which has that
		 * particular table step 2: get the number of rows Step 3: get the number of
		 * columns Step 4: iterate rows and columns and get the text and print it
		 * 
		 * Note: it needs further work, not tested successfully
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www2.asx.com.au");

		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
				
		System.out.println(tableRows.size());
		int rowsize = tableRows.size();

		List<WebElement> tableCol = driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
		System.out.println(tableCol.size());	
		int colsize = tableCol.size();

		for (int i = 1; i < rowsize; i++) {
			for (int j = 1; i < colsize; i++) {
			String text =  driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[" + i +"]/td[" + j +"]")).getText();
			System.out.println(text);
			}
		}
	}

}
