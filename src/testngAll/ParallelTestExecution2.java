package testngAll;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.Screenshots;

public class ParallelTestExecution2 {
	@Test
	public void validateHover() throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.in");
		driver.manage().window().maximize();

		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverelement).perform();

		Screenshots sc = new Screenshots();

		sc.captureScreenshot(driver, "mousehoveraction");
	}
}
