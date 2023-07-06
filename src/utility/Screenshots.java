package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	

	public void captureScreenshot(WebDriver driver, String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

//			String path = "F:\\Desktop\\VimanNagar\\May 21\\SeleniumBasicsRevision\\screenshots\\amazon.png";

		String path = System.getProperty("user.dir") + "\\screenshots\\" + filename + ".png";
		File destinationpath = new File(path);

		FileHandler.copy(screenshot, destinationpath);

	}

}
