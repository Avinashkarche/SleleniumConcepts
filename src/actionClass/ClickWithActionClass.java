package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickWithActionClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.browserstack.com/");
		WebElement element = driver.findElement(By.linkText("Get started free"));
		Actions act= new Actions(driver);

		act.moveToElement(element).click().build().perform();

		// using click action method

	}
}