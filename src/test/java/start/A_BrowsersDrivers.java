package start;
import org.openqa.selenium.edge.EdgeDriver;

public class A_BrowsersDrivers {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\browsersDrivers\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "C:\\browsersDrivers\\geckodriver.exe");
	//	System.setProperty("webdriver.ie.driver", "C:\\browsersDrivers\\IEDriverServer.exe");
		System.setProperty("webdriver.edge.driver", "C:\\browsersDrivers\\msedgedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
	//	InternetExplorerDriver driver = new InternetExplorerDriver();
	//	InternetExplorerDriver driver = new InternetExplorerDriver();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://corammerswork.ml/wordpress/test1/");
		
		System.out.println("opened the test envirnment");
		System.out.println("closed the test envirnment");
	//	driver.close();
		
	}

}
