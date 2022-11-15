package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class H_static_DropDown {

	public static void main(String[] args) throws InterruptedException, WebDriverException {
		/*
		 * G_ActionsClass.java
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo");
		
		
		
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dropDown = driver.findElement(By.name("employees_c"));
		//dropDown.click();

		
		Select selec = new Select(dropDown); 
	
		selec.selectByVisibleText("1 - 10 employees");
		Thread.sleep(2000);
		selec.selectByIndex(3);
		Thread.sleep(2000);
		selec.selectByValue("level5");
		Thread.sleep(2000);
		selec.deselectByIndex(3);
		WebElement firstSelect = selec.getFirstSelectedOption();
		
		//System.out.println(firstSelect.getText());
		
		 String text = firstSelect.getText();
		
		System.out.println(text);
		List<WebElement> allItems =selec.getAllSelectedOptions();
		System.out.println(allItems.size());
		System.out.println(allItems);
		
		/*
		 * selec.deselectAll(); 
		 * List<WebElement> allItems1 =selec.getAllSelectedOptions(); 
		 * System.out.println(allItems1.size());
		 *
		 */
		driver.close();
	}

}
