package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G_ActionsClass {

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

		
		  driver.navigate().to("https://www.ebay.com.au/"); 
		  
		  WebElement electornics = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Electronics']"));
		  
		  System.out.println(" ******************Here is the MovetoElement actions lecture********************* ");
		  
		  Actions actions2 = new Actions(driver); 
		  actions2.moveToElement(electornics).perform();
		  
		  WebElement cameras =  driver.findElement(By.xpath("//a[text()='Cameras']"));
		  actions2.moveToElement(cameras).perform();
		  
		   actions2.moveToElement(cameras).click().perform();
			/*
			 * Or we can also directly click our object as below:
			 * actions2.moveToElement(cameras).perform();
			 *  cameras.click();
			 * 
			 */
		   
		   
		/*
		 * Other actions class methods :
		 * 
		 * actions2.moveToElement(cameras).contextClick().perform();
		 * actions2.moveToElement(cameras).doubleClick().build().perform();
		 * 
		 */
		  
		  
		 System.out.println(" ******************Here is the DragAndDrop actions lecture********************* ");
		driver.get("https://jqueryui.com");

		WebElement drag = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a"));

		Actions actions = new Actions(driver);
		drop.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		driver.switchTo().parentFrame();
		WebElement resize = driver.findElement(By.xpath("//a[text()='Resizable']"));

		resize.click();

		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(iframe2);

		WebElement resizeBttn = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions action3 = new Actions(driver);
		action3.dragAndDropBy(resizeBttn, 200, 200).build().perform();

		
		
		 System.out.println(" ******************Here is the keyEvent actions lecture********************* ");
		 
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement sourcetext = driver.findElement(By.xpath("//div[@id='dropZone']"));
		
		Actions action4 = new Actions(driver);

		action4.keyDown(sourcetext, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement droptext = driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-default']"));

		action4.keyDown(droptext, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

		// driver.close();
	}

}
