package start;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class K_ScreenShot {
	


	public static void takeScreenShot(WebDriver driver) throws Exception {

		Date  currentDate = new Date();
		String screenshotFileName =currentDate.toString().replace(" ", " -").replace(":", "-");
		
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File(".//screenpics//"+screenshotFileName+".png"));

	}
}