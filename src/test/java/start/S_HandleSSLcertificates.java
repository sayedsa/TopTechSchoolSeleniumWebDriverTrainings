package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class S_HandleSSLcertificates {

	public static void main(String[] args) throws InterruptedException {
		/* Handle ssl certificate
		 * we use classess like chromeoptions or firefoxoptions with class desiredcapabilities to handle ssl certificate
		 * 
		 * Notice: it needs further work to be work successfully
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//Global profile
		
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true); or we can do as follow: 
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions chroOptions = new ChromeOptions();
		chroOptions.merge(dc);
		
		
		WebDriver driver = new ChromeDriver(chroOptions);
		
		driver.get("https://expired.badssl.com/");

		
		
		
		// driver.close();
	}

}
